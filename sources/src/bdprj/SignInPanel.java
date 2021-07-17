package bdprj;

import java.awt.event.KeyEvent;
import java.util.Arrays;

public class SignInPanel extends javax.swing.JPanel {

    public static String fullName;

    public SignInPanel() {
        initComponents();

        errorLabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        logoLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        passwordSeparator = new javax.swing.JSeparator();
        usernameSeparator = new javax.swing.JSeparator();
        usernameIconLabel = new javax.swing.JLabel();
        passwordIconLabel = new javax.swing.JLabel();
        signInLabel = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(360, 579));

        usernameField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        usernameField.setForeground(java.awt.Color.gray);
        usernameField.setText("Username");
        usernameField.setBorder(null);
        usernameField.setOpaque(false);
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFieldKeyPressed(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        passwordField.setForeground(java.awt.Color.gray);
        passwordField.setText("Password");
        passwordField.setBorder(null);
        passwordField.setOpaque(false);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        logoLabel.setBackground(new java.awt.Color(255, 255, 255));
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ugal-100x100.png"))); // NOI18N

        errorLabel.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        errorLabel.setForeground(java.awt.Color.red);
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error-25x25.png"))); // NOI18N
        errorLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        passwordSeparator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        usernameIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/username-25x25.png"))); // NOI18N
        usernameIconLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        passwordIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password-25x25.png"))); // NOI18N
        passwordIconLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        signInLabel.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        signInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signInLabel.setText("SIGN IN");
        signInLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        signInButton.setBackground(new java.awt.Color(0, 0, 127));
        signInButton.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        signInButton.setForeground(new java.awt.Color(0, 0, 0));
        signInButton.setText("SIGN IN");
        signInButton.setBorder(null);
        signInButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signInButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordSeparator)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(usernameSeparator)
                            .addComponent(usernameField))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(errorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signInLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(logoLabel)
                .addGap(18, 18, 18)
                .addComponent(signInLabel)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorLabel)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            checkAccount();
        }
    }//GEN-LAST:event_usernameFieldKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            checkAccount();
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void signInButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMousePressed
        checkAccount();
    }//GEN-LAST:event_signInButtonMousePressed

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordFieldToEmpty();
    }//GEN-LAST:event_passwordFieldFocusGained

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        usernameFieldToEmpty();
    }//GEN-LAST:event_usernameFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        usernameFieldToText();
    }//GEN-LAST:event_usernameFieldFocusLost

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        passwordFieldToText();
    }//GEN-LAST:event_passwordFieldFocusLost

    private void checkAccount() {
        // Checking if the username or the password are filled up
        if (usernameField.getText().length() == 0
                || passwordField.getPassword().length == 0
                || "Username".equals(usernameField.getText())
                || Arrays.equals(passwordField.getPassword(), "Password".toCharArray())) {
            errorLabel.setVisible(true);
            errorLabel.setText("Error! Incorrect username or password. Try again.");
        } else {
            // Checking the username and the password
            String password = OracleConnection.getPassword(usernameField.getText());
            if (Arrays.equals(passwordField.getPassword(), password.toCharArray())) {
                logIntoAccount();
            } else {
                errorLabel.setVisible(true);
                errorLabel.setText("Error! Incorrect username or password. Try again.");
            }
        }
    }

    private void logIntoAccount() {
        fullName = OracleConnection.getLastname(usernameField.getText()) + " "
                + OracleConnection.getFirstname(usernameField.getText());
        
        Main.frame.dispose();

        new UserFrame();
    }

    private void usernameFieldToEmpty() {

        if (usernameField.getText().equals("Username")) {
            usernameField.setText("");
            usernameField.setForeground(java.awt.Color.black);
        }
    }

    private void usernameFieldToText() {
        if (usernameField.getText().equals("")) {
            usernameField.setForeground(java.awt.Color.gray);
            usernameField.setText("Username");
        }
    }

    private void passwordFieldToEmpty() {
        if (Arrays.equals(passwordField.getPassword(), "Password".toCharArray())) {
            passwordField.setText("");
            passwordField.setForeground(java.awt.Color.black);
        }
    }

    private void passwordFieldToText() {
        if (Arrays.equals(passwordField.getPassword(), "".toCharArray())) {
            passwordField.setForeground(java.awt.Color.gray);
            passwordField.setText("Password");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordIconLabel;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JButton signInButton;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameIconLabel;
    private javax.swing.JSeparator usernameSeparator;
    // End of variables declaration//GEN-END:variables
}
