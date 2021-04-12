package Bajas.Busqueda;

import Componentes.Botones;
import Componentes.Jframe;
import Componentes.Jlabel;
import Componentes.Jtextfield;

import javax.swing.*;
import java.awt.*;

public class Empleados extends JFrame {
    JPanel panel;
    public Empleados()
    {
        Jframe jframe = new Jframe();
        jframe.jframe(this);
        Componentes();
    }
    public void Componentes()
    {
        panel();Button();Label();Text();
    }
    public void Button()
    {
        JButton jButton = new JButton();
        Botones botones = new Botones();
        botones.Botones(jButton,"Cancelar",new int[]{785, 600, 150, 40},panel,"Cancelar",this);
        botones.Botones(jButton,"Aceptar",new int[]{1085, 600, 150, 40},panel,"BajasBusquedaEmpleados",this);
    }
    public void Label()
    {
        JLabel Label = new JLabel();
        Jlabel jlabel = new Jlabel();
        jlabel.Label(Label,"Busqueda de empleados",new int[]{720,200,600,25},panel,"MenuPrincipal");
        jlabel.Label(Label,"Imagen",new int[]{600,10,800,160},panel,"Imagen");
        jlabel.Label(Label,"Ingrese la Curp",new int[]{905,370, 200, 60},panel,"Titulo");
    }
    public void Text()
    {
        JTextField jTextField = new JTextField();
        Jtextfield jtextfield = new Jtextfield();
        jtextfield.TextField(jTextField,new int[]{905,470, 200, 40},panel,"BajaBusquedaEmpleados","Curp");
    }
    public void panel()
    {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);
    }

    public static void main(String[] args) {
        Empleados a = new Empleados();
        a.setVisible(true);
    }
}
