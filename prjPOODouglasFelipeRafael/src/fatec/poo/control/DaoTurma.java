package fatec.poo.control;

import fatec.poo.model.Curso;
import fatec.poo.model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dougla
 */
public class DaoTurma {
    private Connection conn;
    
    public DaoTurma(Connection conn) {
         this.conn = conn;
    }

    public DaoTurma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void inserir(Turma turma) {
        PreparedStatement ps = null;
        try {
           ps = conn.prepareStatement("INSERT INTO tbTurma(sigla_turma,nome_turma,cargaHoraria_turma,valor_turma,"
                    + "dataVigencia_turma,valorHoraInstrutor_turma,programa_turma) "
                    + "VALUES(?,?,?,?,?,?,?)");
           ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, turma.getCurso().getSigla());
            ps.setString(3, turma.getDescricao());
            ps.setString(4, turma.getDataInicio());
            ps.setString(5, turma.getDataTermino());
            ps.setString(6, turma.getPeriodo());
            ps.setInt(7, turma.getQtdVagas());
            ps.setString(8, turma.getObservacoes());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbCurso set "
                                     + "nome_turma = ?,cargaHoraria_turma = ?,valor_turma = ?,"
                                     + "dataVigencia_turma = ?,valorHoraInstrutor_turma = ?,programa_turma = ? "
                                     + "where sigla_turma = ?");
            
           ps.setString(1, turma.getCurso().getSigla());
            ps.setString(2, turma.getDescricao());
            ps.setString(3, turma.getDataInicio());
            ps.setString(4, turma.getDataTermino());
            ps.setString(5, turma.getPeriodo());
            ps.setInt(6, turma.getQtdVagas());
            ps.setString(7, turma.getObservacoes());
            ps.setString(8, turma.getSiglaTurma());
            ps.setString(9, turma.getCurso().getSigla());

           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public Turma consultar (String siglaTurma, Curso curso) {
        
        Turma t = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbTurma where " +
                                                 "SiglaTurma = ? and SiglaCurso = ?");
            
            ps.setString(1, siglaTurma);
            ps.setString(2, curso.getSigla());
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                t = new Turma(siglaTurma, rs.getString("Descricao"));
                t.setSiglaTurma(rs.getString("SiglaTurma"));
                t.setDataInicio(rs.getString("DataInicio"));
                t.setDataTermino(rs.getString("DataTermino"));
                t.setPeriodo(rs.getString("Periodo"));
                t.setQtdVagas(rs.getInt("QtdVagas"));
                t.setObservacoes(rs.getString("Observacoes"));
                curso.addTurma(t);
                
                
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (t);
    
        }
        
     
     public void excluir(Turma turma) {
        PreparedStatement ps = null;
        try {
             ps = conn.prepareStatement("DELETE FROM tbTurma where siglaTurma = ? and SiglaCurso = ?");
            
            ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, turma.getCurso().getSigla());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
}