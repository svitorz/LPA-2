package Atividade_3;

public class AlturaDAO {
    
   private double altura, peso; 
   private String resposta;

    public String mostrarClassificacao(AlturaDTO alturaDTO){
        this.altura = (alturaDTO.getAltura());
        this.peso = (alturaDTO.getPeso());
        
        
     if((this.altura<1.20)&&(this.peso<60)){
        this.resposta = " A ";
    }else if((this.altura<1.20)&&(this.peso>=60)&&(this.peso<=90)){
        this.resposta = " D ";
    }else if((this.altura<1.20)&&(this.peso>90))
    {
        this.resposta = " G ";
    } else if((this.altura>1.20)&&(this.altura<=1.70)&&(this.peso<60)){
        this.resposta = " B ";
    }else if ((this.altura>1.20)&&(this.altura<=1.70)&&(this.peso>=60)&&(this.peso<=90)){
        this.resposta = " E ";
    }else if((this.altura>1.20)&&(this.altura<=1.70)&&(this.peso>90)){
        this.resposta = " H ";
    }else if((this.altura>1.70)&&(this.peso<60)){
        this.resposta = " C ";
    }else if ((this.altura>1.70)&&(this.peso>=60)&&(this.peso<=90)){
        this.resposta = " F ";
    }else{
        this.resposta = " I ";
     }
     return this.resposta;
    }
}

