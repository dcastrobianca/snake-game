package br.com.dcastrobianca.snakegame;

import br.com.dcastrobianca.snakegame.model.Display;
import br.com.dcastrobianca.snakegame.model.Game;
import br.com.dcastrobianca.snakegame.model.Snake;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        
        Display d = new Display(10, 10);
        Snake s = new Snake(3);
        d.updateSnakePosition(s);
        d.printDisplay();

        System.out.println();
        while(game.gameRunning){
            s.setNextMove(game.readKeyboar());
            d.updateSnakePosition(s);
            d.printDisplay();
        }

    }
}
