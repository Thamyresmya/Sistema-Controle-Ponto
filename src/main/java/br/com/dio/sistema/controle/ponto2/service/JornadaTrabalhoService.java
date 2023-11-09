package br.com.dio.sistema.controle.ponto2.service;

import br.com.dio.sistema.controle.ponto2.model.JornadaTrabalho;
import br.com.dio.sistema.controle.ponto2.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    @Autowired
    JornadaTrabalhoRepository jornadaTrabalhoRepository;



    //metodos para usar nos controlles

    //Criar jornada
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    //Atualizar as jornadas
    public JornadaTrabalho atualizarJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    //Listar todas as jornadas
    public List<JornadaTrabalho> listarJornadas(){
        return jornadaTrabalhoRepository.findAll();
    }

    //Listar por ID
    public Optional<JornadaTrabalho> listarPorId(Long idJornada) {
        return jornadaTrabalhoRepository.findById(idJornada);
    }

    //Deletar
    public void deletarJornada(Long idJornada) {
        jornadaTrabalhoRepository.deleteById(idJornada);
    }
}
