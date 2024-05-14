package SIM.simuladorventarosas.auxiliar;

public class ParProbabilidadFlor {
    private Double probabilidad;
    private int cantFlores;

    public ParProbabilidadFlor(Double probabilidad, int cantFlores) {
        this.probabilidad = probabilidad;
        this.cantFlores = cantFlores;
    }

    public Double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(Double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public int getCantFlores() {
        return cantFlores;
    }

    public void setCantFlores(int cantFlores) {
        this.cantFlores = cantFlores;
    }
}
