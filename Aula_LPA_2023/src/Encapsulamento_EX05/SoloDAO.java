package Encapsulamento_EX05;

public class SoloDAO {
    private String situacao = "";
    private int pontos;
    
    public String calcularTipo(SoloDTO soloDTO) {
        this.pontos = soloDTO.getPontos();
        
        if(this.pontos<=10) {
            this.situacao = "O solo é do tipo rochoso!";
        } else if((this.pontos>10)&&(this.pontos<=40)) {
            this.situacao = "O solo é do tipo firme!";
        } else if(this.pontos>40&&this.pontos<=80){
            this.situacao = "O solo é do tipo pantanoso!";
        } else if(this.pontos>80){
            this.situacao = "Quantidade de água inválida";
        }
        return this.situacao;
    }
}
