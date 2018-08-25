package br.com.sistemaAtividade.DAO;

import br.com.sistemaAtividade.domain.Atividade;
import br.com.sistemaAtividade.domain.Usuario;

import java.util.List;

public interface AtividadeDAO {

    void salvar(Atividade atividade);
    void atualizar(Atividade atividade);
    void deletar(Long id);
    List<Atividade> findAll();
    Atividade findBy(Long id);
}
