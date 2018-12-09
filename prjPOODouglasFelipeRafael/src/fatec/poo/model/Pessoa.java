/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import static java.lang.Integer.parseInt;

/**
 *
 * @author Dougla
 */
public class Pessoa {
    private String nome;
    private String dataNasc;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String celular;
    private String sexo;
    private String estadoCivil;                                                                            
    private String rg;
    private String cpf;
    private String email;

    public Pessoa(String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCEP(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

     public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public void setRG(String rg) {
        this.rg = rg;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
    
    public static boolean validarCPF(String cpf) {
        cpf = cpf.replace(".", "").replace("-","");
        int priDigito=0, segDigito=0, multi, repetido=0, ant=0, count=0;
        
        ant = parseInt(cpf.substring(0,1)); 
        for (int i = 1; i < 9; i++){
            repetido = parseInt(cpf.substring(i,(i+1))); 
            if(ant == repetido) {
                count++;
            }
        }
        if (count == 8){
            return false;
        }
        
        for(int i = 0; i < 9; i++) {
            multi = (i+1) * parseInt(cpf.substring(i,(i+1)));
            priDigito += multi;
        }
        priDigito %= 11; 
        if(priDigito == 10) {
            priDigito = 0;
        }
        
        for(int j = 0; j < 10; j++) {
            multi = (11-j) * parseInt(cpf.substring(j,(j+1)));
            segDigito += multi;
        }
        segDigito *=10;
        segDigito %=11;
        if(segDigito == 10) {
            segDigito = 0;
        }
        return(cpf.substring(9,11).equals((Integer.toString(priDigito) + Integer.toString(segDigito))));
    }
}
