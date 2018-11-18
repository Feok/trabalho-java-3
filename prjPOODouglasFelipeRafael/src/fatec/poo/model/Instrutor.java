package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dougla
 */
public class Instrutor extends Pessoa{

    private String formacao;
    private String areaAtuacao;
    private ArrayList<Turma> turmas;

    public Instrutor(String cpf, String nome) {
        super(cpf, nome);
        this.turmas = new ArrayList<Turma>();
    }

    public void setFormacao(String Formacao) {
        this.formacao = Formacao;
    }

    public void setAreaAtuacao(String AreaAtuacao) {
        this.areaAtuacao = AreaAtuacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    
    public void addTurma(Turma turma){
        turmas.add(turma);
        turma.setInstrutor(this);
    }
}
