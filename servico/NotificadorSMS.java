package servico;

import model.Cliente;

public class NotificadorSMS {
    public void notificar(Cliente cliente) {
        System.out.println("Enviando um SMS para " + cliente.getTelefone());
    }
}