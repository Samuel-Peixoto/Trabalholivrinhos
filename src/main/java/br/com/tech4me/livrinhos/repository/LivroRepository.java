package br.com.tech4me.livrinhos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tech4me.livrinhos.model.Livro;

public interface LivroRepository extends MongoRepository<Livro, String> {
    
}
