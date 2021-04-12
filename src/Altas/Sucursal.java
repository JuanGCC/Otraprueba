package Altas;

import Componentes.*;
import javax.swing.*;
import java.awt.*;

public class Sucursal extends JFrame {
    JPanel panel;
    int[] numeros;
    public JTextField Text;
    public Sucursal()
    {
        Jframe jframe = new Jframe();
        jframe.jframe(this);
        Componentes();
    }
    public void Componentes()
    {
        panel();
        Text();Label();Button();
    }
    public void Text()
    {
        Text = new JTextField();
        Jtextfield text = new Jtextfield();
        text.TextField(Text,new int[]{600,400, 200, 40},panel,"SucursalId","Numero");
        text.TextField(Text,new int[]{900, 400, 200, 40},panel,"SucursalNombre","Letra");
        text.TextField(Text,new int[]{1200,400,200,40},panel,"SucursalCiudad","Letra");


    }
    public void Label()
    {
        JLabel Label = new JLabel();
        Jlabel jlabel = new Jlabel();
        jlabel.Label(Label,"Alta de Sucursal",new int[]{720,200,600,25},panel,"MenuPrincipal");
        jlabel.Label(Label,"Imagen",numeros =new int[]{600,10,800,160},panel,"Imagen");
        jlabel.Label(Label,"ID Sucursal",new int[]{600,300,200,40},panel,"AltaEmpleado");
        jlabel.Label(Label,"Nombre",new int[]{900,300,200,40},panel,"AltaEmpleado");
        jlabel.Label(Label,"Ciudad",new int[]{1200,300,200,40},panel,"AltaEmpleado");

    }
    public void Button()
    {
        JButton Button = new JButton();
        Botones boton = new Botones();
        boton.Botones(Button,"Cancelar",numeros =new int[]{750, 700, 150, 40},panel, "Cancelar",this);
        boton.Botones(Button,"Aceptar",numeros =new int[]{1120, 700, 150, 40},panel, "AltaSucursalAceptar",this);
    }
    public void panel()
    {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);
    }

    public static void main(String[] args) {
        Sucursal a = new Sucursal();
        a.setVisible(true);
    }
}
