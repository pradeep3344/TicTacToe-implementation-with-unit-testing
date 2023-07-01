package com.tictactoe.code;

class Cell {
    private MarkType mark;

    public Cell() {
        this.mark = MarkType.Empty;
    }

    public MarkType getMark() {
        return mark;
    }

    public void setMark(MarkType mark) {
        this.mark = mark;
    }

    public boolean isEmpty() {
        return mark == MarkType.Empty;
    }
}