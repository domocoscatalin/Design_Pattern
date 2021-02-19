package Laborator4;


    public class Image implements Element
    {
        protected String imageName;

        public Image(String s)
        {
            this.imageName=s;
        }

        public void print()
        {
            System.out.println("Laborator5.Image with name :" + this.imageName);
        }

    }

