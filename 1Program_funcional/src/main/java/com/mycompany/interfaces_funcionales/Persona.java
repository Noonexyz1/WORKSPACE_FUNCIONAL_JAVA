
package com.mycompany.interfaces_funcionales;

public class Persona {
    private String nombre;
    private int edad;
    private boolean esMayor;
    
    private EsMayor funcionEsMayor;
    private SumarEdad funcionSumarEdad;
    
    
    public Persona(String nombre, int edad, boolean esMayor, EsMayor funcionEsMayor, SumarEdad sumarEdad){
        this.nombre = nombre;
        this.edad = edad;
        this.esMayor = esMayor;
        this.funcionEsMayor = funcionEsMayor;
        this.funcionSumarEdad = sumarEdad;
    }
    
    public Persona(){}
    
    
    public void caminar(){
        System.out.println("Estoy caminando...");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsMayor() {
        return esMayor;
    }

    public void setEsMayor(boolean esMayor) {
        this.esMayor = esMayor;
    }

    public EsMayor getFuncionEsMayor() {
        return funcionEsMayor;
    }

    public void setFuncionEsMayor(EsMayor funcionEsMayor) {
        this.funcionEsMayor = funcionEsMayor;
    }

    public SumarEdad getFuncionSumarEdad() {
        return funcionSumarEdad;
    }

    public void setFuncionSumarEdad(SumarEdad funcionSumarEdad) {
        this.funcionSumarEdad = funcionSumarEdad;
    }

    
    
    
}
