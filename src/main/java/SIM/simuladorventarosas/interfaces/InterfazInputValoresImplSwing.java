package SIM.simuladorventarosas.interfaces;

import SIM.simuladorventarosas.controller.ControladorCalculoGananciasDiariasPromedio;

import javax.swing.*;

public class InterfazInputValoresImplSwing implements InterfazInputValores {
    ControladorCalculoGananciasDiariasPromedio controladorCalculoGananciasDiariasPromedio;

    public InterfazInputValoresImplSwing(ControladorCalculoGananciasDiariasPromedio controladorCalculoGananciasDiariasPromedio) {
        this.controladorCalculoGananciasDiariasPromedio = controladorCalculoGananciasDiariasPromedio;

        // Crear y mostrar el cuadro de diálogo de entrada de valores
        JFrame frame = new JFrame("Entrada de valores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel("Ingrese la cantidad de días de simulación: ");
        JTextField textField1 = new JTextField(10);

        JLabel label2 = new JLabel("Ingrese la cantidad de docenas que se compran por día: ");
        JTextField textField2 = new JTextField(10);

        JButton button = new JButton("Aceptar");
        button.addActionListener(e -> {
            int cantidadDias = Integer.parseInt(textField1.getText());
            int cantidadDocenasPorDia = Integer.parseInt(textField2.getText());

            controladorCalculoGananciasDiariasPromedio.setValoresInicioSimulacion(cantidadDias, cantidadDocenasPorDia);
            controladorCalculoGananciasDiariasPromedio.iniciarSimulacion();

            frame.dispose(); // Cerrar el cuadro de diálogo después de aceptar los valores
        });

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void setValoresSimulacion(int diasDuracionSimulacion, int cantDocenasCompradasPorDia) {

    }

}
