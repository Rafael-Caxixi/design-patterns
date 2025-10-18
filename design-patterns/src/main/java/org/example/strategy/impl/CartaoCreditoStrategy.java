package org.example.strategy.impl;

import org.example.config.AppConfig;
import org.example.model.Pagamento;
import org.example.strategy.PagamentoStrategy;

public class CartaoCreditoStrategy implements PagamentoStrategy {

    @Override
    public void processarPagamento(Pagamento pagamento) {
        double taxa = AppConfig.getInstance().getTaxaBase() + 0.03; //3% adicional para cartao de credito
        double valorFinal = pagamento.getValor() * (1 + taxa);
        System.out.println("Processando pagamento no cartão de crédito: R$" + valorFinal);
    }

}
