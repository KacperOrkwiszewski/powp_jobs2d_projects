package edu.kis.powp.jobs2d.canvas;

import java.awt.Shape;
import java.awt.geom.Path2D;

public enum TriangleFormat implements ICanvas {
    SMALL(200, 200),
    LARGE(400, 400);

    private final int base;
    private final int height;

    TriangleFormat(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public boolean contains(int x, int y) {
        return true;
    }

    @Override
    public String getName() {
        return "Triangle Format Canvas (" + name() + " - " + base + "x" + height + ")";
    }
}