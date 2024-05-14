package SIM.simuladorventarosas.model;

import SIM.simuladorventarosas.auxiliar.ParProbabilidadFlor;

public class DiaSoleado extends Dia{


    public DiaSoleado(){
        super();
        probabilidades.add(new ParProbabilidadFlor(0.1,6));
        probabilidades.add(new ParProbabilidadFlor(0.2,7));
        probabilidades.add(new ParProbabilidadFlor(0.45, 8));
        probabilidades.add(new ParProbabilidadFlor(0.25, 9));
    }

    public String getName(){
        return "Soleado";
    }



}
