/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import com.mysql.cj.jdbc.Blob;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Produto {
    String nome;
    String descricao;
    double valor;
    String imagem;
    
    public void adicionar(String NameField, String DescField, double ValueField, String path2){
        this.nome = NameField;
        this.descricao = DescField;
        this.valor = ValueField;
        this.imagem = path2;
        
        String sql = "INSERT INTO tb_produtos (nome, descricao, valor, imagem) values (?,?,?,?)";
            
            ConexaoBD cbd = new ConexaoBD();
            try (Connection c = cbd.obtemConexao()){
                PreparedStatement ps = c.prepareStatement(sql);
                ps.setString(1,nome);
                ps.setString(2,descricao);
                ps.setDouble(3,valor);
                ps.setString(4,imagem);
                ps.execute();
            } catch (Exception e){
                e.printStackTrace();
            }   
    }
    
    public boolean deletar(String NameField){
        this.nome = NameField;
        String sql = "SELECT nome FROM tb_produtos WHERE nome = ?";
        
        ConexaoBD cbd = new ConexaoBD();
        try (Connection c = cbd.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == true){ 
                String sql2 = "DELETE FROM tb_produtos WHERE nome = ?";
                PreparedStatement ps1 = c.prepareStatement(sql2);
                ps1.setString(1, nome);
             
                ps1.execute();
        
                java.awt.EventQueue.invokeLater(new Runnable() {  
                    public void run() {
                    new DeleteProduct().setVisible(true);
                    }
                }); 
                return true;
            } else {
                return false;
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
