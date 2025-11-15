/*     */ package org.testrun;
/*     */
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Button;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.FileNotFoundException;
/*     */ import javax.swing.JFileChooser;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JTabbedPane;
/*     */ import javax.swing.JTextField;
/*     */
/*     */ public class Tool extends JFrame {
    /*     */   private static final long serialVersionUID = 1L;
    /*     */
    /*     */   private JTabbedPane tabbedPane;
    /*     */
    /*     */   private JPanel panel1;
    /*     */
    /*     */   public static void main(String[] args) throws FileNotFoundException {
        /*  52 */     Tool mainFrame = new Tool();
        /*  53 */     mainFrame.setVisible(true);
        /*     */   }
    /*     */
    /*     */   public Tool() {
        /*  62 */     setSize(600, 320);
        /*  63 */     setBackground(Color.getColor("c8c8c8"));
        /*  67 */     setFont(getFont());
        /*  69 */     JPanel topPanel = new JPanel();
        /*  70 */     topPanel.setLayout(new BorderLayout());
        /*  71 */     getContentPane().add(topPanel);
        /*  74 */     createPage1();
        /*  77 */     this.tabbedPane = new JTabbedPane();
        /*  78 */     this.tabbedPane.setFont(new Font("Serif", 1, 15));
        /*  79 */     this.tabbedPane.addTab("REGRESSION REPORT TOOL", this.panel1);
        /*  80 */     topPanel.add(this.tabbedPane, "Center");
        /*     */   }
    /*     */
    /*     */   private void createPage1() {
        /*     */     try {
            /*  93 */       this.panel1 = new JPanel();
            /*  94 */       this.panel1.setLayout((LayoutManager)null);
            /*  95 */       this.panel1.setBackground(Color.getColor("0099FF"));
            /* 100 */       this.panel1.setFont(new Font("Serif", 1, 15));
            /* 102 */       JLabel label1 = new JLabel("TEST RUN LINK");
            /* 103 */       label1.setBounds(10, 20, 200, 20);
            /* 104 */       label1.setFont(new Font("Serif", 1, 15));
            /* 105 */       this.panel1.add(label1);
            /* 107 */       final JTextField FILEPath = new JTextField();
            /* 108 */       FILEPath.setBounds(200, 20, 350, 20);
            /* 109 */       this.panel1.add(FILEPath);
            /* 116 */       FILEPath.addActionListener(new ActionListener() {
                /*     */             public void actionPerformed(ActionEvent e) {
                    /* 120 */               JFileChooser chooser = new JFileChooser();
                    /* 121 */               chooser.setDialogTitle("Choose FILE folder path");
                    /* 123 */               chooser.setFileSelectionMode(1);
                    /* 125 */               chooser.setAcceptAllFileFilterUsed(false);
                    /* 127 */               if (chooser.showOpenDialog(null) == 0) {
                        /* 130 */                 String selectedPath = chooser.getSelectedFile().getName();
                        /* 133 */                 FILEPath.setText(selectedPath);
                        /*     */               }
                    /*     */             }
                /*     */           });
            /* 144 */       JLabel label5 = new JLabel("TEST RUN PASSWORD");
            /* 145 */       label5.setBounds(10, 50, 200, 20);
            /* 146 */       label5.setFont(new Font("Serif", 1, 15));
            /* 148 */       this.panel1.add(label5);
            /* 150 */       final JPasswordField namerun = new JPasswordField();
            /* 153 */       namerun.setBounds(200, 50, 350, 20);
            /* 154 */       this.panel1.add(namerun);
            /* 161 */       namerun.addActionListener(new ActionListener() {
                /*     */             public void actionPerformed(ActionEvent e) {
                    /* 165 */               JFileChooser chooser = new JFileChooser();
                    /* 166 */               chooser.setDialogTitle("Choose FILE folder path");
                    /* 168 */               chooser.setFileSelectionMode(1);
                    /* 170 */               chooser.setAcceptAllFileFilterUsed(false);
                    /* 172 */               if (chooser.showOpenDialog(null) == 0) {
                        /* 175 */                 String selectedPath = chooser.getSelectedFile().getName();
                        /* 178 */                 namerun.setText(selectedPath);
                        /*     */               }
                    /*     */             }
                /*     */           });
            /* 189 */       JLabel label2 = new JLabel("MAIL ID");
            /* 190 */       label2.setBounds(10, 80, 200, 20);
            /* 191 */       label2.setFont(new Font("Serif", 1, 15));
            /* 192 */       this.panel1.add(label2);
            /* 194 */       final JTextField user = new JTextField();
            /* 195 */       user.setBounds(200, 80, 350, 20);
            /* 196 */       this.panel1.add(user);
            /* 203 */       user.addActionListener(new ActionListener() {
                /*     */             public void actionPerformed(ActionEvent e) {
                    /* 207 */               JFileChooser chooser = new JFileChooser();
                    /* 208 */               chooser.setDialogTitle("Choose FILE folder path");
                    /* 210 */               chooser.setFileSelectionMode(1);
                    /* 212 */               chooser.setAcceptAllFileFilterUsed(false);
                    /* 214 */               if (chooser.showOpenDialog(null) == 0) {
                        /* 217 */                 String selectedPath = chooser.getSelectedFile().getName();
                        /* 220 */                 user.setText(selectedPath);
                        /*     */               }
                    /*     */             }
                /*     */           });
            /* 230 */       JLabel label3 = new JLabel("SYSTEM PASSWORD");
            /* 231 */       label3.setBounds(10, 110, 200, 20);
            /* 232 */       label3.setFont(new Font("Serif", 1, 15));
            /* 234 */       this.panel1.add(label3);
            /* 236 */       final JPasswordField password = new JPasswordField();
            /* 239 */       password.setBounds(200, 110, 350, 20);
            /* 240 */       this.panel1.add(password);
            /* 247 */       password.addActionListener(new ActionListener() {
                /*     */             public void actionPerformed(ActionEvent e) {
                    /* 251 */               JFileChooser chooser = new JFileChooser();
                    /* 252 */               chooser.setDialogTitle("Choose FILE folder path");
                    /* 254 */               chooser.setFileSelectionMode(1);
                    /* 256 */               chooser.setAcceptAllFileFilterUsed(false);
                    /* 258 */               if (chooser.showOpenDialog(null) == 0) {
                        /* 261 */                 String selectedPath = chooser.getSelectedFile().getName();
                        /* 264 */                 password.setText(selectedPath);
                        /*     */               }
                    /*     */             }
                /*     */           });
            /* 275 */       JLabel label6 = new JLabel("JIRA PASSWORD");
            /* 276 */       label6.setBounds(10, 140, 200, 20);
            /* 277 */       label6.setFont(new Font("Serif", 1, 15));
            /* 279 */       this.panel1.add(label6);
            /* 281 */       final JPasswordField jirapassword = new JPasswordField();
            /* 284 */       jirapassword.setBounds(200, 140, 350, 20);
            /* 285 */       this.panel1.add(jirapassword);
            /* 292 */       jirapassword.addActionListener(new ActionListener() {
                /*     */             public void actionPerformed(ActionEvent e) {
                    /* 296 */               JFileChooser chooser = new JFileChooser();
                    /* 297 */               chooser.setDialogTitle("Choose FILE folder path");
                    /* 299 */               chooser.setFileSelectionMode(1);
                    /* 301 */               chooser.setAcceptAllFileFilterUsed(false);
                    /* 303 */               if (chooser.showOpenDialog(null) == 0) {
                        /* 306 */                 String selectedPath = chooser.getSelectedFile().getName();
                        /* 309 */                 password.setText(selectedPath);
                        /*     */               }
                    /*     */             }
                /*     */           });
            /* 321 */       JLabel label4 = new JLabel("NAME");
            /* 322 */       label4.setBounds(10, 170, 200, 20);
            /* 323 */       label4.setFont(new Font("Serif", 1, 15));
            /* 325 */       this.panel1.add(label4);
            /* 328 */       final JTextField name = new JTextField();
            /* 330 */       name.setBounds(200, 170, 350, 20);
            /* 331 */       this.panel1.add(name);
            /* 338 */       name.addActionListener(new ActionListener() {
                /*     */             public void actionPerformed(ActionEvent e) {
                    /* 342 */               JFileChooser chooser = new JFileChooser();
                    /* 343 */               chooser.setDialogTitle("Choose FILE folder path");
                    /* 345 */               chooser.setFileSelectionMode(1);
                    /* 347 */               chooser.setAcceptAllFileFilterUsed(false);
                    /* 349 */               if (chooser.showOpenDialog(null) == 0) {
                        /* 352 */                 String selectedPath = chooser.getSelectedFile().getName();
                        /* 355 */                 name.setText(selectedPath);
                        /*     */               }
                    /*     */             }
                /*     */           });
            /* 368 */       Button b1 = new Button("RUN THE TOOL");
            /* 370 */       this.panel1.add(b1);
            /* 371 */       b1.setBounds(250, 210, 150, 30);
            /* 374 */       b1.addActionListener(new ActionListener() {
                /*     */             public void actionPerformed(ActionEvent e) {
                    /* 378 */               String FILEPath1 = FILEPath.getText();
                    /* 380 */               String FILEPath2 = user.getText();
                    /* 382 */               String FILEPath3 = password.getText();
                    /* 384 */               String FILEPath4 = name.getText();
                    /* 387 */               String FILEPath5 = namerun.getText();
                    /* 389 */               String FILEPath6 = jirapassword.getText();
                    /*     */               try {
                        /* 401 */                 testrun rt = new testrun();
                        /* 402 */                 rt.samplemailtool(FILEPath1, FILEPath2, FILEPath3, FILEPath4, FILEPath5, FILEPath6);
                        /* 419 */               } catch (Exception e1) {
                        /* 421 */                 e1.printStackTrace();
                        /*     */               } finally {
                        /* 425 */                 JOptionPane.showMessageDialog(null, "Your process is done!", "Message", 1);
                        /*     */               }
                    /*     */             }
                /*     */           });
            /* 435 */     } catch (Exception e) {
            /* 438 */       System.out.println("File Not found" + e);
            /*     */     }
        /*     */   }
    /*     */ }