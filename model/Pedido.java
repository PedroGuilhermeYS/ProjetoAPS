package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;
    private String tipoFrete; 
    private double valorFrete;

    public Pedido(Cliente cliente, String tipoFrete) {
        this.cliente = cliente;
        this.tipoFrete = tipoFrete;
        this.itens = new ArrayList<>();
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public Cliente getCliente() {
        return cliente;
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

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getTotalComFrete() {
        return calcularTotal() + valorFrete;
    }

    @Override
    public String toString() {
        return "\nPedido do cliente: " + cliente.getNome() +
                "\nItens: " + itens +
                "\nTotal dos produtos: R$" + calcularTotal() +
                "\nFrete (" + tipoFrete + "): R$" + valorFrete +
                "\nTOTAL COM FRETE: R$" + getTotalComFrete();
    }
}
