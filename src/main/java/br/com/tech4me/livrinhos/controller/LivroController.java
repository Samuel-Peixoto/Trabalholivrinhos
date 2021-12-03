package br.com.tech4me.livrinhos.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.livrinhos.model.Livro;
import br.com.tech4me.livrinhos.service.LivroService;

@RestController
@RequestMapping("/api/livrinhos")

public class LivroController {
    @Autowired
    private LivroService servico;

    @GetMapping
    public ResponseEntity<List<Livro>> obterLivros() {
        return new ResponseEntity<>(servico.obterLivros(), HttpStatus.FOUND);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Livro> obterLivroPorId(@PathVariable String id) {
        return new ResponseEntity<>(servico.obterLivroPorId(id), HttpStatus.FOUND);

    }

    @PostMapping
    public ResponseEntity<Livro> cadrastarLivro(@RequestBody Livro livro) {
        return new ResponseEntity<>(servico.cadrastarLivro(livro), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> excluirCarro(@PathVariable String id) {
        servico.excluirLivro(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Livro> atualizarCarro(@PathVariable String id, @RequestBody Livro novoLivro) {
        return new ResponseEntity<>(servico.atualizarLivros(id, novoLivro), HttpStatus.ACCEPTED);
    }
    
}
