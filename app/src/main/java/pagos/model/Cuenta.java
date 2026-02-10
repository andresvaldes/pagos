package alkewallet.model; 

public class Cuenta {
    private int idCuenta;
    private String titular;
    private double saldo; // Usamos double para permitir decimales en dinero

    public Cuenta(int idCuenta, String titular, double saldoInicial) {
        this.idCuenta = idCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Ver saldo disponible
    public double getSaldo() {
        return saldo;
    }

    // Realizar ingreso (Depósito)
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: El monto a depositar debe ser positivo.");
        }
    }

    // Realizar retiro (debe impactar el saldo)
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: Fondos insuficientes o monto no válido.");
        }
    }
}