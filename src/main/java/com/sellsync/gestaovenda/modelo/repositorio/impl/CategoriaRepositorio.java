package com.sellsync.gestaovenda.modelo.repositorio.impl;

import com.sellsync.gestaovenda.modelo.entidade.Categoria;

public class CategoriaRepositorio extends CrudRepositorioImpl {

    public CategoriaRepositorio() {
        super(Categoria.class);
    }
    
    
    public static void main(String[] args) {
        Categoria categoria = Categoria.builder()
                .id(1L)
                .nome("Livro")
                .descricao("Conhecimento é poder")
                .build();
        
        CategoriaRepositorio repositorio = new CategoriaRepositorio();
        
        System.out.println("RESULTADO: " + repositorio.removerPeloId(2L));
    }
}
