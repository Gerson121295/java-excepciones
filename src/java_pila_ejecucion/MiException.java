package java_pila_ejecucion;

//public class MiException extends RuntimeException{
 public class MiException extends Exception{
    public MiException(){
        super(); //para llamar al constructor del padre
    }

    public MiException(String message){
        super(message); //para llamar al constructor del padre
    }
}
