package br.com.rhssolutions.GamesProjection.model.record;

import br.com.rhssolutions.GamesProjection.model.entities.GameList;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record GameListRecord(Long id, String name) {
    public  GameListRecord(GameList gameList) {
        this(gameList.getId(), gameList.getName());
    }
}
