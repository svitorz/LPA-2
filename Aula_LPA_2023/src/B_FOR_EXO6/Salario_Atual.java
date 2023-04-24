package B_FOR_EXO6;

public class Salario_Atual {
            private int ano_atual;
            private double salario, novo_salario, percentual;
    public double calculo_Salario(int ano_atual) {
        this.salario = 1000;
        this.percentual = 1.5;
        
        this.ano_atual = ano_atual;
        
        this.novo_salario = this.salario + (this.salario * (this.percentual / 100));
        
        for(int cont = 1997; cont <= ano_atual; cont++) {
            this.percentual = this.percentual * 2;
            this.novo_salario = this.novo_salario + (this.novo_salario * (this.percentual / 100));
        }
        
        return this.novo_salario;
    } // fecha string
} // fehca class      
