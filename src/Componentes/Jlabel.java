package Componentes;

import javax.swing.*;
import java.awt.*;

public class Jlabel {
    public void Label(JLabel label, String Titulo, int [] bounds, JPanel panel,String identificador)
    {
        if (identificador.equals("MenuPrincipal"))
        {
            label = new JLabel(Titulo,SwingConstants.CENTER);
            label.setBounds(bounds[0],bounds[1],bounds[2],bounds[3]);
            label.setFont(new Font("arial",Font.BOLD,25));
            panel.add(label);
        }
        if (identificador.equals("Imagen"))
        {
            label = new JLabel(new ImageIcon("C:\\Users\\Juan\\Downloads\\fotocoppel.jpeg"));
            label.setBounds(bounds[0],bounds[1],bounds[2],bounds[3]);
            panel.add(label);
        }
        if (identificador.equals("Titulo"))
        {
            label = new JLabel(Titulo,SwingConstants.CENTER);
            label.setBounds(bounds[0],bounds[1],bounds[2],bounds[3]);
            label.setFont(new Font("arial",Font.BOLD,25));
            panel.add(label);
        }
        if (identificador.equals("AltaEmpleado"))
        {
            label = new JLabel(Titulo,SwingConstants.CENTER);
            label.setBounds(bounds[0],bounds[1],bounds[2],bounds[3]);
            label.setFont(new  Font("arial",Font.BOLD, 18));
            panel.add(label);
        }
    }
}
