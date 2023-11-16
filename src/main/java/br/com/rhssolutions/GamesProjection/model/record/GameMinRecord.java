package br.com.rhssolutions.GamesProjection.model.record;

import br.com.rhssolutions.GamesProjection.model.entities.Game;

public record GameMinRecord(Long id,
                            String title, Integer year, String imgUrl, String shortDescription) {

   public GameMinRecord(Game game) {
       this(game.getId(),
               game.getTitle(),
               game.getYear(),
               game.getImgUrl(),
               game.getShortDescription());
   }

}
