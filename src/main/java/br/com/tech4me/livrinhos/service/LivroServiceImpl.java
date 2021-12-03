package br.com.tech4me.livrinhos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.livrinhos.model.Livro;
import br.com.tech4me.livrinhos.repository.LivroRepository;

@Service
public class LivroServiceImpl implements LivroService{
    @Autowired
    private LivroRepository repo;

    @Override
    public List<Livro> obterLivros() {
        return repo.findAll();
    }

    @Override
    public Livro cadrastarLivro(Livro livro) {
        return repo.save(livro);
    }

    @Override
    public Livro obterLivroPorId(String id) {
        return repo.findById(id).get();
    }
    @Override
    public void excluirLivro(String id) {
        repo.deleteById(id);

    }

    @Override
    public Livro atualizarLivros(String id, Livro novoLivro) {
       novoLivro.setId(id); 
        return repo.save(novoLivro);
    }

}
