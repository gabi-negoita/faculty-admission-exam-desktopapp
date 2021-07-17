package bdprj;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class InsertPanel extends javax.swing.JPanel {

    private int selectedRow;
    private final DefaultTableModel model;
    private boolean ready;

    public InsertPanel() {
        initComponents();

        // Adding - Data nasterii - zile 
        for (int i = 1; i <= 31; i++) {
            dayComboBox.addItem(String.valueOf(i));
        }

        // Data nasterii - luni
        for (int i = 1; i <= 12; i++) {
            if (i < 10) {
                monthComboBox.addItem("0" + i);
            } else {
                monthComboBox.addItem(String.valueOf(i));
            }
        }

        // Adding - Data nasterii - ani
        for (int i = 1900; i <= Year.now().getValue(); i++) {
            yearComboBox.addItem(String.valueOf(i));
        }

        // Adding - Licee
        List<String> licee = new ArrayList<>();
        licee = OracleConnection.getLiceu();
        for (int i = 0; i < licee.size(); i++) {
            liceuComboBox.addItem(licee.get(i));
        }

        // Adding - Universitati
        List<String> universitati = new ArrayList<>();
        universitati = OracleConnection.getUniversitate("");
        for (int i = 0; i < universitati.size(); i++) {
            universitateComboBox.addItem(universitati.get(i));
        }

        // Getting - Table model
        model = (DefaultTableModel) optionsTable.getModel();

        // Setting - Error - invisible
        errorLabel.setVisible(false);

        // Disabling  - Components
        deleteButton.setEnabled(false);

        // Setting - Table selection listener
        optionsTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {

                if (evt.getValueIsAdjusting()) {
                    tableRowSelected(evt);
                }
            }
        });

        // Initializing - Variable - Default value 
        selectedRow = -1;

        // Setting - Table - Font
        optionsTable.getTableHeader().setFont(new Font("Calibri Light", Font.BOLD, 18));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainScrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        numeField = new javax.swing.JTextField();
        numeLabel = new javax.swing.JLabel();
        informatiiCandidatLabel = new javax.swing.JLabel();
        initialaTataField = new javax.swing.JTextField();
        initialaTataLabel = new javax.swing.JLabel();
        prenumeField = new javax.swing.JTextField();
        prenumeLabel = new javax.swing.JLabel();
        cnpField = new javax.swing.JTextField();
        cnpLabel = new javax.swing.JLabel();
        dataNastereLabel = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        monthComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        initialaTataSeparator = new javax.swing.JSeparator();
        prenumeSeparator = new javax.swing.JSeparator();
        cnpSeparator = new javax.swing.JSeparator();
        liceuLabel = new javax.swing.JLabel();
        liceuComboBox = new javax.swing.JComboBox<>();
        medieLiceuLabel = new javax.swing.JLabel();
        medieBacLabel = new javax.swing.JLabel();
        informatiiCandidatSeparator = new javax.swing.JSeparator();
        optiuniCandidatLabel = new javax.swing.JLabel();
        optiuniCandidatSeparator = new javax.swing.JSeparator();
        addButton = new javax.swing.JButton();
        universitateLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        universitateComboBox = new javax.swing.JComboBox<>();
        optionsScrollPane = new javax.swing.JScrollPane();
        optionsTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        facultateComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        domeniuComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        specializareComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        bugetTaxaComboBox = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        medieBacSpinner = new javax.swing.JSpinner();
        medieLiceuSpinner = new javax.swing.JSpinner();

        setAutoscrolls(true);

        mainScrollPane.setBorder(null);

        mainPanel.setBackground(java.awt.Color.white);

        numeField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        numeField.setForeground(new java.awt.Color(0, 0, 0));
        numeField.setBorder(null);
        numeField.setOpaque(false);
        numeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeFieldKeyTyped(evt);
            }
        });

        numeLabel.setBackground(new java.awt.Color(0, 0, 0));
        numeLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        numeLabel.setForeground(new java.awt.Color(0, 0, 0));
        numeLabel.setText("Numele");

        informatiiCandidatLabel.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        informatiiCandidatLabel.setForeground(new java.awt.Color(0, 0, 0));
        informatiiCandidatLabel.setText("Informații candidat");

        initialaTataField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        initialaTataField.setForeground(new java.awt.Color(0, 0, 0));
        initialaTataField.setBorder(null);
        initialaTataField.setOpaque(false);
        initialaTataField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                initialaTataFieldKeyTyped(evt);
            }
        });

        initialaTataLabel.setBackground(new java.awt.Color(0, 0, 0));
        initialaTataLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        initialaTataLabel.setForeground(new java.awt.Color(0, 0, 0));
        initialaTataLabel.setText("Initiala tatalui");

        prenumeField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        prenumeField.setForeground(new java.awt.Color(0, 0, 0));
        prenumeField.setBorder(null);
        prenumeField.setOpaque(false);
        prenumeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prenumeFieldKeyTyped(evt);
            }
        });

        prenumeLabel.setBackground(new java.awt.Color(0, 0, 0));
        prenumeLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        prenumeLabel.setForeground(new java.awt.Color(0, 0, 0));
        prenumeLabel.setText("Prenume");

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

        cnpLabel.setBackground(new java.awt.Color(0, 0, 0));
        cnpLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        cnpLabel.setForeground(new java.awt.Color(0, 0, 0));
        cnpLabel.setText("Codul Numeric Personal (CNP)");

        dataNastereLabel.setBackground(new java.awt.Color(0, 0, 0));
        dataNastereLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        dataNastereLabel.setForeground(new java.awt.Color(0, 0, 0));
        dataNastereLabel.setText("Data nasterii");

        dayComboBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        dayComboBox.setForeground(new java.awt.Color(0, 0, 0));
        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ZZ" }));

        yearComboBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        yearComboBox.setForeground(new java.awt.Color(0, 0, 0));
        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY" }));

        monthComboBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        monthComboBox.setForeground(new java.awt.Color(0, 0, 0));
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM" }));

        liceuLabel.setBackground(new java.awt.Color(0, 0, 0));
        liceuLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        liceuLabel.setForeground(new java.awt.Color(0, 0, 0));
        liceuLabel.setText("Liceul absolvit");

        liceuComboBox.setEditable(true);
        liceuComboBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        liceuComboBox.setForeground(new java.awt.Color(0, 0, 0));
        liceuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select liceu" }));

        medieLiceuLabel.setBackground(new java.awt.Color(0, 0, 0));
        medieLiceuLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        medieLiceuLabel.setForeground(new java.awt.Color(0, 0, 0));
        medieLiceuLabel.setText("Medie liceu");

        medieBacLabel.setBackground(new java.awt.Color(0, 0, 0));
        medieBacLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        medieBacLabel.setForeground(new java.awt.Color(0, 0, 0));
        medieBacLabel.setText("Medie bacalaureat");

        optiuniCandidatLabel.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        optiuniCandidatLabel.setForeground(new java.awt.Color(0, 0, 0));
        optiuniCandidatLabel.setText("Opțiuni candidat");

        addButton.setBackground(new java.awt.Color(0, 127, 0));
        addButton.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(0, 0, 0));
        addButton.setText("Adauga");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addButtonMousePressed(evt);
            }
        });

        universitateLabel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        universitateLabel.setForeground(new java.awt.Color(0, 0, 0));
        universitateLabel.setText("Universitate");

        deleteButton.setBackground(new java.awt.Color(127, 0, 0));
        deleteButton.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteButton.setText("Sterge");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteButtonMousePressed(evt);
            }
        });

        universitateComboBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        universitateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select universitate" }));
        universitateComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                universitateComboBoxItemStateChanged(evt);
            }
        });

        optionsTable.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        optionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Universitate", "Facultate", "Domeniu", "Specializare", "Forma de finantare"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        optionsTable.setGridColor(java.awt.Color.lightGray);
        optionsTable.setRowHeight(24);
        optionsTable.setSelectionBackground(new java.awt.Color(0, 127, 255));
        optionsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        optionsTable.getTableHeader().setReorderingAllowed(false);
        optionsScrollPane.setViewportView(optionsTable);

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Facultate");

        facultateComboBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        facultateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select facultate" }));
        facultateComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                facultateComboBoxItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Domeniu");

        domeniuComboBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        domeniuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select domeniu" }));
        domeniuComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                domeniuComboBoxItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Specializare");

        specializareComboBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        specializareComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select specializare" }));
        specializareComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                specializareComboBoxItemStateChanged(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Forma de finantare");

        bugetTaxaComboBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        bugetTaxaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select forma de finantare" }));

        submitButton.setBackground(new java.awt.Color(0, 0, 127));
        submitButton.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(0, 0, 0));
        submitButton.setText("ÎNSCRIE");
        submitButton.setPreferredSize(new java.awt.Dimension(93, 50));
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submitButtonMousePressed(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        errorLabel.setForeground(java.awt.Color.red);
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error-25x25.png"))); // NOI18N
        errorLabel.setToolTipText("");
        errorLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        medieBacSpinner.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        medieBacSpinner.setModel(new javax.swing.SpinnerNumberModel(6.0d, 6.0d, 10.0d, 0.009999999776482582d));

        medieLiceuSpinner.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        medieLiceuSpinner.setModel(new javax.swing.SpinnerNumberModel(5.0d, 5.0d, 10.0d, 0.009999999776482582d));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(optiuniCandidatSeparator)
                        .addContainerGap())
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(informatiiCandidatSeparator)
                            .addComponent(informatiiCandidatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bugetTaxaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(specializareComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(domeniuComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(universitateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(universitateComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(facultateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(optiuniCandidatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(numeField)
                                            .addComponent(numeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cnpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cnpField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataNastereLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(initialaTataSeparator)
                                            .addComponent(initialaTataField)
                                            .addComponent(initialaTataLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(prenumeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(prenumeField)
                                            .addComponent(prenumeSeparator)))))
                            .addComponent(cnpSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(liceuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(liceuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(medieLiceuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(medieLiceuSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(medieBacLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(medieBacSpinner))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(informatiiCandidatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informatiiCandidatSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(initialaTataLabel)
                            .addComponent(numeLabel)
                            .addComponent(prenumeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(initialaTataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prenumeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(numeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnpLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cnpSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(initialaTataSeparator)
                            .addComponent(prenumeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataNastereLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                            .addComponent(liceuLabel)
                            .addGap(3, 3, 3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                            .addComponent(medieLiceuLabel)
                            .addGap(4, 4, 4)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(medieBacLabel)
                        .addGap(4, 4, 4)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(liceuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medieLiceuSpinner)
                    .addComponent(medieBacSpinner))
                .addGap(49, 49, 49)
                .addComponent(optiuniCandidatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optiuniCandidatSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(universitateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(universitateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(facultateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(domeniuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(specializareComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bugetTaxaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(deleteButton)))
                    .addComponent(optionsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void universitateComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_universitateComboBoxItemStateChanged
        // Removing  - Facultati
        facultateComboBox.removeAllItems();
        facultateComboBox.addItem("Select facultate");

        // Adding - Facultati
        if (universitateComboBox.getSelectedIndex() != 0) {
            List<String> facultatiUniversitate = new ArrayList<>();
            facultatiUniversitate = OracleConnection.getFacultatiUniversitate(evt.getItem().toString());

            for (int i = 0; i < facultatiUniversitate.size(); i++) {
                facultateComboBox.addItem(facultatiUniversitate.get(i));
            }
        }
    }//GEN-LAST:event_universitateComboBoxItemStateChanged

    private void facultateComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_facultateComboBoxItemStateChanged
        // Removing  - Domenii
        domeniuComboBox.removeAllItems();
        domeniuComboBox.addItem("Select domeniu");

        // Adding - Domenii
        if (facultateComboBox.getSelectedIndex() != 0) {
            List<String> domeniiFacultate = new ArrayList<>();
            domeniiFacultate = OracleConnection.getDomeniiFacultate(evt.getItem().toString());

            for (int i = 0; i < domeniiFacultate.size(); i++) {
                domeniuComboBox.addItem(domeniiFacultate.get(i));
            }
        }
    }//GEN-LAST:event_facultateComboBoxItemStateChanged

    private void domeniuComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_domeniuComboBoxItemStateChanged
        // Removing - Specializari
        specializareComboBox.removeAllItems();
        specializareComboBox.addItem("Select specializare");

        // Adding - Specializari
        if (domeniuComboBox.getSelectedIndex() != 0) {
            List<String> specializariDomeniu = new ArrayList<>();
            specializariDomeniu = OracleConnection.getSpecializariDomeniu(evt.getItem().toString());

            for (int i = 0; i < specializariDomeniu.size(); i++) {
                specializareComboBox.addItem(specializariDomeniu.get(i));
            }
        }
    }//GEN-LAST:event_domeniuComboBoxItemStateChanged

    private void specializareComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_specializareComboBoxItemStateChanged
        // Removing - Forme de finantare
        bugetTaxaComboBox.removeAllItems();
        bugetTaxaComboBox.addItem("Select forma de finantare");

        // Adding - Forme de finantare
        if (specializareComboBox.getSelectedIndex() != 0) {
            // Adding forme de finantare
            bugetTaxaComboBox.addItem("Buget");
            bugetTaxaComboBox.addItem("Taxa");
        }
    }//GEN-LAST:event_specializareComboBoxItemStateChanged

    private void addButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMousePressed
        if (addButton.isEnabled()) {
            // Checking - All the fields must be filled
            if (bugetTaxaComboBox.getSelectedIndex() != 0) {
                // Checking - No duplicates allowed
                if (model.getRowCount() > 0) {
                    for (int i = 0; i < model.getRowCount(); i++) {
                        if (universitateComboBox.getSelectedItem().toString() == model.getValueAt(i, 0)
                                && facultateComboBox.getSelectedItem().toString() == model.getValueAt(i, 1)
                                && domeniuComboBox.getSelectedItem().toString() == model.getValueAt(i, 2)
                                && specializareComboBox.getSelectedItem().toString() == model.getValueAt(i, 3)
                                && bugetTaxaComboBox.getSelectedItem().toString() == model.getValueAt(i, 4)) {
                            errorLabel.setText("You've already added that option.");
                            errorLabel.setVisible(true);
                            return;
                        }
                    }
                }
            } else {
                errorLabel.setText("You must fill in all the fields.");
                errorLabel.setVisible(true);
                return;
            }

            // Adding - Table rows
            model.addRow(new Object[]{
                optionsTable.getRowCount() + 1,
                universitateComboBox.getSelectedItem().toString(),
                facultateComboBox.getSelectedItem().toString(),
                domeniuComboBox.getSelectedItem().toString(),
                specializareComboBox.getSelectedItem().toString(),
                bugetTaxaComboBox.getSelectedItem().toString()
            });

            // Resizing - Table columns
            resizeColumns(optionsTable);

            // Setting - Error - invisible
            errorLabel.setVisible(false);
        }

    }//GEN-LAST:event_addButtonMousePressed

    private void submitButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMousePressed
        if (submitButton.isEnabled()) {
            if (dataIsReady()) {
                insertData();

                // Clearing the data
                numeField.setText(null);
                initialaTataField.setText(null);
                prenumeField.setText(null);
                cnpField.setText(null);

                dayComboBox.setSelectedIndex(0);
                monthComboBox.setSelectedIndex(0);
                yearComboBox.setSelectedIndex(0);
                liceuComboBox.setSelectedIndex(0);

                medieLiceuSpinner.setValue(5);
                medieBacSpinner.setValue(6);

                universitateComboBox.setSelectedIndex(0);

                for (int i = 0; i < optionsTable.getRowCount(); i++) {
                    model.removeRow(i);
                    i--;
                }

            }
        }
    }//GEN-LAST:event_submitButtonMousePressed

    private void deleteButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMousePressed
        if (deleteButton.isEnabled()) {
            // Removing the selected row
            model.removeRow(selectedRow);
        }

        // Disabling - Components
        deleteButton.setEnabled(false);

        // Resetting - Variable - Default value
        selectedRow = -1;
    }//GEN-LAST:event_deleteButtonMousePressed

    private void initialaTataFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_initialaTataFieldKeyTyped
        if (initialaTataField.getText().length() >= 1 || Character.isLetter(evt.getKeyChar()) == false) {
            evt.consume();
        }
    }//GEN-LAST:event_initialaTataFieldKeyTyped

    private void cnpFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnpFieldKeyTyped
        if (cnpField.getText().length() >= 13 || Character.isDigit(evt.getKeyChar()) == false) {
            evt.consume();
        }
    }//GEN-LAST:event_cnpFieldKeyTyped

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

    private void numeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeFieldKeyTyped
        if (Character.isLetter(evt.getKeyChar()) == false) {
            evt.consume();
        }
    }//GEN-LAST:event_numeFieldKeyTyped

    private void prenumeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenumeFieldKeyTyped
        if (Character.isLetter(evt.getKeyChar()) == false) {
            evt.consume();
        }
    }//GEN-LAST:event_prenumeFieldKeyTyped

    private void cnpFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnpFieldFocusGained
        cnpField.setForeground(Color.black);
    }//GEN-LAST:event_cnpFieldFocusGained

    private boolean dataNastereIsReady() {
        ready = true;
        // Checking - The date must be valid
        if (dayComboBox.getSelectedIndex() == 0
                || monthComboBox.getSelectedIndex() == 0
                || yearComboBox.getSelectedIndex() == 0
                || isValid(yearComboBox.getSelectedItem().toString()
                        + "-" + monthComboBox.getSelectedItem().toString()
                        + "-" + dayComboBox.getSelectedItem().toString()) == false) {
            ready = false;
            errorLabel.setText("Something went wrong.");
            errorLabel.setVisible(true);
        }
        return ready;
    }

    private boolean liceuIsReady() {
        ready = true;
        // Checking - The selected item must be valid
        if (liceuComboBox.getSelectedIndex() == 0) {
            ready = false;
            errorLabel.setText("Something went wrong.");
            errorLabel.setVisible(true);
        }
        return ready;
    }

    private boolean optionsTableIsReady() {
        ready = true;
        // Checking - The table must have at least one row
        if (model.getRowCount() == 0) {
            ready = false;
            errorLabel.setText("At least one option is required.");
            errorLabel.setVisible(true);
        }
        return ready;
    }

    private boolean hasDuplicates() {
        ready = true;
        // Checking for duplicates
        if (OracleConnection.hasDuplicateCandidat(cnpField.getText())) {
            ready = false;
            errorLabel.setText("The person has already been added.");
            errorLabel.setVisible(true);
        }
        return ready;
    }

    private boolean dataIsReady() {
        ready = true;
        if (numeField.getText().length() == 0
                || initialaTataField.getText().length() == 0
                || prenumeField.getText().length() == 0
                || cnpField.getText().length() == 0) {
            ready = false;
            errorLabel.setText("You must fill in all the fields.");
            errorLabel.setVisible(true);
        } else if (dataNastereIsReady() == false
                || liceuIsReady() == false
                || optionsTableIsReady() == false
                || hasDuplicates() == false) {
            ready = false;
        }

        return ready;
    }

    private void insertData() {
        // Preparing - Insert data into the database
        int cod_c;
        cod_c = OracleConnection.getNextCodCandidat();

        String nume;
        nume = numeField.getText().substring(0, 1).toUpperCase() + numeField.getText().substring(1).toLowerCase();

        String init_tata;
        init_tata = initialaTataField.getText().toUpperCase();

        String prenume;
        prenume = prenumeField.getText().substring(0, 1).toUpperCase() + prenumeField.getText().substring(1).toLowerCase();

        String cnp;
        cnp = cnpField.getText();

        String data_n;
        data_n = yearComboBox.getSelectedItem().toString() + "-" + monthComboBox.getSelectedIndex() + "-" + dayComboBox.getSelectedItem().toString();

        String den_liceu;
        den_liceu = liceuComboBox.getSelectedItem().toString();

        double medie_liceu;
        medie_liceu = (double) medieLiceuSpinner.getValue();

        double medie_bac;
        medie_bac = (double) medieBacSpinner.getValue();

        errorLabel.setVisible(false);

        // Inserting data into candidat
        OracleConnection.insertIntoCandidat(cod_c, nume, init_tata, prenume, cnp, data_n, den_liceu, medie_liceu, medie_bac);

        // Inserting data into optiune_candidat 
        String buget_taxa;
        int cod_o;
        int cod_s;
        for (int i = 0; i < optionsTable.getRowCount(); i++) {
            cod_o = OracleConnection.getNextCodOptiune();
            buget_taxa = (String) optionsTable.getModel().getValueAt(i, 5);
            cod_s = OracleConnection.getCodSpecializare((String) optionsTable.getModel().getValueAt(i, 4));

            OracleConnection.insertIntoOptiuneCandidat(cod_o, buget_taxa, cod_c, cod_s);
        }

        // Inserting data into rezultat
        List<Integer> cod_e = OracleConnection.getCodExamenCandidat(cod_c);
        for (int i = 0; i < cod_e.size(); i++) {
            OracleConnection.insertIntoRezultat(cod_c, cod_e.get(i), 0);
        }
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

    private void tableRowSelected(ListSelectionEvent e) {
        // Enabling - Components
        deleteButton.setEnabled(true);

        // Getting - Index of selected row
        selectedRow = optionsTable.getSelectedRow();
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> bugetTaxaComboBox;
    private javax.swing.JTextField cnpField;
    private javax.swing.JLabel cnpLabel;
    private javax.swing.JSeparator cnpSeparator;
    private javax.swing.JLabel dataNastereLabel;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> domeniuComboBox;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JComboBox<String> facultateComboBox;
    private javax.swing.JLabel informatiiCandidatLabel;
    private javax.swing.JSeparator informatiiCandidatSeparator;
    private javax.swing.JTextField initialaTataField;
    private javax.swing.JLabel initialaTataLabel;
    private javax.swing.JSeparator initialaTataSeparator;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> liceuComboBox;
    private javax.swing.JLabel liceuLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JLabel medieBacLabel;
    private javax.swing.JSpinner medieBacSpinner;
    private javax.swing.JLabel medieLiceuLabel;
    private javax.swing.JSpinner medieLiceuSpinner;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTextField numeField;
    private javax.swing.JLabel numeLabel;
    private javax.swing.JScrollPane optionsScrollPane;
    private javax.swing.JTable optionsTable;
    private javax.swing.JLabel optiuniCandidatLabel;
    private javax.swing.JSeparator optiuniCandidatSeparator;
    private javax.swing.JTextField prenumeField;
    private javax.swing.JLabel prenumeLabel;
    private javax.swing.JSeparator prenumeSeparator;
    private javax.swing.JComboBox<String> specializareComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> universitateComboBox;
    private javax.swing.JLabel universitateLabel;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
