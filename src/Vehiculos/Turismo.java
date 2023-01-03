package Vehiculos;

public class Turismo extends Vehiculo
{
    private int numPuerta;
    public Turismo(String marca, String modelo, double precioAlquiler, int numPuerta)
    {
        super(marca, modelo, precioAlquiler);
        setNumPuerta(numPuerta);
    }

    public void setNumPuerta(int numPuerta) {
        this.numPuerta = numPuerta;
    }

    public void imprimirAtributos()
    {
        super.imprimirAtributos();
        System.out.printf("\t" + "Puertas: " + numPuerta);
    }
}
