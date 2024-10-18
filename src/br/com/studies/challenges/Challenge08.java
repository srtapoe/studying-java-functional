package br.com.studies.challenges;

import java.util.List;

/* --------------------------------
    Challenge 08
    Contar strings que começam com a letra "A"
     Dada uma lista de strings, utilize Streams para contar quantas delas começam com a letra "A".
*/

public class Challenge08 {
    public static void main(String[] args) {
        List<String> phrases = List.of("Ted", "Barney", "Robin", "Lily", "Marshall", "Tracy", "Stella", "Victoria");

        countLetterA(phrases);
    }

    private static void countLetterA(List<String> words){
           long countA = words
                .stream()
                .filter(word -> word.toLowerCase().contains("a"))
                .count();

        System.out.println(countA);
    }
}
