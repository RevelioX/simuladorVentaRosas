package SIM.simuladorventarosas.model;

public class DiaSoleado extends Dia{


    public DiaSoleado(){
        super();
        probabilidades.put(0.1, 6);
        probabilidades.put(0.2, 7);
        probabilidades.put(0.45, 8);
        probabilidades.put(0.25, 9);
    }



}
