package ua.andrii;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    static DateSorter dateSorter = new DateSorter();
    public static void main( String[] args ) {
        List<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2005, 7, 1));
        unsortedDates.add(LocalDate.of(2005, 1,2));
        unsortedDates.add(LocalDate.of(2005, 1, 1));
        unsortedDates.add(LocalDate.of(2005, 5, 3));
        System.out.println(dateSorter.sortDates(unsortedDates));

    }
}
