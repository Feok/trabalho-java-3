package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Curso;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoCurso {

    private Connection conn;
    private ArrayList<String> cursos;
    
    public DaoCurso(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbCurso(sigla_curso,nome_curso,cargaHoraria_curso,valor_curso,"
                    + "dataVigencia_curso,valorHoraInstrutor_curso,programa_curso) "
                    + "VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, curso.getSigla());
            ps.setString(2, curso.getNome());
            ps.setInt(3, curso.getCargaHoraria());
            ps.setDouble(4, curso.getValor());
            ps.setString(5, curso.getDataVigencia());
            ps.setDouble(6, curso.getValorHoraInstrutor());
            ps.setString(7, curso.getPrograma());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbCurso set "
                                     + "nome_curso = ?,cargaHoraria_curso = ?,valor_curso = ?,"
                                     + "dataVigencia_curso = ?,valorHoraInstrutor_curso = ?,programa_curso = ? "
                                     + "where sigla_curso = ?");
            
            ps.setString(1, curso.getNome());
            ps.setInt(2, curso.getCargaHoraria());
            ps.setDouble(3, curso.getValor());
            ps.setString(4, curso.getDataVigencia().replace("/", ""));
            ps.setDouble(5, curso.getValorHoraInstrutor());
            ps.setString(6, curso.getPrograma());
            ps.setString(7, curso.getSigla());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
    public  Curso consultar (String sigla) {
        Curso c = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbCurso where " +
                                                 "sigla_curso = ?");
            
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                c = new Curso (sigla, rs.getString("nome_curso"));
                c.setCargaHoraria(rs.getInt("cargaHoraria_curso"));
                c.setValor(rs.getDouble("valor_curso"));
                c.setDataVigencia(rs.getString("dataVigencia_curso"));
                c.setValorHoraInstrutor(rs.getDouble("valorHoraInstrutor_curso"));
                c.setPrograma(rs.getString("Programa_curso"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (c);
    }    
     
     public void excluir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbCurso where sigla_curso = ?");
            
            ps.setString(1, curso.getSigla());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
     
    public ArrayList<String> listarSiglas(){
        PreparedStatement ps=null;
        try{
            ps = conn.prepareStatement("SELECT sigla_curso from tbCurso");
            
            ResultSet rs = ps.executeQuery();

            cursos = new ArrayList<String>();
            
            while(rs.next() == true){
                cursos.add(rs.getString("sigla_curso"));
            }
        }catch (SQLException ex){
            System.out.println(ex.toString());
        }
        return cursos;
    }
}