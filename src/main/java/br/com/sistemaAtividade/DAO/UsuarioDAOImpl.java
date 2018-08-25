package br.com.sistemaAtividade.DAO;

import br.com.sistemaAtividade.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public void salvar(Usuario usuario) {
        entityManager.persist(usuario);
    }

    @Override
    public void atualizar(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public void deletar(Long id) {
        entityManager.remove(entityManager.getReference(Usuario.class, id));
    }

    @Override
    public List<Usuario> findAll() {
        return entityManager.createQuery("select u from Usuario u", Usuario.class).getResultList();
    }

    @Override
    public Usuario findBy(Long id) {
        return entityManager.createQuery("select u from Usuario u where u.id = :id", Usuario.class)
                .setParameter("id", id).getSingleResult();
    }
}
