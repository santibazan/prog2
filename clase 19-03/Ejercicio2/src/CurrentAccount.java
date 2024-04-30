public class CurrentAccount extends Account{
    protected float sobregiro=0;

    public CurrentAccount() {
    }

    public CurrentAccount(float saldo, float tasaAnual, float sobregiro) {
        super(saldo, tasaAnual);
        this.sobregiro = sobregiro;
    }

    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }
    public void retiro(float cantidad){
        this.Saldo -= cantidad;
        NumerosRetiros++;
        if (this.Saldo < 0){
            sobregiro += this.Saldo;
        }
    }
    public void consignar(float cantidad){
        this.consignar(cantidad);
        if (sobregiro > 0){
            sobregiro -= cantidad;
        }
    }
    public void estadoMensual(){
        this.estadoMensual();
    }
    public void imprimir(){
        System.out.println("Saldo: "+this.Saldo);
        System.out.println("Comision mensual: "+this.ComisionMensual);
        System.out.println("Cantidad de transacciones realizadas: "+(NumerosRetiros + NumeroConsignas));
        System.out.println("Sobregiro: "+ sobregiro);
    }

}
