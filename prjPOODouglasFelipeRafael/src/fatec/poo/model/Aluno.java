package fatec.poo.model;

/**
 *
 * @author Dougla
 */
public class Aluno extends Pessoa{
    private String escolaridade;
    private Matricula matricula;

    public Aluno(String cpf, String nome) {
        super(cpf, nome);
    }

    public void setEscolaridade(String Escolaridade) {
        this.escolaridade = Escolaridade;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }   
}
