package SIM.simuladorventarosas.model.calculos;

import SIM.simuladorventarosas.auxiliar.ParProbabilidadFlor;

import java.util.List;
import java.util.Map;

public class BuscadorValorSegunNumeroAleatorio {
    private List<ParProbabilidadFlor> probabilidades;
    private Double numeroAleatorio;
    public BuscadorValorSegunNumeroAleatorio(List<ParProbabilidadFlor> probabilidades, double numeroAleatorio){
        this.probabilidades = probabilidades;
        this.numeroAleatorio = numeroAleatorio;
    }

//    public Integer buscar(){
//        double probabilidadAcumulada = 0;
//        for( Map.Entry<Double, Integer> parProbabilidadDemanda : probabilidades.entrySet()){
//            probabilidadAcumulada += parProbabilidadDemanda.getKey();
//            if(numeroAleatorio < probabilidadAcumulada){
//                return parProbabilidadDemanda.getValue();
//            }
//        }
//        return probabilidades.get(probabilidades.size() - 1);
//    }

    public Integer buscar(){
        for( ParProbabilidadFlor par: probabilidades){
            if( numeroAleatorio < par.getProbabilidad()){
                return par.getCantFlores();
            }
        }
        return probabilidades.get(probabilidades.size() -1 ).getCantFlores();
    }
}
