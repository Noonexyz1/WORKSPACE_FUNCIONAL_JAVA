package com.mycompany;

import com.mycompany.interfaces_funcionales.EsMayor;
import com.mycompany.interfaces_funcionales.Persona;
import com.mycompany.interfaces_funcionales.SumarEdad;



public class App {

    public static void main(String[] args) {
        
        
        EsMayor em = (v) -> (v > 18)? true: false;
        SumarEdad se = (a, b) -> a + b;
        
        Persona persona1 = new Persona("Diego", 28, true, em, se);
        Persona persona2 = new Persona("Nelson", 25, true, (v) -> (v > 18) ? true : false, (a, b) -> a + b);
        
        persona1.caminar();
        persona2.caminar();
        
        boolean esMayor = persona1.getFuncionEsMayor().esMayor(18);
        System.out.println(esMayor);
        
        persona1.setFuncionEsMayor((v) -> (v > 15)? true : false);
        esMayor = persona1.getFuncionEsMayor().esMayor(18);
        System.out.println(esMayor);
        
        
    }

}
