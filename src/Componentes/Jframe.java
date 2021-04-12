package Componentes;

import javax.swing.*;
import java.awt.*;

public class Jframe {

    public void jframe(JFrame frame)
    {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        frame.setMinimumSize(new Dimension(1920,1080));
    }
}
