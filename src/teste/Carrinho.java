/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author pedro
 */
public class Carrinho {
    String nome;
    double quantidade;
    double valor;
    
    public void AdicionarCarrinho (String NameField, double QuantityField, double ValueField) {
        this.nome = NameField;
        this.quantidade= QuantityField;
        this.valor = ValueField * QuantityField;
        
        String sql = "INSERT INTO tb_carrinho (nome,quantidade,valor) values (?,?,?);";
        
        ConexaoBD cbd = new ConexaoBD();
        try (Connection c = cbd.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setDouble(2, quantidade);
            ps.setDouble(3, valor);
            ps.execute();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void LimparCarrinho(){
        String nome;
        
        String sql1 = "SELECT nome FROM tb_carrinho;";
        String sql2 = "DELETE FROM tb_carrinho WHERE nome = ?;";
        
        ConexaoBD cbd = new ConexaoBD();
        try (Connection c = cbd.obtemConexao()){
            PreparedStatement ps1 = c.prepareStatement(sql1);
            PreparedStatement ps2 = c.prepareStatement(sql2);
            ResultSet rs = ps1.executeQuery();
            if(rs.next() == true){
                do{
                    nome = rs.getString("nome");
                    ps2.setString(1, nome);
                    ps2.execute();
                } while (rs.next());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
