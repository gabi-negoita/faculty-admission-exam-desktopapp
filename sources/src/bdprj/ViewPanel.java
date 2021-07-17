package bdprj;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public final class ViewPanel extends javax.swing.JPanel {

    public ViewPanel() {
        initComponents();
        showComponents();

        // Adding items to liceuComboBox
        List<String> licee = new ArrayList<>();
//        licee = OracleConnection.getLiceu();
        for (int i = 0; i < licee.size(); i++) {
            liceuComboBox.addItem(licee.get(i));
        }
        liceuComboBox.setMaximumRowCount(licee.size() + 1);

        resultsTable.getTableHeader().setFont(new Font("Calibri Light", Font.BOLD, 18));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        searchForPanel = new javax.swing.JPanel();
        seachForComboBox = new javax.swing.JComboBox<>();
        searchPanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        filtersPanel = new javax.swing.JPanel();
        liceuComboBox = new javax.swing.JComboBox<>();
        showPanel = new javax.swing.JPanel();
        liceuCheckBox = new javax.swing.JCheckBox();
        selectAllCheckBox = new javax.swing.JCheckBox();
        medieLiceuCheckBox = new javax.swing.JCheckBox();
        medieBacCheckBox = new javax.swing.JCheckBox();
        universitateCheckBox = new javax.swing.JCheckBox();
        adresaCheckBox = new javax.swing.JCheckBox();
        facultateCheckBox = new javax.swing.JCheckBox();
        domeniuCheckBox = new javax.swing.JCheckBox();
        durataCheckBox = new javax.swing.JCheckBox();
        regulaAdmitereCheckBox = new javax.swing.JCheckBox();
        locuriCheckBox = new javax.swing.JCheckBox();
        searchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchForPanel.setBackground(java.awt.Color.white);
        searchForPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true), "Search for", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        searchForPanel.setForeground(new java.awt.Color(255, 255, 255));
        searchForPanel.setPreferredSize(new java.awt.Dimension(100, 50));

        seachForComboBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        seachForComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Candidat", "Universitate", "Facultate", "Domeniu", "Specializare" }));
        seachForComboBox.setBorder(null);
        seachForComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                seachForComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout searchForPanelLayout = new javax.swing.GroupLayout(searchForPanel);
        searchForPanel.setLayout(searchForPanelLayout);
        searchForPanelLayout.setHorizontalGroup(
            searchForPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchForPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seachForComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        searchForPanelLayout.setVerticalGroup(
            searchForPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seachForComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        searchPanel.setBackground(java.awt.Color.white);
        searchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true), "Search for", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        searchField.setBackground(java.awt.Color.lightGray);
        searchField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        searchField.setForeground(java.awt.Color.gray);
        searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchField.setText("Search by name");
        searchField.setBorder(null);
        searchField.setOpaque(false);
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField)
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        filtersPanel.setBackground(java.awt.Color.white);
        filtersPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true), "Search for", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        filtersPanel.setPreferredSize(new java.awt.Dimension(100, 50));

        liceuComboBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        liceuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose liceu" }));
        liceuComboBox.setBorder(null);

        javax.swing.GroupLayout filtersPanelLayout = new javax.swing.GroupLayout(filtersPanel);
        filtersPanel.setLayout(filtersPanelLayout);
        filtersPanelLayout.setHorizontalGroup(
            filtersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(liceuComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        filtersPanelLayout.setVerticalGroup(
            filtersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(liceuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        showPanel.setBackground(java.awt.Color.white);
        showPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true), "Search for", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        liceuCheckBox.setBackground(java.awt.Color.white);
        liceuCheckBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        liceuCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        liceuCheckBox.setSelected(true);
        liceuCheckBox.setText("Liceu");
        liceuCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                liceuCheckBoxItemStateChanged(evt);
            }
        });

        selectAllCheckBox.setBackground(java.awt.Color.white);
        selectAllCheckBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        selectAllCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        selectAllCheckBox.setSelected(true);
        selectAllCheckBox.setText("Select all");
        selectAllCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectAllCheckBoxItemStateChanged(evt);
            }
        });

        medieLiceuCheckBox.setBackground(java.awt.Color.white);
        medieLiceuCheckBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        medieLiceuCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        medieLiceuCheckBox.setSelected(true);
        medieLiceuCheckBox.setText("Medie liceu");
        medieLiceuCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                medieLiceuCheckBoxItemStateChanged(evt);
            }
        });

        medieBacCheckBox.setBackground(java.awt.Color.white);
        medieBacCheckBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        medieBacCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        medieBacCheckBox.setSelected(true);
        medieBacCheckBox.setText("Medie bacalaureat");
        medieBacCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                medieBacCheckBoxItemStateChanged(evt);
            }
        });

        universitateCheckBox.setBackground(java.awt.Color.white);
        universitateCheckBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        universitateCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        universitateCheckBox.setSelected(true);
        universitateCheckBox.setText("Universitate");
        universitateCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                universitateCheckBoxItemStateChanged(evt);
            }
        });

        adresaCheckBox.setBackground(java.awt.Color.white);
        adresaCheckBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        adresaCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        adresaCheckBox.setSelected(true);
        adresaCheckBox.setText("Adresa");
        adresaCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                adresaCheckBoxItemStateChanged(evt);
            }
        });

        facultateCheckBox.setBackground(java.awt.Color.white);
        facultateCheckBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        facultateCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        facultateCheckBox.setSelected(true);
        facultateCheckBox.setText("Facultate");
        facultateCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                facultateCheckBoxItemStateChanged(evt);
            }
        });

        domeniuCheckBox.setBackground(java.awt.Color.white);
        domeniuCheckBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        domeniuCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        domeniuCheckBox.setSelected(true);
        domeniuCheckBox.setText("Domeniu");
        domeniuCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                domeniuCheckBoxItemStateChanged(evt);
            }
        });

        durataCheckBox.setBackground(java.awt.Color.white);
        durataCheckBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        durataCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        durataCheckBox.setSelected(true);
        durataCheckBox.setText("Durata (ani)");
        durataCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                durataCheckBoxItemStateChanged(evt);
            }
        });

        regulaAdmitereCheckBox.setBackground(java.awt.Color.white);
        regulaAdmitereCheckBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        regulaAdmitereCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        regulaAdmitereCheckBox.setSelected(true);
        regulaAdmitereCheckBox.setText("Regula admitere");
        regulaAdmitereCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                regulaAdmitereCheckBoxItemStateChanged(evt);
            }
        });

        locuriCheckBox.setBackground(java.awt.Color.white);
        locuriCheckBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        locuriCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        locuriCheckBox.setSelected(true);
        locuriCheckBox.setText("Locuri");
        locuriCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                locuriCheckBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout showPanelLayout = new javax.swing.GroupLayout(showPanel);
        showPanel.setLayout(showPanelLayout);
        showPanelLayout.setHorizontalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showPanelLayout.createSequentialGroup()
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectAllCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(showPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medieLiceuCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(liceuCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medieBacCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(universitateCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adresaCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(facultateCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(domeniuCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(durataCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regulaAdmitereCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(locuriCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        showPanelLayout.setVerticalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showPanelLayout.createSequentialGroup()
                .addComponent(selectAllCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(liceuCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medieLiceuCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medieBacCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(universitateCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adresaCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(facultateCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(domeniuCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(durataCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regulaAdmitereCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locuriCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        searchButton.setBackground(new java.awt.Color(0, 127, 0));
        searchButton.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        searchButton.setForeground(java.awt.Color.black);
        searchButton.setText("SEARCH");
        searchButton.setBorder(null);
        searchButton.setPreferredSize(new java.awt.Dimension(100, 50));
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchButtonMousePressed(evt);
            }
        });

        resultsTable.setAutoCreateRowSorter(true);
        resultsTable.setBackground(new java.awt.Color(255, 255, 255));
        resultsTable.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        resultsTable.setForeground(new java.awt.Color(0, 0, 0));
        resultsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        resultsTable.setCellSelectionEnabled(true);
        resultsTable.setEditingColumn(0);
        resultsTable.setEditingRow(0);
        resultsTable.setFillsViewportHeight(true);
        resultsTable.setGridColor(java.awt.Color.lightGray);
        resultsTable.setName(""); // NOI18N
        resultsTable.setRowHeight(24);
        resultsTable.setSelectionBackground(new java.awt.Color(0, 127, 255));
        resultsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(resultsTable);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filtersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchForPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(showPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(searchForPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filtersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void liceuCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_liceuCheckBoxItemStateChanged
        if (liceuCheckBox.isSelected()) {
            if (medieLiceuCheckBox.isSelected() && medieBacCheckBox.isSelected()) {
                selectAllCheckBox.setSelected(true);
            }
        } else {
            boolean medieLiceu = medieLiceuCheckBox.isSelected();
            boolean medieBac = medieBacCheckBox.isSelected();

            selectAllCheckBox.setSelected(false);

            medieLiceuCheckBox.setSelected(medieLiceu);
            medieBacCheckBox.setSelected(medieBac);
        }
    }//GEN-LAST:event_liceuCheckBoxItemStateChanged

    private void selectAllCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectAllCheckBoxItemStateChanged
        if (selectAllCheckBox.isSelected()) {
            liceuCheckBox.setSelected(true);
            medieLiceuCheckBox.setSelected(true);
            medieBacCheckBox.setSelected(true);
            universitateCheckBox.setSelected(true);
            adresaCheckBox.setSelected(true);
            facultateCheckBox.setSelected(true);
            domeniuCheckBox.setSelected(true);
            durataCheckBox.setSelected(true);
            regulaAdmitereCheckBox.setSelected(true);
            locuriCheckBox.setSelected(true);
        } else {
            liceuCheckBox.setSelected(false);
            medieLiceuCheckBox.setSelected(false);
            medieBacCheckBox.setSelected(false);
            universitateCheckBox.setSelected(false);
            adresaCheckBox.setSelected(false);
            facultateCheckBox.setSelected(false);
            domeniuCheckBox.setSelected(false);
            durataCheckBox.setSelected(false);
            regulaAdmitereCheckBox.setSelected(false);
            locuriCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_selectAllCheckBoxItemStateChanged

    private void medieLiceuCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_medieLiceuCheckBoxItemStateChanged
        if (medieLiceuCheckBox.isSelected()) {
            if (liceuCheckBox.isSelected() && medieBacCheckBox.isSelected()) {
                selectAllCheckBox.setSelected(true);
            }
        } else {
            boolean liceu = liceuCheckBox.isSelected();
            boolean medieBac = medieBacCheckBox.isSelected();

            selectAllCheckBox.setSelected(false);

            liceuCheckBox.setSelected(liceu);
            medieBacCheckBox.setSelected(medieBac);
        }
    }//GEN-LAST:event_medieLiceuCheckBoxItemStateChanged

    private void medieBacCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_medieBacCheckBoxItemStateChanged
        if (medieBacCheckBox.isSelected()) {
            if (liceuCheckBox.isSelected() && medieLiceuCheckBox.isSelected()) {
                selectAllCheckBox.setSelected(true);
            }
        } else {
            boolean liceu = liceuCheckBox.isSelected();
            boolean medieLiceu = medieLiceuCheckBox.isSelected();

            selectAllCheckBox.setSelected(false);

            liceuCheckBox.setSelected(liceu);
            medieLiceuCheckBox.setSelected(medieLiceu);
        }
    }//GEN-LAST:event_medieBacCheckBoxItemStateChanged

    private void adresaCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_adresaCheckBoxItemStateChanged
        switch (seachForComboBox.getSelectedItem().toString()) {
            case "Universitate":
                if (adresaCheckBox.isSelected()) {
                    selectAllCheckBox.setSelected(true);
                } else {
                    selectAllCheckBox.setSelected(false);
                }
                break;
            case "Facultate":
                if (adresaCheckBox.isSelected()) {
                    if (universitateCheckBox.isSelected()) {
                        selectAllCheckBox.setSelected(true);
                    }
                } else {
                    boolean universitate = universitateCheckBox.isSelected();

                    selectAllCheckBox.setSelected(false);

                    universitateCheckBox.setSelected(universitate);
                }
                break;
        }
    }//GEN-LAST:event_adresaCheckBoxItemStateChanged

    private void universitateCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_universitateCheckBoxItemStateChanged
        if (universitateCheckBox.isSelected()) {
            if (adresaCheckBox.isSelected()) {
                selectAllCheckBox.setSelected(true);
            }
        } else {
            boolean adresa = adresaCheckBox.isSelected();

            selectAllCheckBox.setSelected(false);

            adresaCheckBox.setSelected(adresa);
        }
    }//GEN-LAST:event_universitateCheckBoxItemStateChanged

    private void facultateCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_facultateCheckBoxItemStateChanged
        if (facultateCheckBox.isSelected()) {
            selectAllCheckBox.setSelected(true);
        } else {
            selectAllCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_facultateCheckBoxItemStateChanged

    private void domeniuCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_domeniuCheckBoxItemStateChanged
        if (domeniuCheckBox.isSelected()) {
            if (durataCheckBox.isSelected() && regulaAdmitereCheckBox.isSelected() && locuriCheckBox.isSelected()) {
                selectAllCheckBox.setSelected(true);
            }
        } else {
            boolean durata = durataCheckBox.isSelected();
            boolean regulaAdmitere = regulaAdmitereCheckBox.isSelected();
            boolean locuri = locuriCheckBox.isSelected();

            selectAllCheckBox.setSelected(false);

            durataCheckBox.setSelected(durata);
            regulaAdmitereCheckBox.setSelected(regulaAdmitere);
            locuriCheckBox.setSelected(locuri);
        }
    }//GEN-LAST:event_domeniuCheckBoxItemStateChanged

    private void durataCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_durataCheckBoxItemStateChanged
        if (durataCheckBox.isSelected()) {
            if (domeniuCheckBox.isSelected() && regulaAdmitereCheckBox.isSelected() && locuriCheckBox.isSelected()) {
                selectAllCheckBox.setSelected(true);
            }
        } else {
            boolean domeniu = domeniuCheckBox.isSelected();
            boolean regulaAdmitere = regulaAdmitereCheckBox.isSelected();
            boolean locuri = locuriCheckBox.isSelected();

            selectAllCheckBox.setSelected(false);

            domeniuCheckBox.setSelected(domeniu);
            regulaAdmitereCheckBox.setSelected(regulaAdmitere);
            locuriCheckBox.setSelected(locuri);
        }
    }//GEN-LAST:event_durataCheckBoxItemStateChanged

    private void regulaAdmitereCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_regulaAdmitereCheckBoxItemStateChanged
        if (regulaAdmitereCheckBox.isSelected()) {
            if (domeniuCheckBox.isSelected() && durataCheckBox.isSelected() && locuriCheckBox.isSelected()) {
                selectAllCheckBox.setSelected(true);
            }
        } else {
            boolean domeniu = domeniuCheckBox.isSelected();
            boolean durata = durataCheckBox.isSelected();
            boolean locuri = locuriCheckBox.isSelected();

            selectAllCheckBox.setSelected(false);

            domeniuCheckBox.setSelected(domeniu);
            durataCheckBox.setSelected(durata);
            locuriCheckBox.setSelected(locuri);
        }
    }//GEN-LAST:event_regulaAdmitereCheckBoxItemStateChanged

    private void locuriCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_locuriCheckBoxItemStateChanged
        if (locuriCheckBox.isSelected()) {
            if (domeniuCheckBox.isSelected() && durataCheckBox.isSelected() && regulaAdmitereCheckBox.isSelected()) {
                selectAllCheckBox.setSelected(true);
            }
        } else {
            boolean domeniu = domeniuCheckBox.isSelected();
            boolean durata = durataCheckBox.isSelected();
            boolean regulaAdmitere = regulaAdmitereCheckBox.isSelected();

            selectAllCheckBox.setSelected(false);

            domeniuCheckBox.setSelected(domeniu);
            durataCheckBox.setSelected(durata);
            regulaAdmitereCheckBox.setSelected(regulaAdmitere);
        }
    }//GEN-LAST:event_locuriCheckBoxItemStateChanged

    private void seachForComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seachForComboBoxItemStateChanged
        showComponents();
    }//GEN-LAST:event_seachForComboBoxItemStateChanged

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            switch (seachForComboBox.getSelectedItem().toString()) {
                case "Candidat":
                    searchForCandidat();
                    break;
                case "Universitate":
                    searchForUniversitate();
                    break;
                case "Facultate":
                    searchForFacultate();
                    break;
                case "Domeniu":
                    searchForDomeniu();
                    break;
                case "Specializare":
                    searchForSpecializare();
                    break;
            }
        }
    }//GEN-LAST:event_searchFieldKeyPressed

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        searchFieldToEmpty();
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        searchFieldToText();
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMousePressed
        if (searchButton.isEnabled()) {
            switch (seachForComboBox.getSelectedItem().toString()) {
                case "Candidat":
                    searchForCandidat();
                    break;
                case "Universitate":
                    searchForUniversitate();
                    break;
                case "Facultate":
                    searchForFacultate();
                    break;
                case "Domeniu":
                    searchForDomeniu();
                    break;
                case "Specializare":
                    searchForSpecializare();
                    break;
            }
        }
    }//GEN-LAST:event_searchButtonMousePressed

    private void searchForCandidat() {
        List<String> numeCompletCandidati = new ArrayList<>();
        numeCompletCandidati = OracleConnection.getNumeCompletCandidat(searchField.getText());

        // Clearing the table
        resultsTable.setModel(new javax.swing.table.DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Making all cells non-editable
                return false;
            }
        });

        // Getting the model
        DefaultTableModel model;
        model = (DefaultTableModel) resultsTable.getModel();

        // Creating columns
        model.addColumn(
                "#");

        // Adding rows
        for (int i = 1;
                i
                <= numeCompletCandidati.size();
                i++) {
            model.addRow(new Object[]{i});
        }

        // Creating columns 
        model.addColumn(
                "NUME");

        // Adding rows
        for (int i = 0;
                i < numeCompletCandidati.size();
                i++) {
            model.setValueAt(numeCompletCandidati.get(i), i, model.getColumnCount() - 1);
        }

        if (liceuCheckBox.isSelected()) {
            List<String> liceuCandidat = new ArrayList<>();
            liceuCandidat = OracleConnection.getLiceuCandidat(searchField.getText());

            // Getting the model
            model = (DefaultTableModel) resultsTable.getModel();

            // Creating columns 
            model.addColumn("LICEU");

            // Adding rows
            for (int i = 0; i < liceuCandidat.size(); i++) {
                model.setValueAt(liceuCandidat.get(i), i, model.getColumnCount() - 1);
            }
        }

        if (medieLiceuCheckBox.isSelected()) {
            List<Double> medieLiceuCandidat = new ArrayList<>();
            medieLiceuCandidat = OracleConnection.getMedieLiceuCandidat(searchField.getText());

            // Getting the model
            model = (DefaultTableModel) resultsTable.getModel();

            // Creating columns 
            model.addColumn("MEDIE LICEU");

            // Adding rows
            for (int i = 0; i < medieLiceuCandidat.size(); i++) {
                model.setValueAt(medieLiceuCandidat.get(i), i, model.getColumnCount() - 1);
            }
        }

        if (medieBacCheckBox.isSelected()) {
            List<Double> medieBacCandidat = new ArrayList<>();
            medieBacCandidat = OracleConnection.getMedieBacCandidat(searchField.getText());
            // Getting the model
            model = (DefaultTableModel) resultsTable.getModel();

            // Creating columns 
            model.addColumn("MEDIE BACALAUREAT");

            // Adding rows
            for (int i = 0; i < medieBacCandidat.size(); i++) {
                model.setValueAt(medieBacCandidat.get(i), i, model.getColumnCount() - 1);
            }
        }

        if (liceuComboBox.getSelectedIndex()
                != 0) {
            List<String> liceuCandidat = new ArrayList<>();
            liceuCandidat = OracleConnection.getLiceuCandidat(searchField.getText());

            for (int i = 0; i < liceuCandidat.size(); i++) {
                if (liceuCandidat.get(i).equals(liceuComboBox.getSelectedItem()) == false) {
                    // Removing rows
                    model.removeRow(i);
                    liceuCandidat.remove(i);
                    i--;
                }
            }
        }

        resizeColumns(resultsTable);
    }

    private void searchForUniversitate() {
        List<String> universitati = new ArrayList<>();
        universitati = OracleConnection.getUniversitate(searchField.getText());

        // Clearing the table
        resultsTable.setModel(new javax.swing.table.DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Making all cells non-editable
                return false;
            }
        });

        // Getting the model
        DefaultTableModel model;
        model = (DefaultTableModel) resultsTable.getModel();

        // Creating columns
        model.addColumn("#");

        // Adding rows
        for (int i = 1; i <= universitati.size(); i++) {
            model.addRow(new Object[]{i});
        }

        // Creating columns 
        model.addColumn("DENUMIRE");

        // Adding rows
        for (int i = 0; i < universitati.size(); i++) {
            model.setValueAt(universitati.get(i), i, model.getColumnCount() - 1);
        }

        if (adresaCheckBox.isSelected()) {
            List<String> adresaUniversitati = new ArrayList<>();
            adresaUniversitati = OracleConnection.getAdresaUniversitate(searchField.getText());

            // Getting the model
            model = (DefaultTableModel) resultsTable.getModel();

            // Creating columns 
            model.addColumn("ADRESA");

            // Adding rows
            for (int i = 0; i < adresaUniversitati.size(); i++) {
                model.setValueAt(adresaUniversitati.get(i), i, model.getColumnCount() - 1);
            }
        }
        resizeColumns(resultsTable);
    }

    private void searchForFacultate() {
        List<String> facultati = new ArrayList<>();
        facultati = OracleConnection.getFacultate(searchField.getText());

        // Clearing the table
        resultsTable.setModel(new javax.swing.table.DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Making all cells non-editable
                return false;
            }
        });

        // Getting the model
        DefaultTableModel model;
        model = (DefaultTableModel) resultsTable.getModel();

        // Creating columns
        model.addColumn("#");

        // Adding rows
        for (int i = 1; i <= facultati.size(); i++) {
            model.addRow(new Object[]{i});
        }

        // Creating columns 
        model.addColumn("DENUMIRE");

        // Adding rows
        for (int i = 0; i < facultati.size(); i++) {
            model.setValueAt(facultati.get(i), i, model.getColumnCount() - 1);
        }

        if (universitateCheckBox.isSelected()) {
            List<String> universitateFacultati = new ArrayList<>();
            universitateFacultati = OracleConnection.getUniversitateFacultate(searchField.getText());

            // Getting the model
            model = (DefaultTableModel) resultsTable.getModel();

            // Creating columns 
            model.addColumn("UNIVERSITATE");

            // Adding rows
            for (int i = 0; i < universitateFacultati.size(); i++) {
                model.setValueAt(universitateFacultati.get(i), i, model.getColumnCount() - 1);
            }
        }

        if (adresaCheckBox.isSelected()) {
            List<String> adresaFacultati = new ArrayList<>();
            adresaFacultati = OracleConnection.getAdresaFacultate(searchField.getText());

            // Getting the model
            model = (DefaultTableModel) resultsTable.getModel();

            // Creating columns 
            model.addColumn("ADRESA");

            // Adding rows
            for (int i = 0; i < adresaFacultati.size(); i++) {
                model.setValueAt(adresaFacultati.get(i), i, model.getColumnCount() - 1);
            }
        }
        resizeColumns(resultsTable);
    }

    private void searchForDomeniu() {
        List<String> domenii = new ArrayList<>();
        domenii = OracleConnection.getDomeniu(searchField.getText());

        // Clearing the table
        resultsTable.setModel(new javax.swing.table.DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Making all cells non-editable
                return false;
            }
        });

        // Getting the model
        DefaultTableModel model;
        model = (DefaultTableModel) resultsTable.getModel();

        // Creating columns
        model.addColumn("#");

        // Adding rows
        for (int i = 1; i <= domenii.size(); i++) {
            model.addRow(new Object[]{i});
        }

        // Creating columns 
        model.addColumn("DENUMIRE");

        // Adding rows
        for (int i = 0; i < domenii.size(); i++) {
            model.setValueAt(domenii.get(i), i, model.getColumnCount() - 1);
        }

        if (facultateCheckBox.isSelected()) {
            List<String> facultateDomenii = new ArrayList<>();
            facultateDomenii = OracleConnection.getFacultateDomeniu(searchField.getText());

            // Getting the model
            model = (DefaultTableModel) resultsTable.getModel();

            // Creating columns 
            model.addColumn("FACULTATE");

            // Adding rows
            for (int i = 0; i < facultateDomenii.size(); i++) {
                model.setValueAt(facultateDomenii.get(i), i, model.getColumnCount() - 1);
            }
        }
        resizeColumns(resultsTable);
    }

    private void searchForSpecializare() {
        List<String> specializari = new ArrayList<>();
        specializari = OracleConnection.getSpecializare(searchField.getText());

        // Clearing the table
        resultsTable.setModel(new javax.swing.table.DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Making all cells non-editable
                return false;
            }
        });

        // Getting the model
        DefaultTableModel model;
        model = (DefaultTableModel) resultsTable.getModel();

        // Creating columns
        model.addColumn("#");

        // Adding rows
        for (int i = 1; i <= specializari.size(); i++) {
            model.addRow(new Object[]{i});
        }

        // Creating columns 
        model.addColumn("DENUMIRE");

        // Adding rows
        for (int i = 0; i < specializari.size(); i++) {
            model.setValueAt(specializari.get(i), i, model.getColumnCount() - 1);
        }

        if (domeniuCheckBox.isSelected()) {
            List<String> domeniuSpecializari = new ArrayList<>();
            domeniuSpecializari = OracleConnection.getDomeniuSpecializare(searchField.getText());

            // Getting the model
            model = (DefaultTableModel) resultsTable.getModel();

            // Creating columns 
            model.addColumn("DOMENIU");

            // Adding rows
            for (int i = 0; i < domeniuSpecializari.size(); i++) {
                model.setValueAt(domeniuSpecializari.get(i), i, model.getColumnCount() - 1);
            }
        }

        if (durataCheckBox.isSelected()) {
            List<Integer> durataAni = new ArrayList<>();
            durataAni = OracleConnection.getDurataSpecializare(searchField.getText());

            // Getting the model
            model = (DefaultTableModel) resultsTable.getModel();

            // Creating columns 
            model.addColumn("DURATA (ani)");

            // Adding rows
            for (int i = 0; i < durataAni.size(); i++) {
                model.setValueAt(durataAni.get(i), i, model.getColumnCount() - 1);
            }
        }

        if (regulaAdmitereCheckBox.isSelected()) {
            List<String> regulaAdmiteri = new ArrayList<>();
            regulaAdmiteri = OracleConnection.getRegulaAdmitereSpecializare(searchField.getText());

            // Getting the model
            model = (DefaultTableModel) resultsTable.getModel();

            // Creating columns 
            model.addColumn("REGULA ADMITERE");

            // Adding rows
            for (int i = 0; i < regulaAdmiteri.size(); i++) {
                model.setValueAt(regulaAdmiteri.get(i), i, model.getColumnCount() - 1);
            }
        }

        if (locuriCheckBox.isSelected()) {
            // Locuri buget
            List<Integer> locuriBuget = new ArrayList<>();
            locuriBuget = OracleConnection.getLocuriBugetSpecializare(searchField.getText()); // locuri buget/taxa 

            // Getting the model
            model = (DefaultTableModel) resultsTable.getModel();

            // Creating columns 
            model.addColumn("LOCURI BUGET");

            // Adding rows
            for (int i = 0; i < locuriBuget.size(); i++) {
                model.setValueAt(locuriBuget.get(i), i, model.getColumnCount() - 1);
            }

            // Locuri taxa
            List<Integer> locuriTaxa = new ArrayList<>();
            locuriTaxa = OracleConnection.getLocuriTaxaSpecializare(searchField.getText()); // locuri buget/taxa 

            // Creating columns 
            model.addColumn("LOCURI TAXA");

            // Adding rows
            for (int i = 0; i < locuriTaxa.size(); i++) {
                model.setValueAt(locuriTaxa.get(i), i, model.getColumnCount() - 1);
            }
        }
        resizeColumns(resultsTable);
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

    private void searchFieldToText() {
        if (searchField.getText().equals("")) {
            searchField.setText("Search by name");
            searchField.setForeground(java.awt.Color.gray);
        }
    }

    private void searchFieldToEmpty() {
        if (searchField.getText().equals("Search by name")) {
            searchField.setText("");
            searchField.setForeground(java.awt.Color.black);
        }
    }

    public void showComponents() {
        switch (seachForComboBox.getSelectedItem().toString()) {
            case "Candidat":
                filtersPanel.setVisible(true);              // show

                liceuCheckBox.setVisible(true);             // show
                medieLiceuCheckBox.setVisible(true);        // show
                medieBacCheckBox.setVisible(true);          // show
                universitateCheckBox.setVisible(false);
                adresaCheckBox.setVisible(false);
                facultateCheckBox.setVisible(false);
                domeniuCheckBox.setVisible(false);
                durataCheckBox.setVisible(false);
                regulaAdmitereCheckBox.setVisible(false);
                locuriCheckBox.setVisible(false);
                break;
            case "Universitate":
                filtersPanel.setVisible(false);

                liceuCheckBox.setVisible(false);
                medieLiceuCheckBox.setVisible(false);
                medieBacCheckBox.setVisible(false);
                universitateCheckBox.setVisible(false);
                adresaCheckBox.setVisible(true);            // show
                facultateCheckBox.setVisible(false);
                domeniuCheckBox.setVisible(false);
                durataCheckBox.setVisible(false);
                regulaAdmitereCheckBox.setVisible(false);
                locuriCheckBox.setVisible(false);
                break;
            case "Facultate":
                filtersPanel.setVisible(false);

                liceuCheckBox.setVisible(false);
                medieLiceuCheckBox.setVisible(false);
                medieBacCheckBox.setVisible(false);
                universitateCheckBox.setVisible(true);     // show
                adresaCheckBox.setVisible(true);           // show
                facultateCheckBox.setVisible(false);
                domeniuCheckBox.setVisible(false);
                durataCheckBox.setVisible(false);
                regulaAdmitereCheckBox.setVisible(false);
                locuriCheckBox.setVisible(false);
                break;
            case "Domeniu":
                filtersPanel.setVisible(false);

                liceuCheckBox.setVisible(false);
                medieLiceuCheckBox.setVisible(false);
                medieBacCheckBox.setVisible(false);
                universitateCheckBox.setVisible(false);
                adresaCheckBox.setVisible(false);
                facultateCheckBox.setVisible(true);        // show
                domeniuCheckBox.setVisible(false);
                durataCheckBox.setVisible(false);
                regulaAdmitereCheckBox.setVisible(false);
                locuriCheckBox.setVisible(false);
                break;
            case "Specializare":
                filtersPanel.setVisible(false);

                liceuCheckBox.setVisible(false);
                medieLiceuCheckBox.setVisible(false);
                medieBacCheckBox.setVisible(false);
                universitateCheckBox.setVisible(false);
                adresaCheckBox.setVisible(false);
                facultateCheckBox.setVisible(false);
                domeniuCheckBox.setVisible(true);          // show
                durataCheckBox.setVisible(true);           // show
                regulaAdmitereCheckBox.setVisible(true);   // show
                locuriCheckBox.setVisible(true);           // show
                break;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox adresaCheckBox;
    private javax.swing.JCheckBox domeniuCheckBox;
    private javax.swing.JCheckBox durataCheckBox;
    private javax.swing.JCheckBox facultateCheckBox;
    private javax.swing.JPanel filtersPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox liceuCheckBox;
    private javax.swing.JComboBox<String> liceuComboBox;
    private javax.swing.JCheckBox locuriCheckBox;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JCheckBox medieBacCheckBox;
    private javax.swing.JCheckBox medieLiceuCheckBox;
    private javax.swing.JCheckBox regulaAdmitereCheckBox;
    private javax.swing.JTable resultsTable;
    private javax.swing.JComboBox<String> seachForComboBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel searchForPanel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JCheckBox selectAllCheckBox;
    private javax.swing.JPanel showPanel;
    private javax.swing.JCheckBox universitateCheckBox;
    // End of variables declaration//GEN-END:variables
}
