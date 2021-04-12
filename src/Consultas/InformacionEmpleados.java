package Consultas;

import Componentes.Botones;
import Componentes.Jlabel;
import Componentes.Jtable;

import javax.swing.*;
import java.awt.*;

public class InformacionEmpleados extends JFrame {
    JPanel panel;
    public InformacionEmpleados()
    {
        Componentes.Jframe jframe = new Componentes.Jframe();
        jframe.jframe(this);
        Componentes();
    }
    public void Componentes()
    {
        panel();Label();Button();Table();
    }
    public void Label()
    {
        JLabel Label = new JLabel();
        Jlabel jlabel = new Jlabel();
        jlabel.Label(Label,"Alta de empleados",new int[]{720,200,600,25},panel,"MenuPrincipal");
        jlabel.Label(Label,"Imagen",new int[]{600,10,800,160},panel,"Imagen");
    }
    public void Button()
    {
        JButton jButton = new JButton();
        Botones botones = new Botones();
        botones.Botones(jButton,"Cancelar",new int[]{850, 900, 200,40},panel,"Cancelar",this);
    }
    public void panel()
    {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);
    }
    public void Table()
    {
        JTable jTable = new JTable();
        Jtable jtable = new Jtable();
        jtable.Table(jTable,new int[]{400,300,1100,500},panel,"InformacionEmpleados");
    }

    public static void main(String[] args) {
        InformacionEmpleados a = new InformacionEmpleados() ;
        a.setVisible(true);
    }
}
