package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Aluno;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAluno {

    private Connection conn;
    
    public DaoAluno(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbAluno(cpf_aluno,nome_aluno,dataNasc_aluno,sexo_aluno,estadoCivil_aluno,endereco_aluno,"
                                     + "numeroEnd_aluno,bairro_aluno,cep_aluno,cidade_aluno,estado_aluno,telefone_aluno,rg_aluno,"
                                     + "celular_aluno,escolaridade_aluno,email_aluno)"
                                     + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getDataNasc());
            ps.setString(4, aluno.getSexo());
            ps.setString(5, aluno.getEstadoCivil());
            ps.setString(6, aluno.getEndereco());
            ps.setInt(7, aluno.getNumero());
            ps.setString(8, aluno.getBairro());
            ps.setString(9, aluno.getCep());
            ps.setString(10, aluno.getCidade());
            ps.setString(11, aluno.getEstado());
            ps.setString(12, aluno.getTelefone());
            ps.setString(13, aluno.getRg());
            ps.setString(14, aluno.getCelular());
            ps.setString(15, aluno.getEscolaridade());
            ps.setString(16, aluno.getEmail());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbAluno set "
                                     + "nome_aluno = ?,dataNasc_aluno = ?,sexo_aluno = ?,estadoCivil_aluno = ?,"
                                     + "endereco_aluno = ?,numeroEnd_aluno = ?,bairro_aluno = ?,cep_aluno = ?,"
                                     + "cidade_aluno = ?,estado_aluno = ?,telefone_aluno = ?,rg_aluno = ?,"
                                     + "celular_aluno = ?,escolaridade_aluno = ?,email_aluno = ?"
                                     + "where cpf_aluno = ?");
            
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getDataNasc());
            ps.setString(3, aluno.getSexo());
            ps.setString(4, aluno.getEstadoCivil());
            ps.setString(5, aluno.getEndereco());
            ps.setInt(6, aluno.getNumero());
            ps.setString(7, aluno.getBairro());
            ps.setString(8, aluno.getCep());
            ps.setString(9, aluno.getCidade());
            ps.setString(10, aluno.getEstado());
            ps.setString(11, aluno.getTelefone());
            ps.setString(12, aluno.getRg());
            ps.setString(13, aluno.getCelular());
            ps.setString(14, aluno.getEscolaridade());
            ps.setString(16, aluno.getEmail());
            ps.setString(17, aluno.getCpf());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
    public  Aluno consultar (String cpf) {
        Aluno a = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbAluno where " +
                                                 "cpf_aluno = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                a = new Aluno (cpf, rs.getString("nome_aluno"));
                a.setDataNasc(rs.getString("dataNasc_aluno"));
                a.setSexo(rs.getString("sexo_aluno"));
                a.setEstadoCivil(rs.getString("estadoCivil_aluno"));
                a.setEndereco(rs.getString("endereco_aluno"));
                a.setNumero(rs.getInt("numeroEnd_aluno"));
                a.setBairro(rs.getString("bairro_aluno"));
                a.setCEP(rs.getString("cep_aluno"));
                a.setCidade(rs.getString("cidade_aluno"));
                a.setEstado(rs.getString("estado_aluno"));
                a.setTelefone(rs.getString("telefone_aluno"));
                a.setRG(rs.getString("rg_aluno"));
                a.setCelular(rs.getString("celular_aluno"));
                a.setEscolaridade(rs.getString("escolaridade_aluno"));
                a.setEmail(rs.getString("email_aluno"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (a);
    }    
     
     public void excluir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbAluno where cpf_aluno = ?");
            
            ps.setString(1, aluno.getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}