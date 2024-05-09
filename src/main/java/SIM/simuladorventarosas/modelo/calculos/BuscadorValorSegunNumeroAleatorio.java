package SIM.simuladorventarosas.modelo.calculos;

import java.util.Map;

public class BuscadorValorSegunNumeroAleatorio {
    private Map<Double, Integer> probabilidades;
    private Double numeroAleatorio;
    public BuscadorValorSegunNumeroAleatorio(Map<Double, Integer> probabilidades, double numeroAleatorio){
        this.probabilidades = probabilidades;
        this.numeroAleatorio = numeroAleatorio;
    }

    public Integer buscar(){
        double probabilidadAcumulada = 0;
        for( Map.Entry<Double, Integer> parProbabilidadDemanda : probabilidades.entrySet()){
            probabilidadAcumulada += parProbabilidadDemanda.getKey();
            if(numeroAleatorio < probabilidadAcumulada){
                return parProbabilidadDemanda.getValue();
            }
        }
        return probabilidades.get(probabilidades.size() - 1);
    }
}
