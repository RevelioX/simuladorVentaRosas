package SIM.simuladorventarosas.interfaces;

import SIM.simuladorventarosas.controller.ControladorCalculoGananciasDiariasPromedio;

import java.util.Scanner;

public class InterfazInputValoresImplConsola implements InterfazInputValores{

    ControladorCalculoGananciasDiariasPromedio controladorCalculoGananciasDiariasPromedio;

    public InterfazInputValoresImplConsola(ControladorCalculoGananciasDiariasPromedio controladorCalculoGananciasDiariasPromedio){
        this.controladorCalculoGananciasDiariasPromedio = controladorCalculoGananciasDiariasPromedio;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de días de simulación: ");
        int cantidadDias = scanner.nextInt();

        System.out.print("Ingrese la cantidad de docenas que se compran por día: ");
        int cantidadDocenasPorDia = scanner.nextInt();

        scanner.close();

        controladorCalculoGananciasDiariasPromedio.setValoresInicioSimulacion(cantidadDias,cantidadDocenasPorDia);
        controladorCalculoGananciasDiariasPromedio.iniciarSimulacion();
    }

    @Override
    public void setValoresSimulacion(int diasDuracionSimulacion, int cantDocenasCompradasPorDia) {

    }
}
