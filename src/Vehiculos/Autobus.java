package Vehiculos;

public class Autobus extends Vehiculo
{
    private int numPlazas;
    public Autobus(String marca, String modelo, double precioAlquiler, int numPlazas) {
        super(marca, modelo, precioAlquiler);
        setNumPlazas(numPlazas);
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public void imprimirAtributos()
    {
        super.imprimirAtributos();
        System.out.printf("\t" + "Plazas: " + numPlazas);
    }
}
