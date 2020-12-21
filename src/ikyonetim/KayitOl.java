
package ikyonetim;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;




public class KayitOl extends javax.swing.JFrame {
    BinaryTree t1=OkuYaz.bilgileriOku();
    private  LinkedList bilgi=new LinkedList();
     private  LinkedList is_deneyim=new LinkedList();
     private  LinkedList is_toplam=new LinkedList();
     private  LinkedList egitim=new LinkedList();
     private  LinkedList egitim_toplam=new LinkedList();
     private static LinkedList yabanci_dil=new LinkedList();
     private static LinkedList ehliyet=new LinkedList();

    public KayitOl() {
        initComponents();
        KayitOl.setDefaultLookAndFeelDecorated(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_ad = new javax.swing.JTextField();
        tf_soyad = new javax.swing.JTextField();
        tf_adres = new javax.swing.JTextField();
        tf_telefon = new javax.swing.JTextField();
        tf_eposta = new javax.swing.JTextField();
        tf_dtarih = new javax.swing.JTextField();
        tf_ehliyet = new javax.swing.JTextField();
        tf_ydil = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tf_is_adi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_is_adresi = new javax.swing.JTextField();
        tf_is_gorev = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_is_sure = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bt_is = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        tf_ok_ad = new javax.swing.JTextField();
        tf_ok_bas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tf_ok_bitis = new javax.swing.JTextField();
        tf_ok_ort = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bt_egitim = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        tf_ok_bol1 = new javax.swing.JTextField();
        jc_ok_tur = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jb_kayit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Kullanıcı Kayıt Ekranı");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Soyad:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Adres:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Ad:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Doğum Tarihi(Yıl):");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefon:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("E Posta:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Yabancı Dil:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Ehliyet:");

        tf_dtarih.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_dtarihKeyReleased(evt);
            }
        });

        tf_ehliyet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_ehliyetMouseClicked(evt);
            }
        });

        tf_ydil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_ydilMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "İşYeriBilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("İş Yerinin Adresi");

        tf_is_gorev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_is_gorevActionPerformed(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Görev:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Çalıştığı Süre(Yıl):");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("İş Yerinin Adı:");

        bt_is.setText("Bilgileri Kaydet");
        bt_is.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_isActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(tf_is_sure, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_is_gorev, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_is_adresi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_is_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_is, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_is_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_is_adresi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_is_gorev, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_is_sure, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_is, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(64, 153, 228));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "EğitimBilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Bölümü:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Bitiş Tarihi(Yıl):");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Okul Adı:");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Türü:");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Not Ortalaması:");

        bt_egitim.setText("Bilgileri Kaydet");
        bt_egitim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_egitimActionPerformed(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Başlangıç Tarihi(Yıl):");

        tf_ok_bol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ok_bol1ActionPerformed(evt);
            }
        });

        jc_ok_tur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lise", "Lisans", "Yüksek Lisans", "Önlisans", "Doktora", "İlköğretim", "Ortaöğretim" }));

        jCheckBox1.setText("Okul bitmedi");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                            .addComponent(tf_ok_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_ok_bol1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jc_ok_tur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_ok_bitis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_ok_ort, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(27, 27, 27)
                        .addComponent(tf_ok_bas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_egitim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ok_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ok_bol1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc_ok_tur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ok_bas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ok_bitis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ok_ort, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(bt_egitim, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jb_kayit.setText("Kayıt Ol");
        jb_kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_kayitActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(147, 147, 147)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_dtarih, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tf_ydil, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tf_ehliyet, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tf_ad, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tf_eposta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tf_soyad, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tf_telefon, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tf_adres, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jb_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_adres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_eposta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_dtarih, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ydil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ehliyet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145)
                        .addComponent(jb_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(1042, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_is_gorevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_is_gorevActionPerformed

    }//GEN-LAST:event_tf_is_gorevActionPerformed
    private static void yabanciDilKayit(String diller){
        if (diller.contains(",")) {
            for (String dil: diller.split(",")) {
            yabanci_dil.addLast(dil);
        }    
        }
        else{
            yabanci_dil.addLast(diller);
        }
          
    }
    private static void ehliyetKayit(String ehliyetler){
        if (ehliyetler.contains(",")) {
            for (String lisans : ehliyetler.split(",")) {
            ehliyet.addLast(lisans);
        }
        }
        else{
            ehliyet.addLast(ehliyetler);
        }
        
    }
    //Email doğrulama fonksiyonu
    public static boolean validateEmailAddress(String emailAddress) {

       Pattern regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        Matcher regMatcher   = regexPattern.matcher(emailAddress);
        if(regMatcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
    private void jb_kayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_kayitActionPerformed
        String ehliyet_liste="m,a1,a2,a,b1,b,be,c1,c1e,c,ce,d1,d1e,d,de,f,g";
        if (!validateEmailAddress(tf_eposta.getText())) {
            JOptionPane.showMessageDialog(this,"Email düzenli bir email değildir");
            return;
        }
        try {
            Integer.parseInt(tf_dtarih.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lütfen doğum tarihini sadece yıl olarak giriniz");
            return;
        }
        if (tf_telefon.getText().length()!=10) {
            JOptionPane.showMessageDialog(this,"Telefon numaranız 10 haneli olmalıdır");
            return;
        }
        if (tf_ydil.getText().split(",").length==0 ||tf_ydil.getText().split(" ").length>1) {
            JOptionPane.showMessageDialog(this,"Lütfen yabancı diller arasına virgül koyarak giriniz");
            return;
        }
        if (tf_ydil.getText().toLowerCase().contains("türkce")||tf_ydil.getText().toLowerCase().contains("türkçe")) {
            JOptionPane.showMessageDialog(this,"Türkçe yabancı dil değil");
            return;
        }
        if (tf_ehliyet.getText().split(",").length==0||tf_ehliyet.getText().split(" ").length>1) {
            JOptionPane.showMessageDialog(this,"Lütfen ehliyetler arasına virgül koyarak giriniz");
            return;
        }
        for (String string:tf_ehliyet.getText().split(",")) {
            if (!ehliyet_liste.contains(string)) {
                JOptionPane.showMessageDialog(this,"Lütfen listede bulunan ehliyet türlerinden yazınız\n"+ehliyet_liste);
                return;
            }
        }
        bilgi.addLast(tf_ad.getText().toLowerCase());
       bilgi.addLast(tf_soyad.getText().toLowerCase());
       bilgi.addLast(tf_adres.getText().toLowerCase());
       bilgi.addLast(tf_telefon.getText().toLowerCase());
       bilgi.addLast(tf_eposta.getText().toLowerCase());
       bilgi.addLast(tf_dtarih.getText().toLowerCase());
        yabanciDilKayit(tf_ydil.getText().toLowerCase());
        ehliyetKayit(tf_ehliyet.getText().toLowerCase());
       
        if (tf_ad.getText().equals("")||tf_soyad.getText().equals("")||tf_adres.getText().equals("")||tf_telefon.getText().equals("")||tf_eposta.getText().equals("")
                ||tf_dtarih.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen bilgiler kısmını tam ve düzgün doldurunuz.");
            bilgi.clear();
            return;
        }
        if (t1.ifNodeExists(t1.returnRoot(),tf_eposta.getText())) {
            JOptionPane.showMessageDialog(this,"Bu eposta sistemde kayıtlıdır lütfen başka bir e posta giriniz");
            bilgi.clear();
            return;
        }
        t1.add(tf_ad.getText().toLowerCase(), bilgi, is_toplam, egitim_toplam,yabanci_dil,ehliyet);
        t1.preOrder(t1.returnRoot());
       
    OkuYaz.bilgileriKaydet(t1);
       bilgi.clear();
       is_toplam.clear();
       egitim_toplam.clear();
       yabanci_dil.clear();
       ehliyet.clear();
       tf_ad.setText("");
       tf_adres.setText("");
       tf_dtarih.setText("");
       tf_ehliyet.setText("");
       tf_eposta.setText("");
       tf_soyad.setText("");
       tf_telefon.setText("");
       tf_ydil.setText("");
       JOptionPane.showMessageDialog(this,"Başarıyla Kayıt Olunmuştur");
    }//GEN-LAST:event_jb_kayitActionPerformed

    private void bt_isActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_isActionPerformed

     is_deneyim.addLast(tf_is_adi.getText().toLowerCase());
     is_deneyim.addLast(tf_is_adresi.getText().toLowerCase());
     is_deneyim.addLast(tf_is_gorev.getText().toLowerCase());
        if (tf_is_adi.getText().equals("")||tf_is_adresi.getText().equals("")||tf_is_gorev.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen bütün satırları giriniz");
            is_deneyim.clear();
            return;
        }
     try{
          is_deneyim.addLast(tf_is_sure.getText().toLowerCase());
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(this, "Lütfen süreye sayısal bir değer girin");       
         is_deneyim.clear();
         return;
     }
        is_toplam.addLast(is_deneyim.copy());
   
     int a=JOptionPane.showConfirmDialog(this, "Başka bir iş eklemek istiyor musunuz?","Onayla",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (a==JOptionPane.YES_OPTION) {
            tf_is_adi.setText("");
            tf_is_adresi.setText("");
            tf_is_gorev.setText("");
            tf_is_sure.setText("");            
            is_deneyim.clear();
        }
        else{
            tf_is_adi.setText("");
            tf_is_adresi.setText("");
            tf_is_gorev.setText("");
            tf_is_sure.setText("");
            tf_is_adi.setEditable(false);
            tf_is_adresi.setEditable(false);
            tf_is_gorev.setEditable(false);
            tf_is_sure.setEditable(false);
            
        }
        
    }//GEN-LAST:event_bt_isActionPerformed

    private void bt_egitimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_egitimActionPerformed
        if (tf_ok_bas.getText().equals("")||tf_ok_bol1.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Lütfen ilgili satırları doldurunuz");
            return;
        }
        
        try {
            if (!tf_ok_ort.getText().equals("")) {
                Double.parseDouble(tf_ok_ort.getText().toLowerCase());
                if (Double.parseDouble(tf_ok_ort.getText())>100 || Integer.parseInt(tf_ok_ort.getText())<0) {
                JOptionPane.showMessageDialog(this,"Lütfen 0-100 arasında bir sayı girin");
                return;
                }
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Lütfen ortalamaya sayısal bir değer girin.");
            egitim.clear();
            return;
        }  
        try {
            if (!tf_ok_bitis.getText().equals("")) {
                Integer.parseInt(tf_ok_bitis.getText().toLowerCase());
            }
            Integer.parseInt(tf_ok_bas.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lütfen baslangıç ve bitis tarihlerini sadece yıl olarak giriniz");
            return;
        }
       
        egitim.addLast(tf_ok_ad.getText().toLowerCase());
        egitim.addLast(tf_ok_bol1.getText().toLowerCase());
        egitim.addLast(jc_ok_tur.getSelectedItem().toString());
        egitim.addLast(tf_ok_bas.getText().toLowerCase());
        if (tf_ok_bitis.getText().equals("")) {
            egitim.addLast("devam ediyor");
        }
        else{
             egitim.addLast(tf_ok_bitis.getText().toLowerCase());
        }
        if (tf_ok_ort.getText().equals("")) {
            egitim.addLast("e");
        }
        else{
            egitim.addLast(tf_ok_ort.getText());
        }
        
        egitim_toplam.addLast(egitim.copy());
        int a=JOptionPane.showConfirmDialog(this, "Başka bir okul eklemek istiyor musunuz?", "Onay", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (a==JOptionPane.YES_OPTION) {
            tf_ok_ad.setText("");
            tf_ok_bas.setText("");
            tf_ok_bitis.setText("");
            tf_ok_bol1.setText("");
            tf_ok_ort.setText("");
            egitim.clear();
        }
        else{
            tf_ok_ad.setText("");
            tf_ok_bas.setText("");
            tf_ok_bitis.setText("");
            tf_ok_bol1.setText("");
            tf_ok_ort.setText("");
            tf_ok_ad.setEditable(false);
            tf_ok_bas.setEditable(false);
            tf_ok_bitis.setEditable(false);
            tf_ok_bol1.setEditable(false);
            tf_ok_ort.setEditable(false);
            
        }
    }//GEN-LAST:event_bt_egitimActionPerformed

    private void tf_ok_bol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ok_bol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ok_bol1ActionPerformed

    private void tf_dtarihKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_dtarihKeyReleased
        
    }//GEN-LAST:event_tf_dtarihKeyReleased
    int count=0;
    private void tf_ydilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_ydilMouseClicked
        if (count==0) {
            JOptionPane.showMessageDialog(this,"Diller arasına virgül koyarak ekleyiniz\n\n örn:almanca,rusca");
            count++;
        }      
    }//GEN-LAST:event_tf_ydilMouseClicked
int counteh=0;
    private void tf_ehliyetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_ehliyetMouseClicked
        if (counteh==0) {
            JOptionPane.showMessageDialog(this, "Ehliyetler arasına virgül koyarak ekleyiniz \n\nörn:b,a2");
            counteh++;
        }
    }//GEN-LAST:event_tf_ehliyetMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        KullaniciGiris giris=new KullaniciGiris();
        this.setVisible(false);
        giris.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            tf_ok_bitis.setText("");
            tf_ok_ort.setText("");
            tf_ok_bitis.setEditable(false);
            tf_ok_ort.setEditable(false);
        }
        else{
            tf_ok_bitis.setEditable(true);
            tf_ok_ort.setEditable(true);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    private boolean validateEmpty(){
        if (tf_ad.getText().equals("")||tf_adres.getText().equals("")||tf_dtarih.getText().equals("")
                ||tf_eposta.getText().equals("")||tf_is_adi.getText().equals("")||tf_is_adresi.getText().equals("")||tf_is_gorev.getText().equals("")||tf_is_sure.getText().equals("")||tf_ok_ad.getText().equals("")||tf_ok_bas.getText().equals("")||
                tf_ok_bitis.getText().equals("")||tf_ok_bol1.getText().equals("")||tf_ok_ort.getText().equals("")||tf_ehliyet.getText().equals("")
                ||tf_soyad.getText().equals("")||tf_telefon.getText().equals("")||tf_ydil.getText().equals("")) {
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */
    
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
            java.util.logging.Logger.getLogger(KayitOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayitOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayitOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayitOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayitOl().setVisible(true);
            }
        });
    }
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_egitim;
    private javax.swing.JButton bt_is;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JButton jb_kayit;
    private javax.swing.JComboBox<String> jc_ok_tur;
    private javax.swing.JTextField tf_ad;
    private javax.swing.JTextField tf_adres;
    private javax.swing.JTextField tf_dtarih;
    private javax.swing.JTextField tf_ehliyet;
    private javax.swing.JTextField tf_eposta;
    private javax.swing.JTextField tf_is_adi;
    private javax.swing.JTextField tf_is_adresi;
    private javax.swing.JTextField tf_is_gorev;
    private javax.swing.JTextField tf_is_sure;
    private javax.swing.JTextField tf_ok_ad;
    private javax.swing.JTextField tf_ok_bas;
    private javax.swing.JTextField tf_ok_bitis;
    private javax.swing.JTextField tf_ok_bol1;
    private javax.swing.JTextField tf_ok_ort;
    private javax.swing.JTextField tf_soyad;
    private javax.swing.JTextField tf_telefon;
    private javax.swing.JTextField tf_ydil;
    // End of variables declaration//GEN-END:variables
}
