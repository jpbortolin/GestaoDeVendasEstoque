package com.sellsync.gestaovenda.modelo.entidade;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class VendaItem {
    private Long vendaId;
    private Long produtoId;
    private Integer quantidade;
    private BigDecimal desconto;
    private BigDecimal preco;
    private BigDecimal total;
}
