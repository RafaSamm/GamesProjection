package br.com.rhssolutions.GamesProjection.model.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_belonging")
@Data
public class Belonging { // Classe de associação entre jogos e suas listas

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

}
