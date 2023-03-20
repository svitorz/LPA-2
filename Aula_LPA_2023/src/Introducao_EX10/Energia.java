package Introducao_EX10;

public class Energia {
    private double desc,salmin, qwatt, total, consumo;
    
    public String calculoEnergia (double salmin, double consumo) {
        this.salmin = salmin;
        this.qwatt = salmin / 5;
        this.consumo = consumo;
        this.total = this.consumo * this.qwatt;
        this.desc = this.total - (this.total * 0.15);
        
        return"O valor total é " + this.total + 
                "\nO valor com desconto é " + this.desc
                + "\nO valor de cada quilowatt é " + this.qwatt;
    }
}
