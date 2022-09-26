package App;


import Datos.Contenedor;
import Datos.SistemaContenedores;

import java.util.ArrayList;

public class Main {

    static SistemaContenedores misContenedores = new SistemaContenedores();

    public static void main(String[] args) {

        misContenedores.agregar(1, "pepe");
        misContenedores.agregar(2, "pepe");
        misContenedores.agregar(3, "pepe");
        misContenedores.agregar(4, "pepe");
        misContenedores.agregar(5, "pepe");
        misContenedores.agregar(6, "pepe");
        misContenedores.agregar(7, "pepe");
        misContenedores.agregar(8, "pepe");




        misContenedores.despacharUltimo();

        System.out.println(misContenedores.vacio1());
        System.out.println(misContenedores.vacio2());
        System.out.println(misContenedores.vacio3());

        misContenedores.cima();
        System.out.println(misContenedores.numeroContenedores());

        despcharContenedor(7);
        System.out.println(misContenedores.numeroContenedores());
        misContenedores.cima();




    }

    public static void despcharContenedor(int numero){
        ArrayList<Contenedor> arregloInvertido = misContenedores.crearArregloInvertido(numero);

        if(numero > 0 && numero <= 5)
        {
            misContenedores.despacharNumero1(numero);
            misContenedores.repoblar1(arregloInvertido);
        }else if(numero > 5 && numero <= 10)
        {
            misContenedores.despacharNumero2(numero);
            misContenedores.repoblar2(arregloInvertido);
        }else
        {
            misContenedores.despacharNumero3(numero);
            misContenedores.repoblar3(arregloInvertido);
        }


    }


}
