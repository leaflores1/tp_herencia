public class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioBasePorAsiento;

    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBasePorAsiento;
    }

    @Override
    public void aplicarPromocion(double porcentajeDescuento) {
        this.precioBasePorAsiento -= this.precioBasePorAsiento * porcentajeDescuento / 100;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Vuelo Regular");
        System.out.println("Número de Asientos: " + numeroAsientos);
        System.out.println("Precio Base por Asiento: $" + precioBasePorAsiento);
        System.out.println("Precio Total: $" + calcularPrecio());
    }
}
