package Exercicio_02;

public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    PessoaDTO pessoaDTO = new PessoaDTO();
    public String mostrarDadosPessoa(FuncionarioDTO funcionarioDTO){ return funcionarioDAO.retornaDadosPessoa(funcionarioDTO); }
    public String mostrarDadosFuncionario(FuncionarioDTO funcionarioDTO){ return funcionarioDAO.retornaDadosFuncionario(funcionarioDTO); }
    public String mostrarIdadeAposentar(FuncionarioDTO funcionarioDTO){ return funcionarioDAO.permitirAposentar(funcionarioDTO); }
}
