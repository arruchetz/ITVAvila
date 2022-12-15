package com.danielgararr.itvavila.domain.usecase;

import com.danielgararr.itvavila.data.PropietarioDataStore;
import com.danielgararr.itvavila.data.VehiculoDataStore;
import com.danielgararr.itvavila.domain.models.Propietario;
import com.danielgararr.itvavila.domain.models.Vehiculo;

public class BuscarPropietarioUseCase {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public Propietario execute(String dni) {
        return dataStore.buscar(dni);
    }
}
