package br.com.tech4me.livrinhos.service;

import java.util.List;

import br.com.tech4me.livrinhos.model.Livro;

public interface LivroService {
    List<Livro> obterLivros();
    Livro cadrastarLivro(Livro livro);
    Livro obterLivroPorId(String id);
    void excluirLivro(String id);
    Livro atualizarLivros(String id, Livro novoLivro);
}
