import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//serra media pila no podes ser tan boludo
public class AreaCalculatorInterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 100);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel startPanel = new JPanel();
        startPanel.setSize(500, 80);
        startPanel.setBackground(Color.YELLOW);
        startPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        startPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton squareButton = new JButton("Cuadrado");
        JButton triangleButton = new JButton("Triángulo");
        JButton sphereButton = new JButton("Esfera");
        JButton circleButton = new JButton("Circulo");
        JButton cubeButton = new JButton("Cubo");

        squareButton.addActionListener(e ->
                new AreaPanel(
                    500, 500,
                    Color.WHITE,
                    "square",
                    new ArrayList<>(List.of("Side"))
                )

        );

        triangleButton.addActionListener(e ->
                new AreaPanel(
                        500, 500,
                        Color.WHITE,
                        "triangle",
                        new ArrayList<>(List.of("Base", "Height"))
                )

        );

        sphereButton.addActionListener(e ->
                new AreaPanel(
                        500, 500,
                        Color.WHITE,
                        "sphere",
                        new ArrayList<>(List.of("Radius"))
                )

        );

        circleButton.addActionListener(e ->
                new AreaPanel(
                        500, 500,
                        Color.WHITE,
                        "circle",
                        new ArrayList<>(List.of("Radius"))
                )

        );

        cubeButton.addActionListener(e ->
                new AreaPanel(
                        500, 500,
                        Color.WHITE,
                        "cube",
                        new ArrayList<>(List.of("Side"))
                )

        );


        startPanel.add(squareButton);
        startPanel.add(triangleButton);
        startPanel.add(sphereButton);
        startPanel.add(circleButton);
        startPanel.add(cubeButton);

        frame.add(startPanel);
    }
}
