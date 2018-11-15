package fatec.poo.model;

/**
 *
 * @author Dougla
 */
public abstract class Matricula {
    private final String data;
    private int qtdeFaltas;
    private double nota;
    private Aluno aluno;
    private Turma turma;

    public Matricula(String data) {
        this.data = data;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public abstract void emitirCarne();

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
   
   
}
