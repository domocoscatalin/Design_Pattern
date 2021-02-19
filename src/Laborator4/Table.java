package Laborator4;


    public class Table implements Element
    {
        protected String title;

        public Table(String t)
        {
            this.title=t;
        }

        public String toString() {
            return "Laborator5.Table [title=" + title + "]";
        }


        public void print()
        {
            System.out.println("Laborator5.Table title :" + this.title);
        }

    }

