package com.joshua.model;

public class Package {
    private Content content;
    private Color color;
    private Dimension dimension;

    //constructors

    public Package(Content content, Color color, Dimension dimension) {
        this.content = content;
        this.color = color;
        this.dimension = dimension;
    }

    public Content getContent() {
        return content;
    }

    public Color getColor() {
        return color;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Package{" +
                "content=" + content +
                ", color=" + color +
                ", dimension=" + dimension +
                '}';
    }
}




