/*     */ package org.tar;
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
/*  54 */     Tool mainFrame = new Tool();
/*  55 */     mainFrame.setVisible(true);
/*     */   }
/*     */   
/*     */   public Tool() {
/*  64 */     setSize(600, 280);
/*  65 */     setBackground(Color.getColor("c8c8c8"));
/*  69 */     setFont(getFont());
/*  71 */     JPanel topPanel = new JPanel();
/*  72 */     topPanel.setLayout(new BorderLayout());
/*  73 */     getContentPane().add(topPanel);
/*  76 */     createPage1();
/*  79 */     this.tabbedPane = new JTabbedPane();
/*  80 */     this.tabbedPane.setFont(new Font("Serif", 1, 15));
/*  81 */     this.tabbedPane.addTab("EXECUTION REPORT TOOL", this.panel1);
/*  82 */     topPanel.add(this.tabbedPane, "Center");
/*     */   }
/*     */   
/*     */   private void createPage1() {
/*     */     try {
/*  95 */       this.panel1 = new JPanel();
/*  96 */       this.panel1.setLayout((LayoutManager)null);
/*  97 */       this.panel1.setBackground(Color.getColor("0099FF"));
/* 102 */       this.panel1.setFont(new Font("Serif", 1, 15));
/* 104 */       JLabel label1 = new JLabel("TEST RUN LINK");
/* 105 */       label1.setBounds(10, 20, 200, 20);
/* 106 */       label1.setFont(new Font("Serif", 1, 15));
/* 107 */       this.panel1.add(label1);
/* 109 */       final JTextField FILEPath = new JTextField();
/* 110 */       FILEPath.setBounds(200, 20, 350, 20);
/* 111 */       this.panel1.add(FILEPath);
/* 118 */       FILEPath.addActionListener(new ActionListener() {
/*     */             public void actionPerformed(ActionEvent e) {
/* 122 */               JFileChooser chooser = new JFileChooser();
/* 123 */               chooser.setDialogTitle("Choose FILE folder path");
/* 125 */               chooser.setFileSelectionMode(1);
/* 127 */               chooser.setAcceptAllFileFilterUsed(false);
/* 129 */               if (chooser.showOpenDialog(null) == 0) {
/* 132 */                 String selectedPath = chooser.getSelectedFile().getName();
/* 135 */                 FILEPath.setText(selectedPath);
/*     */               } 
/*     */             }
/*     */           });
/* 146 */       JLabel label5 = new JLabel("TEST RUN PASSWORD");
/* 147 */       label5.setBounds(10, 50, 200, 20);
/* 148 */       label5.setFont(new Font("Serif", 1, 15));
/* 150 */       this.panel1.add(label5);
/* 152 */       final JPasswordField namerun = new JPasswordField();
/* 155 */       namerun.setBounds(200, 50, 350, 20);
/* 156 */       this.panel1.add(namerun);
/* 163 */       namerun.addActionListener(new ActionListener() {
/*     */             public void actionPerformed(ActionEvent e) {
/* 167 */               JFileChooser chooser = new JFileChooser();
/* 168 */               chooser.setDialogTitle("Choose FILE folder path");
/* 170 */               chooser.setFileSelectionMode(1);
/* 172 */               chooser.setAcceptAllFileFilterUsed(false);
/* 174 */               if (chooser.showOpenDialog(null) == 0) {
/* 177 */                 String selectedPath = chooser.getSelectedFile().getName();
/* 180 */                 namerun.setText(selectedPath);
/*     */               } 
/*     */             }
/*     */           });
/* 191 */       JLabel label2 = new JLabel("MAIL ID");
/* 192 */       label2.setBounds(10, 80, 200, 20);
/* 193 */       label2.setFont(new Font("Serif", 1, 15));
/* 194 */       this.panel1.add(label2);
/* 196 */       final JTextField user = new JTextField();
/* 197 */       user.setBounds(200, 80, 350, 20);
/* 198 */       this.panel1.add(user);
/* 205 */       user.addActionListener(new ActionListener() {
/*     */             public void actionPerformed(ActionEvent e) {
/* 209 */               JFileChooser chooser = new JFileChooser();
/* 210 */               chooser.setDialogTitle("Choose FILE folder path");
/* 212 */               chooser.setFileSelectionMode(1);
/* 214 */               chooser.setAcceptAllFileFilterUsed(false);
/* 216 */               if (chooser.showOpenDialog(null) == 0) {
/* 219 */                 String selectedPath = chooser.getSelectedFile().getName();
/* 222 */                 user.setText(selectedPath);
/*     */               } 
/*     */             }
/*     */           });
/* 232 */       JLabel label3 = new JLabel("SYSTEM PASSWORD");
/* 233 */       label3.setBounds(10, 110, 200, 20);
/* 234 */       label3.setFont(new Font("Serif", 1, 15));
/* 236 */       this.panel1.add(label3);
/* 238 */       final JPasswordField password = new JPasswordField();
/* 241 */       password.setBounds(200, 110, 350, 20);
/* 242 */       this.panel1.add(password);
/* 249 */       password.addActionListener(new ActionListener() {
/*     */             public void actionPerformed(ActionEvent e) {
/* 253 */               JFileChooser chooser = new JFileChooser();
/* 254 */               chooser.setDialogTitle("Choose FILE folder path");
/* 256 */               chooser.setFileSelectionMode(1);
/* 258 */               chooser.setAcceptAllFileFilterUsed(false);
/* 260 */               if (chooser.showOpenDialog(null) == 0) {
/* 263 */                 String selectedPath = chooser.getSelectedFile().getName();
/* 266 */                 password.setText(selectedPath);
/*     */               } 
/*     */             }
/*     */           });
/* 278 */       JLabel label4 = new JLabel("NAME");
/* 279 */       label4.setBounds(10, 140, 200, 20);
/* 280 */       label4.setFont(new Font("Serif", 1, 15));
/* 282 */       this.panel1.add(label4);
/* 285 */       final JTextField name = new JTextField();
/* 287 */       name.setBounds(200, 140, 350, 20);
/* 288 */       this.panel1.add(name);
/* 295 */       name.addActionListener(new ActionListener() {
/*     */             public void actionPerformed(ActionEvent e) {
/* 299 */               JFileChooser chooser = new JFileChooser();
/* 300 */               chooser.setDialogTitle("Choose FILE folder path");
/* 302 */               chooser.setFileSelectionMode(1);
/* 304 */               chooser.setAcceptAllFileFilterUsed(false);
/* 306 */               if (chooser.showOpenDialog(null) == 0) {
/* 309 */                 String selectedPath = chooser.getSelectedFile().getName();
/* 312 */                 name.setText(selectedPath);
/*     */               } 
/*     */             }
/*     */           });
/* 323 */       Button b1 = new Button("RUN THE TOOL");
/* 325 */       this.panel1.add(b1);
/* 326 */       b1.setBounds(250, 170, 150, 30);
/* 329 */       b1.addActionListener(new ActionListener() {
/*     */             public void actionPerformed(ActionEvent e) {
/* 333 */               String FILEPath1 = FILEPath.getText();
/* 335 */               String FILEPath2 = user.getText();
/* 337 */               String FILEPath3 = password.getText();
/* 339 */               String FILEPath4 = name.getText();
/* 342 */               String FILEPath5 = namerun.getText();
/*     */               try {
/* 354 */                 Tar rt = new Tar();
/* 355 */                 rt.samplemailtool(FILEPath1, FILEPath2, FILEPath3, FILEPath4, FILEPath5);
/* 372 */               } catch (Exception e1) {
/* 374 */                 e1.printStackTrace();
/*     */               } finally {
/* 378 */                 JOptionPane.showMessageDialog(null, "Your process is done!", "Message", 1);
/*     */               } 
/*     */             }
/*     */           });
/* 388 */     } catch (Exception e) {
/* 391 */       System.out.println("File Not found" + e);
/*     */     } 
/*     */   }
/*     */ }


