package Laborator3;



    public class Paragraph implements Element
    {
        protected String text;

        public Paragraph(String t)
        {
            this.text=t;
        }

        public String toString() {
            return "Laborator5.Paragraph [text=" + text + "]";
        }

        public void print()
        {
            System.out.println("Laborator5.Paragraph :" + this.text);
        }
    }

