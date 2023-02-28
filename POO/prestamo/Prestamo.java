package prestamo;
import java.time.LocalDate;

class Prestamo {
    private int documento;
    private String nombre;
    private int valorPrestamo;
    private int valorPrestamoInteres;
    private LocalDate fechaPrestamo;
    private int interes;
    private int numeroCuotas;

    public Prestamo() {
        // this.documento = 0;
        // this.nombre = "";
        // this.valorPrestamo = 0;
        // this.valorPrestamoInteres = 0;
        // this.fechaPrestamo = LocalDate.now();
        // this.interes = 0;
        // this.numeroCuotas = 0;
    }

    public Prestamo(int documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
        this.valorPrestamo = 0;
        this.valorPrestamoInteres = 0;
        this.fechaPrestamo = LocalDate.now();
        this.interes = 0;
        this.numeroCuotas = 0;
    }

    private void calcularValorTotalPrestamo() {
        this.valorPrestamoInteres = this.valorPrestamo + (this.valorPrestamo * ((this.interes / 100)) * this.numeroCuotas);
        
    }

    public double valorPagarCuotasInteres() {
        return this.valorPrestamoInteres / this.numeroCuotas;
    }

    public double valorPagarCuotas() {
        return this.valorPrestamo / this.numeroCuotas;
    }

    public void pagarCuota(double valorPagar) {
        if (valorPagar <= this.valorPrestamoInteres) {
            this.valorPrestamoInteres -= valorPagar;
        } else {
            System.out.println("El valor a pagar es mayor al valor pendiente del préstamo");
        }
    }

    public void refinanciar(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
        calcularValorTotalPrestamo();
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nDocumento: " + this.documento +  "\nValor Prestamo: " + this.valorPrestamo + "\nValor Prestamo con Intereses: " + this.valorPrestamoInteres + "\nFecha Prestamo: " + this.fechaPrestamo + "\nInteres: " + this.interes + "\nNumero de Cuotas: " + this.numeroCuotas;
    }

    public int getDocumento() {
        return this.documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorPrestamo() {
        return valorPrestamo;
    }

    public void setValorPrestamo(int valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

    public int getValorPrestamoInteres() {
        return valorPrestamoInteres;
    }

    public void setValorPrestamoInteres(int valorPrestamoInteres) {
        this.valorPrestamoInteres = valorPrestamoInteres;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }
}