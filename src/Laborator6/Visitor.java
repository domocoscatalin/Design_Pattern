package Laborator6;

import Laborator6.Image;
import Laborator6.ImageProxy;
import Laborator6.Paragraph;
import Laborator6.Table;

public interface Visitor {

    public abstract void visit(Image image);
    public abstract void visit(ImageProxy imageProxy);
    public abstract void visit(Paragraph paraghraph);
    public abstract void visit(Table table);
    public abstract void visit(Section section);
}