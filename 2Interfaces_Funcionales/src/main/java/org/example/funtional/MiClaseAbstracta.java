package org.example.funtional;

// Clase abstracta con métodos abstractos y no abstractos
public abstract class MiClaseAbstracta {
    public int miVariableNoFinal;
    public final int miVariableFinal = 10;
    public static int miVariableEstatica;
    public static final int MI_CONSTANTE = 100;

    // método no abstracto
    public void miMetodoNoAbstracto() {
        System.out.println("miMetodoNoAbstracto()");
    }

    public static void miMetodoNoAbstractoStatico() {
        System.out.println("miMetodoNoAbstracto()");
    }

    // método abstracto
    public abstract void miMetodoAbstracto();

}