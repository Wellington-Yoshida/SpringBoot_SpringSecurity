package br.com.sistemaAtividade.DAO;

import br.com.sistemaAtividade.domain.Usuario;

import java.util.List;

public interface UsuarioDAO {

    void salvar(Usuario usuario);
    void atualizar(Usuario usuario);
    void deletar(Long id);
    List<Usuario> findAll();
    Usuario findBy(Long id);
}
