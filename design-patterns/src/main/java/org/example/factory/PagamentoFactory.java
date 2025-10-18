package org.example.factory;

import org.example.strategy.PagamentoStrategy;
import org.example.strategy.impl.BoletoStrategy;
import org.example.strategy.impl.CartaoCreditoStrategy;
import org.example.strategy.impl.PixStrategy;

public class PagamentoFactory {

    public static PagamentoStrategy criarPagamento(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "cartao" -> new CartaoCreditoStrategy();
            case "pix" -> new PixStrategy();
            case "boleto" -> new BoletoStrategy();
            default -> throw new IllegalArgumentException("Tipo de pagamento inválido: " + tipo);
        };
    }

}
