

import java.awt.Color;

import javax.swing.*;
//Comando concreto 1

class TurnOnCommand implements Command {
    private final Device d;
    private JPanel p;

    public TurnOnCommand(Device d, JPanel p) {
        this.d = d;
        this.p = p;
    }

    @Override
    public void execute() {
        d.turnOn();
        p.setBackground(Color.WHITE);
    }
}