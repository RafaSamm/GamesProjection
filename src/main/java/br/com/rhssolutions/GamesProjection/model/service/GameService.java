package br.com.rhssolutions.GamesProjection.model.service;

import br.com.rhssolutions.GamesProjection.model.entities.Game;
import br.com.rhssolutions.GamesProjection.model.record.GameMinRecord;
import br.com.rhssolutions.GamesProjection.model.repository.GameRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    final GameRepository repository;
    public GameService(GameRepository repository) {
        this.repository = repository;
    }


    public List<GameMinRecord> findAllGames() {

        List<Game> games = repository.findAll();
        List<GameMinRecord> gamesMin = games.stream().map(GameMinRecord::new).toList();
        return gamesMin;
    }

}
