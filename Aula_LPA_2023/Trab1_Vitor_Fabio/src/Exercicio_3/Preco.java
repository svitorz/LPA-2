package Exercicio_3;

public class Preco {
    private double valor, valorvista, valorprazo;
    
    public String calculoPreco(double valor) {
        this.valor = valor;
        this.valorvista = this.valor - this.valor*0.05;
        this.valorprazo = this.valor + this.valor*0.10;
        
        return"O valor do produto é " + this.valor +
                "\nO valor à vista é " + this.valorvista 
                + "\n e o valor a prazo é " + this.valorprazo;
    }
}
