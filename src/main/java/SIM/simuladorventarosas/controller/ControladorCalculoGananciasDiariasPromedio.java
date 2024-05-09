package SIM.simuladorventarosas.controller;


import SIM.simuladorventarosas.generators.Generador;
import SIM.simuladorventarosas.generators.GeneradorNumerosUniformes;
import SIM.simuladorventarosas.interfaces.InterfazResultadorImplConsola;
import SIM.simuladorventarosas.modelo.Dia;
import SIM.simuladorventarosas.modelo.GestorEconomico;
import SIM.simuladorventarosas.modelo.Stock;

public class ControladorCalculoGananciasDiariasPromedio {
    Integer cantidadDias;
    Integer cantidadDocenasPorDia;
public void setValoresInicioSimulacion(int cantidadDias, int cantidadDocenasPorDia){
    this.cantidadDias = cantidadDias;
    this.cantidadDocenasPorDia = cantidadDocenasPorDia;
}

public void iniciarSimulacion(){
    GestorEconomico gestorEconomico = new GestorEconomico();
    Stock stock = new Stock(cantidadDocenasPorDia, gestorEconomico);
    Generador generadorAleatorio = new GeneradorNumerosUniformes(0,1);

    for(int i = 0; i < cantidadDias; i++) {
        stock.comprar();

        generadorAleatorio.generarValor(2);
        Double nroAleatorioClima = generadorAleatorio.getValor();
        Dia dia = Dia.crearNuevo(nroAleatorioClima);

        Double nroAleatorioDemanda = generadorAleatorio.getValor();
        Integer demandaDelDia = dia.getDemandaDia(nroAleatorioDemanda);
        stock.vender(demandaDelDia);

    }
    mostrarResultadosFinSimulación(gestorEconomico.getGananciaAbsoluta() / cantidadDias);
}
public void mostrarResultadosFinSimulación(Double gananciaPromedio){
    InterfazResultadorImplConsola interfazResutados = new InterfazResultadorImplConsola();
    interfazResutados.crearNuevo(null, gananciaPromedio);

}
}
