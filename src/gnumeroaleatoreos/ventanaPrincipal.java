/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gnumeroaleatoreos;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author juan
 */
public class ventanaPrincipal extends javax.swing.JFrame {
Verificar vr;    
boolean flag = false;
String base;
double vector[];

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        initComponents();
        
buttonGroup1.add(opcmulti);
buttonGroup1.add(opcmix);
buttonGroup2.add(opcd);
buttonGroup2.add(opcb);
textpm.setText("");
textpa.setText("");
textpc.setText("");
textpx0.setText("");
textpn.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textpc = new javax.swing.JTextField();
        textpx0 = new javax.swing.JTextField();
        textpm = new javax.swing.JTextField();
        textpa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        opcd = new javax.swing.JCheckBox();
        opcb = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        opcmulti = new javax.swing.JCheckBox();
        opcmix = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textpmatiz = new javax.swing.JTextField();
        textppala = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        resultadospp = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultadop = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultadopp = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        textpn = new javax.swing.JTextField();
        textpalf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        prueba = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Generador de numeros aleatorios");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        textpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpcActionPerformed(evt);
            }
        });
        textpc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textpcKeyTyped(evt);
            }
        });

        textpx0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textpx0KeyTyped(evt);
            }
        });

        textpm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textpmKeyTyped(evt);
            }
        });

        textpa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textpaKeyTyped(evt);
            }
        });

        jLabel3.setText("A");

        jLabel2.setText("M");

        jLabel5.setText("Xo");

        jLabel4.setText("C");

        opcd.setText("Decimal");
        opcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcdActionPerformed(evt);
            }
        });

        opcb.setText("Binario");
        opcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcbActionPerformed(evt);
            }
        });

        jLabel12.setText("Base del sistema:");

        opcmulti.setText("Multiplicativo");
        opcmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcmultiActionPerformed(evt);
            }
        });

        opcmix.setText("Mixto");
        opcmix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcmixActionPerformed(evt);
            }
        });

        jLabel13.setText("Tipo de generador congruencial");

        jLabel14.setText("Mantisa");

        jLabel15.setText("Tamaño de palabra");

        textpmatiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpmatizActionPerformed(evt);
            }
        });
        textpmatiz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textpmatizKeyTyped(evt);
            }
        });

        textppala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textppalaActionPerformed(evt);
            }
        });
        textppala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textppalaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textpx0, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(textpc)
                    .addComponent(textpa)
                    .addComponent(textpm))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(opcmix)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(opcb, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel15))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(opcd)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel14))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textpmatiz, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textppala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcmulti)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcb)
                            .addComponent(jLabel15)
                            .addComponent(textppala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcd)
                            .addComponent(jLabel14)
                            .addComponent(textpmatiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textpx0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcmulti)
                    .addComponent(opcmix))
                .addGap(80, 80, 80))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 0, 51));

        resultadop.setColumns(20);
        resultadop.setRows(5);
        jScrollPane2.setViewportView(resultadop);

        resultadospp.addTab("Parametros ", jScrollPane2);

        resultadopp.setColumns(20);
        resultadopp.setRows(5);
        jScrollPane3.setViewportView(resultadopp);

        resultadospp.addTab("Resultados", jScrollPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(resultadospp, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultadospp, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));

        jLabel9.setText("Komogorov Smith");

        jLabel8.setText("Distribucion z");

        jLabel7.setText("Preba de distancias");

        jButton1.setText("Calcular");

        jButton3.setText("Calcular");

        jButton2.setText("Calcular");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Pruebas Estadisticas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel7)
                            .addGap(27, 27, 27)
                            .addComponent(jButton3))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(28, 28, 28)
                                    .addComponent(jButton1))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton2))
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton3))
                .addGap(28, 28, 28))
        );

        jPanel5.setBackground(new java.awt.Color(51, 255, 204));

        textpn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textpnKeyTyped(evt);
            }
        });

        textpalf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textpalfKeyTyped(evt);
            }
        });

        jLabel11.setText("Significancia (alfa):");

        jLabel10.setText("Cantidad de numeros aleatorios (n)");

        jLabel16.setText("%");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(textpalf, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addComponent(textpn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textpalf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        prueba.setText("Prueba");
        prueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pruebaActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(prueba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(473, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(543, 543, 543))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prueba)
                                    .addComponent(jButton4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void textpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpcActionPerformed

    private void opcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcbActionPerformed
textppala.enable(true);
        base="2";   
textpmatiz.setText("");
textpmatiz.enable(false);// TODO add your handling code here:
    }//GEN-LAST:event_opcbActionPerformed

    private void textpmatizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpmatizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpmatizActionPerformed

    private void textpmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textpmKeyTyped
char car = evt.getKeyChar();
if((car<'0' || car>'9')) evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_textpmKeyTyped

    private void textpaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textpaKeyTyped

        char car = evt.getKeyChar();
if((car<'0' || car>'9')) evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_textpaKeyTyped

    private void textpcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textpcKeyTyped
char car = evt.getKeyChar();
if((car<'0' || car>'9')) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_textpcKeyTyped

    private void textpx0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textpx0KeyTyped
char car = evt.getKeyChar();
if((car<'0' || car>'9')) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_textpx0KeyTyped

    private void textpmatizKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textpmatizKeyTyped
char car = evt.getKeyChar();
if((car<'0' || car>'9')) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_textpmatizKeyTyped

    private void textpnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textpnKeyTyped
char car = evt.getKeyChar();
if((car<'0' || car>'9')) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_textpnKeyTyped

    private void textpalfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textpalfKeyTyped
char car = evt.getKeyChar();
if((car<'0' || car>'9')) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_textpalfKeyTyped

    private void textppalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textppalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textppalaActionPerformed

    private void textppalaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textppalaKeyTyped
char car = evt.getKeyChar();
if((car<'0' || car>'9')) evt.consume();           // TODO add your handling code here:
    }//GEN-LAST:event_textppalaKeyTyped

    private void opcmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcmultiActionPerformed
flag=true;
    //opcmulti.enable(true);
    textpc.setText("0");
    textpc.enable(false);
//    opcmix.
        // TODO add your handling code here:
    }//GEN-LAST:event_opcmultiActionPerformed

    private void opcmixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcmixActionPerformed
textpc.enable(true);  
//opcmix.enable(true);
if(textpc.getText()==""){textpc.setText("");} else textpc.setText(textpc.getText());

//opcmulti.enable(false);// TODO add your handling code here:
    }//GEN-LAST:event_opcmixActionPerformed

    private void opcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcdActionPerformed
textpmatiz.enable(true);
        base="10"; 
textppala.setText("");
textppala.enable(false);// TODO add your handling code here:
    }//GEN-LAST:event_opcdActionPerformed
int cantidad;
int temporalbase;
    private void pruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pruebaActionPerformed

        //resultadop.setText(base);
        
       
   if( textpm.getText() ==null || textpm.getText().equals("") || textpa.getText() ==null || textpa.getText().equals("")||textpc.getText() ==null || textpc.getText().equals("")|| textpx0.getText() ==null || textpx0.getText().equals("")||textpn.getText() ==null || textpn.getText().equals(""))
   {resultadop.setText("ERROR !!!! !!");
   
   
   //Icon ico = new ImageIcon(getClass().getResource("/imagenes/image.png"));
   JOptionPane.showMessageDialog(this,"PI!! falta uno o mas campos por llenar", "Titulo del mensaje",JOptionPane.WARNING_MESSAGE);
   //javax.swing.JOptionPane. showMessageDialog (this, "[mira te falta llenar uno o mas espacios]");
   
   } 
  
   else{
       
        String tempn=textpn.getText();
    cantidad=Integer.parseInt(tempn);
    temporalbase=Integer.parseInt(base);
    ///////////////////////////////
    vector=new double[cantidad];
    
     if(temporalbase==2){
    vr=new Verificar(textpm.getText(),textpa.getText(),textpc.getText(),textpx0.getText(), base,textppala.getText() );
     resultadop.setText(textpm.getText()+""+textpa.getText()+""+textpc.getText()+""+textpx0.getText()+""+base+""+textppala.getText()+""+textpn.getText());
     }
     
    if(temporalbase==10){
    vr=new Verificar(textpm.getText(),textpa.getText(),textpc.getText(),textpx0.getText(), base,textpmatiz.getText() );
    resultadop.setText(textpm.getText()+""+textpa.getText()+""+textpc.getText()+""+textpx0.getText()+""+base+""+textpmatiz.getText()+""+textpn.getText());
    }  
     //envio toda la informaicon que necesito.
   // 
    if(flag==false){         //si es congruencial mixto
        double x;
        for(int i=1; i<=cantidad; i++){
            x=vr.formula_mixto();
            vector[i-1]=x;
            System.out.println((i)+". "+x);
        }        
    }
    else{                       //si no 
        double x;
        for(int i=1; i<=cantidad; i++){
            x=vr.formula_multi();
            vector[i-1]=x;
            System.out.println((i)+". "+x);
        }        
    }
   }   // TODO add your handling code here:
    }//GEN-LAST:event_pruebaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.out.println("hola jajaj");
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox opcb;
    private javax.swing.JCheckBox opcd;
    private javax.swing.JCheckBox opcmix;
    private javax.swing.JCheckBox opcmulti;
    private javax.swing.JButton prueba;
    private javax.swing.JTextArea resultadop;
    private javax.swing.JTextArea resultadopp;
    private javax.swing.JTabbedPane resultadospp;
    private javax.swing.JTextField textpa;
    private javax.swing.JTextField textpalf;
    private javax.swing.JTextField textpc;
    private javax.swing.JTextField textpm;
    private javax.swing.JTextField textpmatiz;
    private javax.swing.JTextField textpn;
    private javax.swing.JTextField textppala;
    private javax.swing.JTextField textpx0;
    // End of variables declaration//GEN-END:variables
}
