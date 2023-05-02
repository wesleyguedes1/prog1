
package classrelationsoop;
import java.util.ArrayList;
import java.util.List;


public class Pedido {
    private List<ItemPedido>itens;
    private double valorTotal;
    
    public Pedido() {
        this.itens = new ArrayList<>();
        
    }
    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
        valorTotal += item.getTotalValue();
    }
    public void obterTotal() {
        System.out.println("Total: " + valorTotal);
    }
}
