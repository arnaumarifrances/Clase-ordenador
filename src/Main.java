// Esta clase contiene el método main, que es el punto de inicio del programa
public class Main {
    public static void main(String[] args) {

        // Creamos 3 objetos tipo Ordenador con distintos valores
        Ordenador ordenador1 = new Ordenador("Arnau", "Estresado", 16, 1000, 1.000);
        Ordenador ordenador2 = new Ordenador("Drölma", "Dramatica", 32, 500, 1.000);
        Ordenador ordenador3 = new Ordenador("Hari", "Miedosa", 8, 10, 10.000);

        // 1️⃣ Imprimir toda la información de cada ordenador usando toString
        System.out.println("+++ Caracteristicas +++");
        System.out.println(ordenador1);
        System.out.println(ordenador2);
        System.out.println(ordenador3);

        // 2️⃣ Imprimir solo la marca y el precio del segundo ordenador
        System.out.println("+++ 1/2 Informacion +++");
        System.out.println("Marca del ordenador 2: " + ordenador2.getMarca());
        System.out.println("Precio del ordenador 2: " + ordenador2.getPrecio() + " €");

        // 3️⃣ Cambiar el precio del tercer ordenador y volver a mostrarlo
        ordenador3.setPrecio(666.605); // simula una rebaja
        System.out.println("+++ Despues de cambiar el precio +++");
        System.out.println("Nuevo precio del ordenador 3: " + ordenador3.getPrecio() + " €");
    }
}
