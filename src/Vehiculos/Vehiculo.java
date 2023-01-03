package Vehiculos;

public class Vehiculo
{
    private String marca, modelo;
    private double precioAquiler;

    public Vehiculo(String marca, String modelo, double precioAlquiler)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.precioAquiler = precioAlquiler;
    }

    public void setPrecioAquiler(double precioAquiler) {
        this.precioAquiler = precioAquiler;
    }

    public void imprimirAtributos()
    {
        System.out.println("Modelo: " + marca + " " + modelo + "\t" + "Precio: " + precioAquiler);
    }
}
