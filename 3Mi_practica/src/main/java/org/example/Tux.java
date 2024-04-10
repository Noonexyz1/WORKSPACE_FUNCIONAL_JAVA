package org.example;

public class Tux implements MyFunctionalInterface {
    @Override
    public String doSomething(String param) {
        return "Hola soy Tux y recibi el siguiente paremetro: " + param;
    }

    public String doSomethingRespetandoFirma(String param) {
        return "Hola soy Tux y recibi el siguiente paremetro respentando la firma a codigo ya existente: " + param;
    }

}