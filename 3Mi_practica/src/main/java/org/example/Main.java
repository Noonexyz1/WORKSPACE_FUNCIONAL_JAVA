package org.example;

public class Main {
    public static void main(String[] args) {
        doSomethingTraditional();
        doSomethingAnonimusClass();
        doSomethingFunctional();
    }

    public static void doSomethingTraditional(){
        var tux1 = new Tux();
        System.out.println(tux1.doSomething("VALOR TRADICIONAL"));
    }

    public static void doSomethingAnonimusClass(){
        var tux1 = new MyFunctionalInterface() {
            @Override
            public String doSomething(String param) {
                return "Hola soy Tux y recibi el siguiente parametro: " + param + " por classe anonima";
            }
        };
        System.out.println(tux1.doSomething("VALOR CLASE ANONIMA"));
    }

    public static void doSomethingFunctional(){
        // respetando la firma de la interfaz functional
        MyFunctionalInterface tux1 = (param) -> {
            return "Hola soy Tux y recibi el siguiente parametro: " + param + " por interfaz funcional";
        };
        System.out.println(tux1.doSomething("VALOR FUNCIONAL"));
    }

}