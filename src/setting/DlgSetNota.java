/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DlgAdmin.java
 *
 * Created on 21 Jun 10, 20:53:44
 */

package setting;

import fungsi.WarnaTable;
import fungsi.batasInput;
import fungsi.koneksiDB;
import fungsi.sekuel;
import fungsi.validasi;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author perpustakaan
 */
public class DlgSetNota extends javax.swing.JDialog {
    private final DefaultTableModel tabMode,tabMode2,tabMode3;
    private Connection koneksi=koneksiDB.condb();
    private sekuel Sequel=new sekuel();
    private validasi Valid=new validasi();
    private PreparedStatement ps;
    private ResultSet rs;
    private String laborat="No",radiologi="No",operasi="No",obat="No",
            ranap_dokter="No",ranap_paramedis="No",ralan_dokter="No",
            ralan_paramedis="No",tambahan="No",potongan="No",
            kamar="No",registrasi="No",harian="No",retur_Obat="No",resep_Pulang="No";

    /** Creates new form DlgAdmin
     * @param parent
     * @param modal */
    public DlgSetNota(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(10,10);
        setSize(457,249);
        tabMode=new DefaultTableModel(null,new Object[]{"Parameter","Nilai"}){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };

        tbAdmin.setModel(tabMode);
        tbAdmin.setPreferredScrollableViewportSize(new Dimension(500,500));
        tbAdmin.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 2; i++) {
            TableColumn column = tbAdmin.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(550);
            }else{
                column.setPreferredWidth(150);
            }
        }

        tbAdmin.setDefaultRenderer(Object.class, new WarnaTable());
        
        tabMode2=new DefaultTableModel(null,new Object[]{"Parameter","Nilai"}){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };

        tbAdmin2.setModel(tabMode2);
        tbAdmin2.setPreferredScrollableViewportSize(new Dimension(500,500));
        tbAdmin2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 2; i++) {
            TableColumn column = tbAdmin2.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(250);
            }else{
                column.setPreferredWidth(250);
            }
        }
        tbAdmin2.setDefaultRenderer(Object.class, new WarnaTable());
        
        tabMode3=new DefaultTableModel(null,new Object[]{"Parameter","Nilai"}){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };

        tbAdmin3.setModel(tabMode3);
        tbAdmin3.setPreferredScrollableViewportSize(new Dimension(500,500));
        tbAdmin3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 2; i++) {
            TableColumn column = tbAdmin3.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(250);
            }else{
                column.setPreferredWidth(250);
            }
        }

        tbAdmin3.setDefaultRenderer(Object.class, new WarnaTable());

        NotaRalan.setDocument(new batasInput((byte)11).getKata(NotaRalan));
        KwitansiRalan.setDocument(new batasInput((byte)11).getKata(KwitansiRalan));
        Nota2Ranap.setDocument(new batasInput((byte)11).getKata(Nota2Ranap));
        Nota1Ranap.setDocument(new batasInput((byte)11).getKata(Nota1Ranap));
        KwitansiRanap.setDocument(new batasInput((byte)11).getKata(KwitansiRanap));
        NotaApotek.setDocument(new batasInput((byte)11).getKata(NotaApotek));
        NotaLab.setDocument(new batasInput((byte)11).getKata(NotaLab));        
        NamaService.setDocument(new batasInput((byte)100).getKata(NamaService));
        BesarBiaya.setDocument(new batasInput((byte)5).getKata(BesarBiaya));
        NamaService1.setDocument(new batasInput((byte)100).getKata(NamaService));
        BesarBiaya1.setDocument(new batasInput((byte)5).getKata(BesarBiaya));
        
        ChkInput.setSelected(false);
        isForm();
        ChkInput2.setSelected(false);
        isForm2();
        ChkInput3.setSelected(false);
        isForm3();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalFrame1 = new widget.InternalFrame();
        panelGlass5 = new widget.panelisi();
        BtnSimpan = new widget.Button();
        BtnBatal = new widget.Button();
        BtnHapus = new widget.Button();
        BtnEdit = new widget.Button();
        BtnKeluar = new widget.Button();
        TabSetting = new javax.swing.JTabbedPane();
        internalFrame2 = new widget.InternalFrame();
        Scroll = new widget.ScrollPane();
        tbAdmin = new widget.Table();
        PanelInput = new javax.swing.JPanel();
        ChkInput = new widget.CekBox();
        FormInput = new widget.panelisi();
        jLabel4 = new widget.Label();
        NotaRalan = new widget.TextBox();
        jLabel5 = new widget.Label();
        jLabel6 = new widget.Label();
        cmbYesRalan = new widget.ComboBox();
        jLabel7 = new widget.Label();
        KwitansiRalan = new widget.TextBox();
        jLabel8 = new widget.Label();
        jLabel9 = new widget.Label();
        Nota1Ranap = new widget.TextBox();
        jLabel10 = new widget.Label();
        jLabel11 = new widget.Label();
        Nota2Ranap = new widget.TextBox();
        jLabel12 = new widget.Label();
        jLabel13 = new widget.Label();
        KwitansiRanap = new widget.TextBox();
        jLabel14 = new widget.Label();
        jLabel15 = new widget.Label();
        NotaApotek = new widget.TextBox();
        jLabel16 = new widget.Label();
        jLabel17 = new widget.Label();
        NotaLab = new widget.TextBox();
        jLabel18 = new widget.Label();
        jLabel19 = new widget.Label();
        cmbYesRanap = new widget.ComboBox();
        cmbYesRincianRalan = new widget.ComboBox();
        jLabel20 = new widget.Label();
        jLabel21 = new widget.Label();
        cmbYesRincianRanap = new widget.ComboBox();
        cmbYesCentangDokterRalan = new widget.ComboBox();
        jLabel22 = new widget.Label();
        cmbYesCentangDokterRanap = new widget.ComboBox();
        jLabel23 = new widget.Label();
        jLabel24 = new widget.Label();
        cmbYesAdministrasiRanap = new widget.ComboBox();
        jLabel25 = new widget.Label();
        cmbYesRincianOperasi = new widget.ComboBox();
        jLabel26 = new widget.Label();
        cmbYesPPNRalan = new widget.ComboBox();
        jLabel27 = new widget.Label();
        cmbYesPPNRanap = new widget.ComboBox();
        jLabel28 = new widget.Label();
        cmbYesTombolNotaRalan = new widget.ComboBox();
        jLabel29 = new widget.Label();
        cmbYesTombolNotaRanap = new widget.ComboBox();
        jLabel30 = new widget.Label();
        cmbYesTombolPenjualan = new widget.ComboBox();
        jLabel39 = new widget.Label();
        cmbYesTombolPenyerahanDarah = new widget.ComboBox();
        internalFrame3 = new widget.InternalFrame();
        Scroll1 = new widget.ScrollPane();
        tbAdmin2 = new widget.Table();
        PanelInput2 = new javax.swing.JPanel();
        ChkInput2 = new widget.CekBox();
        FormInput2 = new widget.panelisi();
        jLabel31 = new widget.Label();
        NamaService = new widget.TextBox();
        jLabel33 = new widget.Label();
        BesarBiaya = new widget.TextBox();
        jLabel34 = new widget.Label();
        chkLaborat = new widget.CekBox();
        chkRadiologi = new widget.CekBox();
        chkOperasi = new widget.CekBox();
        chkObat = new widget.CekBox();
        chkRanapDokter = new widget.CekBox();
        chkRanapParamedis = new widget.CekBox();
        chkRalanDokter = new widget.CekBox();
        chkRalanParamedis = new widget.CekBox();
        chkTambahan = new widget.CekBox();
        chkKamar = new widget.CekBox();
        chkRegistrasi = new widget.CekBox();
        chkHarian = new widget.CekBox();
        chkResepPulang = new widget.CekBox();
        chkRetur = new widget.CekBox();
        chkPotongan = new widget.CekBox();
        jLabel35 = new widget.Label();
        internalFrame4 = new widget.InternalFrame();
        Scroll2 = new widget.ScrollPane();
        tbAdmin3 = new widget.Table();
        PanelInput3 = new javax.swing.JPanel();
        ChkInput3 = new widget.CekBox();
        FormInput3 = new widget.panelisi();
        jLabel32 = new widget.Label();
        NamaService1 = new widget.TextBox();
        jLabel36 = new widget.Label();
        BesarBiaya1 = new widget.TextBox();
        jLabel37 = new widget.Label();
        chkLaborat1 = new widget.CekBox();
        chkRadiologi1 = new widget.CekBox();
        chkOperasi1 = new widget.CekBox();
        chkObat1 = new widget.CekBox();
        chkRanapDokter1 = new widget.CekBox();
        chkRanapParamedis1 = new widget.CekBox();
        chkRalanDokter1 = new widget.CekBox();
        chkRalanParamedis1 = new widget.CekBox();
        chkTambahan1 = new widget.CekBox();
        chkKamar1 = new widget.CekBox();
        chkRegistrasi1 = new widget.CekBox();
        chkHarian1 = new widget.CekBox();
        chkResepPulang1 = new widget.CekBox();
        chkRetur1 = new widget.CekBox();
        chkPotongan1 = new widget.CekBox();
        jLabel38 = new widget.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        internalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ Setup Billing ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 70, 40))); // NOI18N
        internalFrame1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        internalFrame1.setName("internalFrame1"); // NOI18N
        internalFrame1.setLayout(new java.awt.BorderLayout(1, 1));

        panelGlass5.setName("panelGlass5"); // NOI18N
        panelGlass5.setPreferredSize(new java.awt.Dimension(55, 55));
        panelGlass5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 9));

        BtnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/save-16x16.png"))); // NOI18N
        BtnSimpan.setMnemonic('S');
        BtnSimpan.setText("Simpan");
        BtnSimpan.setToolTipText("Alt+S");
        BtnSimpan.setName("BtnSimpan"); // NOI18N
        BtnSimpan.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        BtnSimpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnSimpanKeyPressed(evt);
            }
        });
        panelGlass5.add(BtnSimpan);

        BtnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Cancel-2-16x16.png"))); // NOI18N
        BtnBatal.setMnemonic('B');
        BtnBatal.setText("Baru");
        BtnBatal.setToolTipText("Alt+B");
        BtnBatal.setName("BtnBatal"); // NOI18N
        BtnBatal.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalActionPerformed(evt);
            }
        });
        BtnBatal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnBatalKeyPressed(evt);
            }
        });
        panelGlass5.add(BtnBatal);

        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/stop_f2.png"))); // NOI18N
        BtnHapus.setMnemonic('H');
        BtnHapus.setText("Hapus");
        BtnHapus.setToolTipText("Alt+H");
        BtnHapus.setName("BtnHapus"); // NOI18N
        BtnHapus.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        BtnHapus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnHapusKeyPressed(evt);
            }
        });
        panelGlass5.add(BtnHapus);

        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/inventaris.png"))); // NOI18N
        BtnEdit.setMnemonic('G');
        BtnEdit.setText("Ganti");
        BtnEdit.setToolTipText("Alt+G");
        BtnEdit.setIconTextGap(3);
        BtnEdit.setName("BtnEdit"); // NOI18N
        BtnEdit.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        BtnEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnEditKeyPressed(evt);
            }
        });
        panelGlass5.add(BtnEdit);

        BtnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/exit.png"))); // NOI18N
        BtnKeluar.setMnemonic('K');
        BtnKeluar.setText("Keluar");
        BtnKeluar.setToolTipText("Alt+K");
        BtnKeluar.setName("BtnKeluar"); // NOI18N
        BtnKeluar.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        BtnKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnKeluarKeyPressed(evt);
            }
        });
        panelGlass5.add(BtnKeluar);

        internalFrame1.add(panelGlass5, java.awt.BorderLayout.PAGE_END);

        TabSetting.setBackground(new java.awt.Color(250, 255, 245));
        TabSetting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 235, 225)));
        TabSetting.setForeground(new java.awt.Color(50, 70, 40));
        TabSetting.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        TabSetting.setName("TabSetting"); // NOI18N
        TabSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabSettingMouseClicked(evt);
            }
        });

        internalFrame2.setBackground(new java.awt.Color(235, 255, 235));
        internalFrame2.setBorder(null);
        internalFrame2.setName("internalFrame2"); // NOI18N
        internalFrame2.setLayout(new java.awt.BorderLayout(1, 1));

        Scroll.setName("Scroll"); // NOI18N
        Scroll.setOpaque(true);

        tbAdmin.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        tbAdmin.setName("tbAdmin"); // NOI18N
        tbAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAdminMouseClicked(evt);
            }
        });
        tbAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbAdminKeyPressed(evt);
            }
        });
        Scroll.setViewportView(tbAdmin);

        internalFrame2.add(Scroll, java.awt.BorderLayout.CENTER);

        PanelInput.setName("PanelInput"); // NOI18N
        PanelInput.setOpaque(false);
        PanelInput.setLayout(new java.awt.BorderLayout(1, 1));

        ChkInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/143.png"))); // NOI18N
        ChkInput.setMnemonic('I');
        ChkInput.setText(".: Input Data");
        ChkInput.setToolTipText("Alt+I");
        ChkInput.setBorderPainted(true);
        ChkInput.setBorderPaintedFlat(true);
        ChkInput.setFocusable(false);
        ChkInput.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ChkInput.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ChkInput.setName("ChkInput"); // NOI18N
        ChkInput.setPreferredSize(new java.awt.Dimension(192, 20));
        ChkInput.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/143.png"))); // NOI18N
        ChkInput.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/145.png"))); // NOI18N
        ChkInput.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/145.png"))); // NOI18N
        ChkInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkInputActionPerformed(evt);
            }
        });
        PanelInput.add(ChkInput, java.awt.BorderLayout.PAGE_END);

        FormInput.setName("FormInput"); // NOI18N
        FormInput.setPreferredSize(new java.awt.Dimension(44, 348));
        FormInput.setLayout(null);

        jLabel4.setText("Lebar Nota Rawat Jalan :");
        jLabel4.setName("jLabel4"); // NOI18N
        FormInput.add(jLabel4);
        jLabel4.setBounds(0, 12, 165, 23);
        jLabel4.getAccessibleContext().setAccessibleName("");

        NotaRalan.setHighlighter(null);
        NotaRalan.setName("NotaRalan"); // NOI18N
        NotaRalan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NotaRalanKeyPressed(evt);
            }
        });
        FormInput.add(NotaRalan);
        NotaRalan.setBounds(168, 12, 50, 23);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("px atau %");
        jLabel5.setName("jLabel5"); // NOI18N
        FormInput.add(jLabel5);
        jLabel5.setBounds(222, 12, 60, 23);

        jLabel6.setText("Cetak Nota/Kwitansi Saat Menyimpan di Billing Rawat Jalan :");
        jLabel6.setName("jLabel6"); // NOI18N
        FormInput.add(jLabel6);
        jLabel6.setBounds(285, 12, 300, 23);

        cmbYesRalan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesRalan.setName("cmbYesRalan"); // NOI18N
        cmbYesRalan.setOpaque(false);
        cmbYesRalan.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesRalan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesRalanKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesRalan);
        cmbYesRalan.setBounds(588, 12, 60, 23);

        jLabel7.setText("Lebar Kwitansi Rawat Jalan :");
        jLabel7.setName("jLabel7"); // NOI18N
        FormInput.add(jLabel7);
        jLabel7.setBounds(0, 42, 165, 23);
        jLabel7.getAccessibleContext().setAccessibleName("");

        KwitansiRalan.setHighlighter(null);
        KwitansiRalan.setName("KwitansiRalan"); // NOI18N
        KwitansiRalan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KwitansiRalanKeyPressed(evt);
            }
        });
        FormInput.add(KwitansiRalan);
        KwitansiRalan.setBounds(168, 42, 50, 23);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("px atau %");
        jLabel8.setName("jLabel8"); // NOI18N
        FormInput.add(jLabel8);
        jLabel8.setBounds(222, 42, 60, 23);

        jLabel9.setText("Lebar Nota 1 Rawat Inap :");
        jLabel9.setName("jLabel9"); // NOI18N
        FormInput.add(jLabel9);
        jLabel9.setBounds(0, 72, 165, 23);
        jLabel9.getAccessibleContext().setAccessibleName("");

        Nota1Ranap.setHighlighter(null);
        Nota1Ranap.setName("Nota1Ranap"); // NOI18N
        Nota1Ranap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Nota1RanapKeyPressed(evt);
            }
        });
        FormInput.add(Nota1Ranap);
        Nota1Ranap.setBounds(168, 72, 50, 23);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("px atau %");
        jLabel10.setName("jLabel10"); // NOI18N
        FormInput.add(jLabel10);
        jLabel10.setBounds(222, 72, 60, 23);

        jLabel11.setText("Lebar Nota 2 Rawat Inap :");
        jLabel11.setName("jLabel11"); // NOI18N
        FormInput.add(jLabel11);
        jLabel11.setBounds(0, 102, 165, 23);
        jLabel11.getAccessibleContext().setAccessibleName("");

        Nota2Ranap.setHighlighter(null);
        Nota2Ranap.setName("Nota2Ranap"); // NOI18N
        Nota2Ranap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Nota2RanapKeyPressed(evt);
            }
        });
        FormInput.add(Nota2Ranap);
        Nota2Ranap.setBounds(168, 102, 50, 23);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("px atau %");
        jLabel12.setName("jLabel12"); // NOI18N
        FormInput.add(jLabel12);
        jLabel12.setBounds(222, 102, 60, 23);

        jLabel13.setText("Lebar Kwitansi Rawat Inap :");
        jLabel13.setName("jLabel13"); // NOI18N
        FormInput.add(jLabel13);
        jLabel13.setBounds(0, 132, 165, 23);
        jLabel13.getAccessibleContext().setAccessibleName("");

        KwitansiRanap.setHighlighter(null);
        KwitansiRanap.setName("KwitansiRanap"); // NOI18N
        KwitansiRanap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KwitansiRanapKeyPressed(evt);
            }
        });
        FormInput.add(KwitansiRanap);
        KwitansiRanap.setBounds(168, 132, 50, 23);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("px atau %");
        jLabel14.setName("jLabel14"); // NOI18N
        FormInput.add(jLabel14);
        jLabel14.setBounds(222, 132, 60, 23);

        jLabel15.setText("Lebar Nota Apotek & UTD :");
        jLabel15.setName("jLabel15"); // NOI18N
        FormInput.add(jLabel15);
        jLabel15.setBounds(0, 162, 165, 23);
        jLabel15.getAccessibleContext().setAccessibleName("");

        NotaApotek.setHighlighter(null);
        NotaApotek.setName("NotaApotek"); // NOI18N
        NotaApotek.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NotaApotekKeyPressed(evt);
            }
        });
        FormInput.add(NotaApotek);
        NotaApotek.setBounds(168, 162, 50, 23);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("px atau %");
        jLabel16.setName("jLabel16"); // NOI18N
        FormInput.add(jLabel16);
        jLabel16.setBounds(222, 162, 60, 23);

        jLabel17.setText("Lebar Nota Lab & Radiologi :");
        jLabel17.setName("jLabel17"); // NOI18N
        FormInput.add(jLabel17);
        jLabel17.setBounds(0, 192, 165, 23);
        jLabel17.getAccessibleContext().setAccessibleName("");

        NotaLab.setHighlighter(null);
        NotaLab.setName("NotaLab"); // NOI18N
        NotaLab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NotaLabKeyPressed(evt);
            }
        });
        FormInput.add(NotaLab);
        NotaLab.setBounds(168, 192, 50, 23);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("px atau %");
        jLabel18.setName("jLabel18"); // NOI18N
        FormInput.add(jLabel18);
        jLabel18.setBounds(222, 192, 60, 23);

        jLabel19.setText("Cetak Nota/Kwitansi Saat Menyimpan di Billing Rawat Inap :");
        jLabel19.setName("jLabel19"); // NOI18N
        FormInput.add(jLabel19);
        jLabel19.setBounds(285, 42, 300, 23);

        cmbYesRanap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesRanap.setName("cmbYesRanap"); // NOI18N
        cmbYesRanap.setOpaque(false);
        cmbYesRanap.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesRanap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesRanapKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesRanap);
        cmbYesRanap.setBounds(588, 42, 60, 23);

        cmbYesRincianRalan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesRincianRalan.setName("cmbYesRincianRalan"); // NOI18N
        cmbYesRincianRalan.setOpaque(false);
        cmbYesRincianRalan.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesRincianRalan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesRincianRalanKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesRincianRalan);
        cmbYesRincianRalan.setBounds(588, 72, 60, 23);

        jLabel20.setText("Tampilkan Rincian Tindakan Dokter Ralan :");
        jLabel20.setName("jLabel20"); // NOI18N
        FormInput.add(jLabel20);
        jLabel20.setBounds(285, 72, 300, 23);

        jLabel21.setText("Tampilkan Rincian Tindakan Dokter Ranap :");
        jLabel21.setName("jLabel21"); // NOI18N
        FormInput.add(jLabel21);
        jLabel21.setBounds(285, 102, 300, 23);

        cmbYesRincianRanap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesRincianRanap.setName("cmbYesRincianRanap"); // NOI18N
        cmbYesRincianRanap.setOpaque(false);
        cmbYesRincianRanap.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesRincianRanap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesRincianRanapKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesRincianRanap);
        cmbYesRincianRanap.setBounds(588, 102, 60, 23);

        cmbYesCentangDokterRalan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesCentangDokterRalan.setName("cmbYesCentangDokterRalan"); // NOI18N
        cmbYesCentangDokterRalan.setOpaque(false);
        cmbYesCentangDokterRalan.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesCentangDokterRalan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesCentangDokterRalanKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesCentangDokterRalan);
        cmbYesCentangDokterRalan.setBounds(168, 282, 60, 23);

        jLabel22.setText("Centang Dokter di Nota Ralan :");
        jLabel22.setName("jLabel22"); // NOI18N
        jLabel22.setPreferredSize(null);
        FormInput.add(jLabel22);
        jLabel22.setBounds(0, 282, 165, 23);

        cmbYesCentangDokterRanap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesCentangDokterRanap.setName("cmbYesCentangDokterRanap"); // NOI18N
        cmbYesCentangDokterRanap.setOpaque(false);
        cmbYesCentangDokterRanap.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesCentangDokterRanap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesCentangDokterRanapKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesCentangDokterRanap);
        cmbYesCentangDokterRanap.setBounds(168, 312, 60, 23);

        jLabel23.setText("Centang Dokter di Nota Ranap :");
        jLabel23.setName("jLabel23"); // NOI18N
        jLabel23.setPreferredSize(null);
        FormInput.add(jLabel23);
        jLabel23.setBounds(0, 312, 165, 23);

        jLabel24.setText("Administrasi di Billing Ranap :");
        jLabel24.setName("jLabel24"); // NOI18N
        FormInput.add(jLabel24);
        jLabel24.setBounds(0, 252, 165, 23);

        cmbYesAdministrasiRanap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesAdministrasiRanap.setName("cmbYesAdministrasiRanap"); // NOI18N
        cmbYesAdministrasiRanap.setOpaque(false);
        cmbYesAdministrasiRanap.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesAdministrasiRanap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesAdministrasiRanapKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesAdministrasiRanap);
        cmbYesAdministrasiRanap.setBounds(168, 252, 60, 23);

        jLabel25.setText("Tampilkan Rincian Operasi :");
        jLabel25.setName("jLabel25"); // NOI18N
        FormInput.add(jLabel25);
        jLabel25.setBounds(0, 222, 165, 23);

        cmbYesRincianOperasi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesRincianOperasi.setName("cmbYesRincianOperasi"); // NOI18N
        cmbYesRincianOperasi.setOpaque(false);
        cmbYesRincianOperasi.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesRincianOperasi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesRincianOperasiKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesRincianOperasi);
        cmbYesRincianOperasi.setBounds(168, 222, 60, 23);

        jLabel26.setText("Tampilkan PPN Obat 10 % di Nota Ralan :");
        jLabel26.setName("jLabel26"); // NOI18N
        FormInput.add(jLabel26);
        jLabel26.setBounds(285, 132, 300, 23);

        cmbYesPPNRalan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesPPNRalan.setName("cmbYesPPNRalan"); // NOI18N
        cmbYesPPNRalan.setOpaque(false);
        cmbYesPPNRalan.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesPPNRalan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesPPNRalanKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesPPNRalan);
        cmbYesPPNRalan.setBounds(588, 132, 60, 23);

        jLabel27.setText("Tampilkan PPN Obat 10 % di Nota Ranap :");
        jLabel27.setName("jLabel27"); // NOI18N
        FormInput.add(jLabel27);
        jLabel27.setBounds(285, 162, 300, 23);

        cmbYesPPNRanap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesPPNRanap.setName("cmbYesPPNRanap"); // NOI18N
        cmbYesPPNRanap.setOpaque(false);
        cmbYesPPNRanap.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesPPNRanap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesPPNRanapKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesPPNRanap);
        cmbYesPPNRanap.setBounds(588, 162, 60, 23);

        jLabel28.setText("Tampilkan Tombol Nota di Billing Rawat Jalan :");
        jLabel28.setName("jLabel28"); // NOI18N
        FormInput.add(jLabel28);
        jLabel28.setBounds(285, 192, 300, 23);

        cmbYesTombolNotaRalan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesTombolNotaRalan.setName("cmbYesTombolNotaRalan"); // NOI18N
        cmbYesTombolNotaRalan.setOpaque(false);
        cmbYesTombolNotaRalan.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesTombolNotaRalan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesTombolNotaRalanKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesTombolNotaRalan);
        cmbYesTombolNotaRalan.setBounds(588, 192, 60, 23);

        jLabel29.setText("Tampilkan Tombol Nota di Billing Rawat Inap :");
        jLabel29.setName("jLabel29"); // NOI18N
        FormInput.add(jLabel29);
        jLabel29.setBounds(285, 222, 300, 23);

        cmbYesTombolNotaRanap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesTombolNotaRanap.setName("cmbYesTombolNotaRanap"); // NOI18N
        cmbYesTombolNotaRanap.setOpaque(false);
        cmbYesTombolNotaRanap.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesTombolNotaRanap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesTombolNotaRanapKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesTombolNotaRanap);
        cmbYesTombolNotaRanap.setBounds(588, 222, 60, 23);

        jLabel30.setText("Verifikasi Penjualan Obat Bebas di Kasir :");
        jLabel30.setName("jLabel30"); // NOI18N
        FormInput.add(jLabel30);
        jLabel30.setBounds(285, 252, 300, 23);

        cmbYesTombolPenjualan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesTombolPenjualan.setName("cmbYesTombolPenjualan"); // NOI18N
        cmbYesTombolPenjualan.setOpaque(false);
        cmbYesTombolPenjualan.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesTombolPenjualan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesTombolPenjualanKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesTombolPenjualan);
        cmbYesTombolPenjualan.setBounds(588, 252, 60, 23);

        jLabel39.setText("Verifikasi Penjualan Darah UTD di Kasir :");
        jLabel39.setName("jLabel39"); // NOI18N
        FormInput.add(jLabel39);
        jLabel39.setBounds(285, 282, 300, 23);

        cmbYesTombolPenyerahanDarah.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYesTombolPenyerahanDarah.setName("cmbYesTombolPenyerahanDarah"); // NOI18N
        cmbYesTombolPenyerahanDarah.setOpaque(false);
        cmbYesTombolPenyerahanDarah.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYesTombolPenyerahanDarah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesTombolPenyerahanDarahKeyPressed(evt);
            }
        });
        FormInput.add(cmbYesTombolPenyerahanDarah);
        cmbYesTombolPenyerahanDarah.setBounds(588, 282, 60, 23);

        PanelInput.add(FormInput, java.awt.BorderLayout.CENTER);

        internalFrame2.add(PanelInput, java.awt.BorderLayout.PAGE_START);

        TabSetting.addTab(".: Nota, Kwitansi & Verifikasi Penjualan  ", internalFrame2);

        internalFrame3.setBackground(new java.awt.Color(235, 255, 235));
        internalFrame3.setBorder(null);
        internalFrame3.setName("internalFrame3"); // NOI18N
        internalFrame3.setLayout(new java.awt.BorderLayout(1, 1));

        Scroll1.setName("Scroll1"); // NOI18N
        Scroll1.setOpaque(true);

        tbAdmin2.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        tbAdmin2.setName("tbAdmin2"); // NOI18N
        tbAdmin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAdmin2MouseClicked(evt);
            }
        });
        tbAdmin2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbAdmin2KeyPressed(evt);
            }
        });
        Scroll1.setViewportView(tbAdmin2);

        internalFrame3.add(Scroll1, java.awt.BorderLayout.CENTER);

        PanelInput2.setName("PanelInput2"); // NOI18N
        PanelInput2.setOpaque(false);
        PanelInput2.setLayout(new java.awt.BorderLayout(1, 1));

        ChkInput2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/143.png"))); // NOI18N
        ChkInput2.setMnemonic('I');
        ChkInput2.setText(".: Input Data");
        ChkInput2.setToolTipText("Alt+I");
        ChkInput2.setBorderPainted(true);
        ChkInput2.setBorderPaintedFlat(true);
        ChkInput2.setFocusable(false);
        ChkInput2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ChkInput2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ChkInput2.setName("ChkInput2"); // NOI18N
        ChkInput2.setPreferredSize(new java.awt.Dimension(192, 20));
        ChkInput2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/143.png"))); // NOI18N
        ChkInput2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/145.png"))); // NOI18N
        ChkInput2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/145.png"))); // NOI18N
        ChkInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkInput2ActionPerformed(evt);
            }
        });
        PanelInput2.add(ChkInput2, java.awt.BorderLayout.PAGE_END);

        FormInput2.setName("FormInput2"); // NOI18N
        FormInput2.setPreferredSize(new java.awt.Dimension(44, 165));
        FormInput2.setLayout(null);

        jLabel31.setText("Nama Service/Administrasi :");
        jLabel31.setName("jLabel31"); // NOI18N
        FormInput2.add(jLabel31);
        jLabel31.setBounds(0, 12, 150, 23);

        NamaService.setHighlighter(null);
        NamaService.setName("NamaService"); // NOI18N
        NamaService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaServiceActionPerformed(evt);
            }
        });
        NamaService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NamaServiceKeyPressed(evt);
            }
        });
        FormInput2.add(NamaService);
        NamaService.setBounds(152, 12, 370, 23);

        jLabel33.setText("Besar Biaya :");
        jLabel33.setName("jLabel33"); // NOI18N
        FormInput2.add(jLabel33);
        jLabel33.setBounds(0, 42, 150, 23);

        BesarBiaya.setHighlighter(null);
        BesarBiaya.setName("BesarBiaya"); // NOI18N
        BesarBiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BesarBiayaActionPerformed(evt);
            }
        });
        BesarBiaya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BesarBiayaKeyPressed(evt);
            }
        });
        FormInput2.add(BesarBiaya);
        BesarBiaya.setBounds(152, 42, 40, 23);

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText(")");
        jLabel34.setName("jLabel34"); // NOI18N
        FormInput2.add(jLabel34);
        jLabel34.setBounds(530, 132, 35, 23);

        chkLaborat.setSelected(true);
        chkLaborat.setText("Laboratorium +");
        chkLaborat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkLaborat.setName("chkLaborat"); // NOI18N
        chkLaborat.setOpaque(false);
        chkLaborat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLaboratActionPerformed(evt);
            }
        });
        FormInput2.add(chkLaborat);
        chkLaborat.setBounds(225, 42, 101, 23);

        chkRadiologi.setSelected(true);
        chkRadiologi.setText("Radiologi +");
        chkRadiologi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRadiologi.setName("chkRadiologi"); // NOI18N
        chkRadiologi.setOpaque(false);
        chkRadiologi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRadiologiActionPerformed(evt);
            }
        });
        FormInput2.add(chkRadiologi);
        chkRadiologi.setBounds(320, 42, 80, 23);

        chkOperasi.setSelected(true);
        chkOperasi.setText("Operasi +");
        chkOperasi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkOperasi.setName("chkOperasi"); // NOI18N
        chkOperasi.setOpaque(false);
        chkOperasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOperasiActionPerformed(evt);
            }
        });
        FormInput2.add(chkOperasi);
        chkOperasi.setBounds(395, 42, 74, 23);

        chkObat.setSelected(true);
        chkObat.setText("Obat +");
        chkObat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkObat.setName("chkObat"); // NOI18N
        chkObat.setOpaque(false);
        chkObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkObatActionPerformed(evt);
            }
        });
        FormInput2.add(chkObat);
        chkObat.setBounds(464, 42, 74, 23);

        chkRanapDokter.setSelected(true);
        chkRanapDokter.setText("Ranap Dokter +");
        chkRanapDokter.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRanapDokter.setName("chkRanapDokter"); // NOI18N
        chkRanapDokter.setOpaque(false);
        chkRanapDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRanapDokterActionPerformed(evt);
            }
        });
        FormInput2.add(chkRanapDokter);
        chkRanapDokter.setBounds(225, 72, 105, 23);

        chkRanapParamedis.setSelected(true);
        chkRanapParamedis.setText("Ranap Paramedis +");
        chkRanapParamedis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRanapParamedis.setName("chkRanapParamedis"); // NOI18N
        chkRanapParamedis.setOpaque(false);
        chkRanapParamedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRanapParamedisActionPerformed(evt);
            }
        });
        FormInput2.add(chkRanapParamedis);
        chkRanapParamedis.setBounds(323, 72, 120, 23);

        chkRalanDokter.setSelected(true);
        chkRalanDokter.setText("Ralan Dokter +");
        chkRalanDokter.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRalanDokter.setName("chkRalanDokter"); // NOI18N
        chkRalanDokter.setOpaque(false);
        chkRalanDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRalanDokterActionPerformed(evt);
            }
        });
        FormInput2.add(chkRalanDokter);
        chkRalanDokter.setBounds(438, 72, 99, 23);

        chkRalanParamedis.setSelected(true);
        chkRalanParamedis.setText("Ralan Paramedis +");
        chkRalanParamedis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRalanParamedis.setName("chkRalanParamedis"); // NOI18N
        chkRalanParamedis.setOpaque(false);
        chkRalanParamedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRalanParamedisActionPerformed(evt);
            }
        });
        FormInput2.add(chkRalanParamedis);
        chkRalanParamedis.setBounds(225, 102, 118, 23);

        chkTambahan.setSelected(true);
        chkTambahan.setText("Tambahan +");
        chkTambahan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkTambahan.setName("chkTambahan"); // NOI18N
        chkTambahan.setOpaque(false);
        chkTambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTambahanActionPerformed(evt);
            }
        });
        FormInput2.add(chkTambahan);
        chkTambahan.setBounds(336, 102, 87, 23);

        chkKamar.setSelected(true);
        chkKamar.setText("Kamar +");
        chkKamar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkKamar.setName("chkKamar"); // NOI18N
        chkKamar.setOpaque(false);
        chkKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKamarActionPerformed(evt);
            }
        });
        FormInput2.add(chkKamar);
        chkKamar.setBounds(418, 102, 67, 23);

        chkRegistrasi.setSelected(true);
        chkRegistrasi.setText("Registrasi +");
        chkRegistrasi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRegistrasi.setName("chkRegistrasi"); // NOI18N
        chkRegistrasi.setOpaque(false);
        chkRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRegistrasiActionPerformed(evt);
            }
        });
        FormInput2.add(chkRegistrasi);
        chkRegistrasi.setBounds(480, 102, 90, 23);

        chkHarian.setSelected(true);
        chkHarian.setText("Harian +");
        chkHarian.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkHarian.setName("chkHarian"); // NOI18N
        chkHarian.setOpaque(false);
        chkHarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHarianActionPerformed(evt);
            }
        });
        FormInput2.add(chkHarian);
        chkHarian.setBounds(225, 132, 69, 23);

        chkResepPulang.setSelected(true);
        chkResepPulang.setText("Resep Pulang -");
        chkResepPulang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkResepPulang.setName("chkResepPulang"); // NOI18N
        chkResepPulang.setOpaque(false);
        chkResepPulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkResepPulangActionPerformed(evt);
            }
        });
        FormInput2.add(chkResepPulang);
        chkResepPulang.setBounds(288, 132, 100, 23);

        chkRetur.setSelected(true);
        chkRetur.setText("Retur Obat -");
        chkRetur.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRetur.setName("chkRetur"); // NOI18N
        chkRetur.setOpaque(false);
        chkRetur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkReturActionPerformed(evt);
            }
        });
        FormInput2.add(chkRetur);
        chkRetur.setBounds(381, 132, 87, 23);

        chkPotongan.setSelected(true);
        chkPotongan.setText("Potongan");
        chkPotongan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkPotongan.setName("chkPotongan"); // NOI18N
        chkPotongan.setOpaque(false);
        chkPotongan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPotonganActionPerformed(evt);
            }
        });
        FormInput2.add(chkPotongan);
        chkPotongan.setBounds(463, 132, 78, 23);

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("% X  (");
        jLabel35.setName("jLabel35"); // NOI18N
        FormInput2.add(jLabel35);
        jLabel35.setBounds(194, 42, 35, 23);

        PanelInput2.add(FormInput2, java.awt.BorderLayout.CENTER);

        internalFrame3.add(PanelInput2, java.awt.BorderLayout.PAGE_START);

        TabSetting.addTab(".: Biaya Service Rawat Inap Non Piutang ", internalFrame3);

        internalFrame4.setBackground(new java.awt.Color(235, 255, 235));
        internalFrame4.setBorder(null);
        internalFrame4.setName("internalFrame4"); // NOI18N
        internalFrame4.setLayout(new java.awt.BorderLayout(1, 1));

        Scroll2.setName("Scroll2"); // NOI18N
        Scroll2.setOpaque(true);

        tbAdmin3.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        tbAdmin3.setName("tbAdmin3"); // NOI18N
        tbAdmin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAdmin3MouseClicked(evt);
            }
        });
        tbAdmin3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbAdmin3KeyPressed(evt);
            }
        });
        Scroll2.setViewportView(tbAdmin3);

        internalFrame4.add(Scroll2, java.awt.BorderLayout.CENTER);

        PanelInput3.setName("PanelInput3"); // NOI18N
        PanelInput3.setOpaque(false);
        PanelInput3.setLayout(new java.awt.BorderLayout(1, 1));

        ChkInput3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/143.png"))); // NOI18N
        ChkInput3.setMnemonic('I');
        ChkInput3.setText(".: Input Data");
        ChkInput3.setToolTipText("Alt+I");
        ChkInput3.setBorderPainted(true);
        ChkInput3.setBorderPaintedFlat(true);
        ChkInput3.setFocusable(false);
        ChkInput3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ChkInput3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ChkInput3.setName("ChkInput3"); // NOI18N
        ChkInput3.setPreferredSize(new java.awt.Dimension(192, 20));
        ChkInput3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/143.png"))); // NOI18N
        ChkInput3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/145.png"))); // NOI18N
        ChkInput3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/145.png"))); // NOI18N
        ChkInput3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkInput3ActionPerformed(evt);
            }
        });
        PanelInput3.add(ChkInput3, java.awt.BorderLayout.PAGE_END);

        FormInput3.setName("FormInput3"); // NOI18N
        FormInput3.setPreferredSize(new java.awt.Dimension(44, 165));
        FormInput3.setLayout(null);

        jLabel32.setText("Nama Service/Administrasi :");
        jLabel32.setName("jLabel32"); // NOI18N
        FormInput3.add(jLabel32);
        jLabel32.setBounds(0, 12, 150, 23);

        NamaService1.setHighlighter(null);
        NamaService1.setName("NamaService1"); // NOI18N
        NamaService1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaService1ActionPerformed(evt);
            }
        });
        NamaService1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NamaService1KeyPressed(evt);
            }
        });
        FormInput3.add(NamaService1);
        NamaService1.setBounds(152, 12, 370, 23);

        jLabel36.setText("Besar Biaya :");
        jLabel36.setName("jLabel36"); // NOI18N
        FormInput3.add(jLabel36);
        jLabel36.setBounds(0, 42, 150, 23);

        BesarBiaya1.setHighlighter(null);
        BesarBiaya1.setName("BesarBiaya1"); // NOI18N
        BesarBiaya1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BesarBiaya1ActionPerformed(evt);
            }
        });
        BesarBiaya1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BesarBiaya1KeyPressed(evt);
            }
        });
        FormInput3.add(BesarBiaya1);
        BesarBiaya1.setBounds(152, 42, 40, 23);

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText(")");
        jLabel37.setName("jLabel37"); // NOI18N
        FormInput3.add(jLabel37);
        jLabel37.setBounds(530, 132, 35, 23);

        chkLaborat1.setSelected(true);
        chkLaborat1.setText("Laboratorium +");
        chkLaborat1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkLaborat1.setName("chkLaborat1"); // NOI18N
        chkLaborat1.setOpaque(false);
        chkLaborat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLaborat1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkLaborat1);
        chkLaborat1.setBounds(225, 42, 101, 23);

        chkRadiologi1.setSelected(true);
        chkRadiologi1.setText("Radiologi +");
        chkRadiologi1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRadiologi1.setName("chkRadiologi1"); // NOI18N
        chkRadiologi1.setOpaque(false);
        chkRadiologi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRadiologi1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkRadiologi1);
        chkRadiologi1.setBounds(320, 42, 80, 23);

        chkOperasi1.setSelected(true);
        chkOperasi1.setText("Operasi +");
        chkOperasi1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkOperasi1.setName("chkOperasi1"); // NOI18N
        chkOperasi1.setOpaque(false);
        chkOperasi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOperasi1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkOperasi1);
        chkOperasi1.setBounds(395, 42, 74, 23);

        chkObat1.setSelected(true);
        chkObat1.setText("Obat +");
        chkObat1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkObat1.setName("chkObat1"); // NOI18N
        chkObat1.setOpaque(false);
        chkObat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkObat1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkObat1);
        chkObat1.setBounds(464, 42, 74, 23);

        chkRanapDokter1.setSelected(true);
        chkRanapDokter1.setText("Ranap Dokter +");
        chkRanapDokter1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRanapDokter1.setName("chkRanapDokter1"); // NOI18N
        chkRanapDokter1.setOpaque(false);
        chkRanapDokter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRanapDokter1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkRanapDokter1);
        chkRanapDokter1.setBounds(225, 72, 105, 23);

        chkRanapParamedis1.setSelected(true);
        chkRanapParamedis1.setText("Ranap Paramedis +");
        chkRanapParamedis1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRanapParamedis1.setName("chkRanapParamedis1"); // NOI18N
        chkRanapParamedis1.setOpaque(false);
        chkRanapParamedis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRanapParamedis1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkRanapParamedis1);
        chkRanapParamedis1.setBounds(323, 72, 120, 23);

        chkRalanDokter1.setSelected(true);
        chkRalanDokter1.setText("Ralan Dokter +");
        chkRalanDokter1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRalanDokter1.setName("chkRalanDokter1"); // NOI18N
        chkRalanDokter1.setOpaque(false);
        chkRalanDokter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRalanDokter1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkRalanDokter1);
        chkRalanDokter1.setBounds(438, 72, 99, 23);

        chkRalanParamedis1.setSelected(true);
        chkRalanParamedis1.setText("Ralan Paramedis +");
        chkRalanParamedis1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRalanParamedis1.setName("chkRalanParamedis1"); // NOI18N
        chkRalanParamedis1.setOpaque(false);
        chkRalanParamedis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRalanParamedis1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkRalanParamedis1);
        chkRalanParamedis1.setBounds(225, 102, 118, 23);

        chkTambahan1.setSelected(true);
        chkTambahan1.setText("Tambahan +");
        chkTambahan1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkTambahan1.setName("chkTambahan1"); // NOI18N
        chkTambahan1.setOpaque(false);
        chkTambahan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTambahan1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkTambahan1);
        chkTambahan1.setBounds(336, 102, 87, 23);

        chkKamar1.setSelected(true);
        chkKamar1.setText("Kamar +");
        chkKamar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkKamar1.setName("chkKamar1"); // NOI18N
        chkKamar1.setOpaque(false);
        chkKamar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKamar1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkKamar1);
        chkKamar1.setBounds(418, 102, 67, 23);

        chkRegistrasi1.setSelected(true);
        chkRegistrasi1.setText("Registrasi +");
        chkRegistrasi1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRegistrasi1.setName("chkRegistrasi1"); // NOI18N
        chkRegistrasi1.setOpaque(false);
        chkRegistrasi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRegistrasi1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkRegistrasi1);
        chkRegistrasi1.setBounds(480, 102, 90, 23);

        chkHarian1.setSelected(true);
        chkHarian1.setText("Harian +");
        chkHarian1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkHarian1.setName("chkHarian1"); // NOI18N
        chkHarian1.setOpaque(false);
        chkHarian1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHarian1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkHarian1);
        chkHarian1.setBounds(225, 132, 69, 23);

        chkResepPulang1.setSelected(true);
        chkResepPulang1.setText("Resep Pulang -");
        chkResepPulang1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkResepPulang1.setName("chkResepPulang1"); // NOI18N
        chkResepPulang1.setOpaque(false);
        chkResepPulang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkResepPulang1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkResepPulang1);
        chkResepPulang1.setBounds(288, 132, 100, 23);

        chkRetur1.setSelected(true);
        chkRetur1.setText("Retur Obat -");
        chkRetur1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRetur1.setName("chkRetur1"); // NOI18N
        chkRetur1.setOpaque(false);
        chkRetur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRetur1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkRetur1);
        chkRetur1.setBounds(381, 132, 87, 23);

        chkPotongan1.setSelected(true);
        chkPotongan1.setText("Potongan");
        chkPotongan1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkPotongan1.setName("chkPotongan1"); // NOI18N
        chkPotongan1.setOpaque(false);
        chkPotongan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPotongan1ActionPerformed(evt);
            }
        });
        FormInput3.add(chkPotongan1);
        chkPotongan1.setBounds(463, 132, 78, 23);

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("% X  (");
        jLabel38.setName("jLabel38"); // NOI18N
        FormInput3.add(jLabel38);
        jLabel38.setBounds(194, 42, 35, 23);

        PanelInput3.add(FormInput3, java.awt.BorderLayout.CENTER);

        internalFrame4.add(PanelInput3, java.awt.BorderLayout.PAGE_START);

        TabSetting.addTab(".: Biaya Service Rawat Inap Piutang ", internalFrame4);

        internalFrame1.add(TabSetting, java.awt.BorderLayout.CENTER);

        getContentPane().add(internalFrame1, java.awt.BorderLayout.CENTER);
        internalFrame1.getAccessibleContext().setAccessibleName("::[ Setup Terhitung Kamar Inap ]::");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        if(TabSetting.getSelectedIndex()==0){
            if(NotaRalan.getText().trim().equals("")||KwitansiRalan.getText().trim().equals("")||Nota1Ranap.getText().trim().equals("")||Nota2Ranap.getText().trim().equals("")||
                    KwitansiRanap.getText().trim().equals("")||NotaApotek.getText().trim().equals("")||NotaLab.getText().trim().equals("")){
                Valid.textKosong(NotaRalan,"Semua field");
            }else if(tabMode.getRowCount()==0){
                if(Sequel.menyimpantf("set_nota","'"+NotaRalan.getText()+"','"+KwitansiRalan.getText()+"','"+Nota1Ranap.getText()+"',"+
                        "'"+Nota2Ranap.getText()+"','"+KwitansiRanap.getText()+"','"+NotaApotek.getText()+"','"+NotaLab.getText()+"',"+
                        "'"+cmbYesRalan.getSelectedItem()+"','"+cmbYesRanap.getSelectedItem()+"','"+cmbYesRincianRalan.getSelectedItem()+"',"+
                        "'"+cmbYesRincianRanap.getSelectedItem()+"','"+cmbYesCentangDokterRalan.getSelectedItem()+"',"+
                        "'"+cmbYesCentangDokterRanap.getSelectedItem()+"','"+cmbYesAdministrasiRanap.getSelectedItem()+"',"+
                        "'"+cmbYesRincianOperasi.getSelectedItem()+"','"+cmbYesPPNRalan.getSelectedItem()+"','"+cmbYesPPNRanap.getSelectedItem()+"',"+
                        "'"+cmbYesTombolNotaRalan.getSelectedItem()+"','"+cmbYesTombolNotaRanap.getSelectedItem()+"','"+cmbYesTombolPenjualan.getSelectedItem()+"',"+
                        "'"+cmbYesTombolPenyerahanDarah.getSelectedItem()+"'","Set Nota")==true){
                    tampil();
                    emptTeks();
                }                
            }else if(tabMode.getRowCount()>0){
                JOptionPane.showMessageDialog(null,"Maaf, Hanya diijinkan satu Set Nota, Kwitansi, Verifikasi Penjualan...!!!!");
                NotaRalan.requestFocus();
            }
        }else if(TabSetting.getSelectedIndex()==1){
            if(NamaService.getText().trim().equals("")){
                Valid.textKosong(NamaService,"Nama Service");
            }else if(BesarBiaya.getText().trim().equals("")){
                Valid.textKosong(NamaService,"Nama Service");
            }else if((chkLaborat.isSelected()==false)&&(chkRadiologi.isSelected()==false)&&
                    (chkOperasi.isSelected()==false)&&(chkObat.isSelected()==false)&&
                    (chkRanapDokter.isSelected()==false)&&(chkRanapParamedis.isSelected()==false)&&
                    (chkRalanDokter.isSelected()==false)&&(chkRalanParamedis.isSelected()==false)&&
                    (chkTambahan.isSelected()==false)&&(chkPotongan.isSelected()==false)&&
                    (chkKamar.isSelected()==false)&&(chkRegistrasi.isSelected()==false)&&
                    (chkHarian.isSelected()==false)&&(chkRetur.isSelected()==false)&&
                    (chkResepPulang.isSelected()==false)){
                JOptionPane.showMessageDialog(null,"Maaf, Minimal harus ada 1 pilihan biaya yang dipakai ...!!!!");
                chkLaborat.requestFocus();
            }else if(tabMode2.getRowCount()==0){
                laborat="No";radiologi="No";operasi="No";obat="No";
                ranap_dokter="No";ranap_paramedis="No";ralan_dokter="No";
                ralan_paramedis="No";tambahan="No";potongan="No";
                kamar="No";registrasi="No";harian="No";retur_Obat="No";resep_Pulang="No";
                if(chkLaborat.isSelected()==true){
		    laborat="Yes";
                }if(chkRadiologi.isSelected()==true){
                    radiologi="Yes";
                }if(chkOperasi.isSelected()==true){
                    operasi="Yes";
                }if(chkObat.isSelected()==true){
                    obat="Yes";
                }if(chkRanapDokter.isSelected()==true){
                    ranap_dokter="Yes";
                }if(chkRanapParamedis.isSelected()==true){
                    ranap_paramedis="Yes";
                }if(chkRalanDokter.isSelected()==true){
                    ralan_dokter="Yes";
                }if(chkRalanParamedis.isSelected()==true){
                    ralan_paramedis="Yes";
                }if(chkTambahan.isSelected()==true){
                    tambahan="Yes";
                }if(chkPotongan.isSelected()==true){
                    potongan="Yes";
                }if(chkKamar.isSelected()==true){
                    kamar="Yes";
                }if(chkRegistrasi.isSelected()==true){
                    registrasi="Yes";
                }if(chkHarian.isSelected()==true){
                    harian="Yes";
                }if(chkRetur.isSelected()==true){
                    retur_Obat="Yes";
                }if(chkResepPulang.isSelected()==true){
                    resep_Pulang="Yes";
                }
                if(Sequel.menyimpantf("set_service_ranap","?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?","Data",17,new String[]{
                    NamaService.getText(),BesarBiaya.getText(),laborat,radiologi,operasi,obat,ranap_dokter,ranap_paramedis,
                    ralan_dokter,ralan_paramedis,tambahan,potongan,kamar,registrasi,harian,retur_Obat,resep_Pulang
                })==true){
                    tampil2();
                    emptTeks2();
                }
            }else if(tabMode2.getRowCount()>0){
                JOptionPane.showMessageDialog(null,"Maaf, Hanya diijinkan satu Set Biaya Service Rawat Inap...!!!!");
                NamaService.requestFocus();
            }
        }else if(TabSetting.getSelectedIndex()==2){
            if(NamaService1.getText().trim().equals("")){
                Valid.textKosong(NamaService1,"Nama Service");
            }else if(BesarBiaya1.getText().trim().equals("")){
                Valid.textKosong(NamaService1,"Nama Service");
            }else if((chkLaborat1.isSelected()==false)&&(chkRadiologi1.isSelected()==false)&&
                    (chkOperasi1.isSelected()==false)&&(chkObat1.isSelected()==false)&&
                    (chkRanapDokter1.isSelected()==false)&&(chkRanapParamedis1.isSelected()==false)&&
                    (chkRalanDokter1.isSelected()==false)&&(chkRalanParamedis1.isSelected()==false)&&
                    (chkTambahan1.isSelected()==false)&&(chkPotongan1.isSelected()==false)&&
                    (chkKamar1.isSelected()==false)&&(chkRegistrasi1.isSelected()==false)&&
                    (chkHarian1.isSelected()==false)&&(chkRetur1.isSelected()==false)&&
                    (chkResepPulang1.isSelected()==false)){
                JOptionPane.showMessageDialog(null,"Maaf, Minimal harus ada 1 pilihan biaya yang dipakai ...!!!!");
                chkLaborat.requestFocus();
            }else if(tabMode3.getRowCount()==0){
                laborat="No";radiologi="No";operasi="No";obat="No";
                ranap_dokter="No";ranap_paramedis="No";ralan_dokter="No";
                ralan_paramedis="No";tambahan="No";potongan="No";
                kamar="No";registrasi="No";harian="No";retur_Obat="No";resep_Pulang="No";
                if(chkLaborat1.isSelected()==true){
		    laborat="Yes";
                }if(chkRadiologi1.isSelected()==true){
                    radiologi="Yes";
                }if(chkOperasi1.isSelected()==true){
                    operasi="Yes";
                }if(chkObat1.isSelected()==true){
                    obat="Yes";
                }if(chkRanapDokter1.isSelected()==true){
                    ranap_dokter="Yes";
                }if(chkRanapParamedis1.isSelected()==true){
                    ranap_paramedis="Yes";
                }if(chkRalanDokter1.isSelected()==true){
                    ralan_dokter="Yes";
                }if(chkRalanParamedis1.isSelected()==true){
                    ralan_paramedis="Yes";
                }if(chkTambahan1.isSelected()==true){
                    tambahan="Yes";
                }if(chkPotongan1.isSelected()==true){
                    potongan="Yes";
                }if(chkKamar1.isSelected()==true){
                    kamar="Yes";
                }if(chkRegistrasi1.isSelected()==true){
                    registrasi="Yes";
                }if(chkHarian1.isSelected()==true){
                    harian="Yes";
                }if(chkRetur1.isSelected()==true){
                    retur_Obat="Yes";
                }if(chkResepPulang1.isSelected()==true){
                    resep_Pulang="Yes";
                }
                if(Sequel.menyimpantf("set_service_ranap_piutang","?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?","Data",17,new String[]{
                    NamaService1.getText(),BesarBiaya1.getText(),laborat,radiologi,operasi,obat,ranap_dokter,ranap_paramedis,
                    ralan_dokter,ralan_paramedis,tambahan,potongan,kamar,registrasi,harian,retur_Obat,resep_Pulang
                })==true){
                    tampil3();
                    emptTeks3();
                }
            }else if(tabMode3.getRowCount()>0){
                JOptionPane.showMessageDialog(null,"Maaf, Hanya diijinkan satu Set Biaya Service Rawat Inap...!!!!");
                NamaService.requestFocus();
            }
        }
            
}//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnSimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnSimpanKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnSimpanActionPerformed(null);
        }else{
            Valid.pindah(evt,cmbYesTombolPenyerahanDarah,BtnBatal);
        }
}//GEN-LAST:event_BtnSimpanKeyPressed

    private void BtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalActionPerformed
        if(TabSetting.getSelectedIndex()==0){
            ChkInput.setSelected(true);
            isForm(); 
            emptTeks();
        }else if(TabSetting.getSelectedIndex()==1){
            ChkInput2.setSelected(true);
            isForm2(); 
            emptTeks2();
        }else if(TabSetting.getSelectedIndex()==2){
            ChkInput3.setSelected(true);
            isForm3(); 
            emptTeks3();
        }
        
}//GEN-LAST:event_BtnBatalActionPerformed

    private void BtnBatalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnBatalKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            emptTeks();
        }else{Valid.pindah(evt, BtnSimpan, BtnHapus);}
}//GEN-LAST:event_BtnBatalKeyPressed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        if(TabSetting.getSelectedIndex()==0){
            if(tabMode.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Maaf, data sudah habis...!!!!");
                NotaRalan.requestFocus();
            }else if(NotaRalan.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null,"Maaf, Gagal menghapus. Pilih dulu data yang mau dihapus.\nKlik data pada table untuk memilih...!!!!");
            }else if(!NotaRalan.getText().trim().equals("")){
                Sequel.queryu("delete from set_nota");
                tampil();
                emptTeks();
            }
        }else if(TabSetting.getSelectedIndex()==1){
            if(tabMode2.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Maaf, data sudah habis...!!!!");
                NamaService.requestFocus();
            }else if(NamaService.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null,"Maaf, Gagal menghapus. Pilih dulu data yang mau dihapus.\nKlik data pada table untuk memilih...!!!!");
            }else if(!NamaService.getText().trim().equals("")){
                Sequel.queryu("delete from set_service_ranap");
                tampil2();
                emptTeks2();
            }
        }else if(TabSetting.getSelectedIndex()==2){
            if(tabMode3.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Maaf, data sudah habis...!!!!");
                NamaService1.requestFocus();
            }else if(NamaService1.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null,"Maaf, Gagal menghapus. Pilih dulu data yang mau dihapus.\nKlik data pada table untuk memilih...!!!!");
            }else if(!NamaService1.getText().trim().equals("")){
                Sequel.queryu("delete from set_service_ranap_piutang");
                tampil3();
                emptTeks3();
            }
        }
            
}//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnHapusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnHapusKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnHapusActionPerformed(null);
        }else{
            Valid.pindah(evt, BtnBatal, BtnKeluar);
        }
}//GEN-LAST:event_BtnHapusKeyPressed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        if(tabMode.getRowCount()==0){
            JOptionPane.showMessageDialog(null,"Maaf, data jam minimal tidak boleh kosong ...!!!!");
            NotaRalan.requestFocus();
        }else if(! (tabMode.getRowCount()==0)) {
            dispose();
        }
}//GEN-LAST:event_BtnKeluarActionPerformed

    private void BtnKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnKeluarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            dispose();
        }else{Valid.pindah(evt,BtnBatal,BtnKeluar);}
}//GEN-LAST:event_BtnKeluarKeyPressed

    private void tbAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAdminMouseClicked
        if(tabMode.getRowCount()!=0){
            try {
                getData();
            } catch (java.lang.NullPointerException e) {
            }
        }
}//GEN-LAST:event_tbAdminMouseClicked

    private void tbAdminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAdminKeyPressed
        if(tabMode.getRowCount()!=0){
            if((evt.getKeyCode()==KeyEvent.VK_ENTER)||(evt.getKeyCode()==KeyEvent.VK_UP)||(evt.getKeyCode()==KeyEvent.VK_DOWN)){
                try {
                    getData();
                } catch (java.lang.NullPointerException e) {
                }
            }
        }
}//GEN-LAST:event_tbAdminKeyPressed

private void NotaRalanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NotaRalanKeyPressed
     Valid.pindah(evt, BtnKeluar,KwitansiRalan);

}//GEN-LAST:event_NotaRalanKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       tampil();
    }//GEN-LAST:event_formWindowOpened

    private void cmbYesRalanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesRalanKeyPressed
        Valid.pindah(evt, cmbYesCentangDokterRanap,cmbYesRanap);
    }//GEN-LAST:event_cmbYesRalanKeyPressed

    private void KwitansiRalanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KwitansiRalanKeyPressed
        Valid.pindah(evt, NotaRalan,Nota1Ranap);
    }//GEN-LAST:event_KwitansiRalanKeyPressed

    private void Nota1RanapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nota1RanapKeyPressed
        Valid.pindah(evt, KwitansiRalan,Nota2Ranap);
    }//GEN-LAST:event_Nota1RanapKeyPressed

    private void Nota2RanapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nota2RanapKeyPressed
        Valid.pindah(evt, Nota1Ranap,KwitansiRanap);
    }//GEN-LAST:event_Nota2RanapKeyPressed

    private void KwitansiRanapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KwitansiRanapKeyPressed
        Valid.pindah(evt, Nota2Ranap,NotaApotek);
    }//GEN-LAST:event_KwitansiRanapKeyPressed

    private void NotaApotekKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NotaApotekKeyPressed
        Valid.pindah(evt, KwitansiRanap,NotaLab);
    }//GEN-LAST:event_NotaApotekKeyPressed

    private void NotaLabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NotaLabKeyPressed
        Valid.pindah(evt, NotaApotek,cmbYesRincianOperasi);
    }//GEN-LAST:event_NotaLabKeyPressed

    private void cmbYesRanapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesRanapKeyPressed
        Valid.pindah(evt, cmbYesRalan,cmbYesRincianRalan);
    }//GEN-LAST:event_cmbYesRanapKeyPressed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        if(TabSetting.getSelectedIndex()==0){
            if(NotaRalan.getText().trim().equals("")||KwitansiRalan.getText().trim().equals("")||Nota1Ranap.getText().trim().equals("")||Nota2Ranap.getText().trim().equals("")||
                    KwitansiRanap.getText().trim().equals("")||NotaApotek.getText().trim().equals("")||NotaLab.getText().trim().equals("")){
                Valid.textKosong(NotaRalan,"Semua field");
            }else{
                Sequel.queryu("delete from set_nota");
                if(Sequel.menyimpantf("set_nota","'"+NotaRalan.getText()+"','"+KwitansiRalan.getText()+"','"+Nota1Ranap.getText()+"',"+
                        "'"+Nota2Ranap.getText()+"','"+KwitansiRanap.getText()+"','"+NotaApotek.getText()+"','"+NotaLab.getText()+"',"+
                        "'"+cmbYesRalan.getSelectedItem()+"','"+cmbYesRanap.getSelectedItem()+"','"+cmbYesRincianRalan.getSelectedItem()+"',"+
                        "'"+cmbYesRincianRanap.getSelectedItem()+"','"+cmbYesCentangDokterRalan.getSelectedItem()+"',"+
                        "'"+cmbYesCentangDokterRanap.getSelectedItem()+"','"+cmbYesAdministrasiRanap.getSelectedItem()+"',"+
                        "'"+cmbYesRincianOperasi.getSelectedItem()+"','"+cmbYesPPNRalan.getSelectedItem()+"','"+cmbYesPPNRanap.getSelectedItem()+"',"+
                        "'"+cmbYesTombolNotaRalan.getSelectedItem()+"','"+cmbYesTombolNotaRanap.getSelectedItem()+"','"+cmbYesTombolPenjualan.getSelectedItem()+"',"+
                        "'"+cmbYesTombolPenyerahanDarah.getSelectedItem()+"'","Setting")==true){
                    tampil();
                    emptTeks();
                }
            }
        }else if(TabSetting.getSelectedIndex()==1){
            if(NamaService.getText().trim().equals("")){
                Valid.textKosong(NamaService,"Nama Service");
            }else if(BesarBiaya.getText().trim().equals("")){
                Valid.textKosong(NamaService,"Nama Service");
            }else if((chkLaborat.isSelected()==false)&&(chkRadiologi.isSelected()==false)&&
                    (chkOperasi.isSelected()==false)&&(chkObat.isSelected()==false)&&
                    (chkRanapDokter.isSelected()==false)&&(chkRanapParamedis.isSelected()==false)&&
                    (chkRalanDokter.isSelected()==false)&&(chkRalanParamedis.isSelected()==false)&&
                    (chkTambahan.isSelected()==false)&&(chkPotongan.isSelected()==false)&&
                    (chkKamar.isSelected()==false)&&(chkRegistrasi.isSelected()==false)&&
                    (chkHarian.isSelected()==false)&&(chkRetur.isSelected()==false)&&
                    (chkResepPulang.isSelected()==false)){
                JOptionPane.showMessageDialog(null,"Maaf, Minimal harus ada 1 pilihan biaya yang dipakai ...!!!!");
                chkLaborat.requestFocus();
            }else{
                laborat="No";radiologi="No";operasi="No";obat="No";
                ranap_dokter="No";ranap_paramedis="No";ralan_dokter="No";
                ralan_paramedis="No";tambahan="No";potongan="No";
                kamar="No";registrasi="No";harian="No";retur_Obat="No";resep_Pulang="No";
                if(chkLaborat.isSelected()==true){
		    laborat="Yes";
                }if(chkRadiologi.isSelected()==true){
                    radiologi="Yes";
                }if(chkOperasi.isSelected()==true){
                    operasi="Yes";
                }if(chkObat.isSelected()==true){
                    obat="Yes";
                }if(chkRanapDokter.isSelected()==true){
                    ranap_dokter="Yes";
                }if(chkRanapParamedis.isSelected()==true){
                    ranap_paramedis="Yes";
                }if(chkRalanDokter.isSelected()==true){
                    ralan_dokter="Yes";
                }if(chkRalanParamedis.isSelected()==true){
                    ralan_paramedis="Yes";
                }if(chkTambahan.isSelected()==true){
                    tambahan="Yes";
                }if(chkPotongan.isSelected()==true){
                    potongan="Yes";
                }if(chkKamar.isSelected()==true){
                    kamar="Yes";
                }if(chkRegistrasi.isSelected()==true){
                    registrasi="Yes";
                }if(chkHarian.isSelected()==true){
                    harian="Yes";
                }if(chkRetur.isSelected()==true){
                    retur_Obat="Yes";
                }if(chkResepPulang.isSelected()==true){
                    resep_Pulang="Yes";
                }
                Sequel.queryu("delete from set_service_ranap");
                if(Sequel.menyimpantf("set_service_ranap","?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?","Data",17,new String[]{
                    NamaService.getText(),BesarBiaya.getText(),laborat,radiologi,operasi,obat,ranap_dokter,ranap_paramedis,
                    ralan_dokter,ralan_paramedis,tambahan,potongan,kamar,registrasi,harian,retur_Obat,resep_Pulang
                })==true){
                    tampil2();
                    emptTeks2();
                }
            }
        }else if(TabSetting.getSelectedIndex()==2){
            if(NamaService1.getText().trim().equals("")){
                Valid.textKosong(NamaService1,"Nama Service");
            }else if(BesarBiaya1.getText().trim().equals("")){
                Valid.textKosong(NamaService1,"Nama Service");
            }else if((chkLaborat1.isSelected()==false)&&(chkRadiologi1.isSelected()==false)&&
                    (chkOperasi1.isSelected()==false)&&(chkObat1.isSelected()==false)&&
                    (chkRanapDokter1.isSelected()==false)&&(chkRanapParamedis1.isSelected()==false)&&
                    (chkRalanDokter1.isSelected()==false)&&(chkRalanParamedis1.isSelected()==false)&&
                    (chkTambahan1.isSelected()==false)&&(chkPotongan1.isSelected()==false)&&
                    (chkKamar1.isSelected()==false)&&(chkRegistrasi1.isSelected()==false)&&
                    (chkHarian1.isSelected()==false)&&(chkRetur1.isSelected()==false)&&
                    (chkResepPulang1.isSelected()==false)){
                JOptionPane.showMessageDialog(null,"Maaf, Minimal harus ada 1 pilihan biaya yang dipakai ...!!!!");
                chkLaborat.requestFocus();
            }else{
                laborat="No";radiologi="No";operasi="No";obat="No";
                ranap_dokter="No";ranap_paramedis="No";ralan_dokter="No";
                ralan_paramedis="No";tambahan="No";potongan="No";
                kamar="No";registrasi="No";harian="No";retur_Obat="No";resep_Pulang="No";
                if(chkLaborat1.isSelected()==true){
		    laborat="Yes";
                }if(chkRadiologi1.isSelected()==true){
                    radiologi="Yes";
                }if(chkOperasi1.isSelected()==true){
                    operasi="Yes";
                }if(chkObat1.isSelected()==true){
                    obat="Yes";
                }if(chkRanapDokter1.isSelected()==true){
                    ranap_dokter="Yes";
                }if(chkRanapParamedis1.isSelected()==true){
                    ranap_paramedis="Yes";
                }if(chkRalanDokter1.isSelected()==true){
                    ralan_dokter="Yes";
                }if(chkRalanParamedis1.isSelected()==true){
                    ralan_paramedis="Yes";
                }if(chkTambahan1.isSelected()==true){
                    tambahan="Yes";
                }if(chkPotongan1.isSelected()==true){
                    potongan="Yes";
                }if(chkKamar1.isSelected()==true){
                    kamar="Yes";
                }if(chkRegistrasi1.isSelected()==true){
                    registrasi="Yes";
                }if(chkHarian1.isSelected()==true){
                    harian="Yes";
                }if(chkRetur1.isSelected()==true){
                    retur_Obat="Yes";
                }if(chkResepPulang1.isSelected()==true){
                    resep_Pulang="Yes";
                }
                Sequel.queryu("delete from set_service_ranap_piutang");
                if(Sequel.menyimpantf("set_service_ranap_piutang","?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?","Data",17,new String[]{
                    NamaService1.getText(),BesarBiaya1.getText(),laborat,radiologi,operasi,obat,ranap_dokter,ranap_paramedis,
                    ralan_dokter,ralan_paramedis,tambahan,potongan,kamar,registrasi,harian,retur_Obat,resep_Pulang
                })==true){
                    tampil3();
                    emptTeks3();
                }
            }
        }
            
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnEditKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnEditActionPerformed(null);
        }else{
            Valid.pindah(evt, BtnHapus, BtnKeluar);
        }
    }//GEN-LAST:event_BtnEditKeyPressed

    private void cmbYesRincianRalanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesRincianRalanKeyPressed
        Valid.pindah(evt, cmbYesRanap,cmbYesRincianRanap);
    }//GEN-LAST:event_cmbYesRincianRalanKeyPressed

    private void cmbYesRincianRanapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesRincianRanapKeyPressed
        Valid.pindah(evt, cmbYesRincianRalan,cmbYesCentangDokterRalan);
    }//GEN-LAST:event_cmbYesRincianRanapKeyPressed

    private void cmbYesCentangDokterRalanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesCentangDokterRalanKeyPressed
        Valid.pindah(evt, cmbYesAdministrasiRanap,cmbYesCentangDokterRanap);
    }//GEN-LAST:event_cmbYesCentangDokterRalanKeyPressed

    private void cmbYesCentangDokterRanapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesCentangDokterRanapKeyPressed
        Valid.pindah(evt, cmbYesCentangDokterRalan,cmbYesRalan);
    }//GEN-LAST:event_cmbYesCentangDokterRanapKeyPressed

    private void cmbYesAdministrasiRanapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesAdministrasiRanapKeyPressed
        Valid.pindah(evt, cmbYesRincianOperasi,cmbYesCentangDokterRalan);
    }//GEN-LAST:event_cmbYesAdministrasiRanapKeyPressed

    private void cmbYesRincianOperasiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesRincianOperasiKeyPressed
        Valid.pindah(evt, NotaLab,cmbYesAdministrasiRanap);
    }//GEN-LAST:event_cmbYesRincianOperasiKeyPressed

    private void cmbYesPPNRalanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesPPNRalanKeyPressed
        Valid.pindah(evt, cmbYesCentangDokterRanap,cmbYesPPNRanap);
    }//GEN-LAST:event_cmbYesPPNRalanKeyPressed

    private void cmbYesPPNRanapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesPPNRanapKeyPressed
        Valid.pindah(evt, cmbYesPPNRalan,cmbYesTombolNotaRalan);
    }//GEN-LAST:event_cmbYesPPNRanapKeyPressed

    private void ChkInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkInputActionPerformed
        isForm();
    }//GEN-LAST:event_ChkInputActionPerformed

    private void cmbYesTombolNotaRalanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesTombolNotaRalanKeyPressed
        Valid.pindah(evt, cmbYesPPNRanap,cmbYesTombolNotaRanap);
    }//GEN-LAST:event_cmbYesTombolNotaRalanKeyPressed

    private void cmbYesTombolNotaRanapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesTombolNotaRanapKeyPressed
        Valid.pindah(evt, cmbYesTombolNotaRalan,cmbYesTombolPenjualan);
    }//GEN-LAST:event_cmbYesTombolNotaRanapKeyPressed

    private void cmbYesTombolPenjualanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesTombolPenjualanKeyPressed
        Valid.pindah(evt, cmbYesTombolNotaRanap,cmbYesTombolPenyerahanDarah);
    }//GEN-LAST:event_cmbYesTombolPenjualanKeyPressed

    private void TabSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabSettingMouseClicked
        if(TabSetting.getSelectedIndex()==0){
            tampil();
        }else if(TabSetting.getSelectedIndex()==1){
            tampil2();
        }else if(TabSetting.getSelectedIndex()==2){
            tampil3();
        }
    }//GEN-LAST:event_TabSettingMouseClicked

    private void NamaServiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NamaServiceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaServiceKeyPressed

    private void NamaServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaServiceActionPerformed

    private void BesarBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BesarBiayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BesarBiayaActionPerformed

    private void BesarBiayaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BesarBiayaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BesarBiayaKeyPressed

    private void chkLaboratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLaboratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLaboratActionPerformed

    private void chkRadiologiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRadiologiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRadiologiActionPerformed

    private void chkOperasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOperasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkOperasiActionPerformed

    private void chkObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkObatActionPerformed

    private void chkRanapDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRanapDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRanapDokterActionPerformed

    private void chkRanapParamedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRanapParamedisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRanapParamedisActionPerformed

    private void chkRalanDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRalanDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRalanDokterActionPerformed

    private void chkRalanParamedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRalanParamedisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRalanParamedisActionPerformed

    private void chkTambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTambahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTambahanActionPerformed

    private void chkKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkKamarActionPerformed

    private void chkRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRegistrasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRegistrasiActionPerformed

    private void chkHarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkHarianActionPerformed

    private void chkResepPulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkResepPulangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkResepPulangActionPerformed

    private void chkReturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkReturActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkReturActionPerformed

    private void chkPotonganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPotonganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPotonganActionPerformed

    private void ChkInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkInput2ActionPerformed
        isForm2();
    }//GEN-LAST:event_ChkInput2ActionPerformed

    private void tbAdmin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAdmin2MouseClicked
        if(tabMode2.getRowCount()!=0){
            try {
                getData2();
            } catch (java.lang.NullPointerException e) {
            }
        }
    }//GEN-LAST:event_tbAdmin2MouseClicked

    private void tbAdmin2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAdmin2KeyPressed
        if(tabMode2.getRowCount()!=0){
            if((evt.getKeyCode()==KeyEvent.VK_ENTER)||(evt.getKeyCode()==KeyEvent.VK_UP)||(evt.getKeyCode()==KeyEvent.VK_DOWN)){
                try {
                    getData2();
                } catch (java.lang.NullPointerException e) {
                }
            }
        }
    }//GEN-LAST:event_tbAdmin2KeyPressed

    private void tbAdmin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAdmin3MouseClicked
        if(tabMode3.getRowCount()!=0){
            try {
                getData3();
            } catch (java.lang.NullPointerException e) {
            }
        }
    }//GEN-LAST:event_tbAdmin3MouseClicked

    private void tbAdmin3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAdmin3KeyPressed
        if(tabMode3.getRowCount()!=0){
            if((evt.getKeyCode()==KeyEvent.VK_ENTER)||(evt.getKeyCode()==KeyEvent.VK_UP)||(evt.getKeyCode()==KeyEvent.VK_DOWN)){
                try {
                    getData3();
                } catch (java.lang.NullPointerException e) {
                }
            }
        }
    }//GEN-LAST:event_tbAdmin3KeyPressed

    private void ChkInput3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkInput3ActionPerformed
        isForm3();
    }//GEN-LAST:event_ChkInput3ActionPerformed

    private void NamaService1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaService1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaService1ActionPerformed

    private void NamaService1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NamaService1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaService1KeyPressed

    private void BesarBiaya1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BesarBiaya1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BesarBiaya1ActionPerformed

    private void BesarBiaya1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BesarBiaya1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BesarBiaya1KeyPressed

    private void chkLaborat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLaborat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLaborat1ActionPerformed

    private void chkRadiologi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRadiologi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRadiologi1ActionPerformed

    private void chkOperasi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOperasi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkOperasi1ActionPerformed

    private void chkObat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkObat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkObat1ActionPerformed

    private void chkRanapDokter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRanapDokter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRanapDokter1ActionPerformed

    private void chkRanapParamedis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRanapParamedis1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRanapParamedis1ActionPerformed

    private void chkRalanDokter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRalanDokter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRalanDokter1ActionPerformed

    private void chkRalanParamedis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRalanParamedis1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRalanParamedis1ActionPerformed

    private void chkTambahan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTambahan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTambahan1ActionPerformed

    private void chkKamar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKamar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkKamar1ActionPerformed

    private void chkRegistrasi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRegistrasi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRegistrasi1ActionPerformed

    private void chkHarian1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHarian1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkHarian1ActionPerformed

    private void chkResepPulang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkResepPulang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkResepPulang1ActionPerformed

    private void chkRetur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRetur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRetur1ActionPerformed

    private void chkPotongan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPotongan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPotongan1ActionPerformed

    private void cmbYesTombolPenyerahanDarahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesTombolPenyerahanDarahKeyPressed
        Valid.pindah(evt, cmbYesTombolPenjualan,BtnSimpan);
    }//GEN-LAST:event_cmbYesTombolPenyerahanDarahKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            DlgSetNota dialog = new DlgSetNota(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.TextBox BesarBiaya;
    private widget.TextBox BesarBiaya1;
    private widget.Button BtnBatal;
    private widget.Button BtnEdit;
    private widget.Button BtnHapus;
    private widget.Button BtnKeluar;
    private widget.Button BtnSimpan;
    private widget.CekBox ChkInput;
    private widget.CekBox ChkInput2;
    private widget.CekBox ChkInput3;
    private widget.panelisi FormInput;
    private widget.panelisi FormInput2;
    private widget.panelisi FormInput3;
    private widget.TextBox KwitansiRalan;
    private widget.TextBox KwitansiRanap;
    private widget.TextBox NamaService;
    private widget.TextBox NamaService1;
    private widget.TextBox Nota1Ranap;
    private widget.TextBox Nota2Ranap;
    private widget.TextBox NotaApotek;
    private widget.TextBox NotaLab;
    private widget.TextBox NotaRalan;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JPanel PanelInput2;
    private javax.swing.JPanel PanelInput3;
    private widget.ScrollPane Scroll;
    private widget.ScrollPane Scroll1;
    private widget.ScrollPane Scroll2;
    private javax.swing.JTabbedPane TabSetting;
    private widget.CekBox chkHarian;
    private widget.CekBox chkHarian1;
    private widget.CekBox chkKamar;
    private widget.CekBox chkKamar1;
    private widget.CekBox chkLaborat;
    private widget.CekBox chkLaborat1;
    private widget.CekBox chkObat;
    private widget.CekBox chkObat1;
    private widget.CekBox chkOperasi;
    private widget.CekBox chkOperasi1;
    private widget.CekBox chkPotongan;
    private widget.CekBox chkPotongan1;
    private widget.CekBox chkRadiologi;
    private widget.CekBox chkRadiologi1;
    private widget.CekBox chkRalanDokter;
    private widget.CekBox chkRalanDokter1;
    private widget.CekBox chkRalanParamedis;
    private widget.CekBox chkRalanParamedis1;
    private widget.CekBox chkRanapDokter;
    private widget.CekBox chkRanapDokter1;
    private widget.CekBox chkRanapParamedis;
    private widget.CekBox chkRanapParamedis1;
    private widget.CekBox chkRegistrasi;
    private widget.CekBox chkRegistrasi1;
    private widget.CekBox chkResepPulang;
    private widget.CekBox chkResepPulang1;
    private widget.CekBox chkRetur;
    private widget.CekBox chkRetur1;
    private widget.CekBox chkTambahan;
    private widget.CekBox chkTambahan1;
    private widget.ComboBox cmbYesAdministrasiRanap;
    private widget.ComboBox cmbYesCentangDokterRalan;
    private widget.ComboBox cmbYesCentangDokterRanap;
    private widget.ComboBox cmbYesPPNRalan;
    private widget.ComboBox cmbYesPPNRanap;
    private widget.ComboBox cmbYesRalan;
    private widget.ComboBox cmbYesRanap;
    private widget.ComboBox cmbYesRincianOperasi;
    private widget.ComboBox cmbYesRincianRalan;
    private widget.ComboBox cmbYesRincianRanap;
    private widget.ComboBox cmbYesTombolNotaRalan;
    private widget.ComboBox cmbYesTombolNotaRanap;
    private widget.ComboBox cmbYesTombolPenjualan;
    private widget.ComboBox cmbYesTombolPenyerahanDarah;
    private widget.InternalFrame internalFrame1;
    private widget.InternalFrame internalFrame2;
    private widget.InternalFrame internalFrame3;
    private widget.InternalFrame internalFrame4;
    private widget.Label jLabel10;
    private widget.Label jLabel11;
    private widget.Label jLabel12;
    private widget.Label jLabel13;
    private widget.Label jLabel14;
    private widget.Label jLabel15;
    private widget.Label jLabel16;
    private widget.Label jLabel17;
    private widget.Label jLabel18;
    private widget.Label jLabel19;
    private widget.Label jLabel20;
    private widget.Label jLabel21;
    private widget.Label jLabel22;
    private widget.Label jLabel23;
    private widget.Label jLabel24;
    private widget.Label jLabel25;
    private widget.Label jLabel26;
    private widget.Label jLabel27;
    private widget.Label jLabel28;
    private widget.Label jLabel29;
    private widget.Label jLabel30;
    private widget.Label jLabel31;
    private widget.Label jLabel32;
    private widget.Label jLabel33;
    private widget.Label jLabel34;
    private widget.Label jLabel35;
    private widget.Label jLabel36;
    private widget.Label jLabel37;
    private widget.Label jLabel38;
    private widget.Label jLabel39;
    private widget.Label jLabel4;
    private widget.Label jLabel5;
    private widget.Label jLabel6;
    private widget.Label jLabel7;
    private widget.Label jLabel8;
    private widget.Label jLabel9;
    private widget.panelisi panelGlass5;
    private widget.Table tbAdmin;
    private widget.Table tbAdmin2;
    private widget.Table tbAdmin3;
    // End of variables declaration//GEN-END:variables

    public void tampil() {
        Valid.tabelKosong(tabMode);
        try{    
            ps=koneksi.prepareStatement("select * from set_nota ");
            try {
                rs=ps.executeQuery();
                while(rs.next()){
                    tabMode.addRow(new Object[]{" Lebar Nota Rawat Jalan",rs.getString(1)});
                    tabMode.addRow(new Object[]{" Lebar Kwitansi Rawat Jalan",rs.getString(2)});
                    tabMode.addRow(new Object[]{" Lebar Nota 1 Rawat Inap",rs.getString(3)});
                    tabMode.addRow(new Object[]{" Lebar Nota 2 Rawat Inap",rs.getString(4)});
                    tabMode.addRow(new Object[]{" Lebar Kwitansi Rawat Inap",rs.getString(5)});
                    tabMode.addRow(new Object[]{" Lebar Nota Apotek & UTD",rs.getString(6)});
                    tabMode.addRow(new Object[]{" Lebar Nota Lab & Radiologi",rs.getString(7)});
                    tabMode.addRow(new Object[]{" Cetak Nota/Kwitansi Saat Menyimpan di Billing Rawat Jalan",rs.getString(8)});
                    tabMode.addRow(new Object[]{" Cetak Nota/Kwitansi Saat Menyimpan di Billing Rawat Inap",rs.getString(9)});
                    tabMode.addRow(new Object[]{" Tampilkan Rincian Tindakan Dokter Ralan",rs.getString(10)});
                    tabMode.addRow(new Object[]{" Tampilkan Rincian Tindakan Dokter Ranap",rs.getString(11)});
                    tabMode.addRow(new Object[]{" Centang Dokter di Nota Ralan",rs.getString(12)});
                    tabMode.addRow(new Object[]{" Centang Dokter di Nota Ranap",rs.getString(13)});
                    tabMode.addRow(new Object[]{" Tampilkan Administrasi di Billing Ranap",rs.getString(14)});
                    tabMode.addRow(new Object[]{" Tampilkan Rincian Operasi",rs.getString(15)});
                    tabMode.addRow(new Object[]{" Tampilkan PPN Obat 10 % di Nota Ralan",rs.getString(16)});
                    tabMode.addRow(new Object[]{" Tampilkan PPN Obat 10 % di Nota Ranap",rs.getString(17)});
                    tabMode.addRow(new Object[]{" Tampilkan Tombol Nota di Billing Rawat Jalan",rs.getString(18)});
                    tabMode.addRow(new Object[]{" Tampilkan Tombol Nota di Billing Rawat Inap",rs.getString(19)});
                    tabMode.addRow(new Object[]{" Verifikasi Penjualan Obat Bebas di Kasir",rs.getString(20)});
                    tabMode.addRow(new Object[]{" Verifikasi Penjualan Darah UTD di Kasir",rs.getString(20)});
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
            }                
        }catch(Exception e){
            System.out.println("Notifikasi : "+e);
        }
    }
    
    public void tampil2() {
        Valid.tabelKosong(tabMode2);
        try{    
            ps=koneksi.prepareStatement("select * from set_service_ranap ");
            try {
                rs=ps.executeQuery();
                while(rs.next()){
                    tabMode2.addRow(new Object[]{" Nama Service/Administrasi",rs.getString(1)});
                    tabMode2.addRow(new Object[]{" Besar Biaya(%)",rs.getString(2)});
                    tabMode2.addRow(new Object[]{" Biaya Diambil Dari :",""});
                    tabMode2.addRow(new Object[]{"    Laborat",rs.getString(3)});
                    tabMode2.addRow(new Object[]{"    Radiologi",rs.getString(4)});
                    tabMode2.addRow(new Object[]{"    Operasi",rs.getString(5)});
                    tabMode2.addRow(new Object[]{"    Obat",rs.getString(6)});
                    tabMode2.addRow(new Object[]{"    Ranap Dokter",rs.getString(7)});
                    tabMode2.addRow(new Object[]{"    Ranap Paramedis",rs.getString(8)});
                    tabMode2.addRow(new Object[]{"    Ralan Dokter",rs.getString(9)});
                    tabMode2.addRow(new Object[]{"    Ralan Paramedis",rs.getString(10)});
                    tabMode2.addRow(new Object[]{"    Tambahan",rs.getString(11)});
                    tabMode2.addRow(new Object[]{"    Potongan",rs.getString(12)});
                    tabMode2.addRow(new Object[]{"    Kamar",rs.getString(13)});
                    tabMode2.addRow(new Object[]{"    Registrasi",rs.getString(14)});
                    tabMode2.addRow(new Object[]{"    Harian",rs.getString(15)});
                    tabMode2.addRow(new Object[]{"    Retur Obat",rs.getString(16)});
                    tabMode2.addRow(new Object[]{"    Resep Pulang",rs.getString(17)});
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
            }                
        }catch(Exception e){
            System.out.println("Notifikasi : "+e);
        }
    }
    
    public void tampil3() {
        Valid.tabelKosong(tabMode3);
        try{    
            ps=koneksi.prepareStatement("select * from set_service_ranap_piutang ");
            try {
                rs=ps.executeQuery();
                while(rs.next()){
                    tabMode3.addRow(new Object[]{" Nama Service/Administrasi",rs.getString(1)});
                    tabMode3.addRow(new Object[]{" Besar Biaya(%)",rs.getString(2)});
                    tabMode3.addRow(new Object[]{" Biaya Diambil Dari :",""});
                    tabMode3.addRow(new Object[]{"    Laborat",rs.getString(3)});
                    tabMode3.addRow(new Object[]{"    Radiologi",rs.getString(4)});
                    tabMode3.addRow(new Object[]{"    Operasi",rs.getString(5)});
                    tabMode3.addRow(new Object[]{"    Obat",rs.getString(6)});
                    tabMode3.addRow(new Object[]{"    Ranap Dokter",rs.getString(7)});
                    tabMode3.addRow(new Object[]{"    Ranap Paramedis",rs.getString(8)});
                    tabMode3.addRow(new Object[]{"    Ralan Dokter",rs.getString(9)});
                    tabMode3.addRow(new Object[]{"    Ralan Paramedis",rs.getString(10)});
                    tabMode3.addRow(new Object[]{"    Tambahan",rs.getString(11)});
                    tabMode3.addRow(new Object[]{"    Potongan",rs.getString(12)});
                    tabMode3.addRow(new Object[]{"    Kamar",rs.getString(13)});
                    tabMode3.addRow(new Object[]{"    Registrasi",rs.getString(14)});
                    tabMode3.addRow(new Object[]{"    Harian",rs.getString(15)});
                    tabMode3.addRow(new Object[]{"    Retur Obat",rs.getString(16)});
                    tabMode3.addRow(new Object[]{"    Resep Pulang",rs.getString(17)});
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
            }                
        }catch(Exception e){
            System.out.println("Notifikasi : "+e);
        }
    }

    private void getData() {
        int row=tbAdmin.getSelectedRow();
        if(row!= -1){
            NotaRalan.setText(tbAdmin.getValueAt(0,1).toString());            
            KwitansiRalan.setText(tbAdmin.getValueAt(1,1).toString()); 
            Nota1Ranap.setText(tbAdmin.getValueAt(2,1).toString()); 
            Nota2Ranap.setText(tbAdmin.getValueAt(3,1).toString()); 
            KwitansiRanap.setText(tbAdmin.getValueAt(4,1).toString()); 
            NotaApotek.setText(tbAdmin.getValueAt(5,1).toString());
            NotaLab.setText(tbAdmin.getValueAt(6,1).toString());  
            cmbYesRalan.setSelectedItem(tbAdmin.getValueAt(7,1).toString());
            cmbYesRanap.setSelectedItem(tbAdmin.getValueAt(8,1).toString());
            cmbYesRincianRalan.setSelectedItem(tbAdmin.getValueAt(9,1).toString());
            cmbYesRincianRanap.setSelectedItem(tbAdmin.getValueAt(10,1).toString());
            cmbYesCentangDokterRalan.setSelectedItem(tbAdmin.getValueAt(11,1).toString());
            cmbYesCentangDokterRanap.setSelectedItem(tbAdmin.getValueAt(12,1).toString());
            cmbYesAdministrasiRanap.setSelectedItem(tbAdmin.getValueAt(13,1).toString());
            cmbYesRincianOperasi.setSelectedItem(tbAdmin.getValueAt(14,1).toString());
            cmbYesPPNRalan.setSelectedItem(tbAdmin.getValueAt(15,1).toString());
            cmbYesPPNRanap.setSelectedItem(tbAdmin.getValueAt(16,1).toString());
            cmbYesTombolNotaRalan.setSelectedItem(tbAdmin.getValueAt(17,1).toString());
            cmbYesTombolNotaRanap.setSelectedItem(tbAdmin.getValueAt(18,1).toString());
            cmbYesTombolPenjualan.setSelectedItem(tbAdmin.getValueAt(19,1).toString());
            cmbYesTombolPenyerahanDarah.setSelectedItem(tbAdmin.getValueAt(20,1).toString());
        }
    }
    
    private void getData2() {
        int row=tbAdmin2.getSelectedRow();
        if(row!= -1){
            NamaService.setText(tbAdmin2.getValueAt(0,1).toString());            
            BesarBiaya.setText(tbAdmin2.getValueAt(1,1).toString());    
            if(tbAdmin2.getValueAt(3,1).toString().equals("Yes")){
                chkLaborat.setSelected(true);
            }else if(tbAdmin2.getValueAt(3,1).toString().equals("No")){
                chkLaborat.setSelected(false);
            }
            if(tbAdmin2.getValueAt(4,1).toString().equals("Yes")){
                chkRadiologi.setSelected(true);
            }else if(tbAdmin2.getValueAt(4,1).toString().equals("No")){
                chkRadiologi.setSelected(false);
            }
            if(tbAdmin2.getValueAt(5,1).toString().equals("Yes")){
                chkOperasi.setSelected(true);
            }else if(tbAdmin2.getValueAt(5,1).toString().equals("No")){
                chkOperasi.setSelected(false);
            }
            if(tbAdmin2.getValueAt(6,1).toString().equals("Yes")){
                chkObat.setSelected(true);
            }else if(tbAdmin2.getValueAt(6,1).toString().equals("No")){
                chkObat.setSelected(false);
            }
            if(tbAdmin2.getValueAt(7,1).toString().equals("Yes")){
                chkRanapDokter.setSelected(true);
            }else if(tbAdmin2.getValueAt(7,1).toString().equals("No")){
                chkRanapDokter.setSelected(false);
            }
            if(tbAdmin2.getValueAt(8,1).toString().equals("Yes")){
                chkRanapParamedis.setSelected(true);
            }else if(tbAdmin2.getValueAt(8,1).toString().equals("No")){
                chkRanapParamedis.setSelected(false);
            }
            if(tbAdmin2.getValueAt(9,1).toString().equals("Yes")){
                chkRalanDokter.setSelected(true);
            }else if(tbAdmin2.getValueAt(9,1).toString().equals("No")){
                chkRalanDokter.setSelected(false);
            }
            if(tbAdmin2.getValueAt(10,1).toString().equals("Yes")){
                chkRalanParamedis.setSelected(true);
            }else if(tbAdmin2.getValueAt(10,1).toString().equals("No")){
                chkRalanParamedis.setSelected(false);
            }
            if(tbAdmin2.getValueAt(11,1).toString().equals("Yes")){
                chkTambahan.setSelected(true);
            }else if(tbAdmin2.getValueAt(11,1).toString().equals("No")){
                chkTambahan.setSelected(false);
            }
            if(tbAdmin2.getValueAt(12,1).toString().equals("Yes")){
                chkPotongan.setSelected(true);
            }else if(tbAdmin2.getValueAt(12,1).toString().equals("No")){
                chkPotongan.setSelected(false);
            }
            if(tbAdmin2.getValueAt(13,1).toString().equals("Yes")){
                chkKamar.setSelected(true);
            }else if(tbAdmin2.getValueAt(13,1).toString().equals("No")){
                chkKamar.setSelected(false);
            }
            if(tbAdmin2.getValueAt(14,1).toString().equals("Yes")){
                chkRegistrasi.setSelected(true);
            }else if(tbAdmin2.getValueAt(14,11).toString().equals("No")){
                chkRegistrasi.setSelected(false);
            }
            if(tbAdmin2.getValueAt(15,1).toString().equals("Yes")){
                chkHarian.setSelected(true);
            }else if(tbAdmin2.getValueAt(15,1).toString().equals("No")){
                chkHarian.setSelected(false);
            }
            if(tbAdmin2.getValueAt(16,1).toString().equals("Yes")){
                chkRetur.setSelected(true);
            }else if(tbAdmin2.getValueAt(16,1).toString().equals("No")){
                chkRetur.setSelected(false);
            }
            if(tbAdmin2.getValueAt(17,1).toString().equals("Yes")){
                chkResepPulang.setSelected(true);
            }else if(tbAdmin2.getValueAt(17,1).toString().equals("No")){
                chkResepPulang.setSelected(false);
            }
        }
    }
    
    private void getData3() {
        int row=tbAdmin3.getSelectedRow();
        if(row!= -1){
            NamaService1.setText(tbAdmin3.getValueAt(0,1).toString());            
            BesarBiaya1.setText(tbAdmin3.getValueAt(1,1).toString());    
            if(tbAdmin3.getValueAt(3,1).toString().equals("Yes")){
                chkLaborat1.setSelected(true);
            }else if(tbAdmin3.getValueAt(3,1).toString().equals("No")){
                chkLaborat1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(4,1).toString().equals("Yes")){
                chkRadiologi1.setSelected(true);
            }else if(tbAdmin3.getValueAt(4,1).toString().equals("No")){
                chkRadiologi1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(5,1).toString().equals("Yes")){
                chkOperasi1.setSelected(true);
            }else if(tbAdmin3.getValueAt(5,1).toString().equals("No")){
                chkOperasi1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(6,1).toString().equals("Yes")){
                chkObat1.setSelected(true);
            }else if(tbAdmin3.getValueAt(6,1).toString().equals("No")){
                chkObat1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(7,1).toString().equals("Yes")){
                chkRanapDokter1.setSelected(true);
            }else if(tbAdmin3.getValueAt(7,1).toString().equals("No")){
                chkRanapDokter1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(8,1).toString().equals("Yes")){
                chkRanapParamedis1.setSelected(true);
            }else if(tbAdmin3.getValueAt(8,1).toString().equals("No")){
                chkRanapParamedis1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(9,1).toString().equals("Yes")){
                chkRalanDokter1.setSelected(true);
            }else if(tbAdmin3.getValueAt(9,1).toString().equals("No")){
                chkRalanDokter1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(10,1).toString().equals("Yes")){
                chkRalanParamedis1.setSelected(true);
            }else if(tbAdmin3.getValueAt(10,1).toString().equals("No")){
                chkRalanParamedis1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(11,1).toString().equals("Yes")){
                chkTambahan1.setSelected(true);
            }else if(tbAdmin3.getValueAt(11,1).toString().equals("No")){
                chkTambahan1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(12,1).toString().equals("Yes")){
                chkPotongan1.setSelected(true);
            }else if(tbAdmin3.getValueAt(12,1).toString().equals("No")){
                chkPotongan1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(13,1).toString().equals("Yes")){
                chkKamar1.setSelected(true);
            }else if(tbAdmin3.getValueAt(13,1).toString().equals("No")){
                chkKamar1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(14,1).toString().equals("Yes")){
                chkRegistrasi1.setSelected(true);
            }else if(tbAdmin3.getValueAt(14,11).toString().equals("No")){
                chkRegistrasi1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(15,1).toString().equals("Yes")){
                chkHarian1.setSelected(true);
            }else if(tbAdmin3.getValueAt(15,1).toString().equals("No")){
                chkHarian1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(16,1).toString().equals("Yes")){
                chkRetur1.setSelected(true);
            }else if(tbAdmin3.getValueAt(16,1).toString().equals("No")){
                chkRetur1.setSelected(false);
            }
            if(tbAdmin3.getValueAt(17,1).toString().equals("Yes")){
                chkResepPulang1.setSelected(true);
            }else if(tbAdmin3.getValueAt(17,1).toString().equals("No")){
                chkResepPulang1.setSelected(false);
            }
        }
    }

    public void emptTeks() {
        NotaRalan.setText("");
        KwitansiRalan.setText("");
        Nota1Ranap.setText("");
        Nota2Ranap.setText("");
        KwitansiRanap.setText("");
        NotaApotek.setText("");
        NotaLab.setText("");
        cmbYesRalan.setSelectedItem("No");
        cmbYesRanap.setSelectedItem("No");
        cmbYesRincianRalan.setSelectedItem("No");
        cmbYesRincianRanap.setSelectedItem("No");
        cmbYesCentangDokterRalan.setSelectedItem("No");
        cmbYesCentangDokterRanap.setSelectedItem("No");
        cmbYesAdministrasiRanap.setSelectedItem("No");
        cmbYesRincianOperasi.setSelectedItem("No");
        cmbYesPPNRalan.setSelectedItem("No");
        cmbYesPPNRanap.setSelectedItem("No");
        cmbYesTombolNotaRalan.setSelectedItem("No");
        cmbYesTombolNotaRanap.setSelectedItem("No");
        cmbYesTombolPenjualan.setSelectedItem("No");
        cmbYesTombolPenyerahanDarah.setSelectedItem("No");
        NotaRalan.requestFocus();
    }
    
    public void emptTeks2() {
        NamaService.setText("");
        BesarBiaya.setText("");
        chkLaborat.setSelected(false);
        chkRadiologi.setSelected(false);
        chkOperasi.setSelected(false);
        chkObat.setSelected(false);
        chkRanapDokter.setSelected(false);
        chkRanapParamedis.setSelected(false);
        chkRalanDokter.setSelected(false);
        chkRalanParamedis.setSelected(false);
        chkTambahan.setSelected(false);
        chkPotongan.setSelected(false);
        chkKamar.setSelected(false);
        chkRegistrasi.setSelected(false);
        chkHarian.setSelected(false);
        chkRetur.setSelected(false);
        chkResepPulang.setSelected(false);
    }
    
    public void emptTeks3() {
        NamaService1.setText("");
        BesarBiaya1.setText("");
        chkLaborat1.setSelected(false);
        chkRadiologi1.setSelected(false);
        chkOperasi1.setSelected(false);
        chkObat1.setSelected(false);
        chkRanapDokter1.setSelected(false);
        chkRanapParamedis1.setSelected(false);
        chkRalanDokter1.setSelected(false);
        chkRalanParamedis1.setSelected(false);
        chkTambahan1.setSelected(false);
        chkPotongan1.setSelected(false);
        chkKamar1.setSelected(false);
        chkRegistrasi1.setSelected(false);
        chkHarian1.setSelected(false);
        chkRetur1.setSelected(false);
        chkResepPulang1.setSelected(false);
    }
    
    private void isForm(){
        if(ChkInput.isSelected()==true){
            ChkInput.setVisible(false);
            PanelInput.setPreferredSize(new Dimension(WIDTH,370));
            FormInput.setVisible(true);      
            ChkInput.setVisible(true);
        }else if(ChkInput.isSelected()==false){           
            ChkInput.setVisible(false);            
            PanelInput.setPreferredSize(new Dimension(WIDTH,20));
            FormInput.setVisible(false);      
            ChkInput.setVisible(true);
        }
    }
    
    private void isForm2(){
        if(ChkInput2.isSelected()==true){
            ChkInput2.setVisible(false);
            PanelInput2.setPreferredSize(new Dimension(WIDTH,187));
            FormInput2.setVisible(true);      
            ChkInput2.setVisible(true);
        }else if(ChkInput2.isSelected()==false){           
            ChkInput2.setVisible(false);            
            PanelInput2.setPreferredSize(new Dimension(WIDTH,20));
            FormInput2.setVisible(false);      
            ChkInput2.setVisible(true);
        }
    }
    
    private void isForm3(){
        if(ChkInput3.isSelected()==true){
            ChkInput3.setVisible(false);
            PanelInput3.setPreferredSize(new Dimension(WIDTH,187));
            FormInput3.setVisible(true);      
            ChkInput3.setVisible(true);
        }else if(ChkInput3.isSelected()==false){           
            ChkInput3.setVisible(false);            
            PanelInput3.setPreferredSize(new Dimension(WIDTH,20));
            FormInput3.setVisible(false);      
            ChkInput3.setVisible(true);
        }
    }
}
