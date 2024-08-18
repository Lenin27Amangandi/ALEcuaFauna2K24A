package UserInterface.CustomerBotton;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

import UserInterface.Style;

public class ALButton extends JButton implements MouseListener {
    public ALButton(String text) {
        customizeComponent(text);
    }

    public void customizeComponent(String text) {
        setText(text);
        setOpaque(false);
        // setBorderPainted(false);
        setContentAreaFilled(false);
        setForeground(Style.COLOR_BOTON_U);
        setHorizontalAlignment(Style.ALIGNMENT_LEFT);
        setBounds(460, 325, 84, 30);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setForeground(Color.BLACK);
        // setCursor(Style.CURSOR_HAND);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setForeground(Color.GRAY);
        // setCursor(Style.CURSOR_DEFAULT);
    }

}
