public class PruebaFactura {
    public static void main(String[] args) {
        Factura factura1 = new Factura("1234", "Martillo", 2, 14.95);
        Factura factura2 = new Factura("6787", "Pintura", -5, -9.99);

        System.out.println("Factura inicial:");
        imprimirFactura(factura1);

        factura1.establecerNumeroPieza("4321");
        factura1.establecerDescripcionPieza("Destornillador");
        factura1.establecerCantidad(3);
        factura1.establecerPrecioPorArticulo(7.50);

        System.out.println("\nFactura con datos actualizados:");
        imprimirFactura(factura1);

        System.out.println("\nFactura creada con cantidad y precio invalidos (negativos):");
        imprimirFactura(factura2);
    }

    private static void imprimirFactura(Factura factura) {
        System.out.printf("Numero de pieza: %s%n", factura.obtenerNumeroPieza());
        System.out.printf("Descripcion: %s%n", factura.obtenerDescripcionPieza());
        System.out.printf("Cantidad: %d%n", factura.obtenerCantidad());
        System.out.printf("Precio por articulo: $%.2f%n", factura.obtenerPrecioPorArticulo());
        System.out.printf("Monto de la factura: $%.2f%n", factura.obtenerMontoFactura());
    }
}
