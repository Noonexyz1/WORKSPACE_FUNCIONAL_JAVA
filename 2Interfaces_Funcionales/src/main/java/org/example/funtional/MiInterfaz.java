package org.example.funtional;

// Interfaz con solo métodos abstractos (y métodos estáticos y predeterminados desde Java 8)
public interface MiInterfaz {
    // todas las variables en una interfaz son implícitamente públicas, estáticas y finales
    int MI_CONSTANTE = 100;


    // método abstracto
    void miMetodoAbstracto();

    // método predeterminado (desde Java 8)
    default void miMetodoPredeterminado() {
        // implementación del método
    }

    // método estático (desde Java 8)
    static void miMetodoEstatico() {
        System.out.println("miMetodoEstatico() de una interfaz");
    }
}
