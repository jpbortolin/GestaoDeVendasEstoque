package com.sellsync.gestaovenda.modelo.entidade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissaoUsuario {
    Long permissaoId;
    Long usuarioId;
}
