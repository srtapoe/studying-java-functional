package br.com.studies.challenges;

import java.util.List;

/* --------------------------------
    Challenge 10
     Multiplicar todos os números por 2
        Crie uma lista de inteiros e utilize Streams para multiplicar todos os números por 2, gerando uma nova lista com os resultados.
*/
public class Challenge10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        doubleNumbers(numbers);
    }

    private static void doubleNumbers(List<Integer> numbers){
        numbers
            .stream()
            .map(number -> Math.pow(number, 2))
            .forEach(System.out::println);
    }
}
