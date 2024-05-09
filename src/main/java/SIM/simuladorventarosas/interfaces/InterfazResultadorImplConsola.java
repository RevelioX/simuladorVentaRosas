package SIM.simuladorventarosas.interfaces;

import java.util.Map;

public class InterfazResultadorImplConsola implements InterfazResultados {
    private Map<Integer, Double> gananciasPorSemana;

    private Double gananciasPromedio;

    public InterfazResultadorImplConsola() {

    }

    public InterfazResultadorImplConsola(Map<Integer, Double> gananciasPorSemana, Double gananciasPromedio) {
        gananciasPorSemana = gananciasPorSemana;
        gananciasPromedio = gananciasPromedio;
    }


    @Override
    public InterfazResultados crearNuevo(Map<Integer, Double> gananciasPorSemana, Double gananciasPromedio) {

        System.out.println("Ganancias Promedio  :  " + gananciasPromedio);
        return this;

    }
}

