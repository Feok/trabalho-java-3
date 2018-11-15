package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dougla
 */
public class Curso {
    private String sigla;
    private String nome;
    private int cargaHoraria;
    private double valor;
    private String dataVigencia;
    private double valorHoraInstrutor;
    private String programa;
    private ArrayList<Turma> turmas;

    public Curso(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        this.turmas = new ArrayList<Turma>();
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.cargaHoraria = CargaHoraria;
    }

    public void setValor(double Valor) {
        this.valor = Valor;
    }

    public void setDataVigencia(String DataVigencia) {
        this.dataVigencia = DataVigencia;
    }

    public void setValorHoraInstrutor(double ValorHoraInstrutor) {
        this.valorHoraInstrutor = ValorHoraInstrutor;
    }

    public void setPrograma(String Programa) {
        this.programa = Programa;
    }

    public void addTurma(Turma turma){
        turmas.add(turma);
        turma.setCurso(this);
    }


}
