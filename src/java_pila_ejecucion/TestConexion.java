package java_pila_ejecucion;

public class TestConexion {

    public static void main(String[] args) {

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

//Toda conexion que abrimos debemos cerrarla. Podemos usar finally para asegurarnos de cerrar la conexion.

    }

}
