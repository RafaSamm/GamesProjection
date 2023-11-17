package br.com.rhssolutions.GamesProjection.model.record;

import br.com.rhssolutions.GamesProjection.model.entities.Game;
public record GameRecord(Long id, String title,

                         Integer year,
                         String genre,
                         String platforms,
                         Double score,
                         String imgUrl,
                         String shortDescription,
                         String longDescription) {

     public GameRecord(Game game){
         this(game.getId(),
                 game.getTitle(),
                 game.getYear(),
                 game.getGenre(),
                 game.getPlatforms(),
                 game.getScore(),
                 game.getImgUrl(),
                 game.getShortDescription(),
                 game.getLongDescription());
     }

}
