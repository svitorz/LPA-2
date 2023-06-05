package Atividade_2;

public class CrescDAO{

    private int n1,n2,n3;
     
    public String ordenarNumeros(CrescDTO crescDTO){
        this.n1 = (crescDTO.getN1());
        this.n2 = (crescDTO.getN2());
        this.n3 = (crescDTO.getN3());
      
          if(this.n1>this.n2&&this.n2>this.n3){  
            return this.n1 + " , " + this.n2 + " , " +  this.n3;  
        }else if(this.n1>this.n2&&this.n3>this.n2){
            
            return this.n1 +" , "+ this.n3 + " , "+this.n2;
            
        }else if(this.n2>this.n1&&this.n1>this.n3){
            
            return this.n2 + " , " + this.n1 + " , " + this.n3;
            
        }else if(this.n2>this.n3&&this.n3>this.n1){
            
            return this.n2 + " , " + this.n3 + " , " + this.n1;
            
        }else if(this.n3>this.n1&&this.n1>this.n2){
            
            return this.n3 + " , " + this.n1 + " , " + this.n2;
            
        }else if(this.n3>this.n2&&this.n2>this.n1)
        {
            return this.n3 + " , " + this.n2 + " , " + this.n1;
        } else {
            return "erro";
        }
    }
}
