
package ikyonetim;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class SirketElemanGörüntüleme extends javax.swing.JFrame {
    BinaryTree tree=OkuYaz.bilgileriOku();
    LinkedList bilgiler=new LinkedList();
    BinaryTree agac=new BinaryTree();
    
    public SirketElemanGörüntüleme() {
        initComponents();
        DefaultTableModel model=(DefaultTableModel)table_genel.getModel();
        int max_derinlik=tree.maxDepth(tree.returnRoot())-1;
        preOrderGez(tree.returnRoot(), model);
        jl_derinlik.setText("Ağacın derinliği:"+max_derinlik);
        jb_bilgi.setBackground(Color.yellow);
        jb_filtrele.setBackground(Color.BLUE);
        jb_kaydet.setBackground(Color.green);
    }
    public void preOrderGez(Node root,DefaultTableModel model){
        if (root!=null) {
          bilgiler=root.getBilgi();
          int derinlik=tree.nodeDepth(tree.returnRoot(),bilgiler.bilgiEmailReturn(),0);
          String bilgi=bilgiler.bilgiWriteString()+derinlik;
          model.addRow(bilgi.split(","));
            preOrderGez(root.sol, model);
            preOrderGez(root.sag, model);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_genel = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_ara = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jc_lisans = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jc_dil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_deneyim = new javax.swing.JTextField();
        jc_deneyimsiz = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        tf_yas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jc_ehliyet = new javax.swing.JComboBox<>();
        jc_multidil = new javax.swing.JCheckBox();
        jb_filtrele = new javax.swing.JButton();
        jb_bilgi = new javax.swing.JButton();
        jb_kaydet = new javax.swing.JButton();
        jl_derinlik = new javax.swing.JLabel();
        Geri = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_genel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adı", "Soyadı", "Adres", "Telefon", "Eposta", "Doğum Tarihi", "Düğüm Derinliği"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_genel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(table_genel);
        if (table_genel.getColumnModel().getColumnCount() > 0) {
            table_genel.getColumnModel().getColumn(0).setResizable(false);
            table_genel.getColumnModel().getColumn(1).setResizable(false);
            table_genel.getColumnModel().getColumn(2).setResizable(false);
            table_genel.getColumnModel().getColumn(3).setResizable(false);
            table_genel.getColumnModel().getColumn(4).setResizable(false);
            table_genel.getColumnModel().getColumn(5).setResizable(false);
            table_genel.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ara"));

        jLabel1.setText("Ara:");

        tf_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_araActionPerformed(evt);
            }
        });
        tf_ara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_araKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(tf_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtreleme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jc_lisans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null", "lise", "lisans", "önlisans", "yüksek lisans", "doktora", " " }));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Lisans");

        jc_dil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null", "ingilizce", "almanca", "rusca", "fransızca" }));

        jLabel3.setText("Dil");

        jLabel4.setText("Deneyim(Yıl):");

        jc_deneyimsiz.setText("Deneyimsiz");
        jc_deneyimsiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_deneyimsizActionPerformed(evt);
            }
        });

        jLabel5.setText("Yaş Altı Listele:");

        jLabel6.setText("Ehliyet:");

        jc_ehliyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null", "m", "a1", "a2", "a", "b1", "b", "be", "c1", "c1e", "c", "d", "e", "f", "g" }));

        jc_multidil.setText("Birden Fazla Dil");
        jc_multidil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_multidilActionPerformed(evt);
            }
        });

        jb_filtrele.setText("Filtrele");
        jb_filtrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_filtreleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jc_dil, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jc_multidil, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_deneyim, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_yas)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jc_ehliyet, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jc_deneyimsiz)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jc_lisans, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jb_filtrele, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_lisans, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jc_dil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jc_multidil)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_deneyim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc_deneyimsiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_yas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc_ehliyet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jb_filtrele, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jb_bilgi.setText("Bilgi Göster");
        jb_bilgi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bilgiActionPerformed(evt);
            }
        });

        jb_kaydet.setText("Kaydet");
        jb_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_kaydetActionPerformed(evt);
            }
        });

        jl_derinlik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_derinlik.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Geri.setText("Geri");
        Geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeriActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tüm Kullanıcıların Bilgileri");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_derinlik, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1082, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Geri, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jb_bilgi)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(13, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jb_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(154, 154, 154))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Geri, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jl_derinlik, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_bilgi)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1298, 947));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_araKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_araKeyReleased
        DefaultTableModel model=(DefaultTableModel)table_genel.getModel();
        if (tf_ara.getText().equals("")) {
            model.setRowCount(0);
            preOrderGez(tree.returnRoot(), model);
           return;
        }
        else{
            agac=new BinaryTree();
                agac=ara(tree.returnRoot(), agac,tf_ara.getText());
                model.setRowCount(0);
            preOrderGez(agac.returnRoot(),model);
        }
    }//GEN-LAST:event_tf_araKeyReleased

    private void jc_deneyimsizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_deneyimsizActionPerformed
        tf_deneyim.setEditable(!jc_deneyimsiz.isSelected());
        tf_deneyim.setText("");
    }//GEN-LAST:event_jc_deneyimsizActionPerformed

    private void jb_filtreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_filtreleActionPerformed
        DefaultTableModel model=(DefaultTableModel)table_genel.getModel();
        try {
            if (!tf_deneyim.getText().equals("")) {
                Integer.parseInt(tf_deneyim.getText());
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lütfen deneyime sayısal bir değer girin");
            return;
        }
        try {
            if (!tf_yas.getText().equals("")) {
                 Integer.parseInt(tf_yas.getText());
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lütfen yaşa sayısal bir değer giriniz");
            return;
        }
        agac=tree;
        BinaryTree agac2=new BinaryTree();
        BinaryTree agac3=new BinaryTree();
        BinaryTree agac4=new BinaryTree();
        BinaryTree agac5=new BinaryTree();
        BinaryTree agac6=new BinaryTree();
        BinaryTree agac7=new BinaryTree();
        BinaryTree agac8=new BinaryTree();
        BinaryTree agac9=new BinaryTree();
        BinaryTree agac10=new BinaryTree();
        BinaryTree agac11=new BinaryTree();
        BinaryTree agac12=new BinaryTree();
        BinaryTree agac13=new BinaryTree();
        BinaryTree agac14=new BinaryTree();
        BinaryTree agac15=new BinaryTree();
        int hata=0;
        
        if (!jc_lisans.getSelectedItem().equals("null")) {   
            if (lisans(agac.returnRoot(), agac8, jc_lisans.getSelectedItem().toString()).returnRoot()!=null) {
                agac=lisans(agac.returnRoot(), agac15, jc_lisans.getSelectedItem().toString());
            }
            else{
                JOptionPane.showMessageDialog(this, "Verilen lisansta eleman bulunmamaktadır");
                hata++;
            }
            
        }
        if (jc_dil.getSelectedItem().equals("null")) {
                if (jc_multidil.isSelected()) {
                    if (multiDil(agac.returnRoot(), agac2).returnRoot()!=null) {
                        agac=multiDil(agac.returnRoot(), agac14);
                    }
                    else{
                JOptionPane.showMessageDialog(this, "Çoğul dil olan eleman bulunmamaktadır");
                hata++;
                }
                   
                }
            }
            else{
            if (dil(agac.returnRoot(), agac3, jc_dil.getSelectedItem().toString()).returnRoot()!=null) {
                agac=dil(agac.returnRoot(), agac13, jc_dil.getSelectedItem().toString());
            }
            else{
                JOptionPane.showMessageDialog(this, "Verilen dilde olan eleman bulunmamaktadır");
                hata++;
            }
            }
        if (tf_deneyim.getText().equals("")) {
            if (jc_deneyimsiz.isSelected()) {
                if (deneyimsiz(agac.returnRoot(), agac4).returnRoot()!=null) {
                    agac=deneyimsiz(agac.returnRoot(), agac12);
                }   
                else{
                JOptionPane.showMessageDialog(this, "Deneyimsiz eleman bulunmamaktadır");
                hata++;
                }
            }
        }
        else{
            if (minDeneyim(agac.returnRoot(), agac5,Double.parseDouble(tf_deneyim.getText())).returnRoot()!=null) {
                agac=minDeneyim(agac.returnRoot(), agac11,Double.parseDouble(tf_deneyim.getText()));
            }
            else{
                JOptionPane.showMessageDialog(this, "Girilen minimum deneyimde eleman bulunmamaktadır");
                hata++;
            }
            
        }
        if (!tf_yas.getText().equals("")) {
            if (yasAltiAra(agac.returnRoot(), agac6,Integer.parseInt(tf_yas.getText())).returnRoot()!=null) {
                agac=yasAltiAra(agac.returnRoot(), agac9,Integer.parseInt(tf_yas.getText()));
            } 
            else{
                JOptionPane.showMessageDialog(this, "Yaşa girilen değer bulunamamaktadır");
                hata++;
            }
        }
        if (!jc_ehliyet.getSelectedItem().equals("null")) {
            if (ehliyetListele(agac.returnRoot(), agac7, jc_ehliyet.getSelectedItem().toString()).returnRoot()!=null) {
                agac=ehliyetListele(agac.returnRoot(), agac10, jc_ehliyet.getSelectedItem().toString());
            }
            else{
                JOptionPane.showMessageDialog(this, "Verilen ehliyet bilgisi bulunmamaktadır");
                hata++;
            }
            
        }
        if (hata>0) {
            model.setRowCount(0);
            return;
        }
        model.getDataVector().clear();
        preOrderGez(agac.returnRoot(), model);
        
    }//GEN-LAST:event_jb_filtreleActionPerformed

    private void jc_multidilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_multidilActionPerformed
        jc_dil.setSelectedItem("null");
        jc_dil.setEnabled(!jc_multidil.isSelected());
    }//GEN-LAST:event_jc_multidilActionPerformed

    private void jb_bilgiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_bilgiActionPerformed
        DefaultTableModel model=(DefaultTableModel)table_genel.getModel();
        int secili_row=table_genel.getSelectedRow();
        if (secili_row==-1) {
            JOptionPane.showMessageDialog(this,"Lütfen bir satır seçiniz");
        }
            Node kullaniciNode=tree.returnNode(tree.returnRoot(), model.getValueAt(secili_row, 0).toString(),model.getValueAt(secili_row, 4).toString());
            System.out.println(kullaniciNode.getIsim());
            IsArayanBilgiGösterme a=new IsArayanBilgiGösterme(kullaniciNode);
            this.setVisible(false);
        a.setVisible(true);
       
       
        
    }//GEN-LAST:event_jb_bilgiActionPerformed

    private void jb_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_kaydetActionPerformed
        DefaultTableModel model=(DefaultTableModel)table_genel.getModel();
        FileWriter writer=null;
        try {
            writer=new FileWriter("filtre.txt");
            for (int i = 0; i < table_genel.getRowCount(); i++) {
                Node kullaniciNode=tree.returnNode(tree.returnRoot(),model.getValueAt(i,0).toString(), model.getValueAt(i,4).toString());
                String bilgi=kullaniciNode.getBilgi().bilgiWriteString();
                String ydil=kullaniciNode.getYabanci_dil().bilgiWriteString();
                String eh=kullaniciNode.getEhliyet_bilgisi().bilgiWriteString();
                NodeLink temp=kullaniciNode.getEgitim_durum().head;
                writer.write("Bilgi:\n"+bilgi+"\n");
                while (temp!=null) {
                    writer.write("Eğitim:\n");
                    LinkedList list=(LinkedList)temp.Data;
                    String egitim=list.bilgiWriteString();
                    writer.write(egitim+"\n");
                    temp=temp.next;
                }
                NodeLink temp2=kullaniciNode.getIs_deneyim().head; 
                
                while (temp2!=null) {
                writer.write("Is Bilgisi:\n");
                LinkedList list2=(LinkedList)temp2.Data;
                String is=list2.bilgiWriteString();
                writer.write(is+"\n");
                    temp2=temp2.next;
                }
                writer.write("Yabancı Diller:\n"+ydil+"\n");
                writer.write("Ehliyet:\n"+eh+"\n");
                writer.write("*********************\n");
            }
            
        } catch (IOException ex) {
            System.out.println("IO Exception hatası");
        }
        finally{
            if (writer!=null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Dosya kaydedilirken hata");
                }
            }
        }
    }//GEN-LAST:event_jb_kaydetActionPerformed

    private void GeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeriActionPerformed
    GirisEkran g=new GirisEkran();
    this.setVisible(false);
    g.setVisible(true);
    }//GEN-LAST:event_GeriActionPerformed

    private void tf_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_araActionPerformed
       
    }//GEN-LAST:event_tf_araActionPerformed
     public static BinaryTree ara(Node root,BinaryTree agac,String ara){
         
        if (root!=null) {
                if (root.getIsim().startsWith(ara)) {
                    String isim=root.getIsim();
                    LinkedList bilgi=root.getBilgi();
                    LinkedList is_deneyim=root.getIs_deneyim();
                    LinkedList egitim=root.getEgitim_durum();
                    LinkedList ydil=root.getYabanci_dil();
                    LinkedList ehliyet=root.getEhliyet_bilgisi();
                agac.add(isim,bilgi,is_deneyim,egitim,ydil,ehliyet);
            }
            ara(root.sol,agac, ara);
            ara(root.sag,agac,ara);
        }
        return agac;
    }
     public static BinaryTree lisans(Node root,BinaryTree agac,String lisans){
        if (root!=null) {
            for (String string :root.getEgitim_durum().egitimLisansReturn().split(",")) {
                if (string.toLowerCase().equals(lisans.toLowerCase())) {
                    String isim=root.getIsim();
                    LinkedList bilgi=root.getBilgi();
                    LinkedList is_deneyim=root.getIs_deneyim();
                    LinkedList egitim=root.getEgitim_durum();
                    LinkedList ydil=root.getYabanci_dil();
                    LinkedList ehliyet=root.getEhliyet_bilgisi();
                agac.add(isim,bilgi,is_deneyim,egitim,ydil,ehliyet);
                break;
            }
            }
            lisans(root.sol, agac, lisans);
            lisans(root.sag, agac, lisans);
        }
        return agac;
    }
     public static BinaryTree deneyimsiz(Node root,BinaryTree agac){
      if (root!=null) {
          if (root.getIs_deneyim().isDeneyimReturn()==0) {
               String isim=root.getIsim();
                    LinkedList bilgi=root.getBilgi();
                    LinkedList is_deneyim=root.getIs_deneyim();
                    LinkedList egitim=root.getEgitim_durum();
                    LinkedList ydil=root.getYabanci_dil();
                    LinkedList ehliyet=root.getEhliyet_bilgisi();
                agac.add(isim,bilgi,is_deneyim,egitim,ydil,ehliyet);
          }
          deneyimsiz(root.sol, agac);
          deneyimsiz(root.sag, agac);
      }
      return agac;
  }
     public static BinaryTree minDeneyim(Node root,BinaryTree agac,double mindeneyim){
      if (root!=null) {
          if (root.getIs_deneyim().isDeneyimReturn()>mindeneyim) {
                    String isim=root.getIsim();
                    LinkedList bilgi=root.getBilgi();
                    LinkedList is_deneyim=root.getIs_deneyim();
                    LinkedList egitim=root.getEgitim_durum();
                    LinkedList ydil=root.getYabanci_dil();
                    LinkedList ehliyet=root.getEhliyet_bilgisi();
                agac.add(isim,bilgi,is_deneyim,egitim,ydil,ehliyet);
          }
          minDeneyim(root.sol,agac,mindeneyim);
      minDeneyim(root.sag,agac,mindeneyim);
      }
      return agac;
  }
       public static BinaryTree yasAltiAra(Node root,BinaryTree agac,int yas){
      if (root!=null) {
          if (root.getBilgi().bilgiYasReturn()<yas) {
              String isim=root.getIsim();
                    LinkedList bilgi=root.getBilgi();
                    LinkedList is_deneyim=root.getIs_deneyim();
                    LinkedList egitim=root.getEgitim_durum();
                    LinkedList ydil=root.getYabanci_dil();
                    LinkedList ehliyet=root.getEhliyet_bilgisi();
                agac.add(isim,bilgi,is_deneyim,egitim,ydil,ehliyet);
          }
         yasAltiAra(root.sol, agac, yas);
            yasAltiAra(root.sag, agac, yas);
      }
      return agac;
  }
       public static BinaryTree ehliyetListele(Node root,BinaryTree agac,String ehliyet_bilgisi){
         if (root!=null) {
             for(String string:root.getEhliyet_bilgisi().bilgiWriteString().split(",")) {
                 if (string.equals(ehliyet_bilgisi)) {
                     String isim=root.getIsim();
                    LinkedList bilgi=root.getBilgi();
                    LinkedList is_deneyim=root.getIs_deneyim();
                    LinkedList egitim=root.getEgitim_durum();
                    LinkedList ydil=root.getYabanci_dil();
                    LinkedList ehliyet=root.getEhliyet_bilgisi();
                agac.add(isim,bilgi,is_deneyim,egitim,ydil,ehliyet);
                 }
             }
             ehliyetListele(root.sol, agac, ehliyet_bilgisi);
             ehliyetListele(root.sag, agac, ehliyet_bilgisi);
         }
         return agac;
     }
        public static BinaryTree multiDil(Node root,BinaryTree agac){
        if (root!=null) {
                if (root.getYabanci_dil().bilgiWriteString().split(",").length>1) {
                                String isim=root.getIsim();
                                LinkedList bilgi=root.getBilgi();
                                LinkedList is_deneyim=root.getIs_deneyim();
                                LinkedList egitim=root.getEgitim_durum();
                                LinkedList ydil=root.getYabanci_dil();
                                LinkedList ehliyet=root.getEhliyet_bilgisi();
                                agac.add(isim,bilgi,is_deneyim,egitim,ydil,ehliyet);
                    }  
            multiDil(root.sol, agac);
            multiDil(root.sag, agac);
        }
        return agac;
    }
         public static BinaryTree dil(Node root,BinaryTree agac,String dil){
        if (root!=null) {
            for (String string :root.getYabanci_dil().bilgiWriteString().split(",")) {
                if (string.toLowerCase().equals(dil.toLowerCase())) {
                    String isim=root.getIsim();
                    LinkedList bilgi=root.getBilgi();
                    LinkedList is_deneyim=root.getIs_deneyim();
                    LinkedList egitim=root.getEgitim_durum();
                    LinkedList ydil=root.getYabanci_dil();
                    LinkedList ehliyet=root.getEhliyet_bilgisi();
                agac.add(isim,bilgi,is_deneyim,egitim,ydil,ehliyet);
            }
            }
            dil(root.sol, agac, dil);
            dil(root.sag, agac, dil);
        }
        return agac;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SirketElemanGörüntüleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SirketElemanGörüntüleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SirketElemanGörüntüleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SirketElemanGörüntüleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SirketElemanGörüntüleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Geri;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_bilgi;
    private javax.swing.JButton jb_filtrele;
    private javax.swing.JButton jb_kaydet;
    private javax.swing.JCheckBox jc_deneyimsiz;
    private javax.swing.JComboBox<String> jc_dil;
    private javax.swing.JComboBox<String> jc_ehliyet;
    private javax.swing.JComboBox<String> jc_lisans;
    private javax.swing.JCheckBox jc_multidil;
    private javax.swing.JLabel jl_derinlik;
    private javax.swing.JTable table_genel;
    private javax.swing.JTextField tf_ara;
    private javax.swing.JTextField tf_deneyim;
    private javax.swing.JTextField tf_yas;
    // End of variables declaration//GEN-END:variables
}
