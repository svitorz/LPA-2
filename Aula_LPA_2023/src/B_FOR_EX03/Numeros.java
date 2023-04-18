package B_FOR_EX03;

public class Numeros {
    private int n1,n2;
    private String imprimir = " ";
            
    public String calcular(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.imprimir = imprimir;
        
        for(int i=n1; i<=n2; i++){
            this.imprimir = this.imprimir + " | " + i;
        }
        return this.imprimir;
    } 
}
