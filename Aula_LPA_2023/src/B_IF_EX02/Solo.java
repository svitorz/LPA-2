package B_IF_EX02;

public class Solo {
     private double qnt_agua;
    private String resposta;
    
    public String tipo(double qnt_agua){
    this.qnt_agua = qnt_agua;
    
    if(qnt_agua<=10) {
        resposta = "O tipo de solo é Rochoso";
            }
    else {
        if((qnt_agua > 10) && (qnt_agua <= 40)){
            resposta = "O tipo de solo é Firme";
        }
    
    else {
        if ((qnt_agua > 40) && (qnt_agua <=80)) {
                resposta = "O tipo de solo é Pantanoso";  
            }
            else {
              resposta = "Quantidade de solo inválida!";
            }
        }
    }
    return this.resposta;
    }
}
