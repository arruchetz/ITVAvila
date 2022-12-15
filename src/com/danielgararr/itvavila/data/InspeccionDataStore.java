package com.danielgararr.itvavila.data;

import com.danielgararr.itvavila.domain.models.Inspeccion;

import java.util.Map;
import java.util.TreeMap;

public class InspeccionDataStore {
    private static InspeccionDataStore instance = null;

    private Map<String, Inspeccion> dataStore = new TreeMap<>();

    public void guardar(Inspeccion inspeccion) {
        dataStore.put(inspeccion.getCodigo(), inspeccion);
    }

    public void eliminar(String codigo) {
        dataStore.remove(codigo);
    }

    public Inspeccion buscar(String codigo) {
        return dataStore.get(codigo);
    }

    public void modificar(Inspeccion inspeccion) {
        dataStore.put(inspeccion.getCodigo(), inspeccion);
    }

    public static InspeccionDataStore getInstance() {
        if (instance == null) {
            instance = new InspeccionDataStore();
        }
        return instance;
    }
}
