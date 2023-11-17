package br.com.rhssolutions.GamesProjection.controller;

import br.com.rhssolutions.GamesProjection.model.record.GameListRecord;
import br.com.rhssolutions.GamesProjection.model.service.GameListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    final GameListService gameListService;
    public GameListController(GameListService gameListService) {
        this.gameListService = gameListService;
    }

    @GetMapping()
    public List<GameListRecord> findAllGames() {
        return gameListService.findAll();
    }
}
