package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Diego!");

        Persona persona1 = new Persona();
        Persona persona2 = new Persona(1, "Diego", 1.75);

        persona1.setIdPersona(x -> System.out.println(x));
        IdPersona a = persona1.getIdPersona();
        a.mostrarId(7);


    }
}