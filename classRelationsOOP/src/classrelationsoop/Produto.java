
package classrelationsoop;

public class Produto {
    private int codigo;
    private double valor;
    private String descr;
    
    public Produto (int codigo, double valor, String descr) {
        this.codigo = codigo;
        this.valor = valor;
        this.descr = descr;
    }

    public double getValor() {
        return valor;
    }
    
}
