package SIM.simuladorventarosas.modelo;

import SIM.simuladorventarosas.modelo.calculos.BuscadorValorSegunNumeroAleatorio;

import java.util.HashMap;
import java.util.Map;

public class DiaNublado extends Dia {

    public DiaNublado(){

        //TODO - ACA HAY UN ARREGLO TEMPORAL.
        //TODO - NO SE PUEDE USAR KEYMAP PARA GUARDAR ESTO, ASI Q CAMBIE LAS PROB. PARA Q FUNCIONE

        super();
        probabilidades.put(0.05, 3);
        probabilidades.put(0.14, 4);
        probabilidades.put(0.40, 5);
        probabilidades.put(0.25, 6);
        probabilidades.put(0.16, 7);
    }

}
