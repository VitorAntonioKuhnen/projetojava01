/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import aula_01.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor.kuhnen
 */
public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        String nome = JOptionPane.showInputDialog("Informe o seu nome");
        aluno.setNome(nome);
        String sobrenome = JOptionPane.showInputDialog("Informe o seu sobrenome:");
        aluno.setSobrenome(sobrenome);
        
        System.out.println("Nome: " + aluno.getNome() + " " + aluno.getSobrenome());
        
//        aluno.sobrenome = JOptionPane.showInputDialog("Informe o seu sobrenome");
//        aluno.idade = JOptionPane.showInputDialog("Informe o sua idade");
////        Converte float para string em 1 linha
//        aluno.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário"));
//        aluno.cpf = Long.parseLong(JOptionPane.showInputDialog("Informe o seu CPF"));

//        JOptionPane.showMessageDialog(null, "Nome Completo: " + aluno.nome
//                + " " + aluno.sobrenome + "\nIdade: " + aluno.idade
//                + "\nSalario: " + aluno.salario + "\nCPF: " + aluno.cpf);

    }
}
