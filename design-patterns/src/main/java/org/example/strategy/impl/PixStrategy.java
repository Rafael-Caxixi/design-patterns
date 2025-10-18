package org.example.strategy.impl;

import org.example.config.AppConfig;
import org.example.model.Pagamento;
import org.example.strategy.PagamentoStrategy;

public class PixStrategy implements PagamentoStrategy {

    @Override
    public void processarPagamento(Pagamento pagamento){
        double taxa = AppConfig.getInstance().getTaxaBase(); //taxa base para Pix
        double valorFinal = pagamento.getValor() * (1 + taxa);
        System.out.println("Processando pagamento no pix: R$" + valorFinal);
    }

}
