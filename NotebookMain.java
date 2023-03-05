import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NotebookMain {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook(50000, 16));
        notebooks.add(new Notebook(70000, 32));
        notebooks.add(new Notebook(30000, 16));
        notebooks.add(new Notebook(5000, 8));
        notebooks.add(new Notebook(40000, 16));
        
        /**Сортировка 1.
         * Сортировка по цене
         */
        Comparator<Notebook> PriceComparator = new PriceValueComparator();
        Collections.sort(notebooks, PriceComparator);
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
    

        /**Сортировка 2.
         * Сортировка по значению оперативной памяти
//        Collections.sort(notebooks, Comparator.comparingInt(Notebook::getRam));
//        for (Notebook notebook: notebooks) {
//            System.out.println(notebook);
//        }


        /**Сортировка 3.
         * Сортировка сначала по памяти, потом по цене
         */
//        Collections.sort(notebooks, Comparator.comparingInt(Notebook::getRam)
//                .thenComparingDouble(Notebook::getPrice));
//        for (Notebook notebook : notebooks) {
//            System.out.println(notebook);
//        }
    }
    
    
    public static class PriceValueComparator implements Comparator<Notebook> {
        
        @Override
        public int compare(Notebook o1, Notebook o2) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
    }

}
       