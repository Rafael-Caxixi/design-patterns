package org.example.strategy.impl;

import org.example.config.AppConfig;
import org.example.model.Pagamento;
import org.example.strategy.PagamentoStrategy;

public class BoletoStrategy implements PagamentoStrategy {

    @Override
    public void processarPagamento(Pagamento pagamento) {
        double taxa = AppConfig.getInstance().getTaxaBase() + 0.01; //1% adicional para boleto
        double valorFinal = pagamento.getValor() * (1 + taxa);
        System.out.println("Processando pagamento no boleto: R$" + valorFinal);
    }
}
