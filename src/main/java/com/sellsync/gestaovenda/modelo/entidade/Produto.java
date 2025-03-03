package com.sellsync.gestaovenda.modelo.entidade;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private Integer quantidade;
    private BigDecimal preco;
    private Long usuarioId;
    private Long categoriaId;
    private LocalDateTime dataCriacao;
}
