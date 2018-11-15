package fatec.poo.model;

/**
 *
 * @author Dougla
 */
public class APrazo {
    private double valor;
    private String dtVencimento;
    private double taxaJuros;
    private int qtdeMensalidade;

    public void setValor(double Valor) {
        this.valor = Valor;
    }

    public void setDtVencimento(String DtVencimento) {
        this.dtVencimento = DtVencimento;
    }
   
    public void setTaxaJuros(double TaxaJuros) {
        this.taxaJuros = TaxaJuros;
    }
    
    public void setQtdeMensalidade(int QtdeMensalidade) {
        this.qtdeMensalidade = QtdeMensalidade;
    }    



}
