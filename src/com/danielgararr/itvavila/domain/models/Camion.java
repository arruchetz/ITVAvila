package com.danielgararr.itvavila.domain.models;

public class Camion implements Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private Integer anoMatriculacion;
    private Integer tara;
    private Integer longitud;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAnoMatriculacion() {
        return anoMatriculacion;
    }

    public void setAnoMatriculacion(Integer anoMatriculacion) {
        this.anoMatriculacion = anoMatriculacion;
    }

    public Integer getTara() {
        return tara;
    }

    public void setTara(Integer tara) {
        this.tara = tara;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }
}
