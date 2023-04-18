package B_SWITCH_EX01;

public class Operacao {
    private int opcao, n1,n2;
    
    public String calcular(int opcao, int n1, int n2) {
        this.opcao = opcao;
        this.n1 = n1;
        this.n2 = n2;
        
        switch(this.opcao){
            case 1:
                return "O resultado é: " + (this.n1 + this.n2);
            case 2:
                return "O resultado é: " + (this.n1 - this.n2);
            case 3:
                return "O resultado é: " + (this.n1 * this.n2);
             case 4:
                return "O resultado é: " + (this.n1 / this.n2);    
            default:
                return "Operação inválida";
        }
    }
}
