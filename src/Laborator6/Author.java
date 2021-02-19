package Laborator6;


public class Author
{
    protected String name;

    public Author(String name)
    {
        this.name=name;
    }

    public String toString()
    {
        return "Lab_3_Sabloane.Laborator5.Author [name=" + name + "]";
    }


    public void print()

    {
        System.out.println("Lab_3_Sabloane.Laborator5.Author : " + this.name);
    }
}


