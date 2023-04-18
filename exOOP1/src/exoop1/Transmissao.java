/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exoop1;


public class Transmissao {
    private int numeroMarcha;
    private boolean pontoMorto;
    private boolean marchaRe;
    //metodo construtor
    public Transmissao () {
        this.numeroMarcha = 1;
        this.pontoMorto = false;
        this.marchaRe = false;
    }
    //metodos get e set de todos os atributos
    public int getNumeroMarcha() {
        return numeroMarcha;
    }

    public void setNumeroMarcha(int numeroMarcha) {
        if(numeroMarcha > 0 && numeroMarcha < 6){
            this.numeroMarcha = numeroMarcha;
        }
        else {
            System.out.println("Número inválido.");
        }
        
        
    }
    public boolean getPontoMorto() {
        return pontoMorto;
    }

    public void setPontoMorto(boolean pontoMorto) {
        this.pontoMorto = pontoMorto;
    }

    public boolean getMarchaRe() {
        return marchaRe;
    }
    public void setMarchaRe(boolean marchaRe) {
        this.marchaRe = marchaRe;
    }
    
    public void aumentarMarcha() {
        if (numeroMarcha >= 5) {
            System.out.println("Não é possível aumentar a marcha");
        } else {
            numeroMarcha++;
        }
    }
    public void diminuirMarcha() {
        if (numeroMarcha  <= 1) {
            System.out.println("Não é possível diminuir a marcha");
        } else {
            numeroMarcha--;
        }
    }
    public void retornaMarcha() {
        System.out.println(this.getNumeroMarcha());
    }
    
    
    
    
}
