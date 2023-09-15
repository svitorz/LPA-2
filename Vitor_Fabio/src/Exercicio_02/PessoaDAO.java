package Exercicio_02;

public class PessoaDAO {
    public String retornaDadosPessoa(PessoaDTO pessoaDTO){
        return "O nome do cliente é " + pessoaDTO.getNome() +
                "\n O endereço do cliente é " + pessoaDTO.getEndereco() +
                "\n A idade do cliente é " + pessoaDTO.getIdade() +
                "\n E o telefone do cliente é " + pessoaDTO.getTelefone();
    }// fecha funcao
}// fecha dao
