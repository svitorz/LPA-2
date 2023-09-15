package Exercicio_02;

import javax.swing.*;

public class PessoaVIEW {
    public static void main (String args[]){
        try{
            JOptionPane.showMessageDialog(null, "Trabalhando com o objeto funcionário: ");
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();

            funcionarioDTO.setNome(JOptionPane.showInputDialog("Insira o nome do funcionário: "));
            funcionarioDTO.setEndereco(JOptionPane.showInputDialog("Insira o endereço do funcionário: "));
            funcionarioDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do funcionário: ")));
            funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Insira o telefone do funcionário: "));
            funcionarioDTO.setFuncao(JOptionPane.showInputDialog("insira a função: "));
            funcionarioDTO.setSiape(JOptionPane.showInputDialog("Insira o SIAPE do funcionario: "));

           JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarDadosPessoa(funcionarioDTO));
            JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarDadosFuncionario(funcionarioDTO));
            JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarIdadeAposentar(funcionarioDTO));

            JOptionPane.showMessageDialog(null, "Trabalhando com o objeto aluno: ");
            AlunoDTO alunoDTO = new AlunoDTO();
            AlunoDAO alunoDAO = new AlunoDAO();
            AlunoCTR alunoCTR = new AlunoCTR();

            alunoDTO.setNome(JOptionPane.showInputDialog("Insira o nome do aluno; "));
            alunoDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do aluno: ")));
            alunoDTO.setEndereco(JOptionPane.showInputDialog("Insira o endereço do aluno: "));
            alunoDTO.setTelefone(JOptionPane.showInputDialog("Insira o telefone do aluno: "));
            alunoDTO.setCurso(JOptionPane.showInputDialog("Insira o curso do aluno: "));
            alunoDTO.setProntuario(JOptionPane.showInputDialog("Insira o prontuário do aluno: "));

            JOptionPane.showMessageDialog(null,  alunoCTR.mostrarDadosPessoa(alunoDTO));
            JOptionPane.showMessageDialog(null, alunoCTR.mostrarDadosAluno(alunoDTO));

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
        }
    }
}
