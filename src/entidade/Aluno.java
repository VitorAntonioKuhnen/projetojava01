/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import javax.swing.JTextField;

/**
 *
 * @author vitor.kuhnen
 */
public class Aluno {

    private String nome;
    private int idade;
    private String telefone;
    private float salario;
    private String logradouro;
    private String numero;
    private String bairro;
    private long cpf;
    
    public String getNome() {
        return nome;
    }

    // Segurar "ALT" + "Insert" que irá gerar todos os Get e Set
//    public void setNome(String nomeAluno){
//        nome = nomeAluno;
////       O "this." serve para quando a variaveis locais iguais passa o parametro EX:
////  public void carregarNome(String nome){
////      this.nome = nome;
////  }
//    }
//    public String getNome(){
//        return nome;
    public void setNome(String nome) {
        this.nome = nome;
    }

//    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setNome(JTextField varNome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
