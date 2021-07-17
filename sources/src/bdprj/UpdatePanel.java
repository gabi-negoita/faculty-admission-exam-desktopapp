package bdprj;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class UpdatePanel extends javax.swing.JPanel {

    private int selectedRow;
    private int codCandidat;

    private List<String> numeCompletCandidati;
    private List<String> cnpCandidati;

    private final DefaultTableModel candidatiModel;
    private final DefaultTableModel examsModel;

    private boolean ready;

    public UpdatePanel() {
        initComponents();

        // Setting - Table font
        candidatiTable.getTableHeader().setFont(new Font("Calibri Light", Font.BOLD, 18));
        examsTable.getTableHeader().setFont(new Font("Calibri Light", Font.BOLD, 18));

        numeCompletCandidati = new ArrayList<>();
        numeCompletCandidati = OracleConnection.getNumeCompletCandidat("");

        cnpCandidati = new ArrayList<>();
        cnpCandidati = OracleConnection.getCNPCandidat("");

        // Getting - Table model
        candidatiModel = (DefaultTableModel) candidatiTable.getModel();
        examsModel = (DefaultTableModel) examsTable.getModel();

        // Filling - Table
        for (int i = 0; i < numeCompletCandidati.size(); i++) {
            candidatiModel.addRow(new Object[]{
                candidatiModel.getRowCount() + 1,
                numeCompletCandidati.get(i),
                cnpCandidati.get(i)});
        }

        // Resizing - Table columns
        resizeColumns(candidatiTable);

        // Adding - Table selection listener
        candidatiTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {

                if (evt.getValueIsAdjusting()) {
                    tableRowSelected(evt);
                }
            }
        });

        // Disabling - Components
        showDataButton.setEnabled(false);
        deleteButton.setEnabled(false);
        updateButton.setEnabled(false);
        cancelButton.setEnabled(false);
        numeField.setEnabled(false);
        initialaTataField.setEnabled(false);
        prenumeField.setEnabled(false);
        cnpField.setEnabled(false);
        dataNastereField.setEnabled(false);
        liceuField.setEnabled(false);
        medieLiceuField.setEnabled(false);
        medieBacField.setEnabled(false);
        examsTable.setEnabled(false);

        // Setting - Component - Invisible
        errorLabel.setVisible(false);

        // Setting Variable - Default value
        this.selectedRow = -1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainScrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        candidatiScrollPane = new javax.swing.JScrollPane();
        candidatiTable = new javax.swing.JTable();
        showDataButton = new javax.swing.JButton();
        numeLabel = new javax.swing.JLabel();
        numeField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        initialaTataLabel = new javax.swing.JLabel();
        initialaTataField = new javax.swing.JTextField();
        initialaTataSeparator = new javax.swing.JSeparator();
        prenumeLabel = new javax.swing.JLabel();
        prenumeField = new javax.swing.JTextField();
        prenumeSeparator = new javax.swing.JSeparator();
        cnpLabel = new javax.swing.JLabel();
        cnpField = new javax.swing.JTextField();
        dataNastereLabel = new javax.swing.JLabel();
        liceuLabel = new javax.swing.JLabel();
        medieLiceuLabel = new javax.swing.JLabel();
        medieBacLabel = new javax.swing.JLabel();
        cnpSeparator1 = new javax.swing.JSeparator();
        dataNastereSeparator = new javax.swing.JSeparator();
        dataNastereField = new javax.swing.JTextField();
        liceuField = new javax.swing.JTextField();
        liceuSeparator = new javax.swing.JSeparator();
        medieLiceuField = new javax.swing.JTextField();
        medieLiceuSeparator = new javax.swing.JSeparator();
        medieBacSeparator = new javax.swing.JSeparator();
        medieBacField = new javax.swing.JTextField();
        informatiiCandidatLabel = new javax.swing.JLabel();
        informatiiCandidatSeparator = new javax.swing.JSeparator();
        updateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        examsScrollPane = new javax.swing.JScrollPane();
        examsTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));

        mainScrollPane.setBorder(null);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));

        candidatiTable.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        candidatiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nume", "CNP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        candidatiTable.setGridColor(java.awt.Color.lightGray);
        candidatiTable.setRowHeight(24);
        candidatiTable.setSelectionBackground(new java.awt.Color(0, 127, 255));
        candidatiTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        candidatiTable.getTableHeader().setReorderingAllowed(false);
        candidatiScrollPane.setViewportView(candidatiTable);

        showDataButton.setBackground(new java.awt.Color(0, 127, 0));
        showDataButton.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        showDataButton.setText("SHOW DATA");
        showDataButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showDataButtonMousePressed(evt);
            }
        });

        numeLabel.setBackground(new java.awt.Color(0, 0, 0));
        numeLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        numeLabel.setForeground(new java.awt.Color(0, 0, 0));
        numeLabel.setText("Numele");

        numeField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        numeField.setForeground(new java.awt.Color(0, 0, 0));
        numeField.setBorder(null);
        numeField.setOpaque(false);
        numeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeFieldKeyTyped(evt);
            }
        });

        initialaTataLabel.setBackground(new java.awt.Color(0, 0, 0));
        initialaTataLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        initialaTataLabel.setForeground(new java.awt.Color(0, 0, 0));
        initialaTataLabel.setText("Initiala tatalui");

        initialaTataField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        initialaTataField.setForeground(new java.awt.Color(0, 0, 0));
        initialaTataField.setBorder(null);
        initialaTataField.setOpaque(false);
        initialaTataField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                initialaTataFieldKeyTyped(evt);
            }
        });

        prenumeLabel.setBackground(new java.awt.Color(0, 0, 0));
        prenumeLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        prenumeLabel.setForeground(new java.awt.Color(0, 0, 0));
        prenumeLabel.setText("Prenume");

        prenumeField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        prenumeField.setForeground(new java.awt.Color(0, 0, 0));
        prenumeField.setBorder(null);
        prenumeField.setOpaque(false);
        prenumeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prenumeFieldKeyTyped(evt);
            }
        });

        cnpLabel.setBackground(new java.awt.Color(0, 0, 0));
        cnpLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        cnpLabel.setForeground(new java.awt.Color(0, 0, 0));
        cnpLabel.setText("Codul Numeric Personal (CNP)");

        cnpField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        cnpField.setForeground(new java.awt.Color(0, 0, 0));
        cnpField.setBorder(null);
        cnpField.setOpaque(false);
        cnpField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cnpFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cnpFieldFocusLost(evt);
            }
        });
        cnpField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnpFieldKeyTyped(evt);
            }
        });

        dataNastereLabel.setBackground(new java.awt.Color(0, 0, 0));
        dataNastereLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        dataNastereLabel.setForeground(new java.awt.Color(0, 0, 0));
        dataNastereLabel.setText("Data nasterii");

        liceuLabel.setBackground(new java.awt.Color(0, 0, 0));
        liceuLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        liceuLabel.setForeground(new java.awt.Color(0, 0, 0));
        liceuLabel.setText("Liceul absolvit");

        medieLiceuLabel.setBackground(new java.awt.Color(0, 0, 0));
        medieLiceuLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        medieLiceuLabel.setForeground(new java.awt.Color(0, 0, 0));
        medieLiceuLabel.setText("Medie liceu");

        medieBacLabel.setBackground(new java.awt.Color(0, 0, 0));
        medieBacLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        medieBacLabel.setForeground(new java.awt.Color(0, 0, 0));
        medieBacLabel.setText("Medie bacalaureat");

        dataNastereField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        dataNastereField.setForeground(new java.awt.Color(0, 0, 0));
        dataNastereField.setBorder(null);
        dataNastereField.setOpaque(false);

        liceuField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        liceuField.setForeground(new java.awt.Color(0, 0, 0));
        liceuField.setBorder(null);
        liceuField.setOpaque(false);

        medieLiceuField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        medieLiceuField.setForeground(new java.awt.Color(0, 0, 0));
        medieLiceuField.setBorder(null);
        medieLiceuField.setOpaque(false);

        medieBacField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        medieBacField.setForeground(new java.awt.Color(0, 0, 0));
        medieBacField.setBorder(null);
        medieBacField.setOpaque(false);

        informatiiCandidatLabel.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        informatiiCandidatLabel.setForeground(new java.awt.Color(0, 0, 0));
        informatiiCandidatLabel.setText("Informații candidat");

        updateButton.setBackground(new java.awt.Color(0, 127, 0));
        updateButton.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateButtonMousePressed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(127, 0, 0));
        cancelButton.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        cancelButton.setText("CANCEL");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelButtonMousePressed(evt);
            }
        });

        examsTable.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        examsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Examen", "Locatie", "Data", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        examsTable.setGridColor(java.awt.Color.lightGray);
        examsTable.setRowHeight(24);
        examsTable.setSelectionBackground(new java.awt.Color(0, 127, 255));
        examsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        examsTable.getTableHeader().setReorderingAllowed(false);
        examsScrollPane.setViewportView(examsTable);

        deleteButton.setBackground(new java.awt.Color(127, 0, 0));
        deleteButton.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteButtonMousePressed(evt);
            }
        });

        searchPanel.setBackground(java.awt.Color.white);
        searchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true), "Search", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        searchField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        searchField.setForeground(new java.awt.Color(0, 0, 0));
        searchField.setBorder(null);
        searchField.setOpaque(false);
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        refreshButton.setBackground(java.awt.Color.lightGray);
        refreshButton.setForeground(java.awt.Color.lightGray);
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        refreshButton.setBorder(null);
        refreshButton.setContentAreaFilled(false);
        refreshButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh pressed.png"))); // NOI18N
        refreshButton.setRolloverEnabled(true);
        refreshButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh rollover.png"))); // NOI18N
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                refreshButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField)
                .addGap(18, 18, 18)
                .addComponent(refreshButton)
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        errorLabel.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        errorLabel.setForeground(java.awt.Color.red);
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error-25x25.png"))); // NOI18N
        errorLabel.setToolTipText("");
        errorLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(informatiiCandidatSeparator)
                    .addComponent(candidatiScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addComponent(showDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(examsScrollPane)
                    .addComponent(searchPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(informatiiCandidatLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cnpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cnpField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dataNastereLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dataNastereField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(numeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator1)
                                            .addComponent(numeField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(initialaTataSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(initialaTataLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(initialaTataField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prenumeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prenumeField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prenumeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(liceuField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(liceuSeparator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(medieLiceuField, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(medieLiceuSeparator))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(medieBacField, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(medieBacSeparator)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                        .addComponent(liceuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(medieLiceuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                        .addComponent(cnpSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dataNastereSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(medieBacLabel)))
                        .addGap(0, 436, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(candidatiScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(informatiiCandidatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informatiiCandidatSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeLabel)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(initialaTataLabel)
                                .addComponent(prenumeLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(initialaTataSeparator)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prenumeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(initialaTataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prenumeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cnpLabel)
                    .addComponent(dataNastereLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(cnpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cnpSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(dataNastereField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(dataNastereSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(liceuLabel)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(medieLiceuLabel)
                        .addComponent(medieBacLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medieLiceuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medieBacField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medieLiceuSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medieBacSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(liceuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(liceuSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(examsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(errorLabel)
                .addGap(50, 50, 50))
        );

        mainScrollPane.setViewportView(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainScrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainScrollPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMousePressed
        if (cancelButton.isEnabled()) {
            // Disabling - Components
            numeField.setEnabled(false);
            initialaTataField.setEnabled(false);
            prenumeField.setEnabled(false);
            cnpField.setEnabled(false);
            dataNastereField.setEnabled(false);
            liceuField.setEnabled(false);
            medieLiceuField.setEnabled(false);
            medieBacField.setEnabled(false);
            examsTable.setEnabled(false);
            updateButton.setEnabled(false);
            cancelButton.setEnabled(false);

            // Clearing - Text fields
            numeField.setText(null);
            initialaTataField.setText(null);
            prenumeField.setText(null);
            cnpField.setText(null);
            dataNastereField.setText(null);
            liceuField.setText(null);
            medieLiceuField.setText(null);
            medieBacField.setText(null);

            // Removing - Table rows
            for (int i = 0; i < examsTable.getRowCount(); i++) {
                examsModel.removeRow(0);
                i--;
            }
        }
    }//GEN-LAST:event_cancelButtonMousePressed

    private void updateButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMousePressed
        if (updateButton.isEnabled()) {
            if (dataIsReady()) {
                updateData();
            }
        }
    }//GEN-LAST:event_updateButtonMousePressed

    private void showDataButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDataButtonMousePressed
        if (showDataButton.isEnabled() && this.selectedRow != -1) {
            // Disabling - Components
            showDataButton.setEnabled(false);

            // Enabling - Components
            deleteButton.setEnabled(true);
            numeField.setEnabled(true);
            initialaTataField.setEnabled(true);
            prenumeField.setEnabled(true);
            cnpField.setEnabled(true);
            dataNastereField.setEnabled(true);
            liceuField.setEnabled(true);
            medieLiceuField.setEnabled(true);
            medieBacField.setEnabled(true);
            examsTable.setEnabled(true);
            updateButton.setEnabled(true);
            cancelButton.setEnabled(true);

            // Getting - Data
            codCandidat = OracleConnection.getCodCandidat((String) candidatiModel.getValueAt(this.selectedRow, 2));
            String nume = OracleConnection.getNumeCandidat(codCandidat);
            String initialaTata = OracleConnection.getInitialaTataCandidat(codCandidat);
            String prenume = OracleConnection.getPrenumeCandidat(codCandidat);
            String cnp = (String) candidatiModel.getValueAt(this.selectedRow, 2);
            String dataNastere = OracleConnection.getDataNastereCandidat(codCandidat).substring(0, 10);
            String liceu = OracleConnection.getLiceuCandidat(codCandidat);
            double medieLiceu = OracleConnection.getMedieLiceuCandidat(codCandidat);
            double medieBac = OracleConnection.getMedieBacCandidat(codCandidat);

            // Filling - Text fields
            numeField.setText(nume);
            initialaTataField.setText(initialaTata);
            prenumeField.setText(prenume);
            cnpField.setText(cnp);
            dataNastereField.setText(dataNastere);
            liceuField.setText(liceu);
            medieLiceuField.setText(String.valueOf(medieLiceu));
            medieBacField.setText(String.valueOf(medieBac));

            // Removing - Table rows
            for (int i = 0; i < examsModel.getRowCount(); i++) {
                examsModel.removeRow(0);
                i--;
            }

            // Filling - Table
            List<String> denumireExamenCandidati = new ArrayList<>();
            denumireExamenCandidati = OracleConnection.getDenumireExamenCandidat(codCandidat);

            List<String> locatieExamenCandidati = new ArrayList<>();
            locatieExamenCandidati = OracleConnection.getLocatieExamenCandidat(codCandidat);

            List<String> dataExamenCandidati = new ArrayList<>();
            dataExamenCandidati = OracleConnection.getDataExamenCandidat(codCandidat);

            List<Double> notaExamenCandidati = new ArrayList<>();
            notaExamenCandidati = OracleConnection.getNotaExamenCandidat(codCandidat);

            for (int i = 0; i < denumireExamenCandidati.size(); i++) {
                examsModel.addRow(new Object[]{
                    examsModel.getRowCount() + 1,
                    denumireExamenCandidati.get(i),
                    locatieExamenCandidati.get(i),
                    dataExamenCandidati.get(i).substring(0, 10),
                    notaExamenCandidati.get(i)
                });
            }

            // Resizing - Table columns
            resizeColumns(examsTable);
        }
    }//GEN-LAST:event_showDataButtonMousePressed

    private void deleteButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMousePressed
        if (deleteButton.isEnabled() && this.selectedRow != -1) {

            // Disabling components
            showDataButton.setEnabled(false);
            deleteButton.setEnabled(false);
            updateButton.setEnabled(false);
            cancelButton.setEnabled(false);
            numeField.setEnabled(false);
            initialaTataField.setEnabled(false);
            prenumeField.setEnabled(false);
            cnpField.setEnabled(false);
            dataNastereField.setEnabled(false);
            liceuField.setEnabled(false);
            medieLiceuField.setEnabled(false);
            medieBacField.setEnabled(false);
            examsTable.setEnabled(false);

            // Enabling - Components
            candidatiTable.setEnabled(true);

            // Clearing the fields
            numeField.setText(null);
            initialaTataField.setText(null);
            prenumeField.setText(null);
            cnpField.setText(null);
            dataNastereField.setText(null);
            liceuField.setText(null);
            medieLiceuField.setText(null);
            medieBacField.setText(null);

            // Removing - Database table row
            codCandidat = OracleConnection.getCodCandidat((String) candidatiModel.getValueAt(this.selectedRow, 2));
            OracleConnection.deleteCandidat(codCandidat);

            // Removing - Table rows
            for (int i = 0; i < examsTable.getRowCount(); i++) {
                examsModel.removeRow(0);
                i--;
            }

            // Removing - Table rows
            for (int i = 0; i < candidatiTable.getRowCount(); i++) {
                candidatiModel.removeRow(0);
                i--;
            }

            // Refreshing - Table
            refreshCandidatiTable();
        }
    }//GEN-LAST:event_deleteButtonMousePressed

    private void refreshButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMousePressed
        if (refreshButton.isEnabled()) {
            refreshCandidatiTable();
        }
    }//GEN-LAST:event_refreshButtonMousePressed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // Removing all rows
        for (int i = 0; i < candidatiTable.getRowCount(); i++) {
            candidatiModel.removeRow(0);
            i--;
        }

        for (int i = 0; i < numeCompletCandidati.size(); i++) {
            if (numeCompletCandidati.get(i).toLowerCase().contains(searchField.getText().toLowerCase())
                    || cnpCandidati.get(i).toLowerCase().contains(searchField.getText().toLowerCase())) {
                // Adding rows
                candidatiModel.addRow(new Object[]{
                    candidatiModel.getRowCount() + 1,
                    numeCompletCandidati.get(i),
                    cnpCandidati.get(i)});
            }
        }

        resizeColumns(candidatiTable);
    }//GEN-LAST:event_searchFieldKeyReleased

    private void numeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeFieldKeyTyped
        if (Character.isLetter(evt.getKeyChar()) == false) {
            evt.consume();
        }
    }//GEN-LAST:event_numeFieldKeyTyped

    private void initialaTataFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_initialaTataFieldKeyTyped
        if (initialaTataField.getText().length() >= 1 || Character.isLetter(evt.getKeyChar()) == false) {
            evt.consume();
        }
    }//GEN-LAST:event_initialaTataFieldKeyTyped

    private void prenumeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenumeFieldKeyTyped
        if (Character.isLetter(evt.getKeyChar()) == false) {
            evt.consume();
        }
    }//GEN-LAST:event_prenumeFieldKeyTyped

    private void cnpFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnpFieldKeyTyped
        if (cnpField.getText().length() >= 13 || Character.isDigit(evt.getKeyChar()) == false) {
            evt.consume();
        }
    }//GEN-LAST:event_cnpFieldKeyTyped

    private void cnpFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnpFieldFocusGained
        cnpField.setForeground(Color.black);
    }//GEN-LAST:event_cnpFieldFocusGained

    private void cnpFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnpFieldFocusLost
        ready = true;
        // Checking - This field must have 13 characters
        if (cnpField.getText().length() < 13) {
            ready = false;
            cnpField.setForeground(Color.red);
            errorLabel.setText("Something went wrong.");
            errorLabel.setVisible(true);
        }
    }//GEN-LAST:event_cnpFieldFocusLost

    private void tableRowSelected(ListSelectionEvent e) {
        // Enabling - Components
        showDataButton.setEnabled(true);

        this.selectedRow = candidatiTable.getSelectedRow();
    }

    private void resizeColumns(javax.swing.JTable table) {
        for (int i = 0; i < table.getColumnCount(); i++) {
            DefaultTableColumnModel colModel = (DefaultTableColumnModel) table.getColumnModel();
            TableColumn col = colModel.getColumn(i);
            int width = 0;

            TableCellRenderer renderer = col.getHeaderRenderer();
            for (int r = 0; r < table.getRowCount(); r++) {
                renderer = table.getCellRenderer(r, i);
                Component comp = renderer.getTableCellRendererComponent(table, table.getValueAt(r, i),
                        false, false, r, i);
                width = Math.max(width, comp.getPreferredSize().width);
            }
            width = Math.max(width, col.getHeaderValue().toString().length() * 10);
            col.setPreferredWidth(width + 25);
        }
    }

    private void refreshCandidatiTable() {
        // Removing - Table rows
        for (int i = 0; i < candidatiTable.getRowCount(); i++) {
            candidatiModel.removeRow(0);
            i--;
        }

        // Filling - Table
        numeCompletCandidati = OracleConnection.getNumeCompletCandidat("");
        cnpCandidati = OracleConnection.getCNPCandidat("");

        for (int i = 0; i < numeCompletCandidati.size(); i++) {
            candidatiModel.addRow(new Object[]{
                candidatiModel.getRowCount() + 1,
                numeCompletCandidati.get(i),
                cnpCandidati.get(i)});
        }

        resizeColumns(candidatiTable);
    }

    public boolean isValid(String date) {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    private boolean dataNastereIsReady() {
        ready = true;
        // Checking - The date must be valid
        if (isValid(dataNastereField.getText()) == false) {
            ready = false;
            errorLabel.setText("Something went wrong.");
            errorLabel.setVisible(true);
        }
        return ready;
    }

    private boolean dataIsReady() {
        ready = true;
        if (numeField.getText().length() == 0
                || initialaTataField.getText().length() == 0
                || prenumeField.getText().length() == 0
                || cnpField.getText().length() == 0
                || dataNastereIsReady() == false) {
            ready = false;
            errorLabel.setText("Something went wrong.");
            errorLabel.setVisible(true);
        }
        return ready;
    }

    private void updateData() {
        // Getting the data
        String nume = numeField.getText();
        String initialaTata = initialaTataField.getText();
        String prenume = prenumeField.getText();
        String cnp = cnpField.getText();
        String dataNastere = dataNastereField.getText();
        String liceu = liceuField.getText();
        double medieLiceu = Double.valueOf(medieLiceuField.getText());
        double medieBac = Double.valueOf(medieBacField.getText());

        // Updating candidat
        OracleConnection.updateCandidat(
                codCandidat,
                nume,
                initialaTata,
                prenume,
                cnp,
                dataNastere,
                liceu,
                medieLiceu,
                medieBac);

        // Updating rezultat - nota
        List<Integer> cod_e = OracleConnection.getCodExamenCandidat(codCandidat);
        for (int i = 0; i < examsTable.getRowCount(); i++) {
            OracleConnection.updateNotaRezultat(codCandidat, cod_e.get(i), (double) examsTable.getValueAt(i, 4));
        }

        // Removing - Table rows
        for (int i = 0; i < examsTable.getRowCount(); i++) {
            examsModel.removeRow(0);
            i--;
        }
        for (int i = 0; i < candidatiTable.getRowCount(); i++) {
            candidatiModel.removeRow(0);
            i--;
        }

        // Disabling components
        numeField.setEnabled(false);
        initialaTataField.setEnabled(false);
        prenumeField.setEnabled(false);
        cnpField.setEnabled(false);
        dataNastereField.setEnabled(false);
        liceuField.setEnabled(false);
        medieLiceuField.setEnabled(false);
        medieBacField.setEnabled(false);
        examsTable.setEnabled(false);
        showDataButton.setEnabled(false);
        deleteButton.setEnabled(false);
        updateButton.setEnabled(false);
        cancelButton.setEnabled(false);

        // Clearing the fields
        numeField.setText(null);
        initialaTataField.setText(null);
        prenumeField.setText(null);
        cnpField.setText(null);
        dataNastereField.setText(null);
        liceuField.setText(null);
        medieLiceuField.setText(null);
        medieBacField.setText(null);

        // Refreshing - Table
        refreshCandidatiTable();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane candidatiScrollPane;
    private javax.swing.JTable candidatiTable;
    private javax.swing.JTextField cnpField;
    private javax.swing.JLabel cnpLabel;
    private javax.swing.JSeparator cnpSeparator1;
    private javax.swing.JTextField dataNastereField;
    private javax.swing.JLabel dataNastereLabel;
    private javax.swing.JSeparator dataNastereSeparator;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JScrollPane examsScrollPane;
    private javax.swing.JTable examsTable;
    private javax.swing.JLabel informatiiCandidatLabel;
    private javax.swing.JSeparator informatiiCandidatSeparator;
    private javax.swing.JTextField initialaTataField;
    private javax.swing.JLabel initialaTataLabel;
    private javax.swing.JSeparator initialaTataSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField liceuField;
    private javax.swing.JLabel liceuLabel;
    private javax.swing.JSeparator liceuSeparator;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JTextField medieBacField;
    private javax.swing.JLabel medieBacLabel;
    private javax.swing.JSeparator medieBacSeparator;
    private javax.swing.JTextField medieLiceuField;
    private javax.swing.JLabel medieLiceuLabel;
    private javax.swing.JSeparator medieLiceuSeparator;
    private javax.swing.JTextField numeField;
    private javax.swing.JLabel numeLabel;
    private javax.swing.JTextField prenumeField;
    private javax.swing.JLabel prenumeLabel;
    private javax.swing.JSeparator prenumeSeparator;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JButton showDataButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
