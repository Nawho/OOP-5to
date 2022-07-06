import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AreaPanel {

    public AreaPanel(int sizeX, int sizeY, Color bgColor, String shape, ArrayList<String> inputs) {
        JFrame shapeFrame = new JFrame();
        shapeFrame.setVisible(true);
        shapeFrame.setSize(500, 500);

        JPanel panel = new JPanel();
        panel.setBackground(bgColor);
        panel.setSize(sizeX, sizeY);

        JLabel result = new JLabel();

        for (String inputName : inputs) {
            JLabel fieldLabel = new JLabel(inputName);
            JTextField field = new JTextField("Input " + inputName);
            field.setSize(100,50);
            panel.add(fieldLabel);
            panel.add(field);
        }

        JButton btn = new JButton("Submit");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (shape) {
                    case "square":
                        JTextField input = (JTextField) Arrays.stream(panel.getComponents()).toList().get(1);
                        result.setText(String.valueOf(Area.square(Double.parseDouble(input.getText()))));
                        break;
                    case "circle":
                        JTextField input2 = (JTextField) Arrays.stream(panel.getComponents()).toList().get(1);
                        result.setText(String.valueOf(Area.circle(Double.parseDouble(input2.getText()))));
                        break;
                    case "sphere":
                        JTextField input3 = (JTextField) Arrays.stream(panel.getComponents()).toList().get(1);
                        result.setText(String.valueOf(Area.sphere(Double.parseDouble(input3.getText()))));
                        break;
                    case "cube":
                        JTextField input4 = (JTextField) Arrays.stream(panel.getComponents()).toList().get(1);
                        result.setText(String.valueOf(Area.cube(Double.parseDouble(input4.getText()))));
                        break;
                    case "triangle":
                        JTextField input5 = (JTextField) Arrays.stream(panel.getComponents()).toList().get(1);
                        JTextField input6 = (JTextField) Arrays.stream(panel.getComponents()).toList().get(3);
                        result.setText(String.valueOf(Area.triangle(Double.parseDouble(input5.getText()), Double.parseDouble(input6.getText()))));
                        break;

                }
            }
        });
        panel.add(btn);
        panel.add(result);
        shapeFrame.add(panel);
    }
}
