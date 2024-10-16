package br.com.studies.challenges;

import java.util.List;


/**
 * 
 * Challenge 04
 * Filtrar nomes com mais de 5 caracteres
    Dada uma lista de nomes, utilize um Stream para filtrar apenas os nomes que possuem mais de 5 caracteres.
 */

public class Challenge04 {
    public static void main(String[] args) {
        List<String> bandsRock = List.of("The Smith", "U2", "Duran Duran", "INXS", 
        "The Police", "The Cure", "The Beatles", "The Rolling Stones", "The Who", "The Clash", 
        "The Ramones", "The Jam", "Ira!", "The Slits", "Capital Inicial");

        filterBandNames(bandsRock);
    }

    private static void filterBandNames(List<String> bandsRock) {
        bandsRock.stream()
            .filter(band -> band.length() > 5)
            .forEach(System.out::println);
    }
}
