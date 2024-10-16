package br.com.studies.challenges;

import java.util.List;

/**
 * Challenge 02
 * 
 *  ### 2. Convertendo para maiúsculas
    Dada uma lista de strings, use uma expressão Lambda para transformar todas as strings em maiúsculas.
 */

public class Challenge02 {
    public static void main(String[] args) {
        List<String> words = List.of("Ted", "Mosby", "Robin", "Scherbatsky", "Barney", "Stinson", "Lily", "Aldrin", "Marshall", "Eriksen");
    

        showWordsUpperCase(words);
    }

    private static void showWordsUpperCase(List<String> names){

        names.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
