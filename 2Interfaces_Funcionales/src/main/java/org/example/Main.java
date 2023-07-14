package org.example;

import org.example.funtional.*;

public class Main {

    public static void doSomethingTraditional(){
        var obj1 = new MiClaseTux();
        String retorno = obj1.doSomething("ValorDeParametro");
        System.out.println(retorno);

    }
    public static void doSomethingClassicClassAnonima(){
        var objClassAnomina = new MyFunctionalInterface() {
            @Override
            public String doSomething(String param) {
                return "doSometrhin(String param), param = " + param;
            }
        };

        String retorno = objClassAnomina.doSomething("ValorDeParametro");
        System.out.println(retorno);
    }
    private static void doSomethingFunctional() {
        MyFunctionalInterface obj = (param) -> "obj doSometrhin(String param), param = " + param;
        String retorno = obj.doSomething("ValorDeParametro");
        System.out.println(retorno);


        MyFunctionalInterface obj2 = (param) -> "obj2 doSometrhin(String param), param = " + param;



        //-------Funcion High Order----------
        // Pasando Comportamiento obj
        doSomethingHighOrderFunction(obj);
        // Pasando Comportamiento obj2
        doSomethingHighOrderFunction(obj2);
        // Psando COmportamiento con Lambdas
        doSomethingHighOrderFunction((param -> "Funcion ANONIMA doSometrhin(String param), param = " +  param));

        //Puedo reutilizar los comportamiento de MyFunctionalInterface que ya se haya terminado e implelentado en una clase
        //y pasarlos, mejor conocido como COMOPOSICION DE FUNCIONES
        var tux = new MiClaseTux();
        doSomethingHighOrderFunction(tux::doSomething);

        //puedes pasar cualquier comportamiento de cualquier implementacion siempre y cuando
        //respete la firma que tiene el metodo dentro de la interfaz funcional,
        var pickachu = new MiClasePickachu();
        doSomethingHighOrderFunction(pickachu::pika);
        doSomethingHighOrderFunction(pickachu::impackTrueno);
        //IMPORTANTE, en la firma esta vez, se ignora el nombre del metodo de la clase MiClasePickachu
        //porque es como enviar una funcion anonima, osea exprecion lambda

    }
    private static void doSomethingHighOrderFunction(MyFunctionalInterface comportamiento){
        String valor = comportamiento.doSomething("Valor de PArametro High ORder");
        System.out.println(valor);

    }
    /*private static MyFunctionalInterface doSomethingHighOrderFunction(MyFunctionalInterface comportamiento){
        String valor = comportamiento.doSomething("Valor de PArametro High ORder");
        System.out.println(valor);

        comportamiento = (var) -> {return "Funcion modificada doSomethingHighOrderFunction(..), var = " + var;};
        MyFunctionalInterface comportamiento2 = comportamiento;
        FUNCIONA
        return comportamiento2;
    }*/



    public static void main(String[] args) {
        //instanciasDeClasesAbstractasStaticas();
        //instanciasDeInterfacesAbstractasStaticas();

        //doSomethingTraditional();
        //doSomethingClassicClassAnonima();
        doSomethingFunctional();


    }




    public static void instanciasDeClasesAbstractasStaticas(){
        int c = MiClaseAbstracta.miVariableEstatica;
        int v = MiClaseAbstracta.MI_CONSTANTE;
        System.out.println(c);
        System.out.println(v);

        MiClaseAbstracta.miMetodoNoAbstractoStatico();

        // Instancia de clase Abstracta
        MiClaseAbstracta objAbstracto = new MiClaseAbstracta() {
            @Override
            public void miMetodoAbstracto() {
                System.out.println("Es la unica forma de hacer una instancia de una clase abstracta, ya que una clase abstracta, puede tener muchos metodos abstractos");
            }
        };

        objAbstracto.miMetodoAbstracto();

    }

    public static void instanciasDeInterfacesAbstractasStaticas(){
        int a = MiInterfaz.MI_CONSTANTE;
        System.out.println(a);

        MiInterfaz.miMetodoEstatico();

    }

}