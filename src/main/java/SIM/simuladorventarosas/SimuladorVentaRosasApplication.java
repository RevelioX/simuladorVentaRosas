package SIM.simuladorventarosas;

import SIM.simuladorventarosas.controller.ControladorCalculoGananciasDiariasPromedio;
import SIM.simuladorventarosas.interfaces.InterfazInputValoresImplConsola;
import SIM.simuladorventarosas.interfaces.InterfazInputValoresImplSwing;

public class SimuladorVentaRosasApplication {

    public static void main(String[] args) {
        ControladorCalculoGananciasDiariasPromedio controller = new ControladorCalculoGananciasDiariasPromedio();
        InterfazInputValoresImplSwing interfaz = new InterfazInputValoresImplSwing(controller);



    }

}
