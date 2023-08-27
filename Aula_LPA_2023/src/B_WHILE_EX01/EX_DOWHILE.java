package B_WHILE_EX01;

public class EX_DOWHILE {
    private int soma,numero;
    
    public void somar (int numero) {
        this.numero = numero;
        this.soma += this.numero;
    }
    public int mostra(){
        return this.soma;
    }
}
