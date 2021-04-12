package Altas;

import Componentes.Botones;
import Componentes.Jframe;
import Componentes.Jlabel;
import Componentes.Jtextfield;

import javax.swing.*;
import java.awt.*;

public class Jefe extends JFrame {
    JPanel panel;
    public Jefe()
    {
        Jframe jframe = new Jframe();
        jframe.jframe(this);
        Componentes();
    }
    public void Componentes()
    {
        panel();Label();Button();Text();
    }
    public void Label()
    {
        Jlabel jlabel = new Jlabel();
        JLabel Label = new JLabel();
        jlabel.Label(Label,"Imagen",new int[]{600,10,800,160},panel,"Imagen");
        jlabel.Label(Label,"Alta de Jefe",new int[]{720,200,600,25},panel,"MenuPrincipal");
        jlabel.Label(Label,"Curp",new int[]{650,270, 200, 40},panel,"AltaEmpleado");
        jlabel.Label(Label,"Puesto",new int[]{1100,270, 200, 40},panel,"AltaEmpleado");

    }
    public void Text()
    {
        JTextField jTextField = new JTextField();
        Jtextfield jtextfield = new Jtextfield();
        jtextfield.TextField(jTextField,new int[]{650,370, 200, 40},panel,"JefeAltasCurp","Curp");
        jtextfield.TextField(jTextField,new int[]{1100,370, 200, 40},panel,"JefeAltasPuesto","Letra");

    }
    public void Button()
    {
        JButton jButton = new JButton();
        Botones botones = new Botones();
        botones.Botones(jButton,"Cancelar",new int[]{730, 600, 150, 40},panel,"Cancelar",this);
        botones.Botones(jButton,"Aceptar",new int[]{1080, 600, 150, 40},panel,"AltaJefeAceptar",this);

    }
    public void panel ()
    {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);
    }

    public static void main(String[] args) {
        Jefe a = new Jefe();
        a.setVisible(true);
    }
}
