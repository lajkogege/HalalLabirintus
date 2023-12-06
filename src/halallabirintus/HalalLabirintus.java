package halallabirintus;

import javax.swing.ImageIcon;
import java.util.Random;

public class HalalLabirintus extends javax.swing.JFrame {

    private int doboKockaSzam;
    private int doboKockaSzam2;

    public HalalLabirintus() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        JplStat = new javax.swing.JPanel();
        TxtUgyeseg = new javax.swing.JTextField();
        TxtEletero = new javax.swing.JTextField();
        Txtszerencse1 = new javax.swing.JTextField();
        LblArany = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jUgyeseg = new javax.swing.JButton();
        jeletero = new javax.swing.JButton();
        jszerencse = new javax.swing.JButton();
        JplLeiras = new javax.swing.JPanel();
        BtnBalOldalSzam = new javax.swing.JButton();
        BtnJobbOldalSzam = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtLeiras = new javax.swing.JTextArea();
        BtnKilpes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 500, 500));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setPreferredSize(new java.awt.Dimension(768, 460));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1477, 752, 50, 10));

        JplStat.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        TxtUgyeseg.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        TxtUgyeseg.setText("0");
        TxtUgyeseg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUgyesegActionPerformed(evt);
            }
        });

        TxtEletero.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        TxtEletero.setText("0");

        Txtszerencse1.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        Txtszerencse1.setText("44");

        LblArany.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblArany.setText("Arany:");

        jTextField4.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jTextField4.setText("44");

        jUgyeseg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jUgyeseg.setText("Ügyeség");
        jUgyeseg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUgyesegActionPerformed(evt);
            }
        });

        jeletero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jeletero.setText("Életerő");
        jeletero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeleteroActionPerformed(evt);
            }
        });

        jszerencse.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jszerencse.setText("Szerencse");
        jszerencse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jszerencseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JplStatLayout = new javax.swing.GroupLayout(JplStat);
        JplStat.setLayout(JplStatLayout);
        JplStatLayout.setHorizontalGroup(
            JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JplStatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jszerencse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jeletero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JplStatLayout.createSequentialGroup()
                        .addComponent(LblArany)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jUgyeseg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txtszerencse1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEletero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtUgyeseg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        JplStatLayout.setVerticalGroup(
            JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JplStatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtUgyeseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUgyeseg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEletero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jeletero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtszerencse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jszerencse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblArany)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(JplStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 140));

        JplLeiras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnBalOldalSzam.setText("66.oldal");
        BtnBalOldalSzam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBalOldalSzamActionPerformed(evt);
            }
        });

        BtnJobbOldalSzam.setText("270.oldal");
        BtnJobbOldalSzam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJobbOldalSzamActionPerformed(evt);
            }
        });

        TxtLeiras.setColumns(20);
        TxtLeiras.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        TxtLeiras.setRows(5);
        TxtLeiras.setText("Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal oldali fal mellett áll.\n Hat doboz van rajta, egyikükre a te neved festették. Ha kiakarod nyitni a dobozt, lapozz a 270-re. \nHa inkább tovább haladsz észak felé, lapozz a 66-ra.");
        jScrollPane1.setViewportView(TxtLeiras);

        BtnKilpes.setText("Kilépés");
        BtnKilpes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnKilpesMouseClicked(evt);
            }
        });
        BtnKilpes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKilpesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JplLeirasLayout = new javax.swing.GroupLayout(JplLeiras);
        JplLeiras.setLayout(JplLeirasLayout);
        JplLeirasLayout.setHorizontalGroup(
            JplLeirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JplLeirasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JplLeirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JplLeirasLayout.createSequentialGroup()
                        .addComponent(BtnBalOldalSzam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 500, Short.MAX_VALUE)
                        .addComponent(BtnKilpes)
                        .addGap(35, 35, 35)
                        .addComponent(BtnJobbOldalSzam)))
                .addContainerGap())
        );
        JplLeirasLayout.setVerticalGroup(
            JplLeirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JplLeirasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JplLeirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JplLeirasLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(BtnBalOldalSzam))
                    .addGroup(JplLeirasLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(JplLeirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnJobbOldalSzam)
                            .addComponent(BtnKilpes))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(JplLeiras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 770, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LajkóGergő(SZOFT_202\\Documents\\NetBeansProjects\\2023.11.22\\HalalLabirintus\\HalalLabirintus\\kepek\\hatter.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 1000));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*ImageIcon kep = new ImageIcon("menű 1.png");
        JOptionPane.showMessageDialog(evt, kep);
        JOptionPane.showMessageDialog(null, kep);*/
        
    }//GEN-LAST:event_formWindowOpened

    private void BtnKilpesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnKilpesMouseClicked
 
    }//GEN-LAST:event_BtnKilpesMouseClicked

    private void BtnKilpesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKilpesActionPerformed
        System.exit(0);
        int IkonTipus = 0;
        String uzenet, cim;
        cim="FIGYELEM";
        uzenet="Biztos ki akarsz lépni?";
        JOptionPane.showConfirmDialog(null,uzenet, cim, IkonTipus);
        
        
    }//GEN-LAST:event_BtnKilpesActionPerformed

    private void TxtUgyesegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUgyesegActionPerformed
       
    }//GEN-LAST:event_TxtUgyesegActionPerformed

    private void BtnBalOldalSzamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBalOldalSzamActionPerformed
 TxtLeiras.setText("Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban.\n Egy, a falra festett fehér nyíl nyugatfelé mutat.\n A földön nedves lábnyomok jelzik, merre haladtak az előtted járók.\n Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy.\n Ha nyugat felé kívánsz menni, lapozz a 293-ra. Ha keletnek, lapozz a 56-re.");
 BtnBalOldalSzam.setText("56.oldal");
 BtnJobbOldalSzam.setText("270.olda");
 
 
    }//GEN-LAST:event_BtnBalOldalSzamActionPerformed

    private void BtnJobbOldalSzamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJobbOldalSzamActionPerformed
 TxtLeiras.setText("A három pár nedves lábnyomot követve az alagútnyugati elágazásában hamarosan egy újabb el-ágazáshoz érsz.\n Ha továbbmész nyugat felé a lábnyomokat követve, lapozz a 137-re.\n Ha inkább észak felé mész a harmadik pár lábnyom után, lapozz a 387-re.\n");
 BtnJobbOldalSzam.setText("293.oldal");
 BtnBalOldalSzam.setText("56.oldal");{
     TxtLeiras.setText("Látod, hogy az akadály egy széles, barna, sziklaszerű tárgy. Megérinted, és meglepve tapasztalod, hogy lágy, szivacsszerű. Ha át szeretnél mászni rajta, lapozz a 373-ra. Ha ketté akarod vágni a kardoddal, lapozz a 215-re.");
 }
    }//GEN-LAST:event_BtnJobbOldalSzamActionPerformed

    private void jUgyesegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUgyesegActionPerformed
        Random random = new Random();
        doboKockaSzam= random.nextInt(6)+1;
        TxtUgyeseg.setText(String.valueOf(doboKockaSzam+6));
    }//GEN-LAST:event_jUgyesegActionPerformed

    private void jeleteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeleteroActionPerformed
        Random random = new Random();
        doboKockaSzam= random.nextInt(12)+1;
        TxtEletero.setText(String.valueOf(doboKockaSzam+12));
    }//GEN-LAST:event_jeleteroActionPerformed

    private void jszerencseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jszerencseActionPerformed
       Random random = new Random();
        doboKockaSzam= random.nextInt(6)+1;
        Txtszerencse1.setText(String.valueOf(doboKockaSzam+6));
    }//GEN-LAST:event_jszerencseActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalalLabirintus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBalOldalSzam;
    private javax.swing.JButton BtnJobbOldalSzam;
    private javax.swing.JButton BtnKilpes;
    private javax.swing.JPanel JplLeiras;
    private javax.swing.JPanel JplStat;
    private javax.swing.JLabel LblArany;
    private javax.swing.JTextField TxtEletero;
    private javax.swing.JTextArea TxtLeiras;
    private javax.swing.JTextField TxtUgyeseg;
    private javax.swing.JTextField Txtszerencse1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jUgyeseg;
    private javax.swing.JButton jeletero;
    private javax.swing.JButton jszerencse;
    // End of variables declaration//GEN-END:variables

    private int generateRandomNumber(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class random {

        private static int nextInt(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public random() {
        }
    }
}
