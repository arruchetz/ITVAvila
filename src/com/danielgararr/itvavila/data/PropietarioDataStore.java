package com.danielgararr.itvavila.data;

import com.danielgararr.itvavila.domain.models.Propietario;

import java.util.Map;
import java.util.TreeMap;

public class PropietarioDataStore {
    private static PropietarioDataStore instance = null;

    private Map<String, Propietario> dataStore = new TreeMap<String, Propietario>();

    public void guardar(Propietario propietario) {
        dataStore.put(propietario.getDni(), propietario);
    }

    public void eliminar(String dni) {
        dataStore.remove(dni);
    }

    public Propietario buscar(String dni) {
        return dataStore.get(dni);
    }

    public void modificar(Propietario propietario) {
        dataStore.put(propietario.getDni(), propietario);
    }

    public static PropietarioDataStore getInstance() {
        if (instance == null) {
            instance = new PropietarioDataStore();
        }
        return instance;
    }
}
