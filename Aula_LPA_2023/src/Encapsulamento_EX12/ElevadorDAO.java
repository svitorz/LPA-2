package Encapsulamento_EX12;

public class ElevadorDAO {
    private int entra, sai, passageiros, contador,andares, excesso;
    private String mensagem = "";
    
    public void calcularPessoas(ElevadorDTO elevadorDTO){
        this.entra = (elevadorDTO.getEntra());
        this.sai = (elevadorDTO.getSai());
        this.passageiros += this.entra;
        this.passageiros -= this.sai;
    }
    
    public String excessoPassageiro(ElevadorDTO elevadorDTO){
        if(this.passageiros>15){
            this.excesso = this.passageiros - 15;
            this.mensagem = "Excesso de passageiros, devem sair" + this.excesso +
                    "passageiros do elevador";
        }else if(this.passageiros<0){
            this.mensagem = "O número de passageiros não pode ser negativo, insira um número de pessoas que entram maior do que saem";
        }
        return this.mensagem;
    }
}
