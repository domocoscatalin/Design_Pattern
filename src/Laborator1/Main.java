package Laborator1;

import java.util.Collection;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Collection <Author> autori = new Vector<>();
        autori.add(new Author());
        Carte c= new Carte("Titlu",new Cuprins(),autori);

    }
}