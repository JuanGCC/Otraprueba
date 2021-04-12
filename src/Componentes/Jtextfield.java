package Componentes;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Jtextfield {

    public void TextField(JTextField Text,int[]bounds, JPanel panel,String string,String Identificador)
    {

        Text = new JTextField();
        Text.setBounds(bounds[0],bounds[1],bounds[2],bounds[3]);
        Text.setHorizontalAlignment(JTextField.CENTER);


    if (Identificador == "Letra")
    {
        JTextField finalText = Text;
        Text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                char car = keyEvent.getKeyChar();
                if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z'))keyEvent.consume();
                if (finalText.getText().length() == 20) keyEvent.consume();
            }
        });
    }
    if (Identificador == "Numero")
    {
        JTextField finalText = Text;
        Text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                char car = keyEvent.getKeyChar();
                if ((car < '0' || car > '9'))keyEvent.consume();
                if (finalText.getText().length() == 10) keyEvent.consume();
            }
        });
    }
    if (Identificador == "Postal")
    {
        JTextField finalText = Text;
        Text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                char car = keyEvent.getKeyChar();
                if ((car < '0' || car > '9'))keyEvent.consume();
                if (finalText.getText().length() == 5) keyEvent.consume();
            }
        });
    }
    if (Identificador =="Curp")
    {
        JTextField finalText = Text;
        Text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                char car = keyEvent.getKeyChar();
                if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car < '0' || car > '9'))keyEvent.consume();
                if (finalText.getText().length() == 16) keyEvent.consume();
            }
        });

    }
        panel.add(Text);

    }


}




// public JTextField Uno = new JTextField(),Dos = new JTextField(),Tres = new JTextField(),Cuatro = new JTextField(),Cinco = new JTextField(),Seis= new JTextField(),Prueba = new JTextField();
