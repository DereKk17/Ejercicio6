package Datos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SistemaContenedores {

    Stack<Contenedor> contenedores1;
    Stack<Contenedor> contenedores2;
    Stack<Contenedor> contenedores3;

    ArrayList<Contenedor> aux1 = new ArrayList<>();
    ArrayList<Contenedor> aux2 = new ArrayList<>();
    ArrayList<Contenedor> aux3 = new ArrayList<>();


    public SistemaContenedores(){
        this.contenedores1 = new Stack<>();
        this.contenedores2 = new Stack<>();
        this.contenedores3 = new Stack<>();
    }

    public void agregar(int numero, String empresa){
        if(numero >= 1 && numero <= 5){
            contenedores1.push(new Contenedor(numero, empresa));
        }
        if(numero >= 6 && numero <= 10){
            contenedores2.push(new Contenedor(numero, empresa));
        }
        else if(numero > 10 && numero >= 15){
            contenedores3.push(new Contenedor(numero, empresa));
        }
        else if(numero > 15){
            System.out.println("no se puede agregar mas contenedores");
        }


    }

    public boolean vacio1(){
        return contenedores1.isEmpty();
    }
    public boolean vacio2(){
        return contenedores2.isEmpty();
    }
    public boolean vacio3(){
        return contenedores3.isEmpty();
    }


    public Contenedor despacharUltimo(){
        if(!contenedores3.isEmpty()){
            return contenedores3.pop();
        }
        else if(!contenedores2.isEmpty()){
            return contenedores2.pop();
        }
        else{
            return contenedores1.pop();
        }

    }

    public Contenedor despacharNumero1(int numero){
        Contenedor cima = contenedores1.peek();
        if(cima.getNumero() == numero){
            return contenedores1.pop();
        }
        else{
            Contenedor borrado = contenedores1.pop();
            aux1.add(borrado);
            return despacharNumero1(numero);
        }
    }
    public Contenedor despacharNumero2(int numero){
        Contenedor cima = contenedores2.peek();
        if(cima.getNumero() == numero){
            return contenedores2.pop();
        }
        else{
            Contenedor borrado = contenedores2.pop();
            aux2.add(borrado);
            return despacharNumero1(numero);
        }
    }
    public Contenedor despacharNumero3(int numero){
        Contenedor cima = contenedores3.peek();
        if(cima.getNumero() == numero){
            return contenedores3.pop();
        }
        else{
            Contenedor borrado = contenedores3.pop();
            aux3.add(borrado);
            return despacharNumero1(numero);
        }
    }

    public int numeroContenedores(){
        return contenedores1.size() + contenedores2.size() + contenedores3.size();
    }

    public void repoblar1(ArrayList listaInvertida){
        if(listaInvertida.size() == 0){

        }
        else{
           contenedores1.push((Contenedor) listaInvertida.remove(listaInvertida.size()));
        }
    }

    public void repoblar2(ArrayList listaInvertida){
        if(listaInvertida.size() == 0){

        }
        else{
            contenedores2.push((Contenedor) listaInvertida.remove(listaInvertida.size()));
        }
    }

    public void repoblar3(ArrayList listaInvertida){
        if(listaInvertida.size() == 0){

        }
        else{
            contenedores3.push((Contenedor) listaInvertida.remove(listaInvertida.size()));
        }
    }

    public ArrayList<Contenedor> crearArregloInvertido(int numero){
        if(numero >= 1 && numero <= 5){
            Collections.sort(aux1, Collections.reverseOrder());
            return aux1;
        }
        else if(numero >= 6 && numero <= 10){
            Collections.sort(aux2, Collections.reverseOrder());
            return aux2;
        }
        else{
            Collections.sort(aux3, Collections.reverseOrder());
            return aux3;
        }

    }

    public void cima(){
        Contenedor cimaF;

        if(!contenedores3.isEmpty()){
            cimaF = contenedores3.peek();
        }
        else if(!contenedores2.isEmpty()){
            cimaF = contenedores2.peek();
        }
        else{
            cimaF = contenedores1.peek();
        }


        System.out.println(cimaF.getNumero() + " " + cimaF.getEmpresa());
    }
}
