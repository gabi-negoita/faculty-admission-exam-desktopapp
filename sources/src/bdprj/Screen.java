package bdprj;


import java.awt.Dimension;
import java.awt.Toolkit;

public class Screen {

    public static int width() {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        return size.width;
    }

    public static int height() {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        return size.height;
    }
}
