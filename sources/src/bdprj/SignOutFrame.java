package bdprj;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SignOutFrame extends javax.swing.JFrame {

    public boolean canceled;
    public boolean yes;

    public SignOutFrame() {
        initComponents();

        this.setLocation(Screen.width() / 2 - this.getBounds().width / 2, Screen.height() / 2 - this.getBounds().height / 2);
        this.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signOutPanel = new javax.swing.JPanel();
        messageLabel = new javax.swing.JLabel();
        yesButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        signOutPanel.setBackground(new java.awt.Color(255, 255, 255));
        signOutPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        messageLabel.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(0, 0, 0));
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("Are you sure you want to sign out ?");

        yesButton.setBackground(new java.awt.Color(0, 255, 0));
        yesButton.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        yesButton.setForeground(new java.awt.Color(0, 0, 0));
        yesButton.setText("Yes");
        yesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                yesButtonMousePressed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 0, 0));
        cancelButton.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 0, 0));
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout signOutPanelLayout = new javax.swing.GroupLayout(signOutPanel);
        signOutPanel.setLayout(signOutPanelLayout);
        signOutPanelLayout.setHorizontalGroup(
            signOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signOutPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(signOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel)
                    .addGroup(signOutPanelLayout.createSequentialGroup()
                        .addComponent(yesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        signOutPanelLayout.setVerticalGroup(
            signOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signOutPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(signOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesButton)
                    .addComponent(cancelButton))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signOutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMousePressed
        this.canceled = true;
    }//GEN-LAST:event_cancelButtonMousePressed

    private void yesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesButtonMousePressed
        this.yes = true;
    }//GEN-LAST:event_yesButtonMousePressed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {

        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignOutFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JPanel signOutPanel;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
