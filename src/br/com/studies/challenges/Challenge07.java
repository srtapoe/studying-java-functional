package br.com.studies.challenges;

import java.util.List;


/* --------------------------------
    Challenge 07
     Ordenar lista de strings
Crie uma lista de strings e utilize Streams para ordená-la em ordem alfabética.
*/
public class Challenge07 {
    public static void main(String[] args) {
        List<String> characteres = List.of("Ted", "Barney", "Robin", "Lily", "Marshall", "Tracy", "Stella", "Victoria");

        sortListAlphabetically(characteres);
    }

    private static void sortListAlphabetically(List<String> names){
       String sorted = 
                        names
                            .stream()
                            .sorted()
                            .reduce("", (a, b) -> a + b + " ");

        System.out.println(sorted);
    }
}