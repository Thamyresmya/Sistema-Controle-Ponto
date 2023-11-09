package br.com.dio.sistema.controle.ponto2.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {

    @Id
    private Long id;

    //relacionamento: varios usuarios para um categoria
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;

    //relacionamento
    @ManyToOne
    private Empresa empresa;

    //relacionamento
    @ManyToOne
    private NivelAcesso nivelAcesso;

    //relacionamento
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;


    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
}
