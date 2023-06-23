package byteBankHeredado;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int agencia, int numero) {
        //super llama al constructor que usa estos 2 parametros(agencia, numero)
        super(agencia, numero); //super llama o accede a cualquier atributo o metodos de la clase padre
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override //metodo de la clase padre esta siendo sobreescrito en la hija
        public boolean saca(double valor) {
            double comision = 0.2;
            return super.saca(valor + comision);
        }


}
