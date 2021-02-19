package Laborator7;

public class StatisticsCommand implements Command{

    public void execute(){
        Book b1=DocumentManager.getInstance().getBook();
        BookStatistics stats = new BookStatistics();
        b1.accept(stats);
        stats.printStatistics();
    }
}
