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
    public static void main(String[] args) {
        GeradorUtil util = new GeradorUtil();
        String cpf = util.gerarMascaraCpf();
//        System.out.println("Salário: " + util.gerarSalario());
        System.out.println("CPF: " + cpf);
    }
    
}
