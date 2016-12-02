import javax.swing.*;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceGeminiLookAndFeel;

import java.awt.*;

public class BinaryCalculator {
    public static void main(String args[])  {




        Calculator c = new Calculator("BINARY CALCULATOR");
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setSize(580, 150);
        c.setResizable(false);
        c.setLocationRelativeTo(null);

    }





}
