package org.example;

public class Persona {
    private int id;
    private String nombre;
    private double altura;

    //Interfaces funcionales
    private IdPersona idPersona;
    private NombrePersona nombrePersona;
    private AlturaPersona aluAlturaPersona;

    public Persona(int id, String nombre, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.altura = altura;
    }
    public Persona() {
    }


    public IdPersona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(IdPersona idPersona) {
        this.idPersona = idPersona;
    }

    public NombrePersona getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(NombrePersona nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public AlturaPersona getAluAlturaPersona() {
        return aluAlturaPersona;
    }

    public void setAluAlturaPersona(AlturaPersona aluAlturaPersona) {
        this.aluAlturaPersona = aluAlturaPersona;
    }

}
