
package exercicioherancaassociacoes;


public class Cartao {
    
    private String numero;
    private String nome;
    private double saldo;
    
    
    public Cartao(String numero, String nome, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    
}
