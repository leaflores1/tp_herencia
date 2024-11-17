public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        VueloRegular vuelo1 = new VueloRegular("VR123", "Buenos Aires", "Santiago", "2024-12-01", 100, 200);
        VueloCharter vuelo2 = new VueloCharter("VC456", "Mendoza", "Miami", "2024-12-15", 15000);

        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);

        System.out.println("=== Reservas Iniciales ===");
        reservas.mostrarReservas();

        System.out.println("Aplicando promoción del 10%...");
        reservas.aplicarPromociones(10);

        System.out.println("\n=== Reservas con Descuento ===");
        reservas.mostrarReservas();

        System.out.println("Precio Total de las Reservas: $" + reservas.calcularPrecioTotal());
    }
}
