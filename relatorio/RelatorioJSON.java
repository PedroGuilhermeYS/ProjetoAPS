package relatorio;

import model.Pedido;
import model.ItemPedido;

public class RelatorioJSON {
    public String gerarjson(Pedido pedido) {
        StringBuilder stringson = new StringBuilder();
        stringson.append("{\n");
        stringson.append("  \"cliente\": \"").append(pedido.getCliente().getNome()).append("\",\n");
        stringson.append("  \"produtos\": [\n");
        for (int i = 0; i < pedido.getItens().size(); i++) {
            ItemPedido item = pedido.getItens().get(i);
            stringson.append("    {\"nome\": \"").append(item.getProduto().getNome()).append("\", \"quantidade\": ")
                    .append(item.getQuantidade()).append(", \"preco\": ").append(item.getProduto().getPreco()).append("}");
            if (i < pedido.getItens().size() - 1) {
                stringson.append(",");
            }
            stringson.append("\n");
        }
        stringson.append("  ],\n");
        stringson.append("  \"total\": ").append(pedido.calcularTotal()).append(",\n");
		stringson.append("  \"frete\": ").append(pedido.getValorFrete()).append(",\n");
		stringson.append("  \"total_com_frete\": ").append(pedido.calcularTotal() + pedido.getValorFrete()).append("\n");
        stringson.append("}");
        return stringson.toString();
    }
}