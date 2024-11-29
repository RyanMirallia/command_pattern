
//receiver
import javax.swing.*;
import java.awt.*;


class Light implements Device{
    @Override
    public JPanel turnOn(JPanel corpainel) {
        corpainel.setBackground(Color.WHITE);
        return corpainel;
    }

    @Override
    public JPanel turnOff(JPanel corpainel) {
        corpainel.setBackground(Color.BLACK);
        return corpainel;
    }
}
