package br.com.dcastrobianca.snakegame.model;

public class Cell {
	private int x;
    private int y;
    private CellType type;

    public Cell(int x, int y, CellType type) {
        this.x = x;
        this.y = y;
        this.type = type;
	}

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public CellType getType() {
        return this.type;
    }

    public void setType(CellType type) {
        this.type = type;
    }


}
