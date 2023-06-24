package java_pila_ejecucion;

public class Conexion {

    public Conexion(){//Constructor : abre la conexion cuando la creo.
        System.out.println("Abriendo conexion");
    }

    public void leerDatos(){
        System.out.println("Recibiendo datos");
        throw new IllegalStateException(); //Exeption cuando la conexion a la BD no fue exitosa.
    }

    public void cerrar(){
        System.out.println("Cerrando conexión");
    }

}
