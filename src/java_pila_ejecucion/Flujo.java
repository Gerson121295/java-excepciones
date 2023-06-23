package java_pila_ejecucion;

public class Flujo {

    public static void main(String[] args){
        System.out.println("Inicio de main");
        metodo1();
        System.out.println("Fin de main");
    }

    public static void metodo1(){
        System.out.println("Inicio de metodo1");
        metodo2();
        System.out.println("Fin de metodo1");
    }

    public static void metodo2(){
        System.out.println("Inicio de metodo2");
        for (int i = 1; i<=5; i++){
            System.out.println(i);
        }
        System.out.println("Fin de metodo2");
    }

}

//-------- Ejemplo de la pila de ejecucion de este programa ------
//---------------------------------------------------
//      |        |        |         |       |       |
//      |        |        |         |       |       |
//      |        |        | metodo2 |       |       |
//      |        |metodo1 | metodo1 |metodo1|       |
//      | main   |  main  | main    | main  |  main |
//      |        |        |         |       |       |
//---------------------------------------------------

//Se ejecuta main luego main llama al metodo1 luego metodo1 llama
//al metodo2 este se ejecuta luego regresa a terminar a ejecutar el
//metodo1 luego regresa a terminar de ejecutar el metodo main.
//hasta dejar vacia la pila.





