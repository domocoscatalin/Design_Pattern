package Laborator5;

import java.util.ArrayList;

public class Book implements Element
{
    protected String title;

    protected ArrayList<Element> content= new ArrayList();
    protected ArrayList<Author> autori= new ArrayList();


    public Book (String title)
    {
        this.title=title;
    }


    public void addContent(Element e)
    {
        content.add(e);
    }

    public void addAuthor(Author x)
    {
        autori.add(x);
    }


    public String toString()
    {
        return "Laborator5.Book{" +
                "title='" + title + '\'' +
                ", content=" + content +
                '}';
    }
    public void print()
    {
        System.out.println("Titlu:" + title);
        for (Author s: autori)
        {
            s.print();
        }

        for (Element e: content)
        {
            e.print();
        }
    }
    /*
    public int createChapter (String n)
    {
        Laborator5.Chapter x = new Laborator5.Chapter(n);
        ch.add(x);
        return ch.indexOf(x);
    }

    public Laborator5.Chapter getChapter(int x)
    {
        return ch.get(x);
    }

    public void print()
    {
        System.out.println("Laborator5.Book title : " + this.title);

        for(Laborator5.Author s: autori)
        {
            s.print();
        }

        for(Laborator5.Chapter s: ch)
        {
            s.print();
        }
    }

 */
}