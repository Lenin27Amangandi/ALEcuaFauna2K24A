package UserInterface;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.SwingConstants;

public abstract class Style {

    public static final Color COLOR_FONT = new Color(238, 231, 142 );
    public static final Color COLOR_FONT_LIGHT = new Color(0xd1d1d1);
    public static final Color COLOR_FONT_BG = new Color(0xd9d9d9);

    public static final Color COLOR_BOTON = Color.WHITE;
    public static final Color COLOR_BOTON_U = new Color(90, 97, 98);
    public static final Color COLOR_BOTON_D = new Color(171, 233, 247);
    public static final Color COLOR_INTERFAZ = new Color(205, 218, 213);
    public static final Color COLOR_TITLE = Color.BLUE;
    public static final Color COLOR_BORDER_BUTTON= new Color(0x292929);
    public static final Color COLOR_CURSOR = Color.black;

    public static final Font Font_Normal = new Font("Arial", 0, 30);
    public static final Font Font_TXT = new Font("Arial", 0 | 1, 12);
    public static final Font FONT_TITLE = new Font("Verdana", 1, 18);
    public static final Font FONT_NEGRITA = new Font("JetBrains Mono", 1, 14);
    public static final Font FONT_CURSIVA = new Font("JetBrains Mono", 2, 14);;
    public static final Font FONT = new Font("Inconsolata", Font.PLAIN, 14);


    public static final int ALIGNMENT_LEFT = SwingConstants.LEFT;
    public static final int ALIGNMENT_RIGT = SwingConstants.RIGHT;
    public static final int ALIGNMENT_CENTER = SwingConstants.CENTER;

    public static final URL URL_Logo = Style.class.getResource("/UserInterface/Resources/Img/Logo.jpg");
    public static final URL URL_LOGO = Style.class.getResource("/UserInterface/Resource/Img/Logo.png");
    public static final URL URL_SPLASH = Style.class.getResource("/UserInterface/Resources/Img/Splash1.jpg");
    public static final URL URL_Login1 = Style.class.getResource("/UserInterface/Resources/Img/Ant-Man login1.jfif");
    public static final URL URL_Login2 = Style.class.getResource("/UserInterface/Resources/Img/Ant-Mant Login2.png");

    public static final Cursor CURSOR_HAND = new Cursor(Cursor.HAND_CURSOR);
    public static final Cursor CURSOR_DEFAULT = new Cursor(Cursor.DEFAULT_CURSOR);

    // public static final Cursor CURSOR_HAND = new Cursor(Cursor.HAND_CURSOR);
    // public static final Cursor CURSOR_DEFAULT = new Cursor(Cursor.DEFAULT_CURSOR);


}
