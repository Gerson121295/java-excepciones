package java_pila_ejecucion;

//public class MiException extends RuntimeException{ //RuntimeException exception no verificada.
 public class MiException extends Exception{ //Exception exception verificada. Por lo que necesitamos atrapar la exception
    public MiException(){
        super(); //para llamar al constructor del padre
    }

    public MiException(String message){
        super(message); //para llamar al constructor del padre
    }
}
