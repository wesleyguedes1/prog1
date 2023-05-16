/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exoop2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aluno
 */
public class Carta {
    private String valor;
    private String naipe;
    static private int quantCartas;
    private boolean valorValido;
    String[] valores = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
    String[] naipes = {"Copas", "Espadas", "Ouro", "Paus"};    
    public Carta(String valor, String naipe) throws Exception {
        valorValido = false;
        for(int i = 0; i < valores.length; i++) {
            if(valor.equals(valores[i])) {
                this.valor = valor;
                valorValido = true;
            }
        }
       
        
        
        
        this.naipe = naipe;
    }
}
