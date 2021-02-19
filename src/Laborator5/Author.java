package Laborator5;

public class Author
{
    protected String name;

    public Author(String name)
    {
        this.name=name;
    }

    public String toString()
    {
        return "Laborator5.Author [name=" + name + "]";
    }


    public void print()

    {
        System.out.println("Laborator5.Author : " + this.name);
    }
}

