package PantallaPrincipal;

import Componentes.*;
import javax.swing.*;
import java.awt.*;


public class PantallaPrincipal extends JFrame
{
    JPanel panel;
    Jframe frame = new Jframe();

    public PantallaPrincipal()
    {
        frame.jframe(this);
        Componentes();
    }
    public void Componentes()
    {
        panel();Boton(); ComboBox();Label();
    }
    public void panel()
    {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);
    }
    public void Boton()
    {
        JButton Button = new JButton();
        Botones boton = new Botones();
        boton.Botones(Button,"Salir",new int[]{1660,450,200,40},panel, "Salir",this);
    }
    public void ComboBox()
    {
        JComboBox Combo = new JComboBox();
        ComboBox comboBox = new ComboBox();
        comboBox.ComboBox(Combo,
                new String[]{"Empleado","Sucursal","Trabaja","Jefe"},
                new int[]{110, 450, 200, 40},panel,"ComboBoxAltas");
        comboBox.ComboBox(Combo,
                new String[]{"Empleado","Sucursal","Trabaja","Jefe"},
                new int[]{450, 450, 200, 40},panel, "ComboBoxBajas");
        comboBox.ComboBox(Combo,
                new String[]{"Empleado","Sucursal","Trabaja","Jefe"},
                new int[]{750, 450, 200, 40},panel,"ComboBoxModificacion");
        comboBox.ComboBox(Combo,
                new String[]{"Sucursal","Trabaja","Inf. Empleados","Jefe","Empleado"},
                new int[]{1100, 450, 200, 40},panel,"ComboBoxConsultas");
        comboBox.ComboBox(Combo,
                new String[]{"Empleados","Jefes"},
                new int[]{1400, 450, 200, 40},panel,"ComboBoxReportes");
    }
    public void Label()
    {
        JLabel label = new JLabel();
        Jlabel jlabel = new Jlabel();
        jlabel.Label(label,"Imagen",new int[]{600,10,800,160},panel,"Imagen");
        jlabel.Label(label,"Sistema Integral Coppel",new int[]{850,250,300,40},panel,"Titulo");
        jlabel.Label(label,"Altas",new int[]{110, 350, 170, 60},panel,"MenuPrincipal");
        jlabel.Label(label,"Bajas",new int[]{450, 350, 170, 60},panel,"MenuPrincipal");
        jlabel.Label(label,"Modificacion",new int[]{750, 350, 215, 60},panel,"MenuPrincipal");
        jlabel.Label(label,"Consultas",new int[]{1100, 350, 170, 60},panel,"MenuPrincipal");
        jlabel.Label(label,"Reportes",new int[]{1400, 350, 200, 60},panel,"MenuPrincipal");

    }
    public static void main(String[] args) {
        PantallaPrincipal a = new PantallaPrincipal();
        a.setVisible(true);
    }
}
//FH5A-C5MQ-FDK0-FNAF