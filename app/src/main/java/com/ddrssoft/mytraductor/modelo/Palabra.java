package com.ddrssoft.mytraductor.modelo;

public class Palabra {
    private String palabra;
    private String traducida;
    private int idFoto;

    public Palabra(String palabra, String traducida, int idFoto) {
        this.palabra = palabra;
        this.traducida = traducida;
        this.idFoto = idFoto;
    }

    public String getPalabra() {
        return palabra;
    }

    public String getTraducida() {
        return traducida;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setTraducida(String traducida) {
        this.traducida = traducida;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }
}
