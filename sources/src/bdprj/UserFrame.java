package bdprj;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class UserFrame extends javax.swing.JFrame {

    public UserFrame() {
        initComponents();

        this.getContentPane().setBackground(new Color(225, 225, 225));

        helloMessageLabel.setText("Welcome, " + SignInPanel.fullName);

        mainTabbedPane.add("Vizualizeaza", new ViewPanel());
        mainTabbedPane.add("Adauga", new InsertPanel());
        mainTabbedPane.add("Actualizeaza", new UpdatePanel());
        mainTabbedPane.add("Rezultate", new ResultsPanel());

        this.setTitle("UGAL");
        this.setSize(1280, 720);
        this.setLocation(Screen.width() / 2 - this.getBounds().width / 2, Screen.height() / 2 - this.getBounds().height / 2);
        this.setDefaultCloseOperation(UserFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabbedPane = new javax.swing.JTabbedPane();
        controlPanel = new javax.swing.JPanel();
        signOutButton = new javax.swing.JButton();
        helloMessageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainTabbedPane.setBackground(new java.awt.Color(225, 225, 225));
        mainTabbedPane.setForeground(new java.awt.Color(0, 0, 0));
        mainTabbedPane.setToolTipText("");
        mainTabbedPane.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        mainTabbedPane.setOpaque(true);

        controlPanel.setBackground(new java.awt.Color(225, 225, 225));

        signOutButton.setBackground(java.awt.Color.lightGray);
        signOutButton.setForeground(java.awt.Color.lightGray);
        signOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign out.png"))); // NOI18N
        signOutButton.setBorder(null);
        signOutButton.setContentAreaFilled(false);
        signOutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signOutButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/sign out pressed.png"))); // NOI18N
        signOutButton.setRolloverEnabled(true);
        signOutButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sign out rollover.png"))); // NOI18N
        signOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutButtonMouseClicked(evt);
            }
        });

        helloMessageLabel.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        helloMessageLabel.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helloMessageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signOutButton)
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(helloMessageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutButtonMouseClicked
        if (signOutButton.isEnabled()) {
            SignOutFrame signOutFrame = new SignOutFrame();
            UserFrame thisFrame = this;

            // Disable all components
            Component[] components = getComponents(this);
            for (Component component : components) {
                component.setEnabled(false);
            }

            // Checking if either "Yes" or "Cancel" button is pressed
            Timer time = new Timer(0, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {

                    if (signOutFrame.yes) {
                        thisFrame.dispose();
                        Main.renderSignInFrame();
                        signOutFrame.dispose();
                        ((Timer) evt.getSource()).stop();
                    } else if (signOutFrame.canceled) {
                        // Enable all components
                        for (Component component : components) {
                            component.setEnabled(true);
                        }

                        signOutFrame.dispose();
                        ((Timer) evt.getSource()).stop();
                    }
                }

            });
            time.start();
        }
    }//GEN-LAST:event_signOutButtonMouseClicked

    private Component[] getComponents(Component container) {
        ArrayList<Component> list = null;

        try {

            list = new ArrayList<>(Arrays.asList(
                    ((Container) container).getComponents()));
            for (int index = 0; index < list.size(); index++) {
                list.addAll(Arrays.asList(getComponents(list.get(index))));
            }

        } catch (ClassCastException e) {
            list = new ArrayList<>();
        }

        return list.toArray(new Component[list.size()]);
    }

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {

        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel helloMessageLabel;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JButton signOutButton;
    // End of variables declaration//GEN-END:variables
}
