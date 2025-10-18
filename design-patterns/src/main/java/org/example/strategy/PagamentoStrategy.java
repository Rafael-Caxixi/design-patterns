package org.example.strategy;

import org.example.model.Pagamento;

public interface PagamentoStrategy {

    void processarPagamento(Pagamento pagamento);
}
