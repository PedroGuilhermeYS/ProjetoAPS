package servico;

import model.Pedido;

public class FreteCalculadoraPeso {
    public static double calcularFretePeso(Pedido totalfrete) {
        double pesoTotal = totalfrete.getItens().stream()
            .mapToDouble(item -> item.getProduto().getPeso() * item.getQuantidade())
            .sum();

        double precoPorKg = 5.00;
        return pesoTotal * precoPorKg;
    }
}

