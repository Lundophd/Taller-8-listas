package Controlador;

import Modelo.Lista;

public class Controlador {
    private Lista lista = null;

    public Controlador() {
        lista = Lista.getIntance();
    }

    public void adicionarPersona(String nombre) {
        lista.adicionarNodo(nombre);
    }

    public String recorrer_lista_cabeza_cola() {
        String retorno = "";

        try {
            retorno = lista.recorrer_cabeza_cola();
        } catch (Exception e) {
            retorno = "No existen elementos en la lista";
        }
        return retorno;
    }

    public String recorrer_lista_cola_cabeza() {
        String retorno = "";

        try {
            retorno = lista.recorrer_cola_cabeza();
        } catch (Exception e) {
            retorno = "No existen elementos en la lista";
        }
        return retorno;
    }
}
