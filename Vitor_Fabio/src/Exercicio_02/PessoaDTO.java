package Exercicio_02;

public class PessoaDTO {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome,endereco,telefone;
    private int idade;

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
