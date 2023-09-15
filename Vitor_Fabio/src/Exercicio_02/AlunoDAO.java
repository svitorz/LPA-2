package Exercicio_02;

public class AlunoDAO extends PessoaDAO{
    public String retornaDadosAluno(AlunoDTO alunoDTO){
        return "O curso do aluno é o de " + alunoDTO.getCurso() +
                "\n E o prontuário é " + alunoDTO.getProntuario();
    }
}
