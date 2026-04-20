package edu.kis.powp.jobs2d.canvas;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public enum PaperFormat implements ICanvas {
    A4(210, 297),
    B3(353, 500);

    private final int width;
    private final int height;

    PaperFormat(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean contains(int x, int y) {
        return true;
    }

    @Override
    public String getName() {
        return "Paper Format Canvas (" + name() + " - " + width + "x" + height + ")";
    }
}
