package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Administrador {
    String nome;
    String user;
    String senha;
    
    public boolean VerificarAdm(String UserField){
        String user = UserField;
        
        String sql = "SELECT usuario FROM tb_administradores WHERE usuario = ?;";
        ConexaoBD cbd = new ConexaoBD();
        try (Connection c = cbd.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            if(rs.next() == false){
                return false;
            }
            else{
                return true;
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
   
    
    public void CadastrarAdm (String NameField, String UserField, String PasswordField) {
        String nome = NameField;
        String user = UserField;
        String senha = PasswordField;
        
        String sql = "INSERT INTO tb_administradores (nome,usuario,senha) VALUES (?,?,?);";
        ConexaoBD cbd = new ConexaoBD();
        try (Connection c = cbd.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, user);
            ps.setString(3, senha);
            ps.execute();
        } catch (Exception e){
            e.printStackTrace();
        }  
    }
    
    public boolean LogarAdm(String UserField, String PasswordField){
        String user = UserField;
        String senha = PasswordField;
        String sql = "SELECT usuario,senha FROM tb_administradores WHERE usuario = ? and senha = ?;";
        ConexaoBD cbd = new ConexaoBD();
        try (Connection c = cbd.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if(rs.next() == false){
                return false;
            }
            else{
                return true;
            }
            } catch (Exception e){
                e.printStackTrace();
                return false;
            }  
    }
    
    //Métodos Getters
    public String getNome() {
        return nome;
    }
    public String getUser() {
        return user;
    }
    public String getSenha() {
        return senha;
    }
    //Métodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
