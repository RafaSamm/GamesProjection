package br.com.rhssolutions.GamesProjection.model.repository;

import br.com.rhssolutions.GamesProjection.model.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
