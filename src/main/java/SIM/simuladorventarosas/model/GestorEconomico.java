package SIM.simuladorventarosas.model;

import java.util.ArrayList;
import java.util.List;

public class GestorEconomico {
    private Double costos;
    private List<Double> listaCostos;
    private Double beneficios;

    private List<Double> listaBeneficios;

    //Considero beneficio = precioVenta * cantidadFloresVendidas y
    //considero ganancia = beneficio - costo. (?No se si economicamente sera correcto,
    //tampoco me importa)

    public GestorEconomico(){
        costos = (double) 0;
        beneficios = (double) 0;
        listaCostos = new ArrayList<>();
        listaBeneficios = new ArrayList<>();
    }

    public void añadirCosto(Double costo){
        this.costos += costo;
        listaCostos.add( costo);
    }

    public void añadirBeneficio(Double beneficio){
        this.beneficios += beneficio;
        listaBeneficios.add(beneficio);
        System.out.println("BENEFICIO: " + beneficio);
    }

    public Double getGananciaAbsoluta(){
        return beneficios - costos;
    }

    public List<Double> getListaCostos(){
        return listaCostos;
    }

    public List<Double> getListaBeneficios(){
        return listaBeneficios;
    }

}
