package B_WHILE_EX01;

public class EX_WHILE_2 {
    private String letra;
    private int qtd;
    
    public void verificar(String letra){
        this.letra = letra;
        if(this.letra.equalsIgnoreCase("x")) {
            this.qtd++;
        }
    }
    public int mostra(){
        return this.qtd;
    }
}
