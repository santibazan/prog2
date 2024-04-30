import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount sa = new SavingAccount(11000,7000,true);
        sa.activarCuenta();
        System.out.println("Ingrese el dinero que quiera consignar: ");
        float cantidad=sc.nextFloat();

        sa.consignar(cantidad);

        System.out.println("Ingrese el dinero que quiera retirar: ");
        cantidad = sc.nextFloat();

        sa.retiro(cantidad);
        sa.calcularInteres();
        sa.estadoMensual();
        sa.imprimir();
    }
}