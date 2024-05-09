package SIM.simuladorventarosas;

import SIM.simuladorventarosas.controller.ControladorCalculoGananciasDiariasPromedio;
import SIM.simuladorventarosas.interfaces.InterfazInputValoresImplConsola;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.naming.ldap.Control;

public class SimuladorVentaRosasApplication {

    public static void main(String[] args) {
        ControladorCalculoGananciasDiariasPromedio controller = new ControladorCalculoGananciasDiariasPromedio();
        InterfazInputValoresImplConsola interfaz = new InterfazInputValoresImplConsola(controller);

    }

}
