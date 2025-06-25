package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;
    //private String tipoFrete; Necessita classes Service
    private double valorFrete;

    public Pedido(Cliente cliente, String tipoFrete) {
        this.cliente = cliente;
        //this.tipoFrete = tipoFrete; Necessita classes Service
        this.itens = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItem(Produto p, int qtd) {
        this.itens.add(new ItemPedido(p, qtd));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente.getNome() +
                ", total=" + calcularTotal() +
                ", frete=" + valorFrete +
                //", totalComFrete=" + TotalComFrete() + Necessita classes Service
                '}';
    }
}
