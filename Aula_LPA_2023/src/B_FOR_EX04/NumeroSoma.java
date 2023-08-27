package B_FOR_EX04;

public class NumeroSoma {
    
    private int n, soma;
    
    public void soma_Numero(int n) {
        this.n = n;
        this.soma += this.n;
    }
    
    public int mostrar_Numero() {
        return this.soma;
    }
}
