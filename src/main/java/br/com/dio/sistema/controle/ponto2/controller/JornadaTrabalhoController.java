package br.com.dio.sistema.controle.ponto2.controller;

import br.com.dio.sistema.controle.ponto2.model.JornadaTrabalho;
import br.com.dio.sistema.controle.ponto2.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;


    //Metodos HTTP
    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.saveJornada(jornadaTrabalho);
    }
    @GetMapping
    public List<JornadaTrabalho> getListaJornada(){
        return jornadaTrabalhoService.listarJornadas();
    }
    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getListaJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.listarPorId(idJornada).orElseThrow(() -> new NoSuchElementException("Jornada não existe!")));
    }
    @PutMapping
    public JornadaTrabalho atualizarJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.atualizarJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public void deletarJornada (@PathVariable("idJornada") Long idJornada) {
            jornadaTrabalhoService.deletarJornada(idJornada);

    }


}
