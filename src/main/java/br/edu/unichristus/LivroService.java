package br.edu.unichristus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

	@Autowired
	private ILivroRepository livroRepository;

	public void salvar(Livro livro) {
		this.livroRepository.save(livro);
	}

}
