package br.com.sistemaAtividade.controller;

import br.com.sistemaAtividade.domain.Atividade;
import br.com.sistemaAtividade.domain.Usuario;
import br.com.sistemaAtividade.service.AtividadeService;
import br.com.sistemaAtividade.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/atividade")
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listaAtividade")
    public ModelAndView lista(ModelMap model){
        model.addAttribute("listaAtividade", atividadeService.findAll());
        return new ModelAndView("/atividade/listaAtividade");
    }

    @ModelAttribute("usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioService.findAll();
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("atividade")Atividade atividade, BindingResult result, RedirectAttributes attr){

        atividadeService.salvar(atividade);
        attr.addFlashAttribute("mensagem", "Atividade salva com sucesso.");
        return"redirect:/atividade/listaAtividade";

    }

    @GetMapping("/cadastra")
    public String preCadastra(Atividade atividade){
        return "/atividade/cadastroAtividade";

    }

    @GetMapping("/{id}/atualizar")
    public ModelAndView preEditar(@PathVariable("id") Long id, ModelMap model){
        Atividade atividade = atividadeService.findBy(id);
        model.addAttribute("atividade", atividade);
        return new ModelAndView("/atividade/cadastroAtividade", model);

    }

    @PutMapping("/salvar")
    public String editar(@ModelAttribute("atividade") Atividade atividade, BindingResult result, RedirectAttributes attr){
        if(result.hasErrors()){
            return "/usuario/cadastriUsuario";
        }

        atividadeService.atualizar(atividade);
        attr.addFlashAttribute("mensagem", "Atividade editado com sucesso.");
        return"redirect:/atividade/listaAtividade";
    }

    @GetMapping("{id}/remover")
    public String remover(@PathVariable("id") Long id, RedirectAttributes attr){
        atividadeService.deletar(id);
        attr.addFlashAttribute("mensagem", "Atividade removida com sucesso.");
        return"redirect:/atividade/listaAtividade";
    }

}
