package br.com.studies.challenges;

import java.util.List;

/**
 * Challenge 03
 *  Soma de números
    Usando Streams, crie uma lista de números e calcule a soma de todos os elementos.
 */


public class Challenge03 {
    public static void main(String[] args) {
        List<Integer> numbersSUm = List.of(10,20,30,40,50);
        sumNumbers(numbersSUm);
    }

    public static void sumNumbers(List<Integer> numbers) {
        Integer result = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
