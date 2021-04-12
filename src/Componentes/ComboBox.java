package Componentes;

import Altas.*;
import Altas.Empleados;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox
{

    public void ComboBox(JComboBox comboBox,String [] array,int[] bounds, JPanel panel,String identificador)
    {
        comboBox = new JComboBox(array);
        comboBox.setBounds(bounds[0],bounds[1],bounds[2],bounds[3]);
        comboBox.setSelectedItem(null);
        panel.add(comboBox);
        if (identificador.equals("ComboBoxAltas"))
        {
            JComboBox finalComboBox = comboBox;
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if (finalComboBox.getSelectedItem() == "Empleado")
                    {
                        Empleados empleados = new Empleados();
                        empleados.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem() == ("Sucursal"))
                    {
                        Sucursal sucursal = new Sucursal();
                        sucursal.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem()==("Trabaja"))
                    {
                        Trabaja trabaja = new Trabaja();
                        trabaja.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem()==("Jefe"))
                    {
                        Jefe jefe = new Jefe();
                        jefe.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                }
            });
        }
        if (identificador.equals("ComboBoxBajas"))
        {
            JComboBox finalComboBox = comboBox;
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if (finalComboBox.getSelectedItem()=="Empleado")
                    {
                        Bajas.Busqueda.Empleados a = new Bajas.Busqueda.Empleados();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem()== "Jefe")
                    {
                        Bajas.Busqueda.Jefe a = new Bajas.Busqueda.Jefe();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem()== "Sucursal")
                    {
                        Bajas.Busqueda.Sucursal a = new Bajas.Busqueda.Sucursal();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem()== "Trabaja")
                    {
                        Bajas.Busqueda.Trabaja a = new Bajas.Busqueda.Trabaja();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                }
            });
        }
        if (identificador.equals("ComboBoxModificacion"))
        {
            JComboBox finalComboBox = comboBox;
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if (finalComboBox.getSelectedItem()=="Empleado")
                    {
                        Modificacion.Busqueda.Empleados a = new Modificacion.Busqueda.Empleados();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem()== "Jefe")
                    {
                        Modificacion.Busqueda.Jefe a = new Modificacion.Busqueda.Jefe();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem()== "Sucursal")
                    {
                        Modificacion.Busqueda.Sucursal a = new Modificacion.Busqueda.Sucursal();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem()== "Trabaja")
                    {
                        Modificacion.Busqueda.Trabaja a = new Modificacion.Busqueda.Trabaja();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                }
            });
        }
        if (identificador.equals("ComboBoxConsultas"))
        {
            JComboBox finalComboBox = comboBox;
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if (finalComboBox.getSelectedItem()=="Empleado")
                    {
                        Consultas.Empleados a = new Consultas.Empleados();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem()== "Jefe")
                    {
                        Consultas.Jefe a = new Consultas.Jefe();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem()== "Sucursal")
                    {
                        Consultas.Sucursal a = new Consultas.Sucursal();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem()== "Trabaja")
                    {
                        Consultas.Trabaja a = new Consultas.Trabaja();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                    if (finalComboBox.getSelectedItem()=="Inf. Empleados")
                    {
                        Consultas.InformacionEmpleados a = new Consultas.InformacionEmpleados();
                        a.setVisible(true);
                        finalComboBox.setSelectedItem(null);
                    }
                }
            });
        }

    }
}
