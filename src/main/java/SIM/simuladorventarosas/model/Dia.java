package SIM.simuladorventarosas.model;

import SIM.simuladorventarosas.model.calculos.BuscadorValorSegunNumeroAleatorio;

import java.util.HashMap;
import java.util.Map;

public abstract class Dia {

    protected final Map<Double, Integer> probabilidades;
    public Dia(){
        probabilidades = new HashMap<>();
    }

    public static Dia crearNuevo(double numeroAleatorio){
        if( numeroAleatorio < 0.75){
            return new DiaSoleado();
        }else{
            return new DiaNublado();
        }
    }

    public Integer getDemandaDia(double numeroAleatorio) {
        BuscadorValorSegunNumeroAleatorio buscador = new BuscadorValorSegunNumeroAleatorio(probabilidades, numeroAleatorio);
        return buscador.buscar();
    }

}
