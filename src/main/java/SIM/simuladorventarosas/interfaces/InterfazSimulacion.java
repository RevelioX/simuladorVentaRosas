package SIM.simuladorventarosas.interfaces;

import SIM.simuladorventarosas.auxiliar.DTOTabla;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.List;

public class InterfazSimulacion extends JFrame {

  public void MostrarDatos(List<DTOTabla> datos, Double ganancia) {
    Double gananciaAcumulada = 0.0;
    String[] columnas = {"dia", "nroAleatorioTipoDia", "tipoDia", "stock", "nroAleatorioDemanda", "demanda", "beneficio", "costos", "ganancia", "ganancia AC"};
    DefaultTableModel model = new DefaultTableModel(columnas, 0);
    for (DTOTabla dto : datos) {
      gananciaAcumulada += dto.getGanancia();
      DecimalFormat df = new DecimalFormat("#.#");
      gananciaAcumulada = Double.parseDouble(df.format(gananciaAcumulada).replace(",", "."));
      Object[] fila = {dto.getDia(), dto.getNroAleatorioTipoDia(), dto.getTipoDía(), dto.getStock(), dto.getNroAleatorioDemanda(), dto.getDemanda(), dto.getBeneficio(), dto.getCostos(), dto.getGanancia(), gananciaAcumulada};
      model.addRow(fila);
    }
    CrearTabla(new JTable(model), ganancia);
  }

  private void CrearTabla(JTable tabla, Double ganancia){
    JPanel panelTabla = new JPanel(new BorderLayout());
    panelTabla.add(new JScrollPane(tabla), BorderLayout.CENTER);
    DecimalFormat df = new DecimalFormat("#.#");
    ganancia = Double.parseDouble(df.format(ganancia).replace(",", "."));

    JLabel labelGananciaPromedio = new JLabel("Ganancia promedio: " + ganancia);
    JPanel panelGananciaPromedio = new JPanel();
    panelGananciaPromedio.add(labelGananciaPromedio);

    JPanel panelContenedor = new JPanel(new BorderLayout());
    panelContenedor.add(panelTabla, BorderLayout.CENTER);
    panelContenedor.add(panelGananciaPromedio, BorderLayout.EAST);

    JFrame ventana = new JFrame();
    ventana.add(panelContenedor);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.pack();
    ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
  }

}


