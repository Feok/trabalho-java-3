package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dougla
 */
public class Turma {
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

    public Turma(String SiglaTurma, String descricao) {
        this.siglaTurma = SiglaTurma;
        this.descricao = descricao;
        this.matriculas = new ArrayList<Matricula>(); 
    }

    public void setSiglaTurma(String siglaTurma) {
        this.siglaTurma = siglaTurma;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
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

    public void emitirListaFrequencia() {
        
    }
    
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

    public String getSiglaTurma() {
        return siglaTurma;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public String getPeriodo() {
        return periodo;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public Curso getCurso() {
        return curso;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }
    
}
