package br.edu.unichristus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditoraService {

	@Autowired
	IEditoraRepository editoraRepository;

	public void salvar(Editora editora) {
		this.editoraRepository.save(editora);
	}
}
