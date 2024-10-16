package br.com.studies.challenges;

import java.util.List;

/**
 * 
 * Challenge 05
 * 5. Listar quadrados dos números
    Crie uma lista de inteiros e utilize um Stream para gerar uma nova lista com os quadrados dos números originais.
 */


public class Challenge05 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        listIntegersSquared(numbers);
    }

    private static void listIntegersSquared(List<Integer> numbers){
        numbers.stream()
            .map(number -> Math.pow(number, 2))
            .forEach(System.out::println);
    }
}
