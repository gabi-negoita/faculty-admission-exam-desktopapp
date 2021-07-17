package bdprj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.lowagie.text.DocumentException;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.Rectangle;

import java.io.File;

import java.awt.Component;
import java.awt.Font;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.JFileChooser;

public class ResultsPanel extends javax.swing.JPanel {

    private List<Integer> coduriCandidati;
    private final DefaultTableModel model;

    private List<String> numeCol;
    private List<String> medieConcursCol;
    private List<String> specializareCol;
    private List<String> forma_de_finantareCol;
    private List<String> rezultatCol;
    private List<Integer> cod_s;
    private List<Double> medii_concurs;
    private List<Integer> codSpecializari;
    private List<Integer> locuriBuget;
    private List<Integer> locuriTaxa;
    private List<Integer> cod_o;

    private double medie_liceu;
    private double medie_bac;
    private double medie_concurs;
    private int cod_prima_optiune;
    private String den_s;
    private int totalTableColumnSize;

    public ResultsPanel() {
        initComponents();

        // Getting - Table model
        model = (DefaultTableModel) resultsTable.getModel();

        // Setting - Table font
        resultsTable.getTableHeader().setFont(new Font("Calibri Light", Font.BOLD, 18));

        coduriCandidati = new ArrayList<>();
        cod_s = new ArrayList<>();
        medii_concurs = new ArrayList<>();

        codSpecializari = new ArrayList<>();

        locuriBuget = new ArrayList<>();
        locuriTaxa = new ArrayList<>();

        cod_o = new ArrayList<>();

        numeCol = new ArrayList<>();
        medieConcursCol = new ArrayList<>();
        specializareCol = new ArrayList<>();
        forma_de_finantareCol = new ArrayList<>();
        rezultatCol = new ArrayList<>();

        // Filling - Component
        List<String> denSpecializari = new ArrayList<>();
        denSpecializari = OracleConnection.getSpecializare("");

        specializariComboBox.addItem("Select specializare");
        for (String s : denSpecializari) {
            specializariComboBox.addItem(s);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultsScrollPane = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        searchPanel = new javax.swing.JPanel();
        refreshButton = new javax.swing.JButton();
        specializariComboBox = new javax.swing.JComboBox<>();
        downloadButton = new javax.swing.JButton();
        regulaAdmitereLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        resultsTable.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nume", "Medie concurs", "Specializare", "Forma de finantare", "Rezultat"
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
        resultsTable.setGridColor(java.awt.Color.lightGray);
        resultsTable.setRowHeight(24);
        resultsTable.setSelectionBackground(new java.awt.Color(0, 127, 255));
        resultsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        resultsTable.getTableHeader().setReorderingAllowed(false);
        resultsScrollPane.setViewportView(resultsTable);

        searchPanel.setBackground(java.awt.Color.white);
        searchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true), "Filter", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

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

        specializariComboBox.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        specializariComboBox.setMaximumRowCount(25);
        specializariComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                specializariComboBoxItemStateChanged(evt);
            }
        });

        downloadButton.setBackground(java.awt.Color.lightGray);
        downloadButton.setForeground(java.awt.Color.lightGray);
        downloadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        downloadButton.setBorder(null);
        downloadButton.setContentAreaFilled(false);
        downloadButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        downloadButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/download pressed.png"))); // NOI18N
        downloadButton.setRolloverEnabled(true);
        downloadButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/download rollover.png"))); // NOI18N
        downloadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                downloadButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(specializariComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(refreshButton)
                .addGap(18, 18, 18)
                .addComponent(downloadButton)
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(specializariComboBox)
                    .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(downloadButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        regulaAdmitereLabel.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        regulaAdmitereLabel.setForeground(new java.awt.Color(0, 0, 0));
        regulaAdmitereLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regulaAdmitereLabel.setText("Regula de admitere");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE)
                    .addComponent(regulaAdmitereLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regulaAdmitereLabel)
                .addGap(18, 18, 18)
                .addComponent(resultsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void specializariComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_specializariComboBoxItemStateChanged
        if (resultsTable.getRowCount() > 0) {
            for (int i = 0; i < resultsTable.getRowCount(); i++) {
                model.removeRow(i);
                i--;
            }
        }

        if (specializariComboBox.getSelectedIndex() != 0) {
            for (int i = 0; i < numeCol.size(); i++) {
                if (specializariComboBox.getSelectedItem().toString().equals(specializareCol.get(i))) {
                    model.addRow(new Object[]{
                        resultsTable.getRowCount() + 1,
                        numeCol.get(i),
                        medieConcursCol.get(i),
                        specializareCol.get(i),
                        forma_de_finantareCol.get(i),
                        rezultatCol.get(i)
                    });
                }
            }
            regulaAdmitereLabel.setText(
                    "Regula de admitere: "
                    + OracleConnection.getDenumireRegulaAdmitereSpecializare(specializariComboBox.getSelectedItem().toString()));
        } else {
            for (int i = 0; i < numeCol.size(); i++) {
                model.addRow(new Object[]{
                    resultsTable.getRowCount() + 1,
                    numeCol.get(i),
                    medieConcursCol.get(i),
                    specializareCol.get(i),
                    forma_de_finantareCol.get(i),
                    rezultatCol.get(i)
                });
            }
            regulaAdmitereLabel.setText("Regula de admitere");
        }


    }//GEN-LAST:event_specializariComboBoxItemStateChanged

    private void refreshButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMousePressed
        if (model.getRowCount() > 0) {
            for (int i = 0; i < resultsTable.getRowCount(); i++) {
                model.removeRow(0);
                i--;
            }
        }
        getResults();
    }//GEN-LAST:event_refreshButtonMousePressed

    private void downloadButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downloadButtonMousePressed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save as");
        fileChooser.setSelectedFile(new File("ResultsTable"));

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String absolutePath = fileToSave.getAbsolutePath();
            System.out.println("File saved to: " + absolutePath + ".pdf");
            
            exportToPDF(resultsTable, absolutePath + ".pdf");
        }
    }//GEN-LAST:event_downloadButtonMousePressed

    private double getMedieConcurs(double medie_liceu, double medie_bac, String den_s, int cod_c) {
        switch (den_s) {
            case "Sisteme si echipamente termice": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Inginerie mecanica": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Tehnologia constructiilor de masini": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Autovehicule rutiere": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Ingineria si protectia mediului in industrie": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Amenajari hidrotehnice si protectia mediului": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Inginerie economica industriala": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Stiinta materialelor": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Informatica aplicata in ingineria materialelor": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Inginerie medicala": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Arhitectura navala": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Sisteme si echipamente navale": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Ingineria produselor alimentare": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Controlul si expertiza produselor alimentare": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Tehnologie si control in alimentatie publica": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Ingineria produselor alimentare (in limba engleza)": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Controlul si expertiza produselor alimentare (in limba engleza)": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Piscicultura si acvacultura": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Electronica aplicata": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Electronica de putere si actionari electrice": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Electromecanica": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Inginerie electrica si calculatoare": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Automatica si informatica aplicata": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Calculatoare": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Calculatoare", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return (medie_bac + notaExamen) / 2;
                }
            }
            case "Educatie fizica si sportiva": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Educatie fizica si sportiva", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return (medie_bac + notaExamen) / 2;
                }
            }
            case "Kinetoterapie si motricitate speciala": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Kinetoterapie si motricitate speciala", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return (medie_bac + notaExamen) / 2;
                }
            }
            case "Pedagogia invatamantului primar si prescolar": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Limba si literatura romana - engleza / Limba si literatura engleza - romana": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Limba si literatura romana - franceza / Limba si literatura franceza - romana": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Limba si literatura engleza - franceza / Limba si literatura franceza - engleza": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Limbi moderne aplicate (engleza-franceza)": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Jurnalism": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Matematica informatica": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Stiinta mediului": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Fizica medicala": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Chimie farmaceutica": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Istorie": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Relatii internationale si studii europene": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Filosofie": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Sociologie": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Resurse umane": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Arta sacra": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Arta sacra", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return (medie_bac + notaExamen) / 2;
                }
            }
            case "Teologie ortodoxa asistenta sociala": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Teologie ortodoxa asistenta sociala", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return (medie_bac + notaExamen) / 2;
                }
            }
            case "Utilaje tehnologice pentru constructii": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Ingineria si managementul resurselor tehnologice in constructii": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Masini si instalatii pentru agricultura si industrie alimentara": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Inginerie economica in domeniul mecanic": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Agricultura": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Marketing": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Finante si banci": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Management": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Economia comertului, turismului si serviciilor": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Administrarea afacerilor in alimentatia publica": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Informatica economica": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Contabilitate si informatica de gestiune": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Afaceri internationale": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Drept": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Administratie publica": {
                if (medie_liceu >= 5 && medie_bac >= 6) {
                    return (medie_liceu + medie_bac) / 2;
                }
            }
            case "Farmacie": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Farmacie", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return notaExamen;
                }
            }
            case "Medicina dentara": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Medicina dentara", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return notaExamen;
                }
            }
            case "Medicina": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Medicina", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return notaExamen;
                }
            }
            case "Asistenta medicala generala": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Asistenta medicala generala", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return notaExamen;
                }
            }
            case "Moase": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Moase", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return notaExamen;
                }
            }
            case "Tehnica dentara": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Tehnica dentara", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return notaExamen;
                }
            }
            case "Artele spectacolului (actorie)": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Artele spectacolului (actorie)", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return notaExamen;
                }
            }
            case "Interpretare muzicala - canto": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Interpretare muzicala - canto", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return notaExamen;
                }
            }
            case "Arte plastice (pictura)": {
                double notaExamen = OracleConnection.getNotaExamenCandidat("Arte plastice (pictura)", cod_c);
                if (medie_liceu >= 5 && medie_bac >= 6 && notaExamen >= 5) {
                    return notaExamen;
                }
            }
        }
        return 0;
    }

    private void getResults() {
        coduriCandidati = OracleConnection.getCodCandidat();

        medii_concurs.clear();
        for (int i = 0; i < coduriCandidati.size(); i++) {
            medie_liceu = OracleConnection.getMedieLiceuCandidat(coduriCandidati.get(i));
            medie_bac = OracleConnection.getMedieBacCandidat(coduriCandidati.get(i));

            cod_s = OracleConnection.getCodSpecializareOfOptiuneCandidat(coduriCandidati.get(i));
            cod_prima_optiune = cod_s.get(0);
            den_s = OracleConnection.getDenumireSpecializare(cod_prima_optiune);
            medie_concurs = getMedieConcurs(medie_liceu, medie_bac, den_s, coduriCandidati.get(i));

            medii_concurs.add(medie_concurs);
        }

        // Sorting 
        for (int i = 0; i < medii_concurs.size() - 1; i++) {
            for (int j = i + 1; j < medii_concurs.size(); j++) {
                if (medii_concurs.get(i) < medii_concurs.get(j)) {
                    Collections.swap(medii_concurs, i, j);
                    Collections.swap(coduriCandidati, i, j);
                }
            }
        }

        for (int i = 0; i < medii_concurs.size() - 1; i++) {
        }

        codSpecializari = OracleConnection.getCodSpecializare();

        locuriBuget.clear();
        locuriTaxa.clear();
        for (int i = 0; i < codSpecializari.size(); i++) {
            locuriBuget.add(OracleConnection.getLocuriBuget(codSpecializari.get(i)));
            locuriTaxa.add(OracleConnection.getLocuriTaxa(codSpecializari.get(i)));
        }

        String forma_finantare;
        int cod_prima_optiune_candidat;
        for (int i = 0; i < coduriCandidati.size(); i++) {
            if (medii_concurs.get(i) >= 5) {
                cod_s = OracleConnection.getCodSpecializareOfOptiuneCandidat(coduriCandidati.get(i));
                cod_prima_optiune = cod_s.get(0);
                den_s = OracleConnection.getDenumireSpecializare(cod_prima_optiune);

                cod_o = OracleConnection.getCodOptiuneCandidat(coduriCandidati.get(i));
                cod_prima_optiune_candidat = cod_o.get(0);
                forma_finantare = OracleConnection.getFormaFinantareOptiuneCandidat(cod_prima_optiune_candidat);

                if ("buget".equals(forma_finantare.toLowerCase())) {
                    if (locuriBuget.get(codSpecializari.indexOf(cod_prima_optiune)) > 0) {
                        locuriBuget.set(codSpecializari.indexOf(cod_prima_optiune), locuriBuget.get(codSpecializari.indexOf(cod_prima_optiune)) - 1);

                        model.addRow(new Object[]{
                            resultsTable.getRowCount() + 1,
                            OracleConnection.getNumeCandidat(coduriCandidati.get(i)) + " "
                            + OracleConnection.getInitialaTataCandidat(coduriCandidati.get(i)) + ". "
                            + OracleConnection.getPrenumeCandidat(coduriCandidati.get(i)),
                            String.format("%.2f", medii_concurs.get(i)),
                            den_s,
                            forma_finantare,
                            "ADMIS"
                        });
                    } else {
                        model.addRow(new Object[]{
                            resultsTable.getRowCount() + 1,
                            OracleConnection.getNumeCandidat(coduriCandidati.get(i)) + " "
                            + OracleConnection.getInitialaTataCandidat(coduriCandidati.get(i)) + ". "
                            + OracleConnection.getPrenumeCandidat(coduriCandidati.get(i)),
                            String.format("%.2f", medii_concurs.get(i)),
                            den_s,
                            forma_finantare,
                            "RESPINS"
                        });
                    }
                } else if ("taxa".equals(forma_finantare.toLowerCase())) {
                    if (locuriTaxa.get(codSpecializari.indexOf(cod_prima_optiune)) > 0) {
                        locuriTaxa.set(codSpecializari.indexOf(cod_prima_optiune), locuriTaxa.get(codSpecializari.indexOf(cod_prima_optiune)) - 1);

                        model.addRow(new Object[]{
                            resultsTable.getRowCount() + 1,
                            OracleConnection.getNumeCandidat(coduriCandidati.get(i)) + " "
                            + OracleConnection.getInitialaTataCandidat(coduriCandidati.get(i)) + ". "
                            + OracleConnection.getPrenumeCandidat(coduriCandidati.get(i)),
                            String.format("%.2f", medii_concurs.get(i)),
                            den_s,
                            forma_finantare,
                            "ADMIS"
                        });
                    } else {
                        model.addRow(new Object[]{
                            resultsTable.getRowCount() + 1,
                            OracleConnection.getNumeCandidat(coduriCandidati.get(i)) + " "
                            + OracleConnection.getInitialaTataCandidat(coduriCandidati.get(i)) + ". "
                            + OracleConnection.getPrenumeCandidat(coduriCandidati.get(i)),
                            String.format("%.2f", medii_concurs.get(i)),
                            den_s,
                            forma_finantare,
                            "RESPINS"
                        });
                    }
                }
            } else {
                model.addRow(new Object[]{
                    resultsTable.getRowCount() + 1,
                    OracleConnection.getNumeCandidat(coduriCandidati.get(i)) + " "
                    + OracleConnection.getInitialaTataCandidat(coduriCandidati.get(i)) + ". "
                    + OracleConnection.getPrenumeCandidat(coduriCandidati.get(i)),
                    String.format("%.2f", medii_concurs.get(i)),
                    "",
                    "",
                    "RESPINS"
                });
            }
        }

        resizeColumns(resultsTable);

        numeCol.clear();
        medieConcursCol.clear();
        specializareCol.clear();
        forma_de_finantareCol.clear();
        rezultatCol.clear();

        for (int i = 0; i < resultsTable.getRowCount(); i++) {
            numeCol.add((String) model.getValueAt(i, 1));
            medieConcursCol.add((String) model.getValueAt(i, 2));
            specializareCol.add((String) model.getValueAt(i, 3));
            forma_de_finantareCol.add((String) model.getValueAt(i, 4));
            rezultatCol.add((String) model.getValueAt(i, 5));

        }
    }

    private void resizeColumns(javax.swing.JTable table) {
        totalTableColumnSize = 0;

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
            totalTableColumnSize = totalTableColumnSize + width;
            col.setPreferredWidth(width + 25);
        }
    }

    private void exportToPDF(javax.swing.JTable table, String destination) {
        resizeColumns(table);

        System.out.println(totalTableColumnSize);
        try {
            Document document = new Document(new Rectangle(0, 0, totalTableColumnSize, table.getRowCount() * 50));
            PdfWriter.getInstance(document, new FileOutputStream(destination));
            document.open();

            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
            pdfTable.setWidthPercentage(100);

            // Adding the header            
            for (int i = 0; i < table.getColumnCount(); i++) {
                pdfTable.addCell(table.getColumnModel().getColumn(i).getHeaderValue().toString());
            }

            // Adding the rows
            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                    pdfTable.addCell(table.getModel().getValueAt(i, j).toString());
                }
            }

            document.add(pdfTable);
            document.close();
        } catch (DocumentException | FileNotFoundException | NullPointerException e) {
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton downloadButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel regulaAdmitereLabel;
    private javax.swing.JScrollPane resultsScrollPane;
    private javax.swing.JTable resultsTable;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JComboBox<String> specializariComboBox;
    // End of variables declaration//GEN-END:variables
}
