package br.com.dcastrobianca.snakegame.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.dcastrobianca.snakegame.model.Cell;
import br.com.dcastrobianca.snakegame.model.Snake;
import br.com.dcastrobianca.snakegame.model.SnakeMoves;

public class TestSnakeMove {
    @Test
    public void moveAwithSucessTest(){
        Snake s = new Snake(2);
        List<Cell> oldNodes = new ArrayList<>(s.getNodes());
        s.setNextMove(SnakeMoves.A);
        List<Cell> newNodes = s.getNodes();
        Assertions.assertTrue(()->newNodes.get(0).getX()<oldNodes.get(0).getX() && newNodes.size()==oldNodes.size());
    }

    @Test
    public void moveSwithSucessTest(){
        Snake s = new Snake(2);
        List<Cell> oldNodes = new ArrayList<>(s.getNodes());
        s.setNextMove(SnakeMoves.S);
        List<Cell> newNodes = s.getNodes();
        Assertions.assertTrue(()->newNodes.get(0).getY()>oldNodes.get(0).getY() && newNodes.size()==oldNodes.size());
    }

    @Test
    public void moveDwithSucessTest(){
        Snake s = new Snake(2);
        List<Cell> oldNodes = new ArrayList<>(s.getNodes());
        s.setNextMove(SnakeMoves.D);
        List<Cell> newNodes = s.getNodes();
        Assertions.assertTrue(()->newNodes.get(0).getX()>oldNodes.get(0).getX() && newNodes.size()==oldNodes.size());
    }
    
    @Test
    public void moveWwithWucessTest(){
        Snake s = new Snake(2);
        List<Cell> oldNodes = new ArrayList<>(s.getNodes());
        s.setNextMove(SnakeMoves.W);
        List<Cell> newNodes = s.getNodes();
        Assertions.assertTrue(()->newNodes.get(0).getY()<oldNodes.get(0).getX() && newNodes.size()==oldNodes.size());
    }
}
