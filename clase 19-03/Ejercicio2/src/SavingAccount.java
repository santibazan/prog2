public class SavingAccount extends Account{
    protected boolean activa;

    public SavingAccount(){

    }
    public SavingAccount(float saldo, float tasaAnual, boolean activa) {
        super(saldo, tasaAnual);
        this.activa = activa;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    public void activarCuenta(){
        if (this.Saldo<=10000.0){
            activa = false;
        }else {
            activa = true;
        }
    }
    public void consignar(float cantidad){
        if(activa == true){
            this.Saldo += cantidad;
            this.NumeroConsignas++;
        }
    }

    public void retiro(float cantidad){
        if (activa=true){
            float nuevoSalario = this.Saldo - cantidad;
            if (nuevoSalario>=0){
                this.Saldo -= cantidad;
                NumeroConsignas++;
            }else {
                System.out.println("Fondos insuficientes para el retiro");
            }
        }
    }
    public void calcularInteres(){
        float tasaMensual = this.TasaAnual/12;
        float interesMensual=this.Saldo*tasaMensual;
        this.Saldo = interesMensual;
    }

    public void estadoMensual(){
        if (NumerosRetiros > 4){
            this.ComisionMensual = (NumerosRetiros-4)*100;
        }
        this.Saldo -= this.ComisionMensual;
        calcularInteres();
        activarCuenta();
    }
    public void imprimir(){
        System.out.println("Saldo: "+this.Saldo);
        System.out.println("Comision mensual: "+this.ComisionMensual);
        System.out.println("Numero de transacciones realizadas: "+(NumerosRetiros+NumeroConsignas));
    }

}
