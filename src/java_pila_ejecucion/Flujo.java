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





