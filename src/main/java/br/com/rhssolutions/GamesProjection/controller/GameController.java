package br.com.rhssolutions.GamesProjection.controller;

import br.com.rhssolutions.GamesProjection.model.record.GameListRecord;
import br.com.rhssolutions.GamesProjection.model.record.GameMinRecord;
import br.com.rhssolutions.GamesProjection.model.record.GameRecord;
import br.com.rhssolutions.GamesProjection.model.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
   @Autowired
   private GameService gameService;

   @GetMapping()
   public List<GameMinRecord> findAllGames() {
      return gameService.findAllGames();

   }
    @GetMapping(value = "/{id}")
    public GameRecord findById(@PathVariable(value = "id") Long id) {
        return gameService.findById(id);
    }





}
