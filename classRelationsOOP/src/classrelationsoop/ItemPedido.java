/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classrelationsoop;

/**
 *
 * @author wesle
 */
public class ItemPedido {
    private Produto prod;
    private int qtde;
    private double totalValue;

    public ItemPedido(Produto prod, int qtde) {
        this.prod = prod;
        this.qtde = qtde;
        this.totalValue = prod.getValor() * qtde;
               
    }

    public double getTotalValue() {
        return totalValue;
    }
    
    
    
}
