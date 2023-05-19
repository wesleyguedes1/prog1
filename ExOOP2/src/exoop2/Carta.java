
package exoop2;


public class Carta {
    private String valor;
    private String naipe;
    private boolean valorValido = false;
    private boolean naipeValido = false;
    String[] valores = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
    String[] naipes = {"Copas", "Espadas", "Ouro", "Paus"};    
    public Carta(String valor, String naipe) throws Exception {
        for(int i = 0; i < valores.length; i++) {
            if(valor.equals(valores[i])) {
                this.valor = valor;
                valorValido = true;
            }
        }
        if (valorValido == false) {
            throw new Exception("Numero invalido!");
        }
        for(int i = 0; i < naipes.length; i++) {
            if(naipe.equals(naipes[i])) {
                this.naipe = naipe;
                naipeValido = true;
            }
        }
        if (naipeValido == false) {
            throw new Exception("Naipe invalido!");
        }
        
        
    }
     @Override
    public String toString() {
        return valor + " de " + naipe;
    }


    
    
}
