package B_WHILE_EX02;

public class While_Cada_Vogal {
    private int vogal, consoante,vogal_a,vogal_e,vogal_i,vogal_o,vogal_u;
    private String letra;
    public void somar(String letra){
        this.letra = letra;
            if(this.letra.equalsIgnoreCase("a")){
                this.vogal_a++; 
            }
            else if(this.letra.equalsIgnoreCase("e")){
                    this.vogal_e++; 
                }
                 else if(this.letra.equalsIgnoreCase("i")){
                        this.vogal_i++; 
                    }
                      else if(this.letra.equalsIgnoreCase("o")){
                            this.vogal_o++; 
                        }
                         else if(this.letra.equalsIgnoreCase("u")){
                                this.vogal_u++; 
                            }
                              else if(!this.letra.equalsIgnoreCase("0"))
                                this.consoante++;
                                }
                                         
    
    public String mostrar(){
                    return"O número de vogais 'a' é: " + this.vogal_a +
                    "\nO número de vogais 'e' é " + this.vogal_e +
                    "\nO número de vogais 'i' é " + this.vogal_i +
                    "\nO número de vogais 'o' é " + this.vogal_o +
                    "\nO número de vogais 'u' é " + this.vogal_u +
                    "\nE o número de consoantes é " + this.consoante;
    }
}

