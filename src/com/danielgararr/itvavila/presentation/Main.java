package com.danielgararr.itvavila.presentation;

import com.danielgararr.itvavila.domain.models.*;
import com.danielgararr.itvavila.domain.usecase.BuscarVehiculoUseCase;

public class Main {
    public static void main(String[] args) {

        Propietario propietario = new Propietario();
        propietario.setDni("1");
        propietario.setNombre("Nombre1");

        Camion camion = new Camion();
        camion.setMatricula("1");
        camion.setMarca("Marca1");
        camion.setLongitud(3);

        Coche coche = new Coche();
        coche.setMatricula("2");
        coche.setMarca("Marca2");
        coche.setNumPuertas(5);

        Inspeccion inspeccion = new Inspeccion();
        inspeccion.setCodigo("1");
        inspeccion.setFecha("15 del 12 de 2022");
        inspeccion.setResultado(false);
        inspeccion.setMatricula("1");
        inspeccion.setDni(1);

        Inspeccion inspeccion1 = new Inspeccion();
        inspeccion1.setCodigo("2");
        inspeccion1.setFecha("15 del 12 de 2022");
        inspeccion1.setResultado(false);
        inspeccion1.setMatricula("1");
        inspeccion1.setDni(1);


        BuscarVehiculoUseCase buscarVehiculoUseCase = new BuscarVehiculoUseCase();
        Vehiculo vehiculoBuscado = buscarVehiculoUseCase.execute("1"); //Pongo el código del Demo que quiero recuperar
        System.out.println("Vehiculo buscado" + vehiculoBuscado.getMatricula() + " | " + vehiculoBuscado.getMarca());

        BuscarVehiculoUseCase buscarVehiculoUseCase = new BuscarVehiculoUseCase();
        Vehiculo vehiculoBuscado = buscarVehiculoUseCase.execute("1"); //Pongo el código del Demo que quiero recuperar
        System.out.println("Vehiculo buscado" + vehiculoBuscado.getMatricula() + " | " + vehiculoBuscado.getMarca());
    }
}