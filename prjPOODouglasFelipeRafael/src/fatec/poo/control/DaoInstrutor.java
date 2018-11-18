package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Instrutor;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoInstrutor {

    private Connection conn;
    
    public DaoInstrutor(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbInstrutor(cpf_instrutor,nome_instrutor,dataNasc_instrutor,sexo_instrutor,estadoCivil_instrutor,endereco_instrutor,"
                                     + "numeroEnd_instrutor,bairro_instrutor,cep_instrutor,cidade_instrutor,estado_instrutor,telefone_instrutor,rg_instrutor,"
                                     + "celular_instrutor,formacao_instrutor,areaAtuacao_instrutor,email_instrutor) "
                                     + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, instrutor.getCpf());
            ps.setString(2, instrutor.getNome());
            ps.setString(3, instrutor.getDataNasc());
            ps.setString(4, instrutor.getSexo());
            ps.setString(5, instrutor.getEstadoCivil());
            ps.setString(6, instrutor.getEndereco());
            ps.setInt(7, instrutor.getNumero());
            ps.setString(8, instrutor.getBairro());
            ps.setString(9, instrutor.getCep());
            ps.setString(10, instrutor.getCidade());
            ps.setString(11, instrutor.getEstado());
            ps.setString(12, instrutor.getTelefone());
            ps.setString(13, instrutor.getRg());
            ps.setString(14, instrutor.getCelular());
            ps.setString(15, instrutor.getFormacao());
            ps.setString(16, instrutor.getAreaAtuacao());
            ps.setString(17, instrutor.getEmail());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbInstrutor set "
                                     + "nome_instrutor = ?,dataNasc_instrutor = ?,sexo_instrutor = ?,estadoCivil_instrutor = ?,"
                                     + "endereco_instrutor = ?,numeroEnd_instrutor = ?,bairro_instrutor = ?,cep_instrutor = ?,"
                                     + "cidade_instrutor = ?,estado_instrutor = ?,telefone_instrutor = ?,rg_instrutor = ?,"
                                     + "celular_instrutor = ?,formacao_instrutor = ?,areaAtuacao_instrutor = ?,email_instrutor = ?"
                                     + "where cpf_instrutor = ?");
            
            ps.setString(1, instrutor.getNome());
            ps.setString(2, instrutor.getDataNasc());
            ps.setString(3, instrutor.getSexo());
            ps.setString(4, instrutor.getEstadoCivil());
            ps.setString(5, instrutor.getEndereco());
            ps.setInt(6, instrutor.getNumero());
            ps.setString(7, instrutor.getBairro());
            ps.setString(8, instrutor.getCep());
            ps.setString(9, instrutor.getCidade());
            ps.setString(10, instrutor.getEstado());
            ps.setString(11, instrutor.getTelefone());
            ps.setString(12, instrutor.getRg());
            ps.setString(13, instrutor.getCelular());
            ps.setString(14, instrutor.getFormacao());
            ps.setString(15, instrutor.getAreaAtuacao());
            ps.setString(16, instrutor.getEmail());
            ps.setString(17, instrutor.getCpf());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
    public  Instrutor consultar (String cpf) {
        Instrutor c = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbInstrutor where " +
                                                 "cpf_instrutor = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                c = new Instrutor (cpf, rs.getString("nome_instrutor"));
                c.setDataNasc(rs.getString("dataNasc_instrutor"));
                c.setSexo(rs.getString("sexo_instrutor"));
                c.setEstadoCivil(rs.getString("estadoCivil_instrutor"));
                c.setEndereco(rs.getString("endereco_instrutor"));
                c.setNumero(rs.getInt("numeroEnd_instrutor"));
                c.setBairro(rs.getString("bairro_instrutor"));
                c.setCEP(rs.getString("cep_instrutor"));
                c.setCidade(rs.getString("cidade_instrutor"));
                c.setEstado(rs.getString("estado_instrutor"));
                c.setTelefone(rs.getString("telefone_instrutor"));
                c.setRG(rs.getString("rg_instrutor"));
                c.setCelular(rs.getString("celular_instrutor"));
                c.setFormacao(rs.getString("formacao_instrutor"));
                c.setAreaAtuacao(rs.getString("areaAtuacao_instrutor"));
                c.setEmail(rs.getString("email_instrutor"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (c);
    }    
     
     public void excluir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbInstrutor where cpf_instrutor = ?");
            
            ps.setString(1, instrutor.getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}