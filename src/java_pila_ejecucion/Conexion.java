package java_pila_ejecucion;

public class Conexion {

    public Conexion(){//Constructor : abre la conexion cuando la creo.
        System.out.println("Abriendo conexion");
        throw new IllegalStateException(); //se puede mandar la exception en el constructor
        //La bomba esta explotando al momento de la creacion del objeto por lo que no creará la conexion.
    }

    public void leerDatos(){
        System.out.println("Recibiendo datos");
        //throw new IllegalStateException(); //Exeption cuando la conexion a la BD no fue exitosa.
    }

    public void cerrar(){
        System.out.println("Cerrando conexión");
    }

}
