package SIM.simuladorventarosas.auxiliar;

public class DTOTabla {
    private int dia;

    private double nroAleatorioTipoDia;

    private String tipoDía;
    private int stock;

    private double nroAleatorioDemanda;
    private int demanda;
    private double beneficio;

    private double costos;

    private double ganancia;

    public double getNroAleatorioTipoDia() {
        return nroAleatorioTipoDia;
    }

    public void setNroAleatorioTipoDia(double nroAleatorioTipoDia) {
        this.nroAleatorioTipoDia = nroAleatorioTipoDia;
    }

    public String getTipoDía() {
        return tipoDía;
    }

    public void setTipoDía(String tipoDía) {
        this.tipoDía = tipoDía;
    }

    public double getNroAleatorioDemanda() {
        return nroAleatorioDemanda;
    }

    public void setNroAleatorioDemanda(double nroAleatorioDemanda) {
        this.nroAleatorioDemanda = nroAleatorioDemanda;
    }

    public DTOTabla(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDemanda() {
        return demanda;
    }

    public void setDemanda(int demanda) {
        this.demanda = demanda;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public double getCostos() {
        return costos;
    }

    public void setCostos(double costos) {
        this.costos = costos;
    }

    public double getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }

    @Override
    public String toString() {
        return "DTOTabla{" +
                "dia=" + dia +
                ", nroAleatorioTipoDia=" + nroAleatorioTipoDia +
                ", tipoDía='" + tipoDía + '\'' +
                ", stock=" + stock +
                //", nroAleatorioDemanda=" + nroAleatorioDemanda +
                ", demanda=" + demanda +
                ", beneficio=" + beneficio +
                ", costos=" + costos +
                ", ganancia=" + ganancia +

                '}';
    }
}
