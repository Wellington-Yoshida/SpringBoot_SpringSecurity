package br.com.sistemaAtividade.service;

import br.com.sistemaAtividade.DAO.UsuarioDAO;
import br.com.sistemaAtividade.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public void salvar(Usuario usuario) {
        usuarioDAO.salvar(usuario);
    }

    @Override
    public void atualizar(Usuario usuario) {
        usuarioDAO.atualizar(usuario);
    }

    @Override
    public void deletar(Long id) {
        usuarioDAO.deletar(id);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioDAO.findAll();
    }

    @Override
    public Usuario findBy(Long id) {
        return usuarioDAO.findBy(id);
    }
}
