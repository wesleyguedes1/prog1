
package exoop2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Baralho {
    
    private List<Carta> cartas = new ArrayList<>();
    final int TOTAL_CARTAS = 52;
    final int TOTAL_NAIPE = 13;
    static int quantNaipe = 0;
    static int quant_total = 0;
 
    String[] valores = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
    String[] naipes = {"Copas", "Espadas", "Ouro", "Paus"};  
    
    public Baralho() throws Exception {
        
        for (String naipe : naipes) {
            for (String valor : valores) {
                Carta carta = new Carta(valor, naipe);
                cartas.add(carta);
                quantNaipe++;
                quant_total++;        
            }
            if (quantNaipe!= TOTAL_NAIPE) {
                throw new Exception("Quantidade errada de cartas!");
            }
            quantNaipe = 0;
        }
        if (quant_total != TOTAL_CARTAS) {
            throw new Exception("Quantidade errada de cartas!");
        }
        
        
        
    }
    public void retornaBaralho() {
        for(int i = 0; i < cartas.size(); i++) {
            System.out.println(cartas.get(i));
            
        }
    }
    
    public void embaralha() {
        Random random = new Random();
        for (int i = 0; i < cartas.size(); i++) {
            int j = random.nextInt(cartas.size());
            Carta temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);
        }
    }


    
}
