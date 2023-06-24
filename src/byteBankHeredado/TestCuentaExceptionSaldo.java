package byteBankHeredado;

public class TestCuentaExceptionSaldo {

    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.depositar(200);
        cuenta.saca(200);//Al intentar retirar mas de lo que tiene la cuenta lanza la exception
        //Las exeption nos sirven para el control de errores mas detallado.
        cuenta.saca(10);
    }
}
