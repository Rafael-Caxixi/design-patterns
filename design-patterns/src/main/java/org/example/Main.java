package org.example;

import org.example.config.AppConfig;
import org.example.factory.PagamentoFactory;
import org.example.model.Pagamento;
import org.example.strategy.PagamentoStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pagamento pagamentoCartao = new Pagamento("cartao", 100.0);
        Pagamento pagamentoPix = new Pagamento("pix", 100.0);
        Pagamento pagamentoBoleto = new Pagamento("boleto", 100.0);

        System.out.println("Ambiente: " + AppConfig.getInstance().getAmbiente());

        List<Pagamento> listaDePagamentos = new ArrayList<>();
        listaDePagamentos.add(pagamentoCartao);
        listaDePagamentos.add(pagamentoPix);
        listaDePagamentos.add(pagamentoBoleto);

        for (Pagamento pagamento : listaDePagamentos) {
            PagamentoStrategy strategy = PagamentoFactory.criarPagamento(pagamento.getTipo());
            strategy.processarPagamento(pagamento);
        }

    }
}