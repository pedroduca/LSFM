
/**
 *
 * @author User
 */
public class Sistema extends javax.swing.JFrame {

    /**
     * Creates new form Sistema
     */
    public Sistema() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        NovoClient = new javax.swing.JButton();
        NovoVenda = new javax.swing.JButton();
        NovoProd = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        ConsulProd = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenu7.setText("File");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar2.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar3.add(jMenu10);

        jMenu11.setText("jMenu11");

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("Sistema LSFM");
        setLocation(new java.awt.Point(0, 0));
        setName("Inicio"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1600, 900));

        NovoClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Add_User_Male_48px.png"))); // NOI18N
        NovoClient.setText("Cliente");
        NovoClient.setToolTipText("");
        NovoClient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NovoClient.setFocusPainted(false);
        NovoClient.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NovoClient.setIconTextGap(5);
        NovoClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoClientActionPerformed(evt);
            }
        });

        NovoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Add_Shopping_Cart_48px_1.png"))); // NOI18N
        NovoVenda.setText("Venda");
        NovoVenda.setToolTipText("");
        NovoVenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NovoVenda.setFocusPainted(false);
        NovoVenda.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NovoVenda.setIconTextGap(5);
        NovoVenda.setMargin(new java.awt.Insets(2, 14, 2, 100));

        NovoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produto.png"))); // NOI18N
        NovoProd.setText("Produto");
        NovoProd.setToolTipText("");
        NovoProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NovoProd.setFocusPainted(false);
        NovoProd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NovoProd.setIconTextGap(5);
        NovoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoProdActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fornecedor.png"))); // NOI18N
        jButton5.setText("Fornecedor");
        jButton5.setToolTipText("");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setFocusPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setIconTextGap(5);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        ConsulProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Search_48px.png"))); // NOI18N
        ConsulProd.setText("Produtos");
        ConsulProd.setToolTipText("");
        ConsulProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ConsulProd.setFocusPainted(false);
        ConsulProd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ConsulProd.setIconTextGap(5);

        jMenu1.setText("Sobre");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Produtos");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Fornecedores");
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Vendas");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Relatórios");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(NovoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(NovoClient, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(NovoProd, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ConsulProd, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NovoClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NovoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConsulProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NovoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoProdActionPerformed

        CadastrarProduto novoProduto = new CadastrarProduto();
        novoProduto.setVisible(true);
        
    }//GEN-LAST:event_NovoProdActionPerformed

    private void NovoClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoClientActionPerformed
        CadastrarCliente2 novoCliente = new CadastrarCliente2();
        novoCliente.setVisible(true);
        
    }//GEN-LAST:event_NovoClientActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CadastrarFornecedor2 newFornecedor = new CadastrarFornecedor2();
        newFornecedor.setVisible(true);
      
    }//GEN-LAST:event_jButton5ActionPerformed
        
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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsulProd;
    private javax.swing.JButton NovoClient;
    private javax.swing.JButton NovoProd;
    private javax.swing.JButton NovoVenda;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
