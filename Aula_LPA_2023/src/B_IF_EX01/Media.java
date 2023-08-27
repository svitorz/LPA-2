package B_IF_EX01;

public class Media {
    private double nota1, nota2, mediaf;
    private String resposta;
    
    public String calcular(double nota1, double nota2){
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.mediaf = (nota1 + nota2)/2;
 
    if(mediaf>=6) {
        resposta = "Aprovado";
        }
    else {
        if((mediaf >= 4) && (mediaf < 6)){
            resposta = "Recuperação";
        }
        else {  
            resposta = "Reprovado";  
                }
            }

    return this.resposta;
    }
}

