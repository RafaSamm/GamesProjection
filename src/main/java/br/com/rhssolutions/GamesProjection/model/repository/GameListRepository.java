package br.com.rhssolutions.GamesProjection.model.repository;

import br.com.rhssolutions.GamesProjection.model.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
