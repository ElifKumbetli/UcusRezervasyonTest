
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elifk
 */
public class Rezervasyon extends javax.swing.JFrame implements MouseListener {

    /**
     * Creates new form Rezervasyon
     */
    public Rezervasyon() {
        initComponents();
        lbl1.addMouseListener(this);
        lbl2.addMouseListener(this);
        lbl3.addMouseListener(this);
        lbl4.addMouseListener(this);
        lbl5.addMouseListener(this);
        lbl6.addMouseListener(this);
        lbl7.addMouseListener(this);
        lbl8.addMouseListener(this);
        lbl9.addMouseListener(this);
        lbl10.addMouseListener(this);
        lbl11.addMouseListener(this);
        lbl12.addMouseListener(this);
        lbl13.addMouseListener(this);
        lbl14.addMouseListener(this);
        lbl15.addMouseListener(this);
        lbl16.addMouseListener(this);
        lbl17.addMouseListener(this);
        lbl18.addMouseListener(this);
        lbl19.addMouseListener(this);
        lbl20.addMouseListener(this);
        lbl21.addMouseListener(this);
        lbl22.addMouseListener(this);
        lbl23.addMouseListener(this);
        lbl24.addMouseListener(this);
        lbl25.addMouseListener(this);
        lbl26.addMouseListener(this);
        lbl27.addMouseListener(this);
        lbl28.addMouseListener(this);
        lbl29.addMouseListener(this);
        lbl30.addMouseListener(this);
        lbl31.addMouseListener(this);
        lbl32.addMouseListener(this);
        lbl33.addMouseListener(this);
        lbl34.addMouseListener(this);
        lbl35.addMouseListener(this);
        lbl36.addMouseListener(this);
        lbl37.addMouseListener(this);
        lbl38.addMouseListener(this);
        lbl39.addMouseListener(this);
        lbl40.addMouseListener(this);
        lbl41.addMouseListener(this);
        lbl42.addMouseListener(this);
        lbl43.addMouseListener(this);
        lbl44.addMouseListener(this);
        lbl45.addMouseListener(this);
        lbl46.addMouseListener(this);
        lbl47.addMouseListener(this);
        lbl48.addMouseListener(this);
        lbl49.addMouseListener(this);
        lbl50.addMouseListener(this);
        lbl51.addMouseListener(this);
        lbl52.addMouseListener(this);
        lbl53.addMouseListener(this);
        lbl54.addMouseListener(this);
        lbl55.addMouseListener(this);
        lbl56.addMouseListener(this);
        lbl57.addMouseListener(this);
        lbl58.addMouseListener(this);
        lbl59.addMouseListener(this);
        lbl60.addMouseListener(this);
        lbl61.addMouseListener(this);
        lbl62.addMouseListener(this);
        lbl63.addMouseListener(this);
        lbl64.addMouseListener(this);
        lbl65.addMouseListener(this);
        lbl66.addMouseListener(this);
        lbl67.addMouseListener(this);
        lbl68.addMouseListener(this);
        lbl69.addMouseListener(this);
        lbl70.addMouseListener(this);
        lbl71.addMouseListener(this);
        lbl72.addMouseListener(this);
        lbl73.addMouseListener(this);
        lbl74.addMouseListener(this);
        lbl75.addMouseListener(this);
        connect();
    }

    
    
    int koltuknumarasi=0;
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public void connect()
    {
        try {
            Class.forName("com.mysql.jbdc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost/ucak",root,"");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rezervasyon.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(Rezervasyon.class.getName()).log(Level.Severe,null,ex);
        }
    }
   
    
    
    
    
    
    
    public void Fatura()
    {
        
        String musteri = txtmusteri.getText ();
        int koltuknumarasi1 = koltuknumarasi;
        String fiyat = txtfiyat.getText();
        
        TarihBicim tarih = new TarihBicim("yyyy-MM-dd");
        String tarih = tarih_bic.bicim(txttarih.getDate());
    
        
        txtfatura.setText(txtfatura.getText()+ "****************************************************************\n");
        txtfatura.setText(txtfatura.getText()+ "***************Fatura..............*****************************\n");
        txtfatura.setText(txtfatura.getText()+ "****************************************************************\n");
        txtfatura.setText(txtfatura.getText()+ "Müşteri" + "\t" + musteri + "\n");
        txtfatura.setText(txtfatura.getText()+ "KoltukNumarası" + "\t" + koltuknumarasi + "\n");
        txtfatura.setText(txtfatura.getText()+ "Fiyat" + "\t" + fiyat + "\n");
        txtfatura.setText(txtfatura.getText()+ "Tarih" + "\t" + tarih + "\n");
        txtfatura.setText(txtfatura.getText()+ "******************^^^^^^^^^^^^^^^^^^^^^^^^^^^^*********************\n");
        txtfatura.setText(txtfatura.getText()+ "******************Teşekkürler Tekrar Bekleriz**********************\n");




}
            
            
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtfiyat = new javax.swing.JTextField();
        lbl4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lbl26 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        lbl28 = new javax.swing.JLabel();
        lbl29 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl45 = new javax.swing.JLabel();
        lbl46 = new javax.swing.JLabel();
        lbl47 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl43 = new javax.swing.JLabel();
        lbl44 = new javax.swing.JLabel();
        lbl33 = new javax.swing.JLabel();
        lbl34 = new javax.swing.JLabel();
        lbl35 = new javax.swing.JLabel();
        lbl36 = new javax.swing.JLabel();
        lbl37 = new javax.swing.JLabel();
        lbl38 = new javax.swing.JLabel();
        lbl39 = new javax.swing.JLabel();
        lbl40 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        lbl48 = new javax.swing.JLabel();
        lbl49 = new javax.swing.JLabel();
        lbl50 = new javax.swing.JLabel();
        lbl51 = new javax.swing.JLabel();
        lbl52 = new javax.swing.JLabel();
        lbl53 = new javax.swing.JLabel();
        lbl54 = new javax.swing.JLabel();
        lbl56 = new javax.swing.JLabel();
        lbl55 = new javax.swing.JLabel();
        lbl57 = new javax.swing.JLabel();
        lbl58 = new javax.swing.JLabel();
        lbl59 = new javax.swing.JLabel();
        lbl60 = new javax.swing.JLabel();
        lbl61 = new javax.swing.JLabel();
        lbl62 = new javax.swing.JLabel();
        lbl66 = new javax.swing.JLabel();
        lbl63 = new javax.swing.JLabel();
        lbl64 = new javax.swing.JLabel();
        lbl65 = new javax.swing.JLabel();
        lbl68 = new javax.swing.JLabel();
        lbl67 = new javax.swing.JLabel();
        lbl69 = new javax.swing.JLabel();
        lbl70 = new javax.swing.JLabel();
        lbl72 = new javax.swing.JLabel();
        lbl71 = new javax.swing.JLabel();
        lbl73 = new javax.swing.JLabel();
        lbl75 = new javax.swing.JLabel();
        lbl74 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        txtmusteri = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txttarih = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTextArea txtfatura = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Uçus Rezervasyon Sistemi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Müşteri");

        txtfiyat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfiyatActionPerformed(evt);
            }
        });

        lbl4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("4");

        lbl5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl5.setText("5");

        lbl10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl10.setText("10");

        lbl11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl11.setText("11");

        lbl16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl16.setText("16");

        lbl17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl17.setText("17");

        lbl6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl6.setText("6");

        lbl12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl12.setText("12");

        lbl18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl18.setText("18");

        lbl22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl22.setText("22");

        lbl23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl23.setText("23");

        lbl24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl24.setText("24");

        lbl7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl7.setText("7");

        lbl8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl8.setText("8");

        lbl9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl9.setText("9");

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl1.setText("1");

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl2.setText("2");

        lbl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl3.setText("3");

        lbl13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl13.setText("13");

        lbl14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl14.setText("14");

        lbl15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl15.setText("15");

        lbl19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl19.setText("19");

        lbl20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl20.setText("20");

        lbl21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl21.setText("21");

        lbl25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl25.setText("25");

        lbl26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl26.setText("26");

        lbl27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl27.setText("27");

        lbl28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl28.setText("28");

        lbl29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl29.setText("29");

        lbl30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl30.setText("30");

        lbl31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl31.setText("31");

        lbl32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl32.setText("32");

        lbl45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl45.setText("45");

        lbl46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl46.setText("46");

        lbl47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl47.setText("47");

        lbl42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl42.setText("42");

        lbl43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl43.setText("43");

        lbl44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl44.setText("44");

        lbl33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl33.setText("33");

        lbl34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl34.setText("34");

        lbl35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl35.setText("35");

        lbl36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl36.setText("36");

        lbl37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl37.setText("37");

        lbl38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl38.setText("38");

        lbl39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl39.setText("39");

        lbl40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl40.setText("40");

        lbl41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl41.setText("41");

        lbl48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl48.setText("48");

        lbl49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl49.setText("49");

        lbl50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl50.setText("50");

        lbl51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl51.setText("51");

        lbl52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl52.setText("52");

        lbl53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl53.setText("53");

        lbl54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl54.setText("54");

        lbl56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl56.setText("56");

        lbl55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl55.setText("55");

        lbl57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl57.setText("57");

        lbl58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl58.setText("58");

        lbl59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl59.setText("59");

        lbl60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl60.setText("60");

        lbl61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl61.setText("61");

        lbl62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl62.setText("62");

        lbl66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl66.setText("66");

        lbl63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl63.setText("63");

        lbl64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl64.setText("64");

        lbl65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl65.setText("65");

        lbl68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl68.setText("68");

        lbl67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl67.setText("67");

        lbl69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl69.setText("69");

        lbl70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl70.setText("70");

        lbl72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl72.setText("72");

        lbl71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl71.setText("71");

        lbl73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl73.setText("73");

        lbl75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl75.setText("75");

        lbl74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl74.setText("74");

        javax.swing.GroupLayout lbl4Layout = new javax.swing.GroupLayout(lbl4);
        lbl4.setLayout(lbl4Layout);
        lbl4Layout.setHorizontalGroup(
            lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addComponent(lbl16)
                        .addGap(18, 18, 18)
                        .addComponent(lbl17)
                        .addGap(10, 10, 10)
                        .addComponent(lbl18))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addComponent(lbl22)
                        .addGap(18, 18, 18)
                        .addComponent(lbl23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl24))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addComponent(lbl40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl42))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addComponent(lbl34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl35)
                        .addGap(18, 18, 18)
                        .addComponent(lbl36))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addComponent(lbl28)
                        .addGap(18, 18, 18)
                        .addComponent(lbl29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl30))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addComponent(lbl58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl60))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addComponent(lbl52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl54))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addComponent(lbl46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl48))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addComponent(lbl70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl72))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addComponent(lbl64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl66))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lbl4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(lbl4Layout.createSequentialGroup()
                                        .addComponent(lbl1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl2))
                                    .addGroup(lbl4Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl5))))
                            .addGroup(lbl4Layout.createSequentialGroup()
                                .addComponent(lbl10)
                                .addGap(18, 18, 18)
                                .addComponent(lbl11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl6)
                            .addComponent(lbl12)
                            .addComponent(lbl3))))
                .addGap(114, 114, 114)
                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addComponent(lbl37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl39))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addComponent(lbl61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl63))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl67)
                            .addComponent(lbl73))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl68)
                            .addComponent(lbl74))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl69)
                            .addComponent(lbl75)))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lbl4Layout.createSequentialGroup()
                                .addComponent(lbl25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl27))
                            .addGroup(lbl4Layout.createSequentialGroup()
                                .addComponent(lbl31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl33))
                            .addGroup(lbl4Layout.createSequentialGroup()
                                .addComponent(lbl19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl21))
                            .addGroup(lbl4Layout.createSequentialGroup()
                                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl7)
                                    .addComponent(lbl13))
                                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lbl4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl8)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl9))
                                    .addGroup(lbl4Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lbl14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl15))))))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(lbl4Layout.createSequentialGroup()
                                .addComponent(lbl43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl44))
                            .addGroup(lbl4Layout.createSequentialGroup()
                                .addComponent(lbl49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl50))
                            .addGroup(lbl4Layout.createSequentialGroup()
                                .addComponent(lbl55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl56)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl57)
                            .addComponent(lbl45)
                            .addComponent(lbl51))))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        lbl4Layout.setVerticalGroup(
            lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(lbl2)
                    .addComponent(lbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl5)
                    .addComponent(lbl6)
                    .addComponent(lbl7)
                    .addComponent(lbl8)
                    .addComponent(lbl9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl10)
                    .addComponent(lbl11)
                    .addComponent(lbl12)
                    .addComponent(lbl13)
                    .addComponent(lbl14)
                    .addComponent(lbl15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl16)
                    .addComponent(lbl17)
                    .addComponent(lbl18)
                    .addComponent(lbl19)
                    .addComponent(lbl20)
                    .addComponent(lbl21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl22)
                    .addComponent(lbl23)
                    .addComponent(lbl24)
                    .addComponent(lbl25)
                    .addComponent(lbl26)
                    .addComponent(lbl27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl28)
                    .addComponent(lbl29)
                    .addComponent(lbl30)
                    .addComponent(lbl31)
                    .addComponent(lbl32)
                    .addComponent(lbl33))
                .addGap(53, 53, 53)
                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl37)
                        .addComponent(lbl38)
                        .addComponent(lbl39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl34)
                        .addComponent(lbl35)
                        .addComponent(lbl36)))
                .addGap(44, 44, 44)
                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl40)
                    .addComponent(lbl41)
                    .addComponent(lbl42)
                    .addComponent(lbl43)
                    .addComponent(lbl44)
                    .addComponent(lbl45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl46)
                            .addComponent(lbl47)
                            .addComponent(lbl48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl52)
                            .addComponent(lbl53)
                            .addComponent(lbl54))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl58)
                            .addComponent(lbl60)
                            .addComponent(lbl59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lbl4Layout.createSequentialGroup()
                                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl66)
                                    .addComponent(lbl65)
                                    .addComponent(lbl64))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl70)
                                    .addComponent(lbl71)
                                    .addComponent(lbl72)))
                            .addGroup(lbl4Layout.createSequentialGroup()
                                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl68)
                                    .addComponent(lbl69))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl74)
                                    .addComponent(lbl75))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(lbl4Layout.createSequentialGroup()
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl49)
                            .addComponent(lbl50)
                            .addComponent(lbl51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl55)
                            .addComponent(lbl56)
                            .addComponent(lbl57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl61)
                            .addComponent(lbl62)
                            .addComponent(lbl63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl73)
                        .addGap(79, 79, 79))))
        );

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel72.setText("Koltuklar");

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setText("Fiyat");

        txtmusteri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Ayırt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtfatura.setColumns(20);
        txtfatura.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtfatura.setRows(5);
        jScrollPane1.setViewportView(txtfatura);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Kontrol");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txttarih, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel73)
                                    .addGap(36, 36, 36)
                                    .addComponent(txtfiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtmusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(718, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttarih, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(txtfiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfiyatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfiyatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfiyatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        String musteri = txtmusteri.getText ();
        int koltuknumarasi1 = koltuknumarasi;
        String fiyat = txtfiyat.getText();
        
        TarihBicim tarih = new TarihBicim("yyyy-MM-dd");
        String tarih = tarih_bic.bicim(txttarih.getDate());
        
        
        try {
            pst = con.prepareStatement("ayırt * rezerve edilen tarih = ? ve koltuknumarası = ?");
            pst.setString(1,tarih);
            pst.setInt(2,koltuknumarasi1);  
            rs = pst.executeQuery();
            
            if(rs.next() == true){
                JOptionPane.showMassageDialaog(this,"Bu koltuk daha önce rezerve edilmedi.");
            }
            else
            {
                
                pst =con.prepareStatement("siteme ekle(id,ad,soyad,tc_kimlik,tarih,saat,fiyat,kalkış yeri,iniş yeri)values(?,?,?,?,?,?,?,?,?)");
                pst.setString(1, musteri);
                pst.setString(2, koltuknumarasi1);
                pst.setString(3, fiyat);
                pst.setString(4,tarih);
                int k = pst.executeUpdate();
                
                if(k==1)
                {
                    JOptionPane.showMessageDialog(this,"Koltuk Rezerve Edildi");
                    Fatura();
                }
                else{
                    JOptionPane.showMessageDialog(this,"Yanlış Seçim");

                    
                }
                }
                    
                    
        }
        catch (SQLException ex) {
            Logger.getLogger(rezerve.class.getName()).log.(Level.SEVERE,null,ex);
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Kontrol c = new Kontrol();
        c.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Rezervasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rezervasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rezervasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rezervasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rezervasyon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl28;
    private javax.swing.JLabel lbl29;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl33;
    private javax.swing.JLabel lbl34;
    private javax.swing.JLabel lbl35;
    private javax.swing.JLabel lbl36;
    private javax.swing.JLabel lbl37;
    private javax.swing.JLabel lbl38;
    private javax.swing.JLabel lbl39;
    private javax.swing.JPanel lbl4;
    private javax.swing.JLabel lbl40;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl43;
    private javax.swing.JLabel lbl44;
    private javax.swing.JLabel lbl45;
    private javax.swing.JLabel lbl46;
    private javax.swing.JLabel lbl47;
    private javax.swing.JLabel lbl48;
    private javax.swing.JLabel lbl49;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl51;
    private javax.swing.JLabel lbl52;
    private javax.swing.JLabel lbl53;
    private javax.swing.JLabel lbl54;
    private javax.swing.JLabel lbl55;
    private javax.swing.JLabel lbl56;
    private javax.swing.JLabel lbl57;
    private javax.swing.JLabel lbl58;
    private javax.swing.JLabel lbl59;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl60;
    private javax.swing.JLabel lbl61;
    private javax.swing.JLabel lbl62;
    private javax.swing.JLabel lbl63;
    private javax.swing.JLabel lbl64;
    private javax.swing.JLabel lbl65;
    private javax.swing.JLabel lbl66;
    private javax.swing.JLabel lbl67;
    private javax.swing.JLabel lbl68;
    private javax.swing.JLabel lbl69;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl70;
    private javax.swing.JLabel lbl71;
    private javax.swing.JLabel lbl72;
    private javax.swing.JLabel lbl73;
    private javax.swing.JLabel lbl74;
    private javax.swing.JLabel lbl75;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JTextField txtfiyat;
    private javax.swing.JTextField txtmusteri;
    private com.toedter.calendar.JCalendar txttarih;
    // End of variables declaration//GEN-END:variables


@Override
public void mouseClicked(MouseEvent e) {
    if(e.getSource()== lbl1){
        koltuknumarasi = 1;
        }
    else if(e.getSource()==lbl2){
        koltuknumarasi = 2;
    }
    else if(e.getSource()==lbl3){
        koltuknumarasi = 3;
    }
    else if(e.getSource()==lbl4){
        koltuknumarasi = 4;
    }
    else if(e.getSource()==lbl5){
        koltuknumarasi = 5;
    }
    else if(e.getSource()==lbl6){
        koltuknumarasi = 6;
    }
    else if(e.getSource()==lbl7){
        koltuknumarasi = 7;
    }
    else if(e.getSource()==lbl8){
        koltuknumarasi = 8;
    }
    else if(e.getSource()==lbl9){
        koltuknumarasi = 9;
    }
    else if(e.getSource()==lbl10){
        koltuknumarasi = 10;
    }
    else if(e.getSource()==lbl11){
        koltuknumarasi = 11;
    }
    else if(e.getSource()==lbl12){
        koltuknumarasi = 12;
    }
    else if(e.getSource()==lbl2){
        koltuknumarasi = 13;
    }
    else if(e.getSource()==lbl14){
        koltuknumarasi = 14;
    }
    else if(e.getSource()==lbl15){
        koltuknumarasi = 15;
    }
    else if(e.getSource()==lbl16){
        koltuknumarasi = 16;
    }
    else if(e.getSource()==lbl17){
        koltuknumarasi = 17;
    }
    else if(e.getSource()==lbl18){
        koltuknumarasi = 18;
    }
    else if(e.getSource()==lbl19){
        koltuknumarasi = 19;
    }
    else if(e.getSource()==lbl20){
        koltuknumarasi = 20;
    }
    else if(e.getSource()==lbl21){
        koltuknumarasi = 21;
    }
    else if(e.getSource()==lbl22){
        koltuknumarasi = 22;
    }
    else if(e.getSource()==lbl23){
        koltuknumarasi = 23;
    }
    else if(e.getSource()==lbl24){
        koltuknumarasi = 24;
    }
    else if(e.getSource()==lbl25){
        koltuknumarasi = 25;
    }
    else if(e.getSource()==lbl26){
        koltuknumarasi = 26;
    }
    else if(e.getSource()==lbl27){
        koltuknumarasi = 27;
    }
    else if(e.getSource()==lbl28){
        koltuknumarasi = 28;
    }
    else if(e.getSource()==lbl29){
        koltuknumarasi = 29;
    }
    else if(e.getSource()==lbl30){
        koltuknumarasi = 30;
    }
    else if(e.getSource()==lbl31){
        koltuknumarasi = 31;
    }
    else if(e.getSource()==lbl32){
        koltuknumarasi = 32;
    }
    else if(e.getSource()==lbl33){
        koltuknumarasi = 33;
    }
    else if(e.getSource()==lbl34){
        koltuknumarasi = 34;
    }
    else if(e.getSource()==lbl35){
        koltuknumarasi = 35;
    }
    else if(e.getSource()==lbl36){
        koltuknumarasi = 36;
    }
    else if(e.getSource()==lbl37){
        koltuknumarasi = 37;
    }
    else if(e.getSource()==lbl38){
        koltuknumarasi = 38;
    }
    else if(e.getSource()==lbl39){
        koltuknumarasi = 39;
    }
    else if(e.getSource()==lbl40){
        koltuknumarasi = 40;
    }
    else if(e.getSource()==lbl41){
        koltuknumarasi = 41;
    }
    else if(e.getSource()==lbl42){
        koltuknumarasi = 42;
    }
    else if(e.getSource()==lbl43){
        koltuknumarasi = 43;
    }
    else if(e.getSource()==lbl44){
        koltuknumarasi = 44;
    }
    else if(e.getSource()==lbl45){
        koltuknumarasi = 45;
    }
    else if(e.getSource()==lbl46){
        koltuknumarasi = 46;
    }
    else if(e.getSource()==lbl47){
        koltuknumarasi = 47;
    }
    else if(e.getSource()==lbl48){
        koltuknumarasi = 48;
    }
    else if(e.getSource()==lbl49){
        koltuknumarasi = 49;
    }
    else if(e.getSource()==lbl50){
        koltuknumarasi = 50;
    }
    else if(e.getSource()==lbl51){
        koltuknumarasi = 51;
    }
    else if(e.getSource()==lbl52){
        koltuknumarasi = 52;
    }
    else if(e.getSource()==lbl53){
        koltuknumarasi = 53;
    }
    else if(e.getSource()==lbl54){
        koltuknumarasi = 54;
    }
    else if(e.getSource()==lbl55){
        koltuknumarasi = 55;
    }
    else if(e.getSource()==lbl56){
        koltuknumarasi = 56;
    }
    else if(e.getSource()==lbl57){
        koltuknumarasi = 57;
    }
    else if(e.getSource()==lbl58){
        koltuknumarasi = 58;
    }else if(e.getSource()==lbl59){
        koltuknumarasi = 59;
    }else if(e.getSource()==lbl60){
        koltuknumarasi = 60;
    }else if(e.getSource()==lbl61){
        koltuknumarasi = 61;
    }else if(e.getSource()==lbl62){
        koltuknumarasi = 62;
    }else if(e.getSource()==lbl63){
        koltuknumarasi = 63;
    }else if(e.getSource()==lbl64){
        koltuknumarasi = 64;
    }else if(e.getSource()==lbl65){
        koltuknumarasi = 65;
    }else if(e.getSource()==lbl66){
        koltuknumarasi = 66;
    }else if(e.getSource()==lbl67){
        koltuknumarasi = 67;
    }else if(e.getSource()==lbl68){
        koltuknumarasi = 68;
    }else if(e.getSource()==lbl69){
        koltuknumarasi = 69;
    }else if(e.getSource()==lbl70){
        koltuknumarasi = 70;
    }else if(e.getSource()==lbl71){
        koltuknumarasi = 71;
    }else if(e.getSource()==lbl72){
        koltuknumarasi = 72;
    }else if(e.getSource()==lbl73){
        koltuknumarasi = 73;
    }else if(e.getSource()==lbl74){
        koltuknumarasi = 74;
    }else if(e.getSource()==lbl75){
        koltuknumarasi = 75;
    }
    
    JOptionPane.showMessageDialog(this,koltuknumarasi);
    
    
    
    
    }
@Override
public void mousePressed(MouseEvent e) {
    //throw new UnsupportedOperationException("Not supported yet.");
    }

@Override
public void mouseReleased(MouseEvent e) {
    //throw new UnsupportedOperationException("Not supported yet.");
    }

    

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
