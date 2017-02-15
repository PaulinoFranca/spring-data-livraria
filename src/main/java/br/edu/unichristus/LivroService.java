package br.edu.unichristus;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

	@Autowired
	private ILivroRepository livroRepository;

	public Livro buscarPeloID(long idLivro){
		return this.livroRepository.findOne(idLivro);
	}
	
	public List<Livro> buscaPelosIDs(ArrayList<Long> ids){
		return this.livroRepository.findAll(ids);
	}
	
	public void salvar(Livro livro) {
		this.livroRepository.save(livro);
	}
	
	public void deletar(Livro livro) {
		this.livroRepository.delete(livro);
	}
	
	public void deletar(Long idLivro){
		this.livroRepository.delete(idLivro);
	}
	
	public Livro buscarPeloTitulo(String titulo){
		return this.livroRepository.findByTitulo(titulo);
	}
	
	public List<Livro> buscarPeloTituloContendo(String titulo){
		return this.livroRepository.findByTituloContaining(titulo);
	}

}
