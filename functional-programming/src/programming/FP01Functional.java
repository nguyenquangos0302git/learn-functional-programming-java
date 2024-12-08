package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        printAllNumbersInFunctional(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    private static void printAllNumbersInFunctional(List<Integer> numbers) {
        // what to do?
        numbers
                .stream()
                .filter(FP01Functional::isEven)
                .forEach(FP01Functional::print);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void print(Integer number) {
        System.out.println(number);
    }

}
