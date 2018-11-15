package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dougla
 */
public abstract class Turma {
    private String siglaTurma;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String periodo;
    private int qtdVagas;
    private String observacoes;
    private Instrutor instrutor;
    private Curso curso;
    private ArrayList<Matricula> matriculas;

    public Turma(String SiglaTurma) {
        this.siglaTurma = SiglaTurma;
        this.matriculas = new ArrayList<Matricula>(); 
    }

    public void setDescricao(String Descricao) {
        this.descricao = Descricao;
    }

    public void setDataInicio(String DataInicio) {
        this.dataInicio = DataInicio;
    }

    public void setDataTermino(String DataTermino) {
        this.dataTermino = DataTermino;
    }

    public void setPeriodo(String Periodo) {
        this.periodo = Periodo;
    }

    public void setQtdVagas(int QtdVagas) {
        this.qtdVagas = QtdVagas;
    }

    public void setObservacoes(String Observacoes) {
        this.observacoes = Observacoes;
    }

    public abstract void emitirListaFrequencia();

    void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public void addMatricula(Matricula matricula){
        matriculas.add(matricula);
        matricula.setTurma(this);
    }  
}
