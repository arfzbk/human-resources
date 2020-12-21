
package ikyonetim;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KullaniciEkran extends javax.swing.JFrame {
    private Node kullaniciNode;
    BinaryTree tree=OkuYaz.bilgileriOku();
    String ehliyet_liste="m,a1,a2,a,b1,b,be,c1,c1e,c,ce,d1,d1e,d,de,f,g";
    /**
     * Creates new form KullaniciEkran
     */
    public KullaniciEkran() {
        initComponents();
        isDuzenleVisibleEditable(false);
        egDuzenleVisibleEditable(false);
        dilDuzenleVisibleEditable(false);
        ehDuzenleVisibleEditable(false);
        
    }
   
    public KullaniciEkran(Node kullaniciNode){
        initComponents();
        isDuzenleVisibleEditable(false);
        egDuzenleVisibleEditable(false);
        dilDuzenleVisibleEditable(false);
        ehDuzenleVisibleEditable(false);
        this.kullaniciNode=kullaniciNode;
        jl_kullanici.setText("Kullanıcı:"+kullaniciNode.getIsim().toUpperCase()+" "+kullaniciNode.getBilgi().bilgiSoyadReturn().toUpperCase());
        DefaultTableModel ehliyet_model=(DefaultTableModel) table_ehliyet.getModel();
        DefaultTableModel ydil_model=(DefaultTableModel) table_ydil.getModel();
        DefaultTableModel bilgi_model=(DefaultTableModel) table_bilgiler.getModel();
        DefaultTableModel is_model=(DefaultTableModel) table_is.getModel();
        DefaultTableModel egitim_model=(DefaultTableModel) table_egitim.getModel();
        bilgi_model.addRow(kullaniciNode.getBilgi().bilgiWriteString().split(","));
        //Kullanıcının yabancı dil bilgilerini listeleme
        for (String string : kullaniciNode.getYabanci_dil().bilgiWriteString().split(",")) {
            ydil_model.addRow(string.split(" "));
        }
        //Kullanıcının ehliyet bilgilerini listeleme
        for (String string : kullaniciNode.getEhliyet_bilgisi().bilgiWriteString().split(",")) {
            ehliyet_model.addRow(string.split(" "));
        }
        NodeLink temp=kullaniciNode.getIs_deneyim().head;
        NodeLink temp2=kullaniciNode.getEgitim_durum().head;
        //Kulllanıcının iş deneyimini listeleme
        while (temp!=null) {            
            LinkedList list=(LinkedList)temp.Data;
            is_model.addRow(list.bilgiWriteString().split(","));
            temp=temp.next;
        }
        //Kullanıcının egitimlerini listeleme
        while (temp2!=null) {            
            LinkedList liste=(LinkedList)temp2.Data;
            egitim_model.addRow(liste.bilgiWriteString().split(","));
            temp2=temp2.next;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_kullanici = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_bilgiler = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_egitim = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_is = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_ehliyet = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_ydil = new javax.swing.JTable();
        jb_sistem_kaydet = new javax.swing.JButton();
        jb_is_ekle = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jl_is_ad = new javax.swing.JLabel();
        tf_is_adres = new javax.swing.JTextField();
        jl_is_adres = new javax.swing.JLabel();
        tf_is_ad = new javax.swing.JTextField();
        jl_is_poz = new javax.swing.JLabel();
        tf_is_pozisyon = new javax.swing.JTextField();
        jl_is_sure = new javax.swing.JLabel();
        tf_is_sure = new javax.swing.JTextField();
        jb_is_kaydet = new javax.swing.JButton();
        jl_eg_5 = new javax.swing.JLabel();
        jl_eg_1 = new javax.swing.JLabel();
        jl_eg_6 = new javax.swing.JLabel();
        jl_eg_3 = new javax.swing.JLabel();
        jl_eg_2 = new javax.swing.JLabel();
        jl_eg_4 = new javax.swing.JLabel();
        tf_eg_tur = new javax.swing.JTextField();
        tf_eg_bitis = new javax.swing.JTextField();
        tf_eg_bolum = new javax.swing.JTextField();
        tf_eg_ort = new javax.swing.JTextField();
        tf_eg_baslangic = new javax.swing.JTextField();
        tf_eg_ad = new javax.swing.JTextField();
        jb_eg_kaydet = new javax.swing.JButton();
        jb_eg_ekle = new javax.swing.JButton();
        jb_eg_sil = new javax.swing.JButton();
        jb_dil_ekle = new javax.swing.JButton();
        jb_dil_sil = new javax.swing.JButton();
        jl_eh = new javax.swing.JLabel();
        tf_dil = new javax.swing.JTextField();
        jb_dil_kaydet = new javax.swing.JButton();
        jl_dil = new javax.swing.JLabel();
        tf_eh = new javax.swing.JTextField();
        jb_eh_kaydet = new javax.swing.JButton();
        jb_eh_ekle = new javax.swing.JButton();
        jb_eh_sil = new javax.swing.JButton();
        jb_sistem_cıkar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jc_eg_bitti = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 900));
        setPreferredSize(new java.awt.Dimension(1280, 900));

        jl_kullanici.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        table_bilgiler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Isim", "Soyisim", "Adres", "Telefon", "E posta", "Doğum Tarihi"
            }
        ));
        jScrollPane1.setViewportView(table_bilgiler);
        if (table_bilgiler.getColumnModel().getColumnCount() > 0) {
            table_bilgiler.getColumnModel().getColumn(0).setResizable(false);
            table_bilgiler.getColumnModel().getColumn(1).setResizable(false);
            table_bilgiler.getColumnModel().getColumn(2).setResizable(false);
            table_bilgiler.getColumnModel().getColumn(3).setResizable(false);
            table_bilgiler.getColumnModel().getColumn(4).setResizable(false);
            table_bilgiler.getColumnModel().getColumn(5).setResizable(false);
        }

        table_egitim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Okul Adı", "Bölümü", "Türü", "Başlangıç Tarihi", "Bitiş Tarihi", "Not Ortalaması"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_egitim.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(table_egitim);
        if (table_egitim.getColumnModel().getColumnCount() > 0) {
            table_egitim.getColumnModel().getColumn(0).setResizable(false);
            table_egitim.getColumnModel().getColumn(1).setResizable(false);
            table_egitim.getColumnModel().getColumn(2).setResizable(false);
            table_egitim.getColumnModel().getColumn(3).setResizable(false);
            table_egitim.getColumnModel().getColumn(4).setResizable(false);
            table_egitim.getColumnModel().getColumn(5).setResizable(false);
        }

        table_is.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İşyeri Adı", "İşyeri Adresi", "Pozisyon", "Çalıştığı süre(Yıl)"
            }
        ));
        table_is.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(table_is);
        if (table_is.getColumnModel().getColumnCount() > 0) {
            table_is.getColumnModel().getColumn(0).setResizable(false);
            table_is.getColumnModel().getColumn(1).setResizable(false);
            table_is.getColumnModel().getColumn(2).setResizable(false);
            table_is.getColumnModel().getColumn(3).setResizable(false);
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
        jScrollPane4.setViewportView(table_ehliyet);
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
        jScrollPane5.setViewportView(table_ydil);
        if (table_ydil.getColumnModel().getColumnCount() > 0) {
            table_ydil.getColumnModel().getColumn(0).setResizable(false);
        }

        jb_sistem_kaydet.setText("Kaydet");
        jb_sistem_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_sistem_kaydetActionPerformed(evt);
            }
        });

        jb_is_ekle.setText("İş Ekle");
        jb_is_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_is_ekleActionPerformed(evt);
            }
        });

        jButton2.setText("İş Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jl_is_ad.setText("İşyeri Adı:");

        tf_is_adres.setEditable(false);
        tf_is_adres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_is_adresActionPerformed(evt);
            }
        });

        jl_is_adres.setText("İşyeri Adresi:");

        tf_is_ad.setEditable(false);
        tf_is_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_is_adActionPerformed(evt);
            }
        });

        jl_is_poz.setText("Pozisyon:");

        tf_is_pozisyon.setEditable(false);
        tf_is_pozisyon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_is_pozisyonActionPerformed(evt);
            }
        });

        jl_is_sure.setText("Çalışılan Süre:");

        tf_is_sure.setEditable(false);
        tf_is_sure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_is_sureActionPerformed(evt);
            }
        });

        jb_is_kaydet.setText("Kaydet");
        jb_is_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_is_kaydetActionPerformed(evt);
            }
        });

        jl_eg_5.setText("Bitiş Tarihi:");

        jl_eg_1.setText("Okul Adı:");

        jl_eg_6.setText("Not Ortalaması:");

        jl_eg_3.setText("Bölümü:");

        jl_eg_2.setText("Okul Türü:");

        jl_eg_4.setText("Başlangıç Tarihi:");

        tf_eg_tur.setEditable(false);
        tf_eg_tur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_eg_turActionPerformed(evt);
            }
        });

        tf_eg_bitis.setEditable(false);
        tf_eg_bitis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_eg_bitisActionPerformed(evt);
            }
        });

        tf_eg_bolum.setEditable(false);
        tf_eg_bolum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_eg_bolumActionPerformed(evt);
            }
        });

        tf_eg_ort.setEditable(false);
        tf_eg_ort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_eg_ortActionPerformed(evt);
            }
        });

        tf_eg_baslangic.setEditable(false);
        tf_eg_baslangic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_eg_baslangicActionPerformed(evt);
            }
        });

        tf_eg_ad.setEditable(false);
        tf_eg_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_eg_adActionPerformed(evt);
            }
        });

        jb_eg_kaydet.setText("Kaydet");
        jb_eg_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eg_kaydetActionPerformed(evt);
            }
        });

        jb_eg_ekle.setText("Eğitim Ekle");
        jb_eg_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eg_ekleActionPerformed(evt);
            }
        });

        jb_eg_sil.setText("Eğitim Sil");
        jb_eg_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eg_silActionPerformed(evt);
            }
        });

        jb_dil_ekle.setText("Dil Ekle");
        jb_dil_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dil_ekleActionPerformed(evt);
            }
        });

        jb_dil_sil.setText("Dil Sil");
        jb_dil_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dil_silActionPerformed(evt);
            }
        });

        jl_eh.setText("Ehliyet:");

        tf_dil.setEditable(false);
        tf_dil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dilActionPerformed(evt);
            }
        });

        jb_dil_kaydet.setText("Kaydet");
        jb_dil_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dil_kaydetActionPerformed(evt);
            }
        });

        jl_dil.setText("Dil:");

        tf_eh.setEditable(false);
        tf_eh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ehActionPerformed(evt);
            }
        });

        jb_eh_kaydet.setText("Kaydet");
        jb_eh_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eh_kaydetActionPerformed(evt);
            }
        });

        jb_eh_ekle.setText("Ehliyet Ekle");
        jb_eh_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eh_ekleActionPerformed(evt);
            }
        });

        jb_eh_sil.setText("Ehliyet Sil");
        jb_eh_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eh_silActionPerformed(evt);
            }
        });

        jb_sistem_cıkar.setText("Kişiyi Sistemden Çıkar");
        jb_sistem_cıkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_sistem_cıkarActionPerformed(evt);
            }
        });

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jc_eg_bitti.setText("Okul bitmedi");
        jc_eg_bitti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_eg_bittiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jb_is_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jl_eg_5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_eg_bitis, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jl_eg_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_eg_ort, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jl_eg_1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_eg_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jl_eg_2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_eg_tur, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jl_eg_3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_eg_bolum, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jl_eg_4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_eg_baslangic, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jc_eg_bitti, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jb_eg_kaydet))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb_eg_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb_eg_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jl_dil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_dil, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jb_dil_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jb_dil_ekle)
                                        .addGap(38, 38, 38)
                                        .addComponent(jb_dil_sil))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb_eh_ekle)
                                        .addGap(52, 52, 52)
                                        .addComponent(jb_eh_sil))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_eh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_eh, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jb_eh_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(309, 309, 309)
                                .addComponent(jb_sistem_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jl_is_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_is_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jl_is_adres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_is_adres, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_is_poz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_is_pozisyon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_is_sure)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_is_sure, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jb_is_kaydet)))
                .addGap(37, 60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318)
                .addComponent(jl_kullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_sistem_cıkar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_kullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jb_sistem_cıkar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_is_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_is_adres, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_is_adres, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_is_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_is_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_is_poz, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_is_pozisyon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_is_sure, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_is_sure, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_is_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_eg_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_eg_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_eg_3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_eg_2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_eg_1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_eg_tur, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_eg_bolum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_eg_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_eg_4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_eg_baslangic, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl_eg_5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_eg_bitis, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_eg_ort, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_eg_6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jc_eg_bitti)
                        .addComponent(jb_eg_kaydet)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_eh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_dil, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_dil_kaydet)
                        .addComponent(jl_dil, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_eh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_eh_kaydet)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_dil_ekle)
                    .addComponent(jb_dil_sil)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_eh_sil)
                        .addComponent(jb_eh_ekle)
                        .addComponent(jb_sistem_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1298, 900));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void isDuzenleVisibleEditable(Boolean ifade){
        jb_is_kaydet.setVisible(ifade);
        tf_is_ad.setVisible(ifade);
        tf_is_ad.setEditable(ifade);
        tf_is_adres.setVisible(ifade);
        tf_is_adres.setEditable(ifade);
        tf_is_pozisyon.setVisible(ifade);
        tf_is_pozisyon.setEditable(ifade);
        tf_is_sure.setVisible(ifade);
        tf_is_sure.setEditable(ifade);
        jl_is_ad.setVisible(ifade);
        jl_is_adres.setVisible(ifade);
        jl_is_poz.setVisible(ifade);
        jl_is_sure.setVisible(ifade);
    }
    public void egDuzenleVisibleEditable(Boolean ifade){
        jl_eg_1.setVisible(ifade);
        jl_eg_2.setVisible(ifade);
        jl_eg_3.setVisible(ifade);
        jl_eg_4.setVisible(ifade);
        jl_eg_5.setVisible(ifade);
        jl_eg_6.setVisible(ifade);
        tf_eg_ad.setVisible(ifade);
        tf_eg_ad.setEditable(ifade);
        tf_eg_baslangic.setVisible(ifade);
        tf_eg_baslangic.setEditable(ifade);
        tf_eg_bitis.setVisible(ifade);
        tf_eg_bitis.setEditable(ifade);
        tf_eg_ort.setVisible(ifade);
        tf_eg_ort.setEditable(ifade);
        tf_eg_tur.setVisible(ifade);
        tf_eg_tur.setEditable(ifade);
        tf_eg_bolum.setVisible(ifade);
        tf_eg_bolum.setEditable(ifade);
        jb_eg_kaydet.setVisible(ifade);
        jc_eg_bitti.setVisible(ifade);
        
    }
    public void ehDuzenleVisibleEditable(Boolean ifade){
        jb_eh_kaydet.setVisible(ifade);
        jl_eh.setVisible(ifade);
        tf_eh.setVisible(ifade);
        tf_eh.setEditable(ifade);
    }
    public void dilDuzenleVisibleEditable(Boolean ifade){
        jb_dil_kaydet.setVisible(ifade);
        jl_dil.setVisible(ifade);
        tf_dil.setVisible(ifade);
        tf_dil.setEditable(ifade);
    }
    public static boolean validateEmailAddress(String emailAddress) {

       Pattern regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        Matcher regMatcher   = regexPattern.matcher(emailAddress);
        if(regMatcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
    private void jb_sistem_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_sistem_kaydetActionPerformed
       LinkedList is=new LinkedList();
       LinkedList bilgi=new LinkedList();
       LinkedList egitim=new LinkedList();
       LinkedList dil=new LinkedList();
       LinkedList ehliyet=new LinkedList();
        String isim="";
        String soyisim="";
        String adres="";
        String tel="";
        String eposta="";
        String dtarih="";
        String is_ad="";
        String is_adres="";
        String is_poz="";
        String is_sure="";
        String eg_ad="";
        String eg_turu="";
        String eg_bolum="";
        String eg_bas="";
        String eg_bit="";
        String eg_ort="";
        String ehliyetString="";
        String ydil="";
        DefaultTableModel bilgimodel=(DefaultTableModel) table_bilgiler.getModel();
        DefaultTableModel isModel=(DefaultTableModel) table_is.getModel();
        DefaultTableModel egitimModel=(DefaultTableModel)table_egitim.getModel();
        DefaultTableModel ydilModel=(DefaultTableModel)table_ydil.getModel();
        DefaultTableModel ehliyetModel=(DefaultTableModel)table_ehliyet.getModel();
        //Bilgi düzenleme
          isim=(bilgimodel.getValueAt(0, 0).toString().toLowerCase());
          soyisim=(bilgimodel.getValueAt(0,1).toString().toLowerCase());
          adres=(bilgimodel.getValueAt(0,2).toString().toLowerCase());
          tel=(bilgimodel.getValueAt(0,3).toString().toLowerCase());
          eposta=(bilgimodel.getValueAt(0,4).toString().toLowerCase());
          if (!validateEmailAddress(eposta)) {
            JOptionPane.showMessageDialog(this,"Lütfen geçerli bir email giriniz");
            return;
        }
          dtarih=(bilgimodel.getValueAt(0, 5).toString().toLowerCase());
          try {
            Integer.parseInt(dtarih);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lütfen yılı sadece yıl olarak giriniz");
            return;
        }
          if (isim.equals("")||soyisim.equals("")||adres.equals("")||tel.equals("")||eposta.equals("")||dtarih.equals("")) {
              JOptionPane.showMessageDialog(this, "Bilgilerde boş satır bırakmayınız");
              return;
          }
          bilgi.addLast(isim);
          bilgi.addLast(soyisim);
          bilgi.addLast(adres);
          bilgi.addLast(tel);
          bilgi.addLast(eposta);
          bilgi.addLast(dtarih);        
      //İş düzenleme
      for (int count = 0; count < isModel.getRowCount(); count++){
          is_ad=isModel.getValueAt(count,0).toString().toLowerCase();
          is_adres=isModel.getValueAt(count,1).toString().toLowerCase();
          is_poz=isModel.getValueAt(count,2).toString().toLowerCase();
          is_sure=isModel.getValueAt(count,3).toString().toLowerCase();
          try {
              Double.parseDouble(is_sure);
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, "Lütfen süreye sayısal bir değer girin");
              bilgi.clear();
              return;
          }
          if (is_ad.equals("")||is_adres.equals("")||is_poz.equals("")||is_sure.trim().equals("")) {
              JOptionPane.showMessageDialog(this,"İş Bilgilerini Tam doldurunuz veya Silme işlemi yapınız");
              bilgi.clear();
              return;
          }
          LinkedList is1=new LinkedList();
          is1.addLast(is_ad);
          is1.addLast(is_adres);
          is1.addLast(is_poz);
          is1.addLast(is_sure);
          is.addLast(is1.copy());
          //Eğitim düzenleme
      }
       for (int count = 0; count < egitimModel.getRowCount(); count++){
          eg_ad=egitimModel.getValueAt(count,0).toString().toLowerCase();
          eg_bolum=egitimModel.getValueAt(count,1).toString().toLowerCase();
          eg_turu=egitimModel.getValueAt(count,2).toString().toLowerCase();
          eg_bas=egitimModel.getValueAt(count,3).toString().toLowerCase();
          eg_bit=egitimModel.getValueAt(count,4).toString().toLowerCase();
          eg_ort=egitimModel.getValueAt(count,5).toString().toLowerCase();
           if (eg_turu.equals("")||eg_bolum.equals("")||eg_bas.equals("")||eg_bit.equals("")||eg_ort.equals("")) {
               JOptionPane.showMessageDialog(this, "Eğitim bilgilerin tam doldurunuz veya silme işlemi yapınız");
               bilgi.clear();
               is.clear();
               return;
           }
           LinkedList eg1=new LinkedList();
           eg1.addLast(eg_ad);
           eg1.addLast(eg_bolum);
           eg1.addLast(eg_turu);
           eg1.addLast(eg_bas);
           eg1.addLast(eg_bit);
           eg1.addLast(eg_ort);
           egitim.addLast(eg1.copy());
       }
       //Dil düzenleme
        for (int i = 0; i < ydilModel.getRowCount(); i++) {
            try{
            ydil=ydilModel.getValueAt(i,0).toString().toLowerCase();
            if (ydil.equals("")) {
                JOptionPane.showMessageDialog(this,"Lütfen dil bilgilerini tam giriniz boş olan satır varsa siliniz");
                bilgi.clear();
                is.clear();
                egitim.clear();
                return;
            }
            dil.addLast(ydil);
            }
            catch(Exception ex){
                System.out.println("Hata");
            }
        }
        //Ehliye düzenleme
        for (int i = 0; i < ehliyetModel.getRowCount(); i++) {
            ehliyetString=ehliyetModel.getValueAt(i,0).toString().toLowerCase();
            if (!ehliyet_liste.contains(ehliyetString)) {
                JOptionPane.showMessageDialog(this,"Lütfen listede bulunan ehliyet türlerinden yazınız\n"+ehliyet_liste);
                bilgi.clear();
                is.clear();
                egitim.clear();
                dil.clear();
                return;
            }
            if (ehliyetString.equals("")) {
                JOptionPane.showMessageDialog(this,"Lütfen ehliyet bilgilerini tam giriniz boş olan satır varsa siliniz");
                bilgi.clear();
                is.clear();
                egitim.clear();
                dil.clear();
                return;
            }
            ehliyet.addLast(ehliyetString);
        }
       
        System.out.println("------------------------------");
        Node kullanici=tree.returnNode(tree.returnRoot(), kullaniciNode.getIsim(),kullaniciNode.getBilgi().bilgiEmailReturn());
        kullanici.setBilgi(bilgi);
        kullanici.setEgitim_durum(egitim);
        kullanici.setEhliyet_bilgisi(ehliyet);
        kullanici.setIs_deneyim(is);
        kullanici.setYabanci_dil(dil);
        
        kullanici.setIsim(isim);
        tree.preOrder(tree.returnRoot());
        OkuYaz.bilgileriKaydet(tree);
        JOptionPane.showMessageDialog(this,"Kullanıcı başarıyla düzenlendi");
    }//GEN-LAST:event_jb_sistem_kaydetActionPerformed

    private void tf_is_adresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_is_adresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_is_adresActionPerformed

    private void tf_is_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_is_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_is_adActionPerformed

    private void tf_is_pozisyonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_is_pozisyonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_is_pozisyonActionPerformed

    private void tf_is_sureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_is_sureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_is_sureActionPerformed

    private void jb_is_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_is_ekleActionPerformed
        isDuzenleVisibleEditable(true);
        tf_is_ad.setText("");
        tf_is_adres.setText("");
        tf_is_pozisyon.setText("");
        tf_is_sure.setText("");
    }//GEN-LAST:event_jb_is_ekleActionPerformed

    private void jb_is_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_is_kaydetActionPerformed
        DefaultTableModel model=(DefaultTableModel)table_is.getModel();
        if (tf_is_ad.getText().equals("")||tf_is_adres.getText().equals("")||tf_is_pozisyon.getText().equals("")||tf_is_sure.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Lütfen tüm bilgileri eksiksiz doldurunuz");
            return;
        }
        try {
            Double.parseDouble(tf_is_sure.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lütfen süreye sayısal bir değer giriniz");
            return;
        }
        String is="";
        is=tf_is_ad.getText().toLowerCase()+","+tf_is_adres.getText().toLowerCase()+","+tf_is_pozisyon.getText().toLowerCase()+","+tf_is_sure.getText().toLowerCase();
        model.addRow(is.split(","));
        isDuzenleVisibleEditable(false);
    }//GEN-LAST:event_jb_is_kaydetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model=(DefaultTableModel)table_is.getModel();
        int secili_row=table_is.getSelectedRow();
        if (secili_row==-1) {
            JOptionPane.showMessageDialog(this, "Lütfen bir satır seçiniz");
        }
        else{
            model.removeRow(secili_row);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_eg_turActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_eg_turActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_eg_turActionPerformed

    private void tf_eg_bitisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_eg_bitisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_eg_bitisActionPerformed

    private void tf_eg_bolumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_eg_bolumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_eg_bolumActionPerformed

    private void tf_eg_ortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_eg_ortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_eg_ortActionPerformed

    private void tf_eg_baslangicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_eg_baslangicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_eg_baslangicActionPerformed

    private void tf_eg_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_eg_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_eg_adActionPerformed

    private void jb_eg_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eg_ekleActionPerformed
        egDuzenleVisibleEditable(true);
    }//GEN-LAST:event_jb_eg_ekleActionPerformed

    private void jb_eg_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eg_silActionPerformed
        DefaultTableModel model=(DefaultTableModel) table_egitim.getModel();
        int secili_row=table_egitim.getSelectedRow();
        if (secili_row==-1){
            JOptionPane.showMessageDialog(this,"Lütfen bir satır seçiniz");
            return;
        }
        else{
            model.removeRow(secili_row);
        }
    }//GEN-LAST:event_jb_eg_silActionPerformed

    private void jb_eg_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eg_kaydetActionPerformed
        DefaultTableModel model=(DefaultTableModel)table_egitim.getModel();
        String ekle="";
        if (tf_eg_ad.getText().equals("")||tf_eg_baslangic.getText().equals("")||
                tf_eg_bolum.getText().equals("")||tf_eg_tur.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Lütfen tüm bilgileri eksiksiz doldurunuz");
            return;
        }
        try {
            if (!tf_eg_bitis.getText().equals("")) {
                Double.parseDouble(tf_eg_bitis.getText());
            }
            Double.parseDouble(tf_eg_baslangic.getText());
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Lütfen başlangıç ve bitiş tarihlerini sadece yıl olarak girin ve sayısal girin");
            return;
        }
        try {
            if (!tf_eg_ort.getText().equals("")) {
                Double.parseDouble(tf_eg_ort.getText());
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lütfen ortalamaya sayısal bir değer giriniz.");
            return;
        }
        if (!tf_eg_bitis.getText().equals("")&&!tf_eg_ort.getText().equals("")) {
            ekle=tf_eg_ad.getText().toLowerCase()+","+tf_eg_bolum.getText().toLowerCase()+","+tf_eg_tur.getText().toLowerCase()+","+tf_eg_baslangic.getText().toLowerCase()+","+tf_eg_bitis.getText().toLowerCase()+","+tf_eg_ort.getText().toLowerCase();
        model.addRow(ekle.split(","));
        }
        else{
            ekle=tf_eg_ad.getText().toLowerCase()+","+tf_eg_bolum.getText().toLowerCase()+","+tf_eg_tur.getText().toLowerCase()+","+tf_eg_baslangic.getText().toLowerCase()+","+"devam ediyor"+","+"e";
        model.addRow(ekle.split(","));
        }
        egDuzenleVisibleEditable(false);
        tf_eg_ad.setText("");
        tf_eg_baslangic.setText("");
        tf_eg_bitis.setText("");
        tf_eg_bolum.setText("");
        tf_eg_ort.setText("");
        tf_eg_tur.setText("");
    }//GEN-LAST:event_jb_eg_kaydetActionPerformed

    private void jb_dil_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dil_ekleActionPerformed
        dilDuzenleVisibleEditable(true);
    }//GEN-LAST:event_jb_dil_ekleActionPerformed

    private void tf_dilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dilActionPerformed

    private void jb_dil_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dil_kaydetActionPerformed
        DefaultTableModel model=(DefaultTableModel) table_ydil.getModel();
        if (tf_dil.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Lütfen dili boş bırakmayınız");
            return;
        }
        else if(kullaniciNode.getYabanci_dil().bilgiWriteString().contains(tf_dil.getText())){
            JOptionPane.showMessageDialog(this,"Aynı dilden bulunmaktadır");
            dilDuzenleVisibleEditable(false);
        tf_dil.setText("");
            return;
        }
        else{
            model.addRow(tf_dil.getText().toLowerCase().split(" "));
        }
        dilDuzenleVisibleEditable(false);
        tf_dil.setText("");
    }//GEN-LAST:event_jb_dil_kaydetActionPerformed

    private void jb_dil_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dil_silActionPerformed
        DefaultTableModel model=(DefaultTableModel)table_ydil.getModel();
        int secili_row=table_ydil.getSelectedRow();
        if (secili_row==-1) {
            JOptionPane.showMessageDialog(this,"Lütfen bir satır seçiniz");
            return;
        }
        else{
            model.removeRow(secili_row);
        }
    }//GEN-LAST:event_jb_dil_silActionPerformed

    private void tf_ehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ehActionPerformed

    private void jb_eh_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eh_kaydetActionPerformed
       DefaultTableModel model=(DefaultTableModel) table_ehliyet.getModel();
       
        if (!ehliyet_liste.contains(tf_eh.getText())) {
            JOptionPane.showMessageDialog(this,"Lütfen listede bulunan ehliyet türlerinden yazınız\n"+ehliyet_liste);
                return;
        }
        if (tf_eh.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Lütfen bilgi giriniz");
            return;
        }
        else if(kullaniciNode.getEhliyet_bilgisi().bilgiWriteString().contains(tf_eh.getText())){
             JOptionPane.showMessageDialog(this,"Ehliyet zaten bulunmakta");
             ehDuzenleVisibleEditable(false);
        tf_eh.setText("");
        return;      
        }
        else{
            model.addRow(tf_eh.getText().toLowerCase().split(" "));
        }
        ehDuzenleVisibleEditable(false);
        tf_eh.setText("");
    }//GEN-LAST:event_jb_eh_kaydetActionPerformed

    private void jb_eh_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eh_ekleActionPerformed
        ehDuzenleVisibleEditable(true);
    }//GEN-LAST:event_jb_eh_ekleActionPerformed

    private void jb_eh_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eh_silActionPerformed
        DefaultTableModel model=(DefaultTableModel) table_ehliyet.getModel();
        int secili_row=table_ehliyet.getSelectedRow();
        if (secili_row==-1) {
            JOptionPane.showMessageDialog(this,"Lütfen bir satır seçiniz");
            return;
        }
        else{
            model.removeRow(secili_row);
        }
    }//GEN-LAST:event_jb_eh_silActionPerformed

    private void jb_sistem_cıkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_sistem_cıkarActionPerformed
        int a=JOptionPane.showConfirmDialog(this, "Kullanıcıyı Silmeye Emin Misiniz?", "Kullanıcı Silme" ,JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a==0) {
          tree.deleteNode(tree.returnRoot(),tree.returnNode(tree.returnRoot(),kullaniciNode.getIsim(), kullaniciNode.getBilgi().bilgiEmailReturn()));
            OkuYaz.bilgileriKaydet(tree);
            JOptionPane.showMessageDialog(this, "Kullanıcı başarı ile silindi");
            KullaniciGiris giris=new KullaniciGiris();
            giris.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jb_sistem_cıkarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       KullaniciGiris giris=new KullaniciGiris();
       this.setVisible(false);
       giris.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jc_eg_bittiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_eg_bittiActionPerformed
        if (jc_eg_bitti.isSelected()) {
            tf_eg_bitis.setText("");
            tf_eg_ort.setText("");
            tf_eg_bitis.setEditable(false);
            tf_eg_ort.setEditable(false);
        }
        else{
            tf_eg_bitis.setEditable(true);
            tf_eg_ort.setEditable(true);
        }
    }//GEN-LAST:event_jc_eg_bittiActionPerformed

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
            java.util.logging.Logger.getLogger(KullaniciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jb_dil_ekle;
    private javax.swing.JButton jb_dil_kaydet;
    private javax.swing.JButton jb_dil_sil;
    private javax.swing.JButton jb_eg_ekle;
    private javax.swing.JButton jb_eg_kaydet;
    private javax.swing.JButton jb_eg_sil;
    private javax.swing.JButton jb_eh_ekle;
    private javax.swing.JButton jb_eh_kaydet;
    private javax.swing.JButton jb_eh_sil;
    private javax.swing.JButton jb_is_ekle;
    private javax.swing.JButton jb_is_kaydet;
    private javax.swing.JButton jb_sistem_cıkar;
    private javax.swing.JButton jb_sistem_kaydet;
    private javax.swing.JCheckBox jc_eg_bitti;
    private javax.swing.JLabel jl_dil;
    private javax.swing.JLabel jl_eg_1;
    private javax.swing.JLabel jl_eg_2;
    private javax.swing.JLabel jl_eg_3;
    private javax.swing.JLabel jl_eg_4;
    private javax.swing.JLabel jl_eg_5;
    private javax.swing.JLabel jl_eg_6;
    private javax.swing.JLabel jl_eh;
    private javax.swing.JLabel jl_is_ad;
    private javax.swing.JLabel jl_is_adres;
    private javax.swing.JLabel jl_is_poz;
    private javax.swing.JLabel jl_is_sure;
    private javax.swing.JLabel jl_kullanici;
    private javax.swing.JTable table_bilgiler;
    private javax.swing.JTable table_egitim;
    private javax.swing.JTable table_ehliyet;
    private javax.swing.JTable table_is;
    private javax.swing.JTable table_ydil;
    private javax.swing.JTextField tf_dil;
    private javax.swing.JTextField tf_eg_ad;
    private javax.swing.JTextField tf_eg_baslangic;
    private javax.swing.JTextField tf_eg_bitis;
    private javax.swing.JTextField tf_eg_bolum;
    private javax.swing.JTextField tf_eg_ort;
    private javax.swing.JTextField tf_eg_tur;
    private javax.swing.JTextField tf_eh;
    private javax.swing.JTextField tf_is_ad;
    private javax.swing.JTextField tf_is_adres;
    private javax.swing.JTextField tf_is_pozisyon;
    private javax.swing.JTextField tf_is_sure;
    // End of variables declaration//GEN-END:variables
}
