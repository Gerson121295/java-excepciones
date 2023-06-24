package java_pila_ejecucion;

public class TestConexion {

    public static void main(String[] args) throws Exception { //se agrego throws Exception debido al ejemplo3
//Ejemplo 1.
        /*
        Conexion con = new Conexion();
        try {
            con.leerDatos();

        }catch (IllegalStateException ex){
            System.out.println("Recibiendo Exception - IllegalStateException Capturado");
            ex.printStackTrace();
        }finally { //De una u otra forma. Hay o no halla error se ejecuta el metodo.
            System.out.println("Ejecutando Finally");
            con.cerrar();
        }
*/
//Toda conexion que abrimos debemos cerrarla. Podemos usar finally para asegurarnos de cerrar la conexion.
//Finally es opcional no es obligatorio y solo puede haber un finally. try si debe llevar obligado un catch o un finally
// try no puede ir solo.

        //Ejemplo 2:
        /*
        Conexion con = null;
        try {
            con = new Conexion();//La bomba esta explotando al momento de la creacion del objeto por lo que no creará la conexion.
            con.leerDatos();
        }catch (IllegalStateException ex){
            System.out.println("Capturando exception");
            ex.printStackTrace();

        }finally { //De una u otra forma. Hay o no halla error se ejecuta el metodo.
            System.out.println("Ejecutando Finally");
            if(con != null){
                con.cerrar();
            }
        }
        */

        //Ejemplo3: Mejora del codigo anterior: Try with resources
    //Try with resources: inicializa un objeto pero este objeto debe implementar la interface
    //AutoCloseable, asi tambien debe implementar su metodos close de AutoCloseable,
    //
//Este codigo hace lo mismo que los anteriores pero mas resumido.
        try(Conexion con = new Conexion()){ //declarado la creacion de un objeto de tipo conexion dentro del try.
                con.leerDatos();
        }catch (IllegalStateException ex){
            System.out.println("Ejecutando catch");
            ex.printStackTrace();
        }

    }

}

//Cual usar: Si necesita que el objeto Conexion haga algo al momento de dejar de existir
//cuando sea cerrado, cuando ya no se utilizará mas, si fuera un recurso que necesito asegurarme
// de cerrarlo despues puedo implementar la interfaz AutoCloseable y el cerrará ese recurso.
//Y va a ejecutar todo normalmente. Pero si mi objeto no implementa AutoCloseable utilizar las
//anteriores.
//Try no puede vivir solo necesita de  un catch o un finally o puede tener ambos.


