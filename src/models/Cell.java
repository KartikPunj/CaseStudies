package models;

public class Cell {
    private int row;
    private int col;
    private CellState isEmpty;
    private Player player;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellState getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(CellState isEmpty) {
        this.isEmpty = isEmpty;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
