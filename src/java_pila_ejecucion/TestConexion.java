package java_pila_ejecucion;

public class TestConexion {

    public static void main(String[] args) {

        Conexion con = new Conexion();
        try {
            con.leerDatos();

        }catch (IllegalStateException ex){
            System.out.println("Recibiendo Exception - IllegalStateException Capturado");
            ex.printStackTrace();
            con.cerrar();
        }

//Toda conexion que abrimos debemos cerrarla.

    }

}
