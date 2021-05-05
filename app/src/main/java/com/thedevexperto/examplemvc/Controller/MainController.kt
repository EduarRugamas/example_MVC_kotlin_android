package com.thedevexperto.examplemvc.Controller

import com.thedevexperto.examplemvc.Model.MainModel
import com.thedevexperto.examplemvc.View.MainView

class MainController (var model : MainModel, var view: MainView) {

    fun obtener_string_de_modelo():String{
        return model.Mensaje
    }

    fun enviar_string_a_modelo(mensaje:String){
        model.Mensaje = mensaje
    }

    //actualizar la vista desde el controlador
    fun actualizar_vista(){
        view.mostrar_mensaje_desde_controlador(model.Mensaje)
    }
}