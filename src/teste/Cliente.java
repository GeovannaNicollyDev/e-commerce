package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Cliente {
    
    private String nome;
    private String cpf;
    private String senha;
    
    public boolean VerificarUsuario(String CPFField){
        String cpf = CPFField;
        
        String sql = "SELECT cpf FROM tb_usuarios WHERE cpf = ?;";
        ConexaoBD cbd = new ConexaoBD();
        try (Connection c = cbd.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, cpf);
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
   
    
    public void CadastrarUsuario (String NameField, String CPFField, String PasswordField) {
        String nome = NameField;
        String cpf = CPFField;
        String senha = PasswordField;
        
        String sql = "INSERT INTO tb_usuarios (nome,cpf,senha) VALUES (?,?,?);";
        ConexaoBD cbd = new ConexaoBD();
        try (Connection c = cbd.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, cpf);
            ps.setString(3, senha);
            ps.execute();
        } catch (Exception e){
            e.printStackTrace();
        }  
    }
    
    public boolean LogarUsuario(String CPFField, String PasswordField){
        String cpf = CPFField;
        String senha = PasswordField;
        String sql = "SELECT cpf,senha FROM tb_usuarios WHERE cpf = ? and senha = ?;";
        ConexaoBD cbd = new ConexaoBD();
        try (Connection c = cbd.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, cpf);
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
    
    public void DeletarCliente(String CPFField, String PasswordField){
        String cpf = CPFField;
        String senha = PasswordField;
                        
        String sql = "Delete from tb_usuarios where cpf = ?;";
        
        ConexaoBD cbd = new ConexaoBD();
        try (Connection c = cbd.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1,cpf);           
            ps.execute();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    //Métodos Getters
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getSenha() {
        return senha;
    }
    //Métodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
