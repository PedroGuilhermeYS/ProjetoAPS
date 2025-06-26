package servico;

import model.Pedido;

public class FreteCalculadoraPeso {
    public double calcular(Pedido pedido) {
        double pesoTotal = pedido.getItens().stream()
            .mapToDouble(item -> item.getProduto().getPeso() * item.getQuantidade())
            .sum();

        double precoPorKg = 1.0; // R$ 1,00 por kg
        return pesoTotal * precoPorKg;
    }
}

