
package ikyonetim;

import javax.swing.table.*;

public class IsArayanBilgiGösterme extends javax.swing.JFrame {
   private Node kullaniciNode;
    BinaryTree tree=OkuYaz.bilgileriOku();
    public IsArayanBilgiGösterme() {
        initComponents();
    }
    public IsArayanBilgiGösterme(Node kullaniciNode){
        initComponents();
        this.kullaniciNode=kullaniciNode;
        System.out.println(this.kullaniciNode.getIsim());
        DefaultTableModel eh_model=(DefaultTableModel)table_ehliyet.getModel();
        DefaultTableModel yabanci_model=(DefaultTableModel) table_ydil.getModel();
        DefaultTableModel bil_model=(DefaultTableModel) table_bilgi.getModel();
        DefaultTableModel isler_model=(DefaultTableModel) table_is.getModel();
        DefaultTableModel egitimler_model=(DefaultTableModel) table_egitim.getModel();
        bil_model.addRow(kullaniciNode.getBilgi().bilgiWriteString().split(","));
        //Kullanıcının yabancı dil bilgilerini listeleme
        for (String string : kullaniciNode.getYabanci_dil().bilgiWriteString().split(",")) {
            yabanci_model.addRow(string.split(" "));
        }
        //Kullanıcının ehliyet bilgilerini listeleme
        for (String string : kullaniciNode.getEhliyet_bilgisi().bilgiWriteString().split(",")) {
            eh_model.addRow(string.split(" "));
        }
        NodeLink temp=kullaniciNode.getIs_deneyim().head;
        NodeLink temp2=kullaniciNode.getEgitim_durum().head;
        //Kulllanıcının iş deneyimini listeleme
        while (temp!=null) {            
            LinkedList list=(LinkedList)temp.Data;
            isler_model.addRow(list.bilgiWriteString().split(","));
            temp=temp.next;
        }
        //Kullanıcının egitimlerini listeleme
        while (temp2!=null) {            
            LinkedList liste=(LinkedList)temp2.Data;
            egitimler_model.addRow(liste.bilgiWriteString().split(","));
            temp2=temp2.next;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        table_bilgi = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_is = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_egitim = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_ehliyet = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_ydil = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_bilgi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ad", "Soyad", "Adres", "Telefon", "Eposta", "Doğum Tarih"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_bilgi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(table_bilgi);
        if (table_bilgi.getColumnModel().getColumnCount() > 0) {
            table_bilgi.getColumnModel().getColumn(0).setResizable(false);
            table_bilgi.getColumnModel().getColumn(1).setResizable(false);
            table_bilgi.getColumnModel().getColumn(2).setResizable(false);
            table_bilgi.getColumnModel().getColumn(3).setResizable(false);
            table_bilgi.getColumnModel().getColumn(4).setResizable(false);
            table_bilgi.getColumnModel().getColumn(5).setResizable(false);
        }

        table_is.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İşyeri Adı", "İşyeri Adresi", "Pozisyon", "Süresi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_is.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(table_is);
        if (table_is.getColumnModel().getColumnCount() > 0) {
            table_is.getColumnModel().getColumn(0).setResizable(false);
            table_is.getColumnModel().getColumn(1).setResizable(false);
            table_is.getColumnModel().getColumn(2).setResizable(false);
            table_is.getColumnModel().getColumn(3).setResizable(false);
        }

        table_egitim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Okul Adı", "Bölümü", "Türü", "Başlangıç Tarihi", "Bitiş Tarihi", "Ortalaması"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_egitim.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(table_egitim);
        if (table_egitim.getColumnModel().getColumnCount() > 0) {
            table_egitim.getColumnModel().getColumn(0).setResizable(false);
            table_egitim.getColumnModel().getColumn(2).setResizable(false);
            table_egitim.getColumnModel().getColumn(3).setResizable(false);
            table_egitim.getColumnModel().getColumn(4).setResizable(false);
            table_egitim.getColumnModel().getColumn(5).setResizable(false);
        }

        table_ehliyet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ehliyet"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_ehliyet.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(table_ehliyet);
        if (table_ehliyet.getColumnModel().getColumnCount() > 0) {
            table_ehliyet.getColumnModel().getColumn(0).setResizable(false);
        }

        table_ydil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Yabancı Dil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_ydil.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(table_ydil);
        if (table_ydil.getColumnModel().getColumnCount() > 0) {
            table_ydil.getColumnModel().getColumn(0).setResizable(false);
        }

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane6))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1298, 847));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        SirketElemanGörüntüleme g=new SirketElemanGörüntüleme();
        g.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(IsArayanBilgiGösterme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IsArayanBilgiGösterme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IsArayanBilgiGösterme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IsArayanBilgiGösterme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IsArayanBilgiGösterme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable table_bilgi;
    private javax.swing.JTable table_egitim;
    private javax.swing.JTable table_ehliyet;
    private javax.swing.JTable table_is;
    private javax.swing.JTable table_ydil;
    // End of variables declaration//GEN-END:variables
}
