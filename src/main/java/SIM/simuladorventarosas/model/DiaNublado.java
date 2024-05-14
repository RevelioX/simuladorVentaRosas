package SIM.simuladorventarosas.model;

import SIM.simuladorventarosas.auxiliar.ParProbabilidadFlor;

public class DiaNublado extends Dia {

    public DiaNublado(){


        super();
        probabilidades.add(new ParProbabilidadFlor(0.05,3));
        probabilidades.add(new ParProbabilidadFlor(0.15,4));
        probabilidades.add(new ParProbabilidadFlor(0.4, 5));
        probabilidades.add(new ParProbabilidadFlor(0.25,6));
        probabilidades.add(new ParProbabilidadFlor(0.16,7));
    }

    public String getName(){
        return "Nublado";
    }

}