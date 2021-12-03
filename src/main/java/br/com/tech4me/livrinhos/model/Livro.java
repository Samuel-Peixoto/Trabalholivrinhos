package br.com.tech4me.livrinhos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("livros")
public class Livro {
@Id

   public String id;
   public String nome; 
   public String autor; 
   private Integer codigo; 
   private Double valor;
   private Integer numeroPagina;
   
public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getAutor() {
    return autor;
}
public void setAutor(String autor) {
    this.autor = autor;
}
public Integer getCodigo() {
    return codigo;
}
public void setCodigo(Integer codigo) {
    this.codigo = codigo;
}
public Double getValor() {
    return valor;
}
public void setValor(Double valor) {
    this.valor = valor;
}
public Integer getNumeroPagina() {
    return numeroPagina;
}
public void setNumeroPagina(Integer numeroPagina) {
    this.numeroPagina = numeroPagina;
}

@Override
public String toString() {
    return "Livro [autor=" + autor + ", codigo=" + codigo + ", id=" + id + ", nome=" + nome + ", numeroPagina="
            + numeroPagina + ", valor=" + valor + "]";
}

}
