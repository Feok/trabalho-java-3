package fatec.poo.control;

import fatec.poo.model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import fatec.poo.model.Curso;

public class DaoTurma {
    private Connection conn;
    private ArrayList<String> cursos;
    
    public DaoTurma(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Turma turma) {
        PreparedStatement ps = null;
        try {      
            ps = conn.prepareStatement("INSERT INTO tbTurma(sigla_turma, siglaCurso_turma, "
                    + "descricao_turma, dataInicio_turma, dataTermino_turma, periodo_turma, "
                    + "qtdVagas_turma, observacoes_turma )"
                    + "VALUES(?,?,?,?,?,?,?,?)");
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
            ps = conn.prepareStatement("UPDATE tbTurma set siglaCurso_turma = ?, descricao_turma = ?, dataInicio_turma = ?, "
                                    + "dataTermino_turma = ?, periodo_turma = ?, qtdVagas_turma = ?, observacoes_turma = ? "
                                    + "WHERE sigla_turma = ? and siglaCurso_turma = ?");
            
            
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
                                                 "sigla_turma = ? and siglaCurso_turma = ?");
            
            ps.setString(1, siglaTurma);
            ps.setString(2, curso.getSigla());
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                t = new Turma(siglaTurma, rs.getString("descricao_turma"));
                t.setSiglaTurma(rs.getString("sigla_turma"));
                t.setDataInicio(rs.getString("dataInicio_turma"));
                t.setDataTermino(rs.getString("dataTermino_turma"));
                t.setPeriodo(rs.getString("periodo_turma"));
                t.setQtdVagas(rs.getInt("qtdVagas_turma"));
                t.setObservacoes(rs.getString("observacoes_turma"));
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
            ps = conn.prepareStatement("DELETE FROM tbTurma where sigla_turma = ? and siglaCurso_turma = ?");
            
            ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, turma.getCurso().getSigla());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    
}
