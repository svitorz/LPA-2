package IntroducaoEX06;

public class Conversao {
    private double polegadas, jardas, milhas, pes;
    
    public String medidaConv (double pes) {
        this.pes = pes;
        this.polegadas = pes * 12;
        this.jardas = pes/3;
        this.milhas = jardas/1760;
       
      return ("A medida em pés é:" + this.pes +
      "\nA medida em polegadas é:" + this.polegadas +
      "\nA medida em jardas é:" + this.jardas +
      "\nA medida em milhas é:" + this.milhas);  
    }
}
