package Altas;

import Componentes.Botones;
import Componentes.Jframe;
import Componentes.Jlabel;
import Componentes.Jtextfield;

import javax.swing.*;
import java.awt.*;

public class Trabaja extends JFrame {
    JPanel panel = new JPanel();
    public Trabaja()
    {
        Jframe jframe = new Jframe();
        jframe.jframe(this);
        Componentes();
    }
    public void Componentes()
    {
        panel();Label();Text();Button();
    }
    public void Label()
    {
        JLabel Label = new JLabel();
        Jlabel jlabel = new Jlabel();
        jlabel.Label(Label,"Alta de Sucursal",new int[]{720,200,600,25},panel,"MenuPrincipal");
        jlabel.Label(Label,"Imagen",new int[]{600,10,800,160},panel,"Imagen");
        jlabel.Label(Label,"Curp",new int[]{700,270, 200, 40},panel,"AltaEmpleado");
        jlabel.Label(Label,"ID Sucursal",new int[]{1050, 270, 100, 40},panel,"AltaEmpleado");
        jlabel.Label(Label,"Salario",new int[]{1320,270, 200, 40},panel,"AltaEmpleado");
        jlabel.Label(Label,"Clave de Trabajo",new int[]{420,270,200,40},panel,"AltaEmpleado");
    }
    public void Text()
    {
        JTextField jTextField = new JTextField();
        Jtextfield jtextfield = new Jtextfield();
        jtextfield.TextField(jTextField,new int[]{700,370,200,40},panel,"Curp","Curp");
        jtextfield.TextField(jTextField,new int[]{1000,370,200,40},panel,"IDSucursal","Numero");
        jtextfield.TextField(jTextField,new int[]{1320,370,200,40},panel,"Salario","Numero");
        jtextfield.TextField(jTextField,new int[]{400,370,200,40},panel,"ClaveTrabajo","Numero");
    }
    public void Button()
    {
        JButton jButton = new JButton();
        Botones botones = new Botones();
        botones.Botones(jButton,"Cancelar",new int[]{750, 500, 150, 40},panel,"Cancelar",this);
        botones.Botones(jButton,"Aceptar",new int[]{1050, 500, 150, 40},panel,"AltaTrabajaAceptar",this);
    }
    public void panel()
    {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);
    }

    public static void main(String[] args) {
        Trabaja a = new Trabaja();
        a.setVisible(true);
    }
}
