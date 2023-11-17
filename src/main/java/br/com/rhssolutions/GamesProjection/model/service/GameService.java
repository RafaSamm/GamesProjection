package br.com.rhssolutions.GamesProjection.model.service;

import br.com.rhssolutions.GamesProjection.model.entities.Game;
import br.com.rhssolutions.GamesProjection.model.record.GameMinRecord;
import br.com.rhssolutions.GamesProjection.model.record.GameRecord;
import br.com.rhssolutions.GamesProjection.model.repository.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    final GameRepository repository;
    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<GameMinRecord> findAllGames() {
        List<Game> games = repository.findAll();
        List<GameMinRecord> gamesMin = games.stream().map(GameMinRecord::new).toList();
        return gamesMin;
    }
    @Transactional(readOnly = true)
    public GameRecord findById(Long id) {
        return new GameRecord(repository.findById(id).get());
    }


}
