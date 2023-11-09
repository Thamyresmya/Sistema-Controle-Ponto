package br.com.dio.sistema.controle.ponto2.repository;

import br.com.dio.sistema.controle.ponto2.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long> {

}
