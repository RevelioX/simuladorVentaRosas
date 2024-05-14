package SIM.simuladorventarosas.model;

import SIM.simuladorventarosas.auxiliar.ParProbabilidadFlor;
import SIM.simuladorventarosas.model.calculos.BuscadorValorSegunNumeroAleatorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Dia{

    protected final List<ParProbabilidadFlor> probabilidades;
    public Dia()
    {
        probabilidades = new ArrayList<ParProbabilidadFlor>();
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

    public String getName(){
        return null;
    }

}
