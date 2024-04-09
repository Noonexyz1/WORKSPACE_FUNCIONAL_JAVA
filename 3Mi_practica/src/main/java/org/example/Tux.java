package org.example;

public class Tux implements MyFunctionalInterface {
    @Override
    public String doSomething(String param) {
        return "Hola soy Tux y recibi el sieguiente paremetro: " + param;
    }
}