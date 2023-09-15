package Exercicio_02;

public class AlunoCTR {
    AlunoDAO alunoDAO = new AlunoDAO();
    public String mostrarDadosPessoa(AlunoDTO alunoDTO){ return alunoDAO.retornaDadosPessoa(alunoDTO); }
    public String mostrarDadosAluno(AlunoDTO alunoDTO){ return alunoDAO.retornaDadosAluno(alunoDTO); }
}
