package br.edu.unichristus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_EDITORA")
public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EDITORA_ID")
	private Long editoraID;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "CIDADE")
	private String cidade;

	public Long getEditoraID() {
		return editoraID;
	}

	public void setEditoraID(Long editoraID) {
		this.editoraID = editoraID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Editora() {

	}

	public Editora(String nome, String cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}
}
