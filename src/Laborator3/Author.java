package Laborator3;

public class Author {
    protected String name;

    public Author(String name)
    {
        this.name=name;
    }

    public String toString()
    {
        return "Laborator3.Laborator5.Author [name=" + name + "]";
    }


    public void print()

    {
        System.out.println("Laborator3.Laborator5.Author : " + this.name);
    }
}
