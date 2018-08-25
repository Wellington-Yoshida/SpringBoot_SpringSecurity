package br.com.sistemaAtividade.service;

import br.com.sistemaAtividade.domain.Atividade;

import java.util.List;

public interface AtividadeService {

    void salvar(Atividade atividade);
    void atualizar(Atividade atividade);
    void deletar(Long id);
    List<Atividade> findAll();
    Atividade findBy(Long id);
}
