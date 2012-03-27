
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class principal extends javax.swing.JFrame {
int entradaUno=0,entradaDos=0,yDeseada=0,yResultante=0,numeroIteraciones=0,error=0;
double pesoSinapticoW1,pesoSinapticoW2,bias,u;

    
    public principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        X1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        X2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        W1 = new javax.swing.JTextField();
        W2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BIAS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        U = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        YD = new javax.swing.JTextField();
        Entrenar = new javax.swing.JButton();
        YR = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("x1");

        X1.setText("0");

        jLabel2.setText("x2");

        X2.setText("1");

        jLabel3.setText("w1");

        jLabel4.setText("w2");

        W1.setText("1.7");

        W2.setText("1.8");

        jLabel5.setText("bias");

        BIAS.setText("2.4");

        jLabel6.setText("u");

        U.setText("0.4");

        jLabel7.setText("YD");

        YD.setText("0");

        Entrenar.setText("Entrenar");
        Entrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrenarActionPerformed(evt);
            }
        });

        jLabel8.setText("YR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(X2)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(W1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(W2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(U, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(YR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(YD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(BIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(Entrenar)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(W1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(W2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(YD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BIAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Entrenar))
                        .addGap(5, 5, 5)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrenarActionPerformed
            /*   getU();
            getYR();*/
        try{
            getX1();
            getX2();
            getW1();
            getW2();
            getBIAS();
         
            
                        if((getX1()==0 ||getX1()==1) && (getX2()==0 || getX2()==1)){
                                    JOptionPane.showMessageDialog(null, "aceptado");
                                    
                                    net();
                                    hardlim(valorHardlim);
                                    setYR(yr);
                                    error();
                                    do{
                                        traine();
                                    }
                                    while(error!=0);
                            
                                   
                        }
                         JOptionPane.showMessageDialog(null, "solo se admiten valores en el rango de [0,1] para los campos X1 & X2");
                        
        }
        catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"solo se permiten números");
        }
        
    }//GEN-LAST:event_EntrenarActionPerformed

    public int hardlim(int valor){
        if(valor<0){
        yr=0;
        }
        yr=1;
    return yr;
    }
    public int net(){
        valorHardlim=(int)getX1()*(int)getW1()+(int)getX2()*(int)getW2()+(int)getBIAS();
    return valorHardlim;
    }
    public int error(){
        error=getYD()-yr;
    return error;
    }
    public void traine(){
    setW1(incrementoW1);
    setW2(incrementoW2);
    setBias(incrementoBias);
    net();
    hardlim(valorHardlim);
    setYR(yr);
    error();
    Iteracion++;
    }

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
        this.pesoSinapticoW1=getW1();
        W1.setText(pesoSinapticoW1+" ");
    }
    
    public double getW2() {
        pesoSinapticoW2=Double.parseDouble(W2.getText());
        return pesoSinapticoW2;
    }
    public void setW2(double pesoSinapticoW2) {
        this.pesoSinapticoW2=getW2();
        W2.setText(pesoSinapticoW2+" ");
    }
    
    
    public double getBias() {
        bias=Double.parseDouble(BIAS.getText());
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }
    
    public double getU() {
        u=Double.parseDouble(U.getText());
        return u;
    }
    public int getYR() {
        yr=Integer.parseInt(YR.getText());
        return yr;
    }
    public int getYD() {
        yd=Integer.parseInt(YD.getText());
        return yd;
    }

    
    
    
    public double setBias(double incrementoBias){
        this.incrementoBias=incrementoBias+net()*error();
        BIAS.setText(incrementoBias+"");
    return incrementoBias;
    }

    public void setYR(int yr) {
        YR.setText(""+yr);
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
    private javax.swing.JTextField X2;
    private javax.swing.JTextField YD;
    private javax.swing.JTextField YR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
