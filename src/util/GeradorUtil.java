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
public class GeradorUtil {
   /**
    * Retorna um valor string conforme a quantidade de número solicitado
     * @param qtde
    * @return 
    */ 
    public String gerarNumero(int qtde){
        String senha = "";
        int numero;
        for (int i = 0; i < qtde;i++){
            numero = (int)(Math.random() * 10);
            senha = senha + numero;
        }
        return senha;
        
    }
    
    public String gerarMascaraCpf(){
        
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + "-" + gerarNumero(2);
    }
    
    
    public double gerarSalario(){
        int numero = (int) (Math.random() * 100000);
        return numero;
    }
    
    
    public String gerarNome(){
        String[] nomes  = {"Vítor", "Dougras", "João", "Beatriz", "Thiago", "Tiago", 
            "Ramon", "Max", "Alisson", "Willian", "Mariele", "Jeferson", "Matheus", 
            "Elaine", "Belmir", "Silvio", "Guilherme", "Lucas", "Marcos", "Arnaldo", "Octavia", "Ellen"};
        int indice = (int)(Math.random() * nomes.length);
        String nome = nomes[indice];
        return nome;
    }
    private String gerarSobrenome(){
        String[] sobrenomes = {"Kuhnen", "Antônio", "Gaspar", "Vilas", "Boas", "Henrique", "Kuhn", "Silva", "Warmling"};
        int indice = (int)(Math.random() * sobrenomes.length);
        String sobrenome = sobrenomes[indice];
        return sobrenome;
    }
    
    public static void main(String[] args) {
        GeradorUtil util = new GeradorUtil();
        String nomes = util.gerarNome();
        String sobrenome = util.gerarSobrenome();
//        System.out.println("Salário: " + util.gerarSalario());
        System.out.println("NomeS: " + nomes + " " + sobrenome);
    }
    
}
