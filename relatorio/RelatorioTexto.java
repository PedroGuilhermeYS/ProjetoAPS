package relatorio;

import model.ItemPedido;
import model.Pedido;

public class RelatorioTexto {
    public void gerar(Pedido pedido) {
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Produtos:");
        for (ItemPedido item : pedido.getItens()) {
            System.out.println("- " + item.getProduto().getNome() + " (" + item.getQuantidade() + "x) - R$ " + String.format("%.2f", item.getSubtotal()));
        }
        System.out.println("Total: R$ " + String.format("%.2f", pedido.calcularTotal()));
        System.out.println("Frete: R$ " + String.format("%.2f", pedido.getValorFrete()));
        System.out.println("Total com frete: R$ " + String.format("%.2f", pedido.getTotalComFrete()));
    }
}
