package Laborator4;


    public class test {

        public static void main(String[] args) throws Exception {
            long startTime = System.currentTimeMillis();
            ImageProxy img1 = new ImageProxy("Marius");
            ImageProxy img2 = new ImageProxy("Ion");
            ImageProxy img3 = new ImageProxy("Liviu");

            Section sectiune1 = new Section("Coperta");
            sectiune1.add(img1);
            Section sectiune2 = new Section("Sectiune");
            sectiune2.add(img2);
            sectiune2.add(img3);

            Book carte = new Book("Cartea mea");
            carte.addContent(sectiune1);
            carte.addContent(sectiune2);

            long endTime = System.currentTimeMillis();
            System.out.println("Crearea continutului a durat " + (endTime -
                    startTime) + " ms");
            startTime = System.currentTimeMillis();
            sectiune1.print();

            endTime = System.currentTimeMillis();
            System.out.println("Afisarea sectiunii 1 a durat " + (endTime -
                    startTime) + " ms");
            startTime = System.currentTimeMillis();
            sectiune1.print();
            endTime = System.currentTimeMillis();
            System.out.println("Afisarea din nou sectiunii 1 a durat " + (endTime -
                    startTime) + " ms");
        }
    }

