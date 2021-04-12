package Componentes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones
{

    public void Botones (JButton boton, String Titulo, int [] bounds, JPanel panel, String identificador,JFrame frame)
    {
        boton = new JButton(Titulo);
        boton.setBounds(bounds[0],bounds[1],bounds[2],bounds[3]);
        panel.add(boton);
        if (identificador.equals("Salir"))
        {
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            });
        }
        if (identificador==("AltaEmpleadoAceptar"))
        {
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {

                }
            });
        }
        if (identificador==("Cancelar"))
        {
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    frame.dispose();
                }
            });
        }
        if (identificador=="AltaSucursalAceptar")
        {

        }

    }


}
