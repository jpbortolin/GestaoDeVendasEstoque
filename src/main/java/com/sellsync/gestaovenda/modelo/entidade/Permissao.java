package com.sellsync.gestaovenda.modelo.entidade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Permissao {
    private Long id;
    private String nome;
    private String descricao;
}
