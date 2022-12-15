package com.danielgararr.itvavila.data;

import com.danielgararr.itvavila.domain.models.Vehiculo;

import java.util.Map;
import java.util.TreeMap;

public class VehiculoDataStore {
    private static VehiculoDataStore instance = null;

    private Map<String, Vehiculo> dataStore = new TreeMap<>();

    public void guardar(Vehiculo vehiculo) {
        dataStore.put(vehiculo.getMatricula(), vehiculo);
    }

    public void eliminar(String matricula) {
        dataStore.remove(matricula);
    }

    public Vehiculo buscar(String matricula) {
        return (Demo) dataStore.get(matricula);
    }

    public void modificar(Vehiculo vehiculo) {
        dataStore.put(vehiculo.getMatricula(), vehiculo);
    }

    public static VehiculoDataStore getInstance() {
        if (instance == null) {
            instance = new VehiculoDataStore();
        }
        return instance;
    }
}
