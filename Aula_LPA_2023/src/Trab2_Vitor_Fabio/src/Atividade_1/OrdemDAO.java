
package Atividade_1;

public class OrdemDAO {
    private int n1,n2,n3,n4;

    public String ordenarNumeros(OrdemDTO ordemDTO) {  
        this.n1 = (ordemDTO.getN1());
        this.n2 = (ordemDTO.getN2());
        this.n3 = (ordemDTO.getN3());   
        this.n4 = (ordemDTO.getN4());
        
        if(this.n4 >= this.n3){
            return this.n4+" , "+this.n3+" , "+this.n2+" , "+this.n1;
        }else if(this.n4 < this.n3 && this.n4 >= this.n2){
            return this.n3 + " , " +  +this.n4 +" , "+ this.n2 +" , "+ this.n1;
        } else if(this.n4 < this.n2 && this.n4>=this.n1){
            return this.n3 + " , " + this.n2 + " , " + this.n4 + " , " + this.n1;
        } else {
            return this.n3 + " , " + " , " +  this.n2+ " , " + this.n1 + " , " + this.n4;
        }
    }
}
