package br.com.caelum.loja.session;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;

@Path("/livraria")
public interface GerenciadorLoja {

	Livro procura(String isbn);
	
	Livro salva(Livro livro);
	
	Autor salva(Autor autor);

	Livro procura(Long id);
	
	List<Autor> getAutoresDoLivro(Livro livro);
	
	@GET
	@Path("/livros/autor/{nome}")
	@Produces({"application/xml", "application/json"})	
	List<Livro> buscaLivrosPeloNomeDoAutor(String nome);
	
	List<Livro> listaLivros();
}
