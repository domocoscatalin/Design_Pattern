package Laborator6;

public class Image implements Element
{
    protected String imageName;

    public Image(String s)
    {
        this.imageName=s;
    }

    public String toString()
    {
        return "Laborator5.Image [imageName=" + imageName + "]";
    }


    public void print()
    {
        System.out.println("Laborator5.Image with name :" + this.imageName);
    }

    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
