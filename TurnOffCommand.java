

import javax.swing.*;
//comando contreto 2

class TurnOffCommand implements Command {
    private final Device d;
    private JPanel p;

    public TurnOffCommand(Device d, JPanel p) {
        this.d = d;
        this.p = p;
    }

    @Override
    public void execute() {
        d.turnOff(p);
    }
}