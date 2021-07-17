package bdprj;

import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static JFrame frame;

    public static void main(String args[]) {

        // Making a connection to Oracle to move the delay at the start (before launching the app)
        Connection connection = null;
        connection = OracleConnection.openConnection(connection);
        OracleConnection.closeConnection(connection);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {

        }
        renderSignInFrame();
    }

    public static void renderSignInFrame() {
        frame = new JFrame("Sign In");
        frame.setSize(360, 640);
        frame.setLocation(Screen.width() / 2 - frame.getBounds().width / 2, Screen.height() / 2 - frame.getBounds().height / 2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
        frame.add(new ViewPanel());
        frame.setVisible(true);
    }
}
