/*
    Arquivo .java para teste das instruções MERGE
    no banco de dados do projeto
*/


package com.sellsync.gestaovenda.modelo.repositorio.impl;

import com.sellsync.gestaovenda.modelo.entidade.Categoria;

public class CategoriaRepositorioTeste extends CrudRepositorioImpl{
    
    public CategoriaRepositorioTeste() {
        super(Categoria.class);
    }
    
    public static void main(String[] args) {
        Categoria categoria = Categoria.builder()
                .id(3L)
                .nome("Esporte")
                .descricao("Basquete")
                .build();
        
        CategoriaRepositorioTeste repositorioTeste = new CategoriaRepositorioTeste();
        
        System.err.println("RESULTADO: " + repositorioTeste.salvar(args));
    }
    
}
