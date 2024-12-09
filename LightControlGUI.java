import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//main
//CLIENTE
public class LightControlGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Command Pattern - Light Control");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Device light = new Light();

        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 60));
        painel.setBackground(Color.WHITE);

        Command lightOn = new TurnOnCommand(light, painel);
        Command lightOff = new TurnOffCommand(light, painel);
        RemoteControl controle = new RemoteControl();
        
        JButton onButton = new JButton("Turn on light");
        JButton offButton = new JButton("Turn off light");

        onButton.setForeground(Color.WHITE);
        onButton.setBackground(Color.DARK_GRAY);

        offButton.setForeground(Color.WHITE);
        offButton.setBackground(Color.DARK_GRAY);

        ActionListener listener1 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controle.setCommand(lightOn);
                controle.getButtonAction();
            }
        };

        onButton.addActionListener(listener1);

        ActionListener listener2 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controle.setCommand(lightOff);
                controle.getButtonAction();
            }
        };

        offButton.addActionListener(listener2);

        painel.add(onButton);
        painel.add(offButton);

        frame.getContentPane().add(painel);
        frame.setVisible(true);
    }
}
