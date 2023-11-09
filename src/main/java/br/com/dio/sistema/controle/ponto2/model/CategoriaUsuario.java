package br.com.dio.sistema.controle.ponto2.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class CategoriaUsuario {

    @Id
    private Long id;
    private String descricao;
}
