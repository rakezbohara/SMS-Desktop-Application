/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package schoolmanagementsystem;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Rakez
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    String user;
    public HomePage() {
        initComponents();
         setExtendedState(HomePage.MAXIMIZED_BOTH);
    }
    public HomePage(String user) {
        this.user=user;
        
        initComponents();
        setExtendedState(HomePage.MAXIMIZED_BOTH);
     
        lblUsername.setText(user);

    }


  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        home = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        lblUsername2 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        img7 = new javax.swing.JLabel();
        img8 = new javax.swing.JLabel();
        img9 = new javax.swing.JLabel();
        img10 = new javax.swing.JLabel();
        img12 = new javax.swing.JLabel();
        img11 = new javax.swing.JLabel();
        img13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblUsername1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        home.setBackground(new java.awt.Color(255,255,255));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/default.png"))); // NOI18N
        img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgMouseExited(evt);
            }
        });

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/staff default.png"))); // NOI18N
        img1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img1MouseExited(evt);
            }
        });

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fee payment default.png"))); // NOI18N
        img2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img2MouseExited(evt);
            }
        });

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payment default.png"))); // NOI18N
        img3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img3MouseExited(evt);
            }
        });

        lblUsername2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        lblUsername2.setForeground(java.awt.Color.darkGray);
        lblUsername2.setText("Dashboard:");

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/subjects default.png"))); // NOI18N
        img4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img4MouseExited(evt);
            }
        });

        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attendence default.png"))); // NOI18N
        img5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img5MouseExited(evt);
            }
        });

        img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/staff info default.png"))); // NOI18N
        img6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img6MouseExited(evt);
            }
        });

        img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student info default.png"))); // NOI18N
        img7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img7MouseExited(evt);
            }
        });

        img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventory default.png"))); // NOI18N
        img8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img8MouseExited(evt);
            }
        });

        img9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings default.png"))); // NOI18N
        img9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img9MouseExited(evt);
            }
        });

        img10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/time table default.png"))); // NOI18N
        img10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img10MouseExited(evt);
            }
        });

        img12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage users default.png"))); // NOI18N
        img12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img12MouseExited(evt);
            }
        });

        img11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exams default.png"))); // NOI18N
        img11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img11MouseExited(evt);
            }
        });

        img13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reports default.png"))); // NOI18N
        img13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img13MouseExited(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(123, 192, 226));

        lblUsername.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        lblUsername.setForeground(java.awt.Color.white);
        lblUsername.setText("User name:");

        lblUsername1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        lblUsername1.setForeground(java.awt.Color.white);
        lblUsername1.setText("User:");

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("School Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(318, 318, 318)
                .addComponent(lblUsername1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(lblUsername1)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logOut.setBackground(java.awt.Color.white);
        logOut.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        logOut.setForeground(java.awt.Color.darkGray);
        logOut.setText("Log Out");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(187, 43, 43));
        jPanel2.setPreferredSize(new java.awt.Dimension(70, 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(187, 43, 43));
        jPanel4.setPreferredSize(new java.awt.Dimension(120, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsername2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(homeLayout.createSequentialGroup()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img)
                            .addComponent(img7))
                        .addGap(18, 18, 18)
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(homeLayout.createSequentialGroup()
                                .addComponent(img6)
                                .addGap(18, 18, 18)
                                .addComponent(img5)
                                .addGap(18, 18, 18)
                                .addComponent(img4)
                                .addGap(18, 18, 18)
                                .addComponent(img9)
                                .addGap(18, 18, 18)
                                .addComponent(img12)
                                .addGap(18, 18, 18)
                                .addComponent(img13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(homeLayout.createSequentialGroup()
                                .addComponent(img1)
                                .addGap(18, 18, 18)
                                .addComponent(img2)
                                .addGap(18, 18, 18)
                                .addComponent(img3)
                                .addGap(18, 18, 18)
                                .addComponent(img8)
                                .addGap(18, 18, 18)
                                .addComponent(img10)
                                .addGap(18, 18, 18)
                                .addComponent(img11))))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOut))
                .addGap(146, 146, 146))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblUsername2))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(logOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img)
                            .addComponent(img1)
                            .addComponent(img2)
                            .addComponent(img3)
                            .addComponent(img8)
                            .addComponent(img10)
                            .addComponent(img11))
                        .addGap(54, 54, 54)
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(img7)
                            .addComponent(img6)
                            .addComponent(img5)
                            .addComponent(img4)
                            .addComponent(img9)
                            .addComponent(img12)))
                    .addComponent(img13))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        home.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(lblUsername2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(img13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(logOut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        home.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu2.setText("RestService");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Upload Student Info");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Upload Student Marksheet");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Upload Student Report");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseClicked

       
       new NewAdmission().setVisible(true);
    }//GEN-LAST:event_imgMouseClicked

    private void imgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseEntered

        img.setIcon(new ImageIcon(getClass().getResource("/images/clicked.png")));
        // img.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/admin.png")));
        //   getContentPane().add(img);
        // img.setBounds(100, 220, 68, 30);
    }//GEN-LAST:event_imgMouseEntered

    private void imgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseExited

        img.setIcon(new ImageIcon(getClass().getResource("/images/default.png")));
    }//GEN-LAST:event_imgMouseExited

    private void img1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseEntered
        img1.setIcon(new ImageIcon(getClass().getResource("/images/staff clicked.png")));
    }//GEN-LAST:event_img1MouseEntered

    private void img1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseExited
        img1.setIcon(new ImageIcon(getClass().getResource("/images/staff default.png")));
    }//GEN-LAST:event_img1MouseExited

    private void img2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img2MouseEntered
        img2.setIcon(new ImageIcon(getClass().getResource("/images/fee payment clicked.png")));
    }//GEN-LAST:event_img2MouseEntered

    private void img2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img2MouseExited
        img2.setIcon(new ImageIcon(getClass().getResource("/images/fee payment default.png")));
    }//GEN-LAST:event_img2MouseExited

    private void img3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MouseEntered
        img3.setIcon(new ImageIcon(getClass().getResource("/images/payment clicked.png")));
    }//GEN-LAST:event_img3MouseEntered

    private void img3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MouseExited
        img3.setIcon(new ImageIcon(getClass().getResource("/images/payment default.png")));
    }//GEN-LAST:event_img3MouseExited

    private void img4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img4MouseEntered
        img4.setIcon(new ImageIcon(getClass().getResource("/images/subjects clicked.png")));

    }//GEN-LAST:event_img4MouseEntered

    private void img4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img4MouseExited
        img4.setIcon(new ImageIcon(getClass().getResource("/images/subjects default.png")));
    }//GEN-LAST:event_img4MouseExited

    private void img5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img5MouseEntered
        img5.setIcon(new ImageIcon(getClass().getResource("/images/attendence clicked.png")));
    }//GEN-LAST:event_img5MouseEntered

    private void img5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img5MouseExited
        img5.setIcon(new ImageIcon(getClass().getResource("/images/attendence default.png")));
    }//GEN-LAST:event_img5MouseExited

    private void img6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img6MouseEntered
        img6.setIcon(new ImageIcon(getClass().getResource("/images/staff info clicked.png")));
    }//GEN-LAST:event_img6MouseEntered

    private void img6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img6MouseExited
        img6.setIcon(new ImageIcon(getClass().getResource("/images/staff info default.png")));
    }//GEN-LAST:event_img6MouseExited

    private void img7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img7MouseEntered
        img7.setIcon(new ImageIcon(getClass().getResource("/images/student info clicked.png")));
    }//GEN-LAST:event_img7MouseEntered

    private void img7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img7MouseExited
        img7.setIcon(new ImageIcon(getClass().getResource("/images/student info default.png")));
    }//GEN-LAST:event_img7MouseExited

    private void img8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img8MouseEntered
        img8.setIcon(new ImageIcon(getClass().getResource("/images/inventory clicked.png")));
    }//GEN-LAST:event_img8MouseEntered

    private void img8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img8MouseExited
        img8.setIcon(new ImageIcon(getClass().getResource("/images/inventory default.png")));
    }//GEN-LAST:event_img8MouseExited

    private void img9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img9MouseEntered
        img9.setIcon(new ImageIcon(getClass().getResource("/images/settings clicked.png")));
    }//GEN-LAST:event_img9MouseEntered

    private void img9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img9MouseExited
        img9.setIcon(new ImageIcon(getClass().getResource("/images/settings default.png")));
    }//GEN-LAST:event_img9MouseExited

    private void img10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img10MouseEntered
        img10.setIcon(new ImageIcon(getClass().getResource("/images/time table clicked.png")));
    }//GEN-LAST:event_img10MouseEntered

    private void img10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img10MouseExited
        img10.setIcon(new ImageIcon(getClass().getResource("/images/time table default.png")));
    }//GEN-LAST:event_img10MouseExited

    private void img12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img12MouseEntered
        img12.setIcon(new ImageIcon(getClass().getResource("/images/manage users clicked.png")));
    }//GEN-LAST:event_img12MouseEntered

    private void img12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img12MouseExited
        img12.setIcon(new ImageIcon(getClass().getResource("/images/manage users default.png")));
    }//GEN-LAST:event_img12MouseExited

    private void img11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img11MouseEntered
        img11.setIcon(new ImageIcon(getClass().getResource("/images/exams clicked.png")));
    }//GEN-LAST:event_img11MouseEntered

    private void img11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img11MouseExited
        img11.setIcon(new ImageIcon(getClass().getResource("/images/exams default.png")));
    }//GEN-LAST:event_img11MouseExited

    private void img13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img13MouseEntered
        img13.setIcon(new ImageIcon(getClass().getResource("/images/reports clicked.png")));
    }//GEN-LAST:event_img13MouseEntered

    private void img13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img13MouseExited
        img13.setIcon(new ImageIcon(getClass().getResource("/images/reports default.png")));
    }//GEN-LAST:event_img13MouseExited

    private void img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseClicked
        new NewStaff().setVisible(true);
    }//GEN-LAST:event_img1MouseClicked

    private void img6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img6MouseClicked
        new StaffDetails().setVisible(true);
    }//GEN-LAST:event_img6MouseClicked

    private void img7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img7MouseClicked
        new StudentDetails().setVisible(true);
    }//GEN-LAST:event_img7MouseClicked

    private void img2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img2MouseClicked
      if(user.equals("Admin")||user.equals("Accountant")){
        new FeeStructure().setVisible(true);
      }
      else{
      JOptionPane.showMessageDialog(null, "Please Logins as Admin or Accountant ", "Authentication Required!", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_img2MouseClicked

    private void logOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseEntered
     
    }//GEN-LAST:event_logOutMouseEntered

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
       
    }//GEN-LAST:event_logOutMouseExited

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        dispose();
        new RestNotice().setVisible(true);
    }//GEN-LAST:event_logOutMouseClicked

    private void img11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img11MouseClicked
        new MarkSheet().setVisible(true);
    }//GEN-LAST:event_img11MouseClicked

    private void img8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img8MouseClicked
        //JOptionPane.showMessageDialog(this, "Development On Progress!!");
        new inventory().setVisible(true);
    }//GEN-LAST:event_img8MouseClicked

    private void img5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img5MouseClicked
        new RestNotice().setVisible(true);
    }//GEN-LAST:event_img5MouseClicked

    private void img13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img13MouseClicked
        new ReportInn().setVisible(true);
    }//GEN-LAST:event_img13MouseClicked

    private void img10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img10MouseClicked
        JOptionPane.showMessageDialog(this, "Development On Progress!!");
    }//GEN-LAST:event_img10MouseClicked

    private void img3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MouseClicked

         if(user.equals("Admin")||user.equals("Accountant")){
        new staffsalary().setVisible(true);
      }
      else{
      JOptionPane.showMessageDialog(null, "Please Logins as Admin or Accountant ", "Authentication Required!", JOptionPane.ERROR_MESSAGE);
      }
        
    }//GEN-LAST:event_img3MouseClicked

    private void img12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img12MouseClicked
         if(user.equals("Admin")){
        new ManageUsers().setVisible(true);
      }
      else{
      JOptionPane.showMessageDialog(null, "Please Log in as Admin", "Authentication Required", JOptionPane.ERROR_MESSAGE);
      }
       
    }//GEN-LAST:event_img12MouseClicked

    private void img4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img4MouseClicked
      new EditSubject().setVisible(true);
    }//GEN-LAST:event_img4MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        DBHelper dbh = new DBHelper();
        dbh.sendToRest();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        DBHelper dbh = new DBHelper();
        dbh.sendToRestMarks();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        DBHelper dbh = new DBHelper();
        dbh.sendToRestReport();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane home;
    private javax.swing.JLabel img;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img10;
    private javax.swing.JLabel img11;
    private javax.swing.JLabel img12;
    private javax.swing.JLabel img13;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel img8;
    private javax.swing.JLabel img9;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel logOut;
    // End of variables declaration//GEN-END:variables
}
