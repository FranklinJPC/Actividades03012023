package listas;
import Vehiculos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehiculos
{
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        List listaVehiculos = new ArrayList();
        String marca, modelo;
        int precio, plazas;

        listaVehiculos.add(new Vehiculo("Mercedes" , "E", 55));
        listaVehiculos.add(new Autobus("Nissan", "Frontier", 100,2));
        listaVehiculos.add(new Turismo("BMW", "525", 50, 4));
        listaVehiculos.add(new Turismo("Audi", "A4", 55, 4));
        listaVehiculos.add(new Autobus("Mercedes", "M10", 120, 30));
        listaVehiculos.add(new Turismo("VM", "Passat", 35, 4));
        listaVehiculos.add(new Turismo("Audi", "A3", 30, 2));
        listaVehiculos.add(new Turismo("Mercedes", "E", 60, 4));
        listaVehiculos.add(new Vehiculo("Audi", "A3", 30));
        imprimirElementosLista((ArrayList) listaVehiculos);

        System.out.println("1. Autobus");
        System.out.println("2. Turismo");
        System.out.println("3. Vehiculo");
        System.out.println("0. SALIR");
        System.out.print("Tipo de vehiculo a ingresar: ");
        int num = scn.nextInt();
        switch (num)
        {
            case 1:
                System.out.print("Ingrese la marca: ");
                marca = scn.next();
                System.out.print("Ingrese el modelo: ");
                modelo = scn.next();
                System.out.print("Ingrese el precio: ");
                precio = scn.nextInt();
                listaVehiculos.add(new Vehiculo(marca, modelo, precio));
                break;
            case 2:
                break;
            case 3:
                break;
        }


    }

     public static void imprimirElementosLista(ArrayList lista)
     {
         for (int i = 0; i < lista.size(); i++)
         {
             Vehiculo v = (Vehiculo) lista.get(i);
             v.imprimirAtributos();
             System.out.println("");
         }

     }
}
