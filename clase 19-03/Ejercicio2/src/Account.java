public class Account {
    protected float Saldo;
    protected int NumeroConsignas = 0;
    protected int NumerosRetiros = 0;
    protected float TasaAnual;
    protected float ComisionMensual =0;

    public Account() {
    }

    public Account(float saldo, float tasaAnual) {
        this.Saldo = saldo;
        this.TasaAnual = tasaAnual;
    }

    public void consignar(float cantidad){
        Saldo += cantidad;
        NumeroConsignas++;
    }
    public void retiro(float cantidad){
        float SaldoActualizado = Saldo -cantidad;
        if (SaldoActualizado>=0){
            Saldo-=cantidad;
            NumerosRetiros++;

        }else {
            System.out.println("No se puede retirar mas del saldo actual");
        }
    }
    public void calcularInteres(){
        float tasaMensual= TasaAnual/12;
        float interesMensual=tasaMensual*Saldo;
        Saldo += interesMensual;
    }
    public void estadoMensual(){
        Saldo -= ComisionMensual;
        calcularInteres();
    }
    public void imprimir(){
        System.out.println("Saldo "+Saldo);
        System.out.println("Numero de consignas "+NumeroConsignas);
        System.out.println("Numero de retiros "+NumerosRetiros);
        System.out.println("Tasa anual "+TasaAnual);
        System.out.println("Comision mensual "+ComisionMensual);
    }
}
