package br.com.studies.challenges;

import java.util.List;

/* --------------------------------
 * ### 1. Filtrando números pares
Crie uma lista de inteiros e utilize Streams para filtrar apenas os números pares dessa lista.
    * --------------------------------
*/

public class Challenge01 {
    public static void main(String[] args) {
        List<Integer> numbersNoFilter = List.of(1, 5, 8,12, 15, 20, 25, 55, 60, 70, 80, 90, 100); 

        returnListEvenNumbers(numbersNoFilter);
    }
    
    private static void returnListEvenNumbers(List<Integer> numbers) {
        numbers
            .stream()
                .filter(number -> number % 2 == 0)
                 .forEach(System.out::println);
    }
}
