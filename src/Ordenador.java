// Definimos la clase Ordenador que representará un objeto tipo ordenador
public class Ordenador {

    // Atributos principales del ordenador
    private String marca;
    private String modelo;
    private int memoriaRAM;   // Memoria RAM en GB
    private int discoDuro;    //
    private double precio;    // Precio en euros Capacidad de almacenamiento en GB

    // Constructor para crear un nuevo ordenador con todos los atributos
    public Ordenador(String marca, String modelo, int memoriaRAM, int discoDuro, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.discoDuro = discoDuro;
        this.precio = precio;
    }

    // Métodos getters (sirven para obtener el valor de los atributos)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public double getPrecio() {
        return precio;
    }

    // Métodos setters (sirven para modificar el valor de los atributos)
    public void setMarca(String nuevaMarca) {
        marca = nuevaMarca;
    }

    public void setModelo(String nuevoModelo) {
        modelo = nuevoModelo;
    }

    public void setMemoriaRAM(int nuevaMemoria) {
        memoriaRAM = nuevaMemoria;
    }

    public void setDiscoDuro(int nuevoDisco) {
        discoDuro = nuevoDisco;
    }

    public void setPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
    }

    // Devuelve descripcion completa
    @Override
    public String toString() {
        return "Ordenador:\n" +
                "- Marca: " + marca + "\n" +
                "- Modelo: " + modelo + "\n" +
                "- Memoria RAM: " + memoriaRAM + " GB\n" +
                "- Disco Duro: " + discoDuro + " GB\n" +
                "- Precio: " + precio + " €\n";
    }
}
