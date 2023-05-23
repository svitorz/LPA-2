package B_WHILE_EX03;

public class While_CanalTv {
    private int e,canal_9,canal_12,canal_23,canal_40,outros_canais;
    public void somar(int e){
        this.e = e;
            if(this.e==9){
                this.canal_9++; 
            }
            else if(this.e==12){
                    this.canal_12++; 
                }
                 else if(this.e==23){
                        this.canal_23++; 
                    }
                      else if(this.e==40){
                            this.canal_40++; 
                        }
                         else if(this.e !=0)
                            this.outros_canais++;
                        }
                                         
    
    public String mostrar(){
                    return"A audiência do canal 9 é: " + this.canal_9 +
                    "\nA audiência do canal 12 é: é " + this.canal_12 +
                    "\nA audiência do canal 23 é: é " + this.canal_23 +
                    "\nA audiência do canal 40 é: é " + this.canal_40 +
                    "\nA audiência de outros canais é " + this.outros_canais;
    }
}

