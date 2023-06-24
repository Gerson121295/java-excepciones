package java_pila_ejecucion;

public class Flujo {
/*//Extendiendo la excepcion de RuntimeException
    public static void main(String[] args){
        System.out.println("Inicio de main");
        metodo1();
        System.out.println("Fin de main");
    }
    */
//Extendiendo la excepcion de Exception
public static void main(String[] args){
    System.out.println("Inicio de main");
    try {
        metodo1();
    //}catch (MiException | ArithmeticException e){ // En el catch: Capturo 2 excepciones.
    }catch (Exception e){ //Usando polimorfismo: Exception capturará cualquier excepcion que ocurra en el codigo. Ya que todo extiende de Exception.
        e.printStackTrace(); //Es mejor capturar nuestra Exception ya que asi sabemos que error estamos tratando.
    }
    System.out.println("Fin de main");
}

    public static void metodo1() throws MiException{ //forma 2: agregar: "throws MiException" en la funcion es definido para evitar hacer el try y catch
        System.out.println("Inicio de metodo1");
        //Uso de nuestra exception creada
       // try{
            metodo2();
        //}catch (MiException me){
           // me.printStackTrace();
        // }
        System.out.println("Fin de metodo1");
    }

  /*
    //Crear nuestro propia excepcion en el metodo2 - Extiende de RuntimeException
    public static void metodo2() {
        System.out.println("Inicio de metodo2");
        //Forma 1: crear y Lanzar nuestra propia excepcion
       // ArithmeticException ae = new ArithmeticException(); //Instancia de la excepcion
        //throw ae; //throw - Lanza la excepcion: lanza la bomba
        //Abajo de throw no debe haber mas codigo debido a que no sera ejecutado.

        //Forma 2: crear(instanciar) y Lanzar nuestra propia excepcion
        //throw new ArithmeticException(); //forma de definir y lazar la excepcion

        //Solo podemos hacer throw de objetos que son excepciones ya que extendienden o heredan de throwable

        //Se lanza nuestra exception que se creó
        throw new MiException("Mi excepcion fue lanzada");

        //Error StackOverflow cuando la pila se llena
        //metodo2(); //ciclo infinito metodo2(); llama al metodo2(); y asi.

    }
*/

    //Crear nuestro propia excepcion en el metodo2 - Extiende de Exception
    public static void metodo2() throws  MiException{
        System.out.println("Inicio de metodo2");
//        int a = 50/0; //Dará un error lanzará un ArithmeticException //por lo que en el main lo atrapo dentro del try agrego 2 catch
//       //El siguiente generará un error, lanzará un NullPointerException por lo que tambien se debe atrapar
//        Cuenta c = null;
//        c.deposita();
        throw new MiException("My exception was thrown");
    }

    /*
    public static void metodo2(){
        System.out.println("Inicio de metodo2");
        for (int i = 1; i<=5; i++){
            System.out.println(i);

            //try - Palabra reservada para controlar errores, try no puede existir sin el catch
            try { //try intenta esto, si no funciona atrapa el resultado (catch).

                //error de divicion es lanzado cuando i=3
                if(i == 3) {
                    int num = 0;
                    int resultado = i / num;
                    System.out.println(resultado);
                }
                //otro error NullPointerException
                String test = null;
                System.out.println(test.toString());
                //-----
            }catch (ArithmeticException exception){ //catch - Atrapa el error. ArithmeticException(es un objeto) por lo que lo declaro como una variable llamada exception. //Aqui explota la bomba.
                System.out.println("Atrapo el Arithmetic");
                System.out.println(exception.getMessage());//getMessage es un metodo que mostrará el mensaje. //Aqui se define como se trata la bomba.
                exception.printStackTrace();//Imprime por donde paso
            }catch(NullPointerException exception) { //catch - Atrapa el error. NullPointerException(es un objeto) por lo que lo declaro como una variable llamada exception. //Aqui explota la bomba. Atrapa otro error
                System.out.println("Atrapo NullPointerException");
                System.out.println(exception.getMessage());//getMessage es un metodo que mostrará el mensaje. //Aqui se define como se trata la bomba.
                exception.printStackTrace();
            }

            //Ejemplo de atrapar 2 errores en un mismo catch
            /*
            }catch (ArithmeticException | NullPointerException exception){ //catch - Atrapa el error. ArithmeticException(es un objeto) por lo que lo declaro como una variable llamada exception. //Aqui explota la bomba.
                System.out.println("Atrapo el Arithmetic");
                System.out.println(exception.getMessage());//getMessage es un metodo que mostrará el mensaje. //Aqui se define como se trata la bomba.
                exception.printStackTrace();//Imprime por donde paso la pila
             }
             */

/*
        }
        System.out.println("Fin de metodo2");
    }

    */


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





