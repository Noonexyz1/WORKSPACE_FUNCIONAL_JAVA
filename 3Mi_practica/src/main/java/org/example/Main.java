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

        MyFunctionalInterface tux2 = (x) -> "Hola soy Tux2 y recibi el siguiente parametro: " + x + " por interfaz funcional";
        System.out.println(tux2.doSomething("VALOR FUNCIONAL"));

        // hacemos uso de la funcion high-order
        doSomethingHighOrder(tux1);
        doSomethingHighOrder(tux2);
        doSomethingHighOrder(x -> "Hola soy Metodo Anonimo y recibi el siguiente parametro: " + x + " por interfaz funcional");

        var tux = new Tux();
        doSomethingHighOrder(tux::doSomethingRespetandoFirma);

    }

        //El argumento valida la firma del metodo funcional
        public static void doSomethingHighOrder(MyFunctionalInterface comportamiento){
            // Ejecuto el comportamiento que recibo como argumento
            System.out.println(comportamiento.doSomething("VALOR HIGH-ORDER"));
        }

}