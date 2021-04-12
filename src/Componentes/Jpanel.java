package Componentes;

import javax.swing.*;
import java.awt.*;


public class Jpanel{



    public void Panel( JPanel panel, JFrame frame){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.yellow);
        frame.getContentPane().add(panel);

    }
}
