package Exercicio_5;

public class Conversao {
     private double valoreal, dolar, libra, euro;
    
    public String calculoConversao(double valoreal) {
        this.valoreal = valoreal;
        this.dolar = this.valoreal / 5.25;
        this.euro = this.valoreal / 5.66;
        this.libra = this.valoreal / 6.42;
    
        return"O valor em reais é " + this.valoreal +
                "\nO valor em dolares é " + this.dolar +
                "\nO valor em euros é " + this.euro +
                "\nO valor em libras é " + this.libra;
    }
}
