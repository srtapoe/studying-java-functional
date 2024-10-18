package br.com.studies.challenges;

import java.util.List;

/* --------------------------------
Challenge 06
  Encontrar o primeiro número maior que 10
    Dada uma lista de inteiros, use Streams para encontrar o primeiro número que seja maior que 10.
*/

public class Challenge06 {
    public static void main(String[] args){
        List<Integer> numbers = List.of(5, 8, 9, 25, 39);

        findFirstNumberGreaterThan10(numbers);
    }

    private static void findFirstNumberGreaterThan10(List<Integer> numbers){
        int result = numbers
                .stream()
                .filter(number -> number > 10)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Nenhum número maior que 10 foi encontrado"));  

        System.out.println("First number bigger than 10: " + result);
    }
}
