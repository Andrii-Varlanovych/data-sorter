package ua.andrii;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 *
 *
 * Implement in single class.
 */
class DateSorter {
    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2005-07-01, 2005-01-02, 2005-01-01, 2005-05-03)
     * would sort to
     * (2005-01-01, 2005-01-02, 2005-07-01, 2005-05-03)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        // your solution here
        List<LocalDate> ascDates = new ArrayList<>();
        List<LocalDate> descDates = new ArrayList<>();
        List<Integer> monthsWithoutR = Arrays.asList(5, 6, 7, 8);

        for (LocalDate localDate : unsortedDates) {
            int monthNum = localDate.getMonth().getValue();
            if (monthsWithoutR.contains(monthNum)) {
                descDates.add(localDate);
                continue;
            }
            ascDates.add(localDate);
        }
        ascDates.sort(Comparator.naturalOrder());
        descDates.sort(Comparator.reverseOrder());

        List<LocalDate> sortedDates = new ArrayList<>();
        sortedDates.addAll(ascDates);
        sortedDates.addAll(descDates);

        return sortedDates;
    }
}
