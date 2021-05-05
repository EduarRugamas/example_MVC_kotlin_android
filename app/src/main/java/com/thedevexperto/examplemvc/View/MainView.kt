package com.thedevexperto.examplemvc.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thedevexperto.examplemvc.Controller.MainController
import com.thedevexperto.examplemvc.Model.MainModel
import com.thedevexperto.examplemvc.R
import kotlinx.android.synthetic.main.activity_main.*

class MainView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val modelo: MainModel = Obtener_datos()
        val vista =  MainView()

        val controlador = MainController(modelo, vista)

        controlador.enviar_string_a_modelo("hola mundo")


    }

     fun Obtener_datos(): MainModel {

         return MainModel("Hello World !!!!!!!!!")
    }

    fun mostrar_mensaje_desde_controlador(mensaje:String){
        text_1.text = mensaje.toString()
        text_2.text = mensaje.toString()
    }
}