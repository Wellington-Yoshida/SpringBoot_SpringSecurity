package br.com.sistemaAtividade.service;

import br.com.sistemaAtividade.DAO.AtividadeDAO;
import br.com.sistemaAtividade.domain.Atividade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AtividadeServiceImpl implements AtividadeService{

    @Autowired
    private AtividadeDAO atividadeDAO;

    @Override
    public void salvar(Atividade atividade) {
        atividadeDAO.salvar(atividade);
    }

    @Override
    public void atualizar(Atividade atividade) {
        atividadeDAO.atualizar(atividade);
    }

    @Override
    public void deletar(Long id) {
        atividadeDAO.deletar(id);
    }

    @Override
    public List<Atividade> findAll() {
        return atividadeDAO.findAll();
    }

    @Override
    public Atividade findBy(Long id) {
        return atividadeDAO.findBy(id);
    }
}
