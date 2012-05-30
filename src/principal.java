
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class principal extends javax.swing.JFrame {
    
ImageIcon hoverx1,hoverx2,Normalx1,Normalx2,eNormal,eHover,fNoramal,fHover; 
boolean ban=false;
int     entradaUno=0,
          entradaDos=0,
          yDeseada=0,
          yResultante=0,
          numeroIteraciones=0,
          error=0,
          net=0;

double pesoSinapticoW1,pesoSinapticoW2,bias,u,incrementoPesoSinapticoW1,incrementoPesoSinapticoW2,incrementoBias,dos;

    
    public principal() {
        initComponents();
        hoverx1=new ImageIcon(getClass().getResource("hoverx1.png"));
        hoverx2=new ImageIcon(getClass().getResource("hoverx2.png"));
        Normalx1=new ImageIcon(getClass().getResource("Normalx1.png"));
        Normalx2=new ImageIcon(getClass().getResource("Normalx2.png"));
        eHover=new ImageIcon(getClass().getResource("Ehover.png"));
        eNormal=new ImageIcon(getClass().getResource("eNormal.png"));
        fNoramal=new ImageIcon(getClass().getResource("fNormal.png"));
        fHover=new ImageIcon(getClass().getResource("fHover.png"));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        funcion = new javax.swing.JLabel();
        xSumatoraiaLabel = new javax.swing.JLabel();
        x2label = new javax.swing.JLabel();
        X1LABEL = new javax.swing.JLabel();
        YR = new javax.swing.JTextField();
        Entrenar = new javax.swing.JButton();
        YD = new javax.swing.JTextField();
        U = new javax.swing.JTextField();
        BIAS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        W2 = new javax.swing.JTextField();
        W1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        X2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        X1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 200, 0, 0));
        setPreferredSize(new java.awt.Dimension(496, 330));
        setResizable(false);

        funcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fNormal.png"))); // NOI18N
        funcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                funcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                funcionMouseExited(evt);
            }
        });
        funcion.setBounds(370, 130, 50, 50);
        jLayeredPane1.add(funcion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        xSumatoraiaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eNormal.png"))); // NOI18N
        xSumatoraiaLabel.setBounds(230, 120, 70, 50);
        jLayeredPane1.add(xSumatoraiaLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        x2label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Normalx2.png"))); // NOI18N
        x2label.setText("jLabel6");
        x2label.setBounds(60, 160, 60, 60);
        jLayeredPane1.add(x2label, javax.swing.JLayeredPane.DEFAULT_LAYER);

        X1LABEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Normalx1.png"))); // NOI18N
        X1LABEL.setBounds(60, 60, 60, 50);
        jLayeredPane1.add(X1LABEL, javax.swing.JLayeredPane.DEFAULT_LAYER);

        YR.setBackground(new java.awt.Color(0, 0, 0));
        YR.setForeground(new java.awt.Color(0, 204, 204));
        YR.setBorder(null);
        YR.setBounds(440, 130, 20, 14);
        jLayeredPane1.add(YR, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Entrenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        Entrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrenarActionPerformed(evt);
            }
        });
        Entrenar.setBounds(420, 260, 50, 30);
        jLayeredPane1.add(Entrenar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        YD.setBackground(new java.awt.Color(0, 0, 0));
        YD.setForeground(new java.awt.Color(0, 204, 204));
        YD.setText("0");
        YD.setBounds(440, 215, 20, 20);
        jLayeredPane1.add(YD, javax.swing.JLayeredPane.DEFAULT_LAYER);

        U.setBackground(new java.awt.Color(0, 0, 0));
        U.setForeground(new java.awt.Color(0, 204, 204));
        U.setText("0.4");
        U.setBorder(null);
        U.setBounds(310, 130, 40, 20);
        jLayeredPane1.add(U, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BIAS.setBackground(new java.awt.Color(0, 0, 0));
        BIAS.setForeground(new java.awt.Color(0, 204, 204));
        BIAS.setText("2.4");
        BIAS.setBorder(null);
        BIAS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BIASFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BIASFocusLost(evt);
            }
        });
        BIAS.setBounds(240, 230, 40, 20);
        jLayeredPane1.add(BIAS, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("bias");
        jLabel5.setBounds(180, 260, 19, 14);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        W2.setBackground(new java.awt.Color(0, 0, 0));
        W2.setForeground(new java.awt.Color(0, 204, 204));
        W2.setText("1.8");
        W2.setBorder(null);
        W2.setBounds(190, 80, 40, 20);
        jLayeredPane1.add(W2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        W1.setBackground(new java.awt.Color(0, 0, 0));
        W1.setForeground(new java.awt.Color(0, 204, 204));
        W1.setText("1.7");
        W1.setBorder(null);
        W1.setBounds(190, 200, 40, 20);
        jLayeredPane1.add(W1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("w2");
        jLabel4.setBounds(90, 180, 14, 14);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("w1");
        jLabel3.setBounds(90, 60, 14, 14);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        X2.setBackground(new java.awt.Color(0, 0, 0));
        X2.setForeground(new java.awt.Color(0, 204, 204));
        X2.setText("1");
        X2.setBorder(null);
        X2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                X2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                X2FocusLost(evt);
            }
        });
        X2.setBounds(20, 180, 30, 20);
        jLayeredPane1.add(X2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("x2");
        jLabel2.setBounds(20, 190, 12, 14);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        X1.setBackground(new java.awt.Color(0, 0, 0));
        X1.setForeground(new java.awt.Color(0, 204, 204));
        X1.setText("0");
        X1.setBorder(null);
        X1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                X1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                X1FocusLost(evt);
            }
        });
        X1.setBounds(20, 70, 30, 20);
        jLayeredPane1.add(X1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("x1");
        jLabel1.setBounds(30, 60, 12, 14);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EvaluacionFinal_0000_Flechas.png"))); // NOI18N
        fONDO.setPreferredSize(new java.awt.Dimension(496, 350));
        fONDO.setBounds(0, -20, 500, 340);
        jLayeredPane1.add(fONDO, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrenarActionPerformed
            
            getX1(); //obtener datos de x1
            getX2(); //obtener datos de x2
            getW1(); //obtener datos de w1
            getW2(); //obtener datos de w2
            getBias(); //obtener datos de bias
            
                    net(); //Calcular suma aritmetica
                    setU(); //Settear valor resultante a JTextField u
                    hardlim(net); //Clasificar valor Resultante de net()
                    setyResultante(yResultante); //settear valor resultante a JtextField YR
                    error(); //Calcular Error

                    do{ //si existe error arrojado por el metodo error(, mandar llamar a traine
                        traine(); // recalcular pesos y reasignarlos
                    }
                    while(error!=0); //hasta que no haya error

    }//GEN-LAST:event_EntrenarActionPerformed

    private void X1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_X1FocusGained
       X1LABEL.setIcon(hoverx1);
    }//GEN-LAST:event_X1FocusGained

    private void X1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_X1FocusLost
      X1LABEL.setIcon(Normalx1);
    }//GEN-LAST:event_X1FocusLost

    private void X2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_X2FocusGained
      x2label.setIcon(hoverx2);
    }//GEN-LAST:event_X2FocusGained

    private void X2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_X2FocusLost
      x2label.setIcon(Normalx2);
    }//GEN-LAST:event_X2FocusLost

    private void BIASFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BIASFocusGained
      xSumatoraiaLabel.setIcon(eHover);
    }//GEN-LAST:event_BIASFocusGained

    private void BIASFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BIASFocusLost
      xSumatoraiaLabel.setIcon(eNormal);
    }//GEN-LAST:event_BIASFocusLost

    private void funcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionMouseEntered
        funcion.setIcon(fHover);
    }//GEN-LAST:event_funcionMouseEntered

    private void funcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionMouseExited
        funcion.setIcon(fNoramal);
    }//GEN-LAST:event_funcionMouseExited

    

    public int getX1() {
        entradaUno=Integer.parseInt(X1.getText());
        return entradaUno;
    }
    public int  getX2() {
        entradaDos=Integer.parseInt(X2.getText());
        return entradaDos;
    }
    
    public double getW1() {
        pesoSinapticoW1=Double.parseDouble(W1.getText());
        return pesoSinapticoW1;
    }
    public void setW1(double pesoSinapticoW1) {
        this.pesoSinapticoW1=pesoSinapticoW1;
        W1.setText(pesoSinapticoW1+" ");
    }
    
    public double getW2() {
        pesoSinapticoW2=Double.parseDouble(W2.getText());
        return pesoSinapticoW2;
    }
    public void setW2(double pesoSinapticoW2) {
        this.pesoSinapticoW2=pesoSinapticoW2;
        W2.setText(pesoSinapticoW2+" ");
    }
    
    public double getBias() {
        bias=Double.parseDouble(BIAS.getText());
        return bias;
    }
    public void setBias(double bias) {
        this.bias = bias;
        BIAS.setText(bias+"");
    }

    public double getU() {
        u=Double.parseDouble(U.getText());
        return u;
    }
    public void setU() {
       U.setText(net()+"");
    }
    
    public int getYResultante() {
        yResultante=Integer.parseInt(YR.getText());
        return yResultante;
    }
    public int setyResultante(int yResultante) {
        this.yResultante = yResultante;
        YR.setText(yResultante+"");
        return yResultante;
    }
    
    public int getYDeseada() {
        yDeseada=Integer.parseInt(YD.getText());
        return yDeseada;
    }
    public void setyDeseada(int yDeseada) {
        this.yDeseada = yDeseada;
        YD.setText(getYDeseada()+"");
    }

    public double setIncrementoBias(double incrementoBias) {
        return this.incrementoBias = incrementoBias+getU()*error();
    }
    public double setIncrementoPesoSinapticoW1(double incrementoPesoSinapticoW1) {
        return this.incrementoPesoSinapticoW1 = incrementoPesoSinapticoW1+getU()*error()*getX1();
    }
    public double setIncrementoPesoSinapticoW2(double incrementoPesoSinapticoW2) {
     return   this.incrementoPesoSinapticoW2 = incrementoPesoSinapticoW2+getU()*error()*getX2();
    }
    
    public int hardlim(int net){
        if(net()<=0){
        setyResultante(0);
        }
        else{
        setyResultante(1);
        }
    return yResultante;
    }
    public int net(){
        net=(int)getX1()*(int)getW1()+(int)getX2()*(int)getW2()+(int)getBias();
    return net;
    }
    public int error(){
        error=getYDeseada()-getYResultante();
    return error;
    }
    public int traine(){
        setIncrementoBias(incrementoBias); //utilza como parametro el valor actual de bias para recalcular incremento
        setIncrementoPesoSinapticoW1(incrementoPesoSinapticoW1);
        //utilza como parametro el valor actual de w1 para recalcular incremento
        setIncrementoPesoSinapticoW2(incrementoPesoSinapticoW2);
        //utilza como parametro el valor actual de w2 para recalcular incremento
        setW1(incrementoPesoSinapticoW1);
        //utilza como parametro el valor de retorno del metodo setIncrementoPesoSinapticoW1 para recalcular incremento
        setW2(incrementoPesoSinapticoW2);
        //utilza como parametro el valor de retorno del metodo setIncrementoPesoSinapticoW2 para recalcular incremento
        setBias(incrementoBias);
        //utilza como parametro el valor de retorno del metodo setIncrementoBias para recalcular incremento
        net();
        hardlim(yResultante);
        error();
        
        numeroIteraciones+=numeroIteraciones;
        //contador de numero de iteraciones
    return error;
    }
  
    
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BIAS;
    private javax.swing.JButton Entrenar;
    private javax.swing.JTextField U;
    private javax.swing.JTextField W1;
    private javax.swing.JTextField W2;
    private javax.swing.JTextField X1;
    private javax.swing.JLabel X1LABEL;
    private javax.swing.JTextField X2;
    private javax.swing.JTextField YD;
    private javax.swing.JTextField YR;
    private javax.swing.JLabel fONDO;
    private javax.swing.JLabel funcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel x2label;
    private javax.swing.JLabel xSumatoraiaLabel;
    // End of variables declaration//GEN-END:variables
}
