/*     */ package must;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Image;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LayoutStyle;
/*     */ import javax.swing.UIManager;
/*     */ 
/*     */ public class claculator extends JFrame {
/*     */   double num1;
/*     */   double num2;
/*     */   char op;
/*     */   double result;
/*     */   private JButton b0;
/*     */   
/*     */   public claculator() {
/*  25 */     initComponents();
/*     */   }
/*     */   private JButton b1; private JButton b2; private JButton b3; private JButton b4; private JButton b5; private JButton b6; private JButton b7; private JButton b8; private JButton b9; private JButton bclear; private JButton bdiv;
/*     */   private JButton bmul;
/*     */   private JButton boff;
/*     */   private JButton br;
/*     */   private JButton bsub;
/*     */   private JButton bsum;
/*     */   private JButton jButton1;
/*     */   private JTextField text;
/*     */   
/*     */   private void initComponents() {
/*  37 */     this.jButton1 = new JButton();
/*  38 */     this.text = new JTextField();
/*  39 */     this.boff = new JButton();
/*  40 */     this.b7 = new JButton();
/*  41 */     this.b4 = new JButton();
/*  42 */     this.b1 = new JButton();
/*  43 */     this.b8 = new JButton();
/*  44 */     this.b5 = new JButton();
/*  45 */     this.b2 = new JButton();
/*  46 */     this.b3 = new JButton();
/*  47 */     this.b9 = new JButton();
/*  48 */     this.b6 = new JButton();
/*  49 */     this.b0 = new JButton();
/*  50 */     this.br = new JButton();
/*  51 */     this.bsub = new JButton();
/*  52 */     this.bdiv = new JButton();
/*  53 */     this.bmul = new JButton();
/*  54 */     this.bsum = new JButton();
/*  55 */     this.bclear = new JButton();
/*     */     
/*  57 */     this.jButton1.setText("jButton1");
/*     */     
/*  59 */     setDefaultCloseOperation(3);
/*  60 */     setForeground(new Color(255, 102, 102));
/*  61 */     addWindowListener(new WindowAdapter() {
/*     */           public void windowOpened(WindowEvent evt) {
/*  63 */             claculator.this.formWindowOpened(evt);
/*     */           }
/*     */         });
/*     */     
/*  67 */     this.text.setFont(new Font("Tahoma", 0, 36));
/*  68 */     this.text.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  70 */             claculator.this.textActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  74 */     this.boff.setBackground(new Color(255, 204, 204));
/*  75 */     this.boff.setFont(new Font("Verdana", 0, 18));
/*  76 */     this.boff.setForeground(new Color(255, 0, 51));
/*  77 */     this.boff.setText("off");
/*  78 */     this.boff.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  80 */             claculator.this.boffActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  84 */     this.b7.setBackground(new Color(153, 153, 255));
/*  85 */     this.b7.setFont(new Font("Tahoma", 0, 24));
/*  86 */     this.b7.setText("7");
/*  87 */     this.b7.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  89 */             claculator.this.b7ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  93 */     this.b4.setBackground(new Color(153, 153, 255));
/*  94 */     this.b4.setFont(new Font("Tahoma", 0, 24));
/*  95 */     this.b4.setText("4");
/*  96 */     this.b4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  98 */             claculator.this.b4ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 102 */     this.b1.setBackground(new Color(153, 153, 255));
/* 103 */     this.b1.setFont(new Font("Tahoma", 0, 24));
/* 104 */     this.b1.setText("1");
/* 105 */     this.b1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 107 */             claculator.this.b1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 111 */     this.b8.setBackground(new Color(153, 153, 255));
/* 112 */     this.b8.setFont(new Font("Tahoma", 0, 24));
/* 113 */     this.b8.setText("8");
/* 114 */     this.b8.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 116 */             claculator.this.b8ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 120 */     this.b5.setBackground(new Color(153, 153, 255));
/* 121 */     this.b5.setFont(new Font("Tahoma", 0, 24));
/* 122 */     this.b5.setText("5");
/* 123 */     this.b5.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 125 */             claculator.this.b5ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 129 */     this.b2.setBackground(new Color(153, 153, 255));
/* 130 */     this.b2.setFont(new Font("Tahoma", 0, 24));
/* 131 */     this.b2.setText("2");
/* 132 */     this.b2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 134 */             claculator.this.b2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 138 */     this.b3.setBackground(new Color(153, 153, 255));
/* 139 */     this.b3.setFont(new Font("Tahoma", 0, 24));
/* 140 */     this.b3.setText("3");
/* 141 */     this.b3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 143 */             claculator.this.b3ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 147 */     this.b9.setBackground(new Color(153, 153, 255));
/* 148 */     this.b9.setFont(new Font("Tahoma", 0, 24));
/* 149 */     this.b9.setText("9");
/* 150 */     this.b9.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 152 */             claculator.this.b9ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 156 */     this.b6.setBackground(new Color(153, 153, 255));
/* 157 */     this.b6.setFont(new Font("Tahoma", 0, 24));
/* 158 */     this.b6.setText("6");
/* 159 */     this.b6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 161 */             claculator.this.b6ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 165 */     this.b0.setBackground(new Color(153, 153, 255));
/* 166 */     this.b0.setFont(new Font("Tahoma", 0, 24));
/* 167 */     this.b0.setText("0");
/* 168 */     this.b0.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 170 */             claculator.this.b0ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 174 */     this.br.setBackground(new Color(204, 204, 255));
/* 175 */     this.br.setFont(new Font("Tahoma", 0, 18));
/* 176 */     this.br.setForeground(new Color(0, 0, 153));
/* 177 */     this.br.setText("=");
/* 178 */     this.br.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 180 */             claculator.this.brActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 184 */     this.bsub.setBackground(new Color(204, 204, 255));
/* 185 */     this.bsub.setFont(new Font("Tahoma", 0, 24));
/* 186 */     this.bsub.setText("-");
/* 187 */     this.bsub.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 189 */             claculator.this.bsubActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 193 */     this.bdiv.setBackground(new Color(204, 204, 255));
/* 194 */     this.bdiv.setFont(new Font("Tahoma", 0, 24));
/* 195 */     this.bdiv.setText("/");
/* 196 */     this.bdiv.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 198 */             claculator.this.bdivActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 202 */     this.bmul.setBackground(new Color(204, 204, 255));
/* 203 */     this.bmul.setFont(new Font("Tahoma", 0, 24));
/* 204 */     this.bmul.setText("*");
/* 205 */     this.bmul.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 207 */             claculator.this.bmulActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 211 */     this.bsum.setBackground(new Color(204, 204, 255));
/* 212 */     this.bsum.setFont(new Font("Tahoma", 0, 24));
/* 213 */     this.bsum.setText("+");
/* 214 */     this.bsum.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 216 */             claculator.this.bsumActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 220 */     this.bclear.setBackground(new Color(204, 255, 204));
/* 221 */     this.bclear.setFont(new Font("Tahoma", 0, 18));
/* 222 */     this.bclear.setForeground(new Color(0, 153, 0));
/* 223 */     this.bclear.setText("clear");
/* 224 */     this.bclear.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 226 */             claculator.this.bclearActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 230 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 231 */     getContentPane().setLayout(layout);
/* 232 */     layout.setHorizontalGroup(layout
/* 233 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 234 */         .addGroup(layout.createSequentialGroup()
/* 235 */           .addContainerGap()
/* 236 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/* 237 */             .addComponent(this.text)
/* 238 */             .addGroup(layout.createSequentialGroup()
/* 239 */               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 240 */                 .addComponent(this.bclear, -1, -1, 32767)
/* 241 */                 .addGroup(layout.createSequentialGroup()
/* 242 */                   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 243 */                     .addGroup(layout.createSequentialGroup()
/* 244 */                       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 245 */                         .addComponent(this.b7, -1, -1, 32767)
/* 246 */                         .addComponent(this.b4, -1, -1, 32767)
/* 247 */                         .addComponent(this.b1, -1, -1, 32767))
/* 248 */                       .addGap(22, 22, 22)
/* 249 */                       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 250 */                         .addComponent(this.b5)
/* 251 */                         .addComponent(this.b2)
/* 252 */                         .addComponent(this.b8)))
/* 253 */                     .addComponent(this.br, -2, 112, -2))
/* 254 */                   .addGap(0, 0, 32767)))
/* 255 */               .addGap(18, 18, 18)
/* 256 */               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 257 */                 .addGroup(layout.createSequentialGroup()
/* 258 */                   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 259 */                     .addComponent(this.b3, -1, 49, 32767)
/* 260 */                     .addComponent(this.b9, -1, -1, 32767)
/* 261 */                     .addComponent(this.b6, -1, -1, 32767)
/* 262 */                     .addComponent(this.b0, -1, -1, 32767))
/* 263 */                   .addGap(18, 18, 18)
/* 264 */                   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 265 */                     .addComponent(this.bdiv, -1, -1, 32767)
/* 266 */                     .addComponent(this.bmul, -1, -1, 32767)
/* 267 */                     .addComponent(this.bsub, -1, -1, 32767)
/* 268 */                     .addComponent(this.bsum, -1, -1, 32767)))
/* 269 */                 .addComponent(this.boff, -1, -1, 32767))))
/* 270 */           .addContainerGap(-1, 32767)));
/*     */     
/* 272 */     layout.setVerticalGroup(layout
/* 273 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 274 */         .addGroup(layout.createSequentialGroup()
/* 275 */           .addContainerGap()
/* 276 */           .addComponent(this.text, -2, 52, -2)
/* 277 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 278 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 279 */             .addComponent(this.bclear, -2, 38, -2)
/* 280 */             .addComponent(this.boff, -2, 40, -2))
/* 281 */           .addGap(9, 9, 9)
/* 282 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 283 */             .addGroup(layout.createSequentialGroup()
/* 284 */               .addComponent(this.b9)
/* 285 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 286 */               .addComponent(this.b6)
/* 287 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 288 */               .addComponent(this.b3))
/* 289 */             .addGroup(layout.createSequentialGroup()
/* 290 */               .addComponent(this.bdiv)
/* 291 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 292 */               .addComponent(this.bmul)
/* 293 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 294 */               .addComponent(this.bsub)
/* 295 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 296 */               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 297 */                 .addComponent(this.bsum)
/* 298 */                 .addComponent(this.b0)))
/* 299 */             .addGroup(layout.createSequentialGroup()
/* 300 */               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 301 */                 .addGroup(layout.createSequentialGroup()
/* 302 */                   .addComponent(this.b7)
/* 303 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 304 */                   .addComponent(this.b4)
/* 305 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 306 */                   .addComponent(this.b1))
/* 307 */                 .addGroup(layout.createSequentialGroup()
/* 308 */                   .addComponent(this.b8)
/* 309 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 310 */                   .addComponent(this.b5)
/* 311 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 312 */                   .addComponent(this.b2)))
/* 313 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 314 */               .addComponent(this.br, -1, -1, 32767)))
/* 315 */           .addContainerGap(14, 32767)));
/*     */ 
/*     */     
/* 318 */     pack();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void textActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void set(int number) {
/* 328 */     String value = this.text.getText() + number;
/* 329 */     this.text.setText(value);
/*     */   }
/*     */   public void sop(char operation) {
/* 332 */     this.num1 = Double.valueOf(this.text.getText()).doubleValue();
/* 333 */     this.text.setText("");
/* 334 */     this.op = operation;
/*     */   }
/*     */   
/*     */   private void boffActionPerformed(ActionEvent evt) {
/* 338 */     System.exit(0);
/*     */   }
/*     */ 
/*     */   
/*     */   private void bsubActionPerformed(ActionEvent evt) {
/* 343 */     sop('-');
/*     */   }
/*     */ 
/*     */   
/*     */   private void bmulActionPerformed(ActionEvent evt) {
/* 348 */     sop('*');
/*     */   }
/*     */ 
/*     */   
/*     */   private void formWindowOpened(WindowEvent evt) {
/* 353 */     setLocationRelativeTo((Component)null);
/*     */     
/*     */     try {
/* 356 */       Image img = ImageIO.read(getClass().getResource("FB_IMG_1529266998679"));
/* 357 */       setIconImage(img);
/*     */     }
/* 359 */     catch (IOException ex) {
/* 360 */       Logger.getLogger(claculator.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void bdivActionPerformed(ActionEvent evt) {
/* 367 */     sop('/');
/*     */   }
/*     */ 
/*     */   
/*     */   private void bclearActionPerformed(ActionEvent evt) {
/* 372 */     this.text.setText(null);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b1ActionPerformed(ActionEvent evt) {
/* 377 */     set(1);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b2ActionPerformed(ActionEvent evt) {
/* 382 */     set(2);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b3ActionPerformed(ActionEvent evt) {
/* 387 */     set(3);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b4ActionPerformed(ActionEvent evt) {
/* 392 */     set(4);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b5ActionPerformed(ActionEvent evt) {
/* 397 */     set(5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b6ActionPerformed(ActionEvent evt) {
/* 402 */     set(6);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b7ActionPerformed(ActionEvent evt) {
/* 407 */     set(7);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b8ActionPerformed(ActionEvent evt) {
/* 412 */     set(8);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b9ActionPerformed(ActionEvent evt) {
/* 417 */     set(9);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b0ActionPerformed(ActionEvent evt) {
/* 422 */     set(0);
/*     */   }
/*     */ 
/*     */   
/*     */   private void bsumActionPerformed(ActionEvent evt) {
/* 427 */     sop('+');
/*     */   }
/*     */   
/*     */   private void brActionPerformed(ActionEvent evt) {
/* 431 */     this.num2 = Double.valueOf(this.text.getText()).doubleValue();
/* 432 */     switch (this.op) { case '+':
/* 433 */         this.result = this.num1 + this.num2; break;
/* 434 */       case '/': this.result = this.num1 / this.num2; break;
/* 435 */       case '-': this.result = this.num1 - this.num2; break;
/* 436 */       case '*': this.result = this.num1 * this.num2; break; }
/*     */     
/* 438 */     this.text.setText(String.valueOf(this.result));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 453 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 454 */         if ("Nimbus".equals(info.getName())) {
/* 455 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 459 */     } catch (ClassNotFoundException ex) {
/* 460 */       Logger.getLogger(claculator.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 461 */     } catch (InstantiationException ex) {
/* 462 */       Logger.getLogger(claculator.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 463 */     } catch (IllegalAccessException ex) {
/* 464 */       Logger.getLogger(claculator.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 465 */     } catch (UnsupportedLookAndFeelException ex) {
/* 466 */       Logger.getLogger(claculator.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 471 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 473 */             (new claculator()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              F:\Work Maybe\My Fucking Projects\my-calculator\my-Calculator.jar!\must\claculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */