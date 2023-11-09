package br.com.dio.sistema.controle.ponto2.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {

    @Id
    private Long id;

    //relacionamento: varias localidades para um nivel de acesso
    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;
}
