package halallabirintus;

import javax.swing.ImageIcon;

public class HalalLabirintus extends javax.swing.JFrame {

    public HalalLabirintus() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        JplStat = new javax.swing.JPanel();
        LblUgyeseg = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        LblEletero = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        LblSzerencse = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        JplLeiras = new javax.swing.JPanel();
        BtnBalOldalSzam = new javax.swing.JButton();
        BtnJobbOldalSzam = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BtnStart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 500, 500));
        setMaximumSize(new java.awt.Dimension(768, 432));
        setMinimumSize(new java.awt.Dimension(768, 460));
        setPreferredSize(new java.awt.Dimension(768, 460));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1477, 752, 50, 10));

        JplStat.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        LblUgyeseg.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        LblUgyeseg.setText("Ügyesség:");

        jTextField1.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jTextField1.setText("12");

        LblEletero.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        LblEletero.setText("Életerö:");

        jTextField3.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jTextField3.setText("33");

        LblSzerencse.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        LblSzerencse.setText("Szerencse:");

        jTextField2.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jTextField2.setText("44");

        javax.swing.GroupLayout JplStatLayout = new javax.swing.GroupLayout(JplStat);
        JplStat.setLayout(JplStatLayout);
        JplStatLayout.setHorizontalGroup(
            JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JplStatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JplStatLayout.createSequentialGroup()
                        .addComponent(LblSzerencse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(JplStatLayout.createSequentialGroup()
                        .addComponent(LblEletero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JplStatLayout.createSequentialGroup()
                        .addComponent(LblUgyeseg)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        JplStatLayout.setVerticalGroup(
            JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JplStatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUgyeseg)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEletero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JplStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSzerencse)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        getContentPane().add(JplStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 100));

        JplLeiras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnBalOldalSzam.setText("66.oldal");

        BtnJobbOldalSzam.setText("270.oldal");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal oldali fal mellett áll.\n Hat doboz van rajta, egyikükre a te neved festették. Ha kiakarod nyitni a dobozt, lapozz a 270-re. \nHa inkább tovább haladsz észak felé, lapozz a 66-ra.");
        jScrollPane1.setViewportView(jTextArea1);

        BtnStart.setText("Kilépés");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JplLeirasLayout = new javax.swing.GroupLayout(JplLeiras);
        JplLeiras.setLayout(JplLeirasLayout);
        JplLeirasLayout.setHorizontalGroup(
            JplLeirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JplLeirasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(JplLeirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JplLeirasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(JplLeirasLayout.createSequentialGroup()
                        .addComponent(BtnBalOldalSzam)
                        .addGap(243, 243, 243)
                        .addComponent(BtnStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnJobbOldalSzam)
                        .addGap(24, 24, 24))))
        );
        JplLeirasLayout.setVerticalGroup(
            JplLeirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JplLeirasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JplLeirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBalOldalSzam)
                    .addComponent(BtnJobbOldalSzam)
                    .addComponent(BtnStart))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        getContentPane().add(JplLeiras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 730, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LajkóGergő(SZOFT_202\\Documents\\NetBeansProjects\\2023.11.22\\HalalLabirintus\\HalalLabirintus\\kepek\\hatter.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 1000));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon kep = new ImageIcon("menű 1.png");
        JOptionPane.showMessageDialog(evt, kep);
        JOptionPane.showMessageDialog(null, kep);
        
    }//GEN-LAST:event_formWindowOpened

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
        System.exit(0);
        JOptionPane.showm
    }//GEN-LAST:event_BtnStartActionPerformed

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
    private javax.swing.JButton BtnStart;
    private javax.swing.JPanel JplLeiras;
    private javax.swing.JPanel JplStat;
    private javax.swing.JLabel LblEletero;
    private javax.swing.JLabel LblSzerencse;
    private javax.swing.JLabel LblUgyeseg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
