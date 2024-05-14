package SIM.simuladorventarosas.model;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    public Integer cantStock;
    public Integer cantDocenasCompradasPorDia;
    public GestorEconomico gestorEconomico;

    private List<Integer> cantidadesDemandadas;

    public Stock(Integer cantDocenasCompradasPorDia, GestorEconomico gestorEconomico){
        this.gestorEconomico = gestorEconomico;
        this.cantStock = 0;
        this.cantDocenasCompradasPorDia = cantDocenasCompradasPorDia;
        cantidadesDemandadas = new ArrayList<Integer>();
    }

    public void comprar(){
        cantStock += cantDocenasCompradasPorDia;
        gestorEconomico.añadirCosto((double)cantDocenasCompradasPorDia * 8);
    }

    public void vender(Integer cantidadDemandada){
        cantidadesDemandadas.add(cantidadDemandada);
        if( cantidadDemandada < cantStock){
            cantStock = cantStock - cantidadDemandada;
            gestorEconomico.añadirBeneficio((double)cantidadDemandada * 12 + cantStock * 1.2);
        }else{
            gestorEconomico.añadirBeneficio( ((double)cantStock) * 12);
            cantStock = 0;
        }
    }

    public List<Integer> getCantidadesDemandadas(){
        return cantidadesDemandadas;
    }

//    public void venderNoVendido(){
//        gestorEconomico.añadirBeneficio( cantStock * 1.2);
//        cantStock = 0;
//    }

}
