/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teste;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author pedro
 */
public class ViewProduct extends javax.swing.JFrame {
    String nome;
    String descricao;
    double valor;
    String imagem;
    
    /**
     * Creates new form ZFrameTeste
     */
    public ViewProduct(String PName, String PDesc, double PValue, String PPath) throws IOException {
        super("A3");
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.DARK_GRAY);
        LogoTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teste/midias/logo_top.png")));
        ShopListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teste/midias/shoplisticon.png")));
        
        this.nome = PName;
        this.descricao = PDesc;
        this.valor = PValue;
        this.imagem = PPath;
        
        BufferedImage bi = ImageIO.read(new File(imagem));
        ImageIcon icon = new ImageIcon(bi);
        ImageField.setIcon(icon);
            
        NameField.setText(nome);
        DescField.setText(descricao);
        ValueField.setText("Valor: " + valor);
    }

    private ViewProduct() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DescLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescField = new javax.swing.JTextPane();
        ValueField = new javax.swing.JLabel();
        QuantityField = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        LogoTop = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AddShopList = new javax.swing.JButton();
        ImageField = new javax.swing.JLabel();
        ShopListButton = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        NameField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DescLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescLabel.setForeground(new java.awt.Color(255, 255, 255));
        DescLabel.setText("Descrição:");
        DescLabel.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.darkGray));

        DescField.setBackground(new java.awt.Color(61, 61, 61));
        DescField.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.darkGray));
        DescField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescField.setForeground(new java.awt.Color(255, 255, 255));
        DescField.setMaximumSize(new java.awt.Dimension(284, 84));
        DescField.setMinimumSize(new java.awt.Dimension(284, 84));
        jScrollPane1.setViewportView(DescField);

        ValueField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ValueField.setForeground(new java.awt.Color(255, 255, 255));
        ValueField.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.darkGray));

        QuantityField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        QuantityField.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        LogoTop.setText("LogoTop");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E-COMMERCE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LogoTop, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoTop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AddShopList.setBackground(new java.awt.Color(0, 0, 255));
        AddShopList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddShopList.setForeground(new java.awt.Color(255, 255, 255));
        AddShopList.setText("Adicionar ao Carrinho");
        AddShopList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddShopListActionPerformed(evt);
            }
        });

        ImageField.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.darkGray));

        ShopListButton.setBackground(new java.awt.Color(0, 0, 255));
        ShopListButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ShopListButton.setForeground(new java.awt.Color(255, 255, 255));
        ShopListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShopListButtonActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(0, 0, 255));
        Back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Voltar");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        NameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NameField.setForeground(new java.awt.Color(255, 255, 255));
        NameField.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.darkGray));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ShopListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddShopList))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(ValueField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DescLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ImageField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShopListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Back))
                        .addGap(5, 5, 5)
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DescLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ValueField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddShopList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddShopListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddShopListActionPerformed
        // TODO add your handling code here:
        String quantidade1 = String.valueOf(QuantityField.getValue());
        double quantidade2 = Double.parseDouble(quantidade1);
        
        if (quantidade2 <= 0) {
            JOptionPane.showMessageDialog(null, "Insira uma quantidade adequada.");
        } else {
            Carrinho cr = new Carrinho();
            cr.AdicionarCarrinho(nome, quantidade2, valor);
        }
        QuantityField.setValue(0);
    }//GEN-LAST:event_AddShopListActionPerformed

    private void ShopListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShopListButtonActionPerformed
        // TODO add your handling code here:
        ShopList sl = new ShopList();
        sl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ShopListButtonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        ProductScreen ps = new ProductScreen();
        ps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddShopList;
    private javax.swing.JButton Back;
    private javax.swing.JTextPane DescField;
    private javax.swing.JLabel DescLabel;
    private javax.swing.JLabel ImageField;
    private javax.swing.JLabel LogoTop;
    private javax.swing.JLabel NameField;
    private javax.swing.JSpinner QuantityField;
    private javax.swing.JButton ShopListButton;
    private javax.swing.JLabel ValueField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
