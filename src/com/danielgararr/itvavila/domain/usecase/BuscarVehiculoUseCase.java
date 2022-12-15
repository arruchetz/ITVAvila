package com.danielgararr.itvavila.domain.usecase;

import com.danielgararr.itvavila.data.VehiculoDataStore;
import com.danielgararr.itvavila.domain.models.Vehiculo;

public class BuscarVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public Vehiculo execute(String matricula) {
        return (Vehiculo) dataStore.buscar(matricula);
    }
}
