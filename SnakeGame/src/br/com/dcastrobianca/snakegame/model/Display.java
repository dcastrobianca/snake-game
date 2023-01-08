package br.com.dcastrobianca.snakegame.model;

import java.util.ArrayList;
import java.util.List;

public class Display {
    List<List<Cell>> lines = new ArrayList<>();
    

    public Display(int widthX, int heightY) {
        
        for (int j = 0; j < heightY; j++) {
            List<Cell> line = new ArrayList<>();
            for (int i = 0; i < widthX; i++) {
                line.add(new Cell(i, j, CellType.empty));
            }
            lines.add(line);
            
        }
        
    }

    public boolean isInsideBounderies(Cell c){
        for (List<Cell> list : lines) {
            for (Cell cell : list) {
                if(cell.equals(c))
                    return true;
            }
        }

        return false;
    }
        
    public void printDisplay(){
        for (List<Cell> line : lines) {
            line.stream()
                .map(c -> c.toString())
                .forEach(c->System.out.print(c+" "));
            System.out.println();
        }
        System.out.println();
    }

    public void updateSnakePosition(Snake s){

        List<Cell>snakeNodes = s.getNodes();

        for (List<Cell> list : lines) {
            for (Cell cell : list) {
                for (Cell snakeCell : snakeNodes) {
                    if(snakeCell.equals(cell)){
                        cell.setType(snakeCell.getType());
                        break;
                    }else{
                        cell.setType(CellType.empty);
                    }   
                }
            }
        }
    }
}
