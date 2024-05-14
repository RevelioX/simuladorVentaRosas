package SIM.simuladorventarosas.controller;


import SIM.simuladorventarosas.auxiliar.DTOTabla;
import SIM.simuladorventarosas.generators.Generador;
import SIM.simuladorventarosas.generators.GeneradorNumerosUniformes;
import SIM.simuladorventarosas.interfaces.InterfazResultadorImplConsola;
import SIM.simuladorventarosas.model.Dia;
import SIM.simuladorventarosas.model.GestorEconomico;
import SIM.simuladorventarosas.model.Stock;

import java.util.ArrayList;
import java.util.List;

public class ControladorCalculoGananciasDiariasPromedio {
    private Integer cantidadDias;
    private Integer cantidadDocenasPorDia;

    private List<DTOTabla> listaDtoTabla;
public void setValoresInicioSimulacion(int cantidadDias, int cantidadDocenasPorDia){
    this.cantidadDias = cantidadDias;
    this.cantidadDocenasPorDia = cantidadDocenasPorDia;
    this.listaDtoTabla = new ArrayList<DTOTabla>();
}

public void iniciarSimulacion(){
    GestorEconomico gestorEconomico = new GestorEconomico();
    Stock stock = new Stock(cantidadDocenasPorDia, gestorEconomico);
    Generador generadorAleatorio = new GeneradorNumerosUniformes(0,1);

    for(int i = 0; i < cantidadDias; i++) {
        stock.comprar();

        DTOTabla itemTabla = new DTOTabla(i);
        itemTabla.setStock(cantidadDocenasPorDia);
        generadorAleatorio.generarValor(2);
        Double nroAleatorioClima = generadorAleatorio.getValor();
        Dia dia = Dia.crearNuevo(nroAleatorioClima);
        itemTabla.setNroAleatorioTipoDia(nroAleatorioClima);
        itemTabla.setTipoDía(dia.getName());

        Double nroAleatorioDemanda = generadorAleatorio.getValor();
        itemTabla.setNroAleatorioDemanda(nroAleatorioDemanda);
        Integer demandaDelDia = dia.getDemandaDia(nroAleatorioDemanda);
        stock.vender(demandaDelDia);
        listaDtoTabla.add(itemTabla);
    }
    List<Double> listaBeneficios = gestorEconomico.getListaBeneficios();
    List<Double> listaCostos = gestorEconomico.getListaCostos();
    List<Integer> cantidadesDemandadas = stock.getCantidadesDemandadas();

    for(int i = 0; i < listaCostos.size(); i++){
        DTOTabla itemTabla = listaDtoTabla.get(i);
        itemTabla.setBeneficio((double) Math.round(listaBeneficios.get(i) * 100) /100);
        itemTabla.setCostos((double) Math.round(listaCostos.get(i) * 100) / 100);
        itemTabla.setGanancia((double) Math.round((listaBeneficios.get(i) - listaCostos.get(i)) * 100)  / 100);
        itemTabla.setDemanda(cantidadesDemandadas.get(i));
    }
    for(DTOTabla dto: listaDtoTabla){
        System.out.println(dto.toString());
    }
   mostrarResultadosFinSimulación(gestorEconomico.getGananciaAbsoluta() / cantidadDias, listaDtoTabla);
}
public void mostrarResultadosFinSimulación(Double gananciaPromedio, List<DTOTabla> listaDTOTabla){
    InterfazResultadorImplConsola interfazResutados = new InterfazResultadorImplConsola();
    interfazResutados.crearNuevo(null, gananciaPromedio);

}
}
