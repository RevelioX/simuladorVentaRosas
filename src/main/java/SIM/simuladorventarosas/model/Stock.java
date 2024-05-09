package SIM.simuladorventarosas.model;

public class Stock {
    public Integer cantStock;
    public Integer cantDocenasCompradasPorDia;

    public GestorEconomico gestorEconomico;

    public Stock(Integer cantDocenasCompradasPorDia, GestorEconomico gestorEconomico){
        this.gestorEconomico = gestorEconomico;
        this.cantStock = 0;
        this.cantDocenasCompradasPorDia = cantDocenasCompradasPorDia;
    }

    public void comprar(){
        cantStock += cantDocenasCompradasPorDia;
        gestorEconomico.añadirCosto((double)cantDocenasCompradasPorDia * 8);
    }

    public void vender(Integer cantidadDemandada){
        if( cantidadDemandada <= cantStock){
            cantStock = cantStock - cantidadDemandada;
            gestorEconomico.añadirBeneficio((double)cantidadDemandada * 12);
            venderNoVendido();
        }else{
            gestorEconomico.añadirBeneficio( ((double)cantStock) * 12);
            cantStock = 0;
        }
    }

    public void venderNoVendido(){
        gestorEconomico.añadirBeneficio( cantStock * 1.2);
        cantStock = 0;
    }

}
