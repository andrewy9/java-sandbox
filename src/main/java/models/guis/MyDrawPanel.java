package models.guis;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyDrawPanel extends JPanel implements ControllerEventListener {

    private boolean msg = false;

    @Override
    public void controlChange(ShortMessage event) {
        msg = true;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        if (msg) {
            Random random = new Random();
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            Color startColor = new Color(red, green, blue);

            g.setColor(startColor);

            int height = random.nextInt(120) + 10;
            int width = random.nextInt(120) + 10;

            int xPos = random.nextInt(40) + 10;
            int yPos = random.nextInt(40) + 10;

            g.fillRect(xPos, yPos, width, height);
            msg = false;
        }
    }
}
