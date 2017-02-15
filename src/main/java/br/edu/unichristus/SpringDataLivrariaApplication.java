package br.edu.unichristus;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataLivrariaApplication implements CommandLineRunner {
	@Autowired
	private LivroService servicoLivros;

	@Override
	public void run(String... args) {
		Livro livro = new Livro("Java Como Programar", new Date(), 250, new BigDecimal("15.00"));
		this.servicoLivros.salvar(livro);
		
		Livro livro1 = this.servicoLivros.buscarPeloID(1L);
		System.out.println(livro1);
		
		List<Livro> livros = this.servicoLivros.buscaPelosIDs(new ArrayList<Long>() {
			{
				add(1L);
			}
		});
		
		for(Livro l : livros){
			System.out.println(l);
		}
		
		
		livro1.setPreco(new BigDecimal(666));
		livro1.setTitulo("The number of the beast");
		this.servicoLivros.salvar(livro1);
		
		this.servicoLivros.deletar(2L);
		
		Livro beast = this.servicoLivros.buscarPeloTitulo("The number of the beast");
		System.out.println(beast);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataLivrariaApplication.class, args);
	}
}
