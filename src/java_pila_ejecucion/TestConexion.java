package java_pila_ejecucion;

public class TestConexion {

    public static void main(String[] args) {
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

    }

}
