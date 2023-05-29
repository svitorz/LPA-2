package Encapsulamento_EX04;

public class MediaDAO {
    private double media;
    private String situacao="";
    
    public String calcularMedia(MediaDTO mediaDTO){
        
     this.media = (mediaDTO.getN1() + mediaDTO.getN2())/2;
     
        if(this.media>= 7){
            this.situacao = "O aluno está aprovado e a media foi " + this.media;
    } else {
        this.situacao = "O aluno está reprovado e a media foi " + this.media;
        }
        return this.situacao;
    }
}
