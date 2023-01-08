package br.com.dcastrobianca.snakegame.model;

public enum CellType {
    snake("o"),
    empty(".");

    private String visual;

    CellType(String s){
        this.visual = s;
    }

    public String getVisual(){
        return this.visual;
    }
    
}
