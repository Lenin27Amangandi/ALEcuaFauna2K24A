package UserInterface.CustomerBotton;

import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import UserInterface.Style;

public class PrjTextBox extends JTextField {

    public PrjTextBox() {
        customizeComponent();
    }

    private void customizeComponent() {
        setBorderRect();
        setFont(Style.FONT);
        setForeground(Style.COLOR_FONT);
        setBackground(Style.COLOR_FONT_BG);
        setCaretColor(Style.COLOR_CURSOR);
        setMargin(new Insets(5, 5, 5, 5));
        setOpaque(true);
    }

    public void setBorderRect() {
        Border lineBorder = BorderFactory.createLineBorder(Style.COLOR_BORDER_BUTTON);
        Border emptyBorder = new EmptyBorder(5, 5, 5, 5);
        setBorder(new CompoundBorder(lineBorder, emptyBorder));
    }

    public void setBorderLine() {
        int thickness = 1;
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(0, 0, thickness, 0),
                BorderFactory.createMatteBorder(0, 0, thickness, 0, Style.COLOR_BORDER_BUTTON)));
    }
}