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

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public String getDataVigencia() {
        return dataVigencia;
    }

    public double getValorHoraInstrutor() {
        return valorHoraInstrutor;
    }

    public String getPrograma() {
        return programa;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void addTurma(Turma turma){
        turmas.add(turma);
        turma.setCurso(this);
    }


}
