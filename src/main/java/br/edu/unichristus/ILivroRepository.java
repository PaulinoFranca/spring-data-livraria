package br.edu.unichristus;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILivroRepository extends JpaRepository<Livro, Long> {

	public Livro findByTitulo(String titulo);
	
	public List<Livro> findByTituloContaining(String titulo);

}
