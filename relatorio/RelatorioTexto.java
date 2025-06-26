package relatorio;

import model.ItemPedido;
import model.Pedido;

public class RelatorioTexto {
    public void gerartexto(Pedido pedido) {
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Produtos:");
        for (ItemPedido item : pedido.getItens()) {
            System.out.println("- " + item.getProduto().getNome() + " (" + item.getQuantidade() + "x) - R$ " + item.getSubtotal());
        }
        System.out.println("Total: R$ " + pedido.calcularTotal());
        System.out.println("Frete: R$ " + pedido.getValorFrete());
        System.out.println("Total com frete: R$ " + pedido.getTotalComFrete());
    }
}
