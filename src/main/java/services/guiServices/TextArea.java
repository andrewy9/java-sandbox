package services.guiServices;

import javax.swing.*;
import java.awt.*;

public class TextArea {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("Just click it");
        JCheckBox checkBox = new JCheckBox("Goes to 11");

        JTextArea text = new JTextArea(10, 20);
        text.setLineWrap(true);
        button.addActionListener(e -> text.append("button clicked \n"));

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        checkBox.addItemListener(e -> {
            String state = "off";
            if (checkBox.isSelected()) {
               state = "on";
            }
            text.append("Check box is " + state + "\n");
        });

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.EAST, checkBox);

        frame.setSize(350, 350);
        frame.setVisible(true);

    }

}
