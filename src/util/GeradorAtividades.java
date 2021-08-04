/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author vitor.kuhnen
 */



public class GeradorAtividades {
//Gerador de CNPJ
    public String gerarNumeru(int qtde){
        String cnpj ="";
        int numero;
        for (int i = 0; i < qtde; i++){
            numero = (int)(Math.random() * 10);
            cnpj = cnpj + numero;
        }
        return cnpj;
    }
    
    public String cnpj(){
       return gerarNumeru(2) + "." + gerarNumeru(3) + "." + gerarNumeru(3) + "/" + gerarNumeru(4) + "-" + gerarNumeru(2);
    }

//Gerador de Número de Telefone Fixo

    public String gerarNumero(int qtde){
        String tell = "";
        int numero;
        for (int i = 0; i < qtde; i++){
            numero = (int)(Math.random() * 10);
            tell = tell + numero;
        }
        return tell;
    }
    public String tell(){
        return "(48) 9" + gerarNumero(4) + "-" + gerarNumero(4);
    }
    
    public String gerarNumeric(int qtde){
        String cep = "";
        int numero;
        for (int i = 0; i < qtde; i++){
            numero = (int)(Math.random()* 10);
            cep = cep + numero;
        }
        return cep;
    }
    public String gerarCep(){
        return gerarNumeric(5) + "." + gerarNumeric(3);
    } 
    public static void main(String[] args) {
        GeradorAtividades util = new GeradorAtividades();
        String cep = util.gerarCep();
        String tell = util.tell();
        String cnpj = util.cnpj();
        System.out.println("Telefone: " + cep);
        System.out.println("Numero: " + tell);
        System.out.println("CNPJ: " + cnpj);
    }
}
