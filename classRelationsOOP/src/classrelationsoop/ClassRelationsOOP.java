
package classrelationsoop;

public class ClassRelationsOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto prod1 = new Produto(123, 20.00, "produto novo");
        Produto prod2 = new Produto(321, 50.00, "Promoção");
        ItemPedido pedido2 = new ItemPedido(prod2, 1);
        ItemPedido pedido1 = new ItemPedido(prod1, 3);
        System.out.println("valor total pedido 1: " + pedido1.getTotalValue());
        System.out.println("valor total pedido 2: " + pedido2.getTotalValue());
        Pedido total = new Pedido();
        total.adicionarItem(pedido1);
        total.adicionarItem(pedido2);
        total.obterTotal();
        
        
    }
    
}
