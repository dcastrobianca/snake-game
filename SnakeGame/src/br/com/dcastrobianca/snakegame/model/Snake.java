package br.com.dcastrobianca.snakegame.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Snake {
    private LinkedList<Cell> nodes = new LinkedList<>();


    public Snake(int size) {
        if(size<2){
            throw new RuntimeException("minimal size of the snake is 2");
        }
        for (int i = 0; i < size; i++) {
            nodes.add(new Cell(0, i, CellType.snake));
        }
    }

    public List<Cell> getNodes() {
        return Collections.unmodifiableList(nodes);
    }

    public void setNextMove(SnakeMoves move){
        if(move == SnakeMoves.A){
            nodes.addFirst(new Cell(nodes.getFirst().getX()-1, nodes.getFirst().getY(), CellType.snake));
        }else if(move == SnakeMoves.S){
            nodes.addFirst(new Cell(nodes.getFirst().getX(), nodes.getFirst().getY()+1, CellType.snake));
        }else if(move == SnakeMoves.D){
            nodes.addFirst(new Cell(nodes.getFirst().getX()+1, nodes.getFirst().getY(), CellType.snake));
        }else if(move == SnakeMoves.W){
            nodes.addFirst(new Cell(nodes.getFirst().getX(), nodes.getFirst().getY()-1, CellType.snake));
        }else{
            throw new RuntimeException("move doesn't exist");
        }
        nodes.removeLast();
    }
} 
