package Laborator3;
import java.util.concurrent.TimeUnit;



    public class Image implements Element
    {
        protected String imageName;

        Image(String name) {
            imageName = name;
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public String toString()
        {
            return "Lab_3_Sabloane.Laborator5.Image [imageName=" + imageName + "]";
        }


        public void print()
        {
            System.out.println("Lab_3_Sabloane.Laborator5.Image with name :" + this.imageName);
        }

    }

