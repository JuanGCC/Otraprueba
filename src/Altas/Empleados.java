package Altas;

import Componentes.*;
import javax.swing.*;
import java.awt.*;

public class Empleados extends JFrame{
    JPanel panel;
    public JButton Button;
    String identificador;
    public JTextField Text;
    int [] numeros;
    Jpanel jpanel = new Jpanel();

    public String[] estados = {"AGUASCALIENTES", "BAJA CALIFORNIA", "BAJA CALIFORNIA SUR", "CAMPECHE", "COAHUILA DE ZARAGOZA", "COLIMA", "CHIAPAS", "CHIHUAHUA",
            "DISTRITO FEDERAL", "DURANGO", "GUANAJUATO", "GUERRERO", "HIDALGO", "JALISCO", "MEXICO", "MICHOACÁN DE OCAMPO", "MORELOS", "NAYARIT", "NUEVO LEON", "OAXACA",
            "PUEBLA", "QUERETARO", "QUINTANA ROO", "SAN LUIS POTOSI", "SINALOA", "SONORA", "TABASCO", "TAMAULIPAS", "TLAXCALA", "VERACRUZ", "YUCATAN", "ZACATECAS"};
    public Empleados()
    {
        Jframe jframe = new Jframe();
        jframe.jframe(this);
        Componentes();
    }
    public void Componentes()
    {
        panel();
        Boton();Text();ComboBox();Label();
    }

    public void Boton()
    {
        Button = new JButton();
        Botones boton = new Botones();
        boton.Botones(Button,"Cancelar",numeros =new int[]{750, 700, 150, 40},panel, "Cancelar",this);
        boton.Botones(Button,"Aceptar",numeros =new int[]{1120, 700, 150, 40},panel, "AltaEmpleadoAceptar",this);
    }

    public void Text()
    {
        Text = new JTextField();
        Jtextfield text = new Jtextfield();
        text.TextField(Text,new int[]{920, 300, 200, 40},panel,"EmpleadoAltaCurp","Curp");
        text.TextField(Text,new int[]{690, 400, 200, 40},panel,"EmpleadoAltaNombre","Letra");
        text.TextField(Text,new int[]{920, 400, 200, 40},panel,"EmpleadoAltaApellidoPaterno","Letra");
        text.TextField(Text,new int[]{1140, 400, 200, 40},panel,"EmpleadoAltaApellidoMaterno","Letra");
        text.TextField(Text,new int[]{690, 500, 200, 40},panel,"EmpleadoAltaCodigoPostal","Postal");
        text.TextField(Text,new int[]{920, 500, 200, 40},panel,"EmpleadoAltaCiudad","Letra");
        text.TextField(Text,new int[]{920,600,200,40},panel,"EmpleadoAltaCalle","Letra");

    }
    public void ComboBox()
    {
        JComboBox ComboBox = new JComboBox();
        ComboBox comboBox = new ComboBox();
        comboBox.ComboBox(ComboBox,estados,new int[]{1140, 500, 200, 40},panel,"ComboEstado");
    }
    public void Label()
    {
        JLabel Label = new JLabel();
        Jlabel jlabel = new Jlabel();
        jlabel.Label(Label,"Alta de empleados",new int[]{720,200,600,25},panel,"MenuPrincipal");
        jlabel.Label(Label,"Imagen",new int[]{600,10,800,160},panel,"Imagen");
        jlabel.Label(Label,"Curp",new int[]{920,250,200,40},panel,"AltaEmpleado");
        jlabel.Label(Label,"Nombre",new int[]{690, 350, 200, 40},panel,"AltaEmpleado");
        jlabel.Label(Label,"Apellido Paterno",new int[]{920,350,200,40},panel,"AltaEmpleado");
        jlabel.Label(Label,"Apellido Materno",new int[]{1140, 350, 200, 40},panel,"AltaEmpleado");
        jlabel.Label(Label,"Codigo Postal",new int[]{690, 450, 200, 40},panel,"AltaEmpleado");
        jlabel.Label(Label,"Ciudad",new int[]{920, 450, 200, 40},panel,"AltaEmpleado");
        jlabel.Label(Label,"Calle",new int[]{920,550,200,40},panel,"AltaEmpleado");
        jlabel.Label(Label,"Estado",new int[]{1140, 450, 200, 40},panel,"AltaEmpleado");
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
