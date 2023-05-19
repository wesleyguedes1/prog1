/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exoop2;

public class ExOOP2 {

    
    public static void main(String[] args) throws Exception {
        Carta carta1 = new Carta("3", "Paus");
        Baralho baralho1 = new Baralho();
        baralho1.retornaBaralho();
        baralho1.embaralha();
        baralho1.retornaBaralho();
    }
    
}
