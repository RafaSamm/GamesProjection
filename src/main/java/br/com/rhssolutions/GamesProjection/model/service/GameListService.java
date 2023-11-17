package br.com.rhssolutions.GamesProjection.model.service;

import br.com.rhssolutions.GamesProjection.model.entities.Game;
import br.com.rhssolutions.GamesProjection.model.entities.GameList;
import br.com.rhssolutions.GamesProjection.model.record.GameListRecord;
import br.com.rhssolutions.GamesProjection.model.record.GameMinRecord;
import br.com.rhssolutions.GamesProjection.model.repository.GameListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    final GameListRepository repository;

    public GameListService(GameListRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<GameListRecord> findAll() {
        List<GameList> games = repository.findAll();
        return games.stream().map(GameListRecord::new).toList();
    }


}
