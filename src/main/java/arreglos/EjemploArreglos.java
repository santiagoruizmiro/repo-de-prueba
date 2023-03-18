package arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {
        //1.declaramos variable de tipo entero
        int edades[];
        //instanciamos el arreglo de tipo int
        edades = new int[3];
        // inicializar valores del arreglo
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        System.out.println("arreglo de enteros indice 0" + edades[0]);
        System.out.println("arreglo de enteros indice 0" + edades[1]);
        System.out.println("arreglo de enteros indice 0" + edades[2]);
        //1. Declarar e instanciar arreglo de tipo object
        Persona persona[] = new Persona[4];
        //inicializar valores del arreglo
        persona[0] = new Persona("Juan");
        persona[2] = new Persona("Karla");
        System.out.println(persona[0]);
        System.out.println(persona[1]);
        System.out.println(persona[2]);
        System.out.println(persona[3]);

//arreglo utilizando notacion simplificada
        String nombres[] = {"Sara", "Laura", "Carlos", "Carmen"};
        // imprimir los elementos de un arreglo
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo string indice:" + i + "" + nombres[i]);
        }

    }
}