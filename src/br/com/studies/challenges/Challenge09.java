package br.com.studies.challenges;

import java.util.List;

/* --------------------------------
    Challenge 09
    Juntar nomes com vírgula
        Dada uma lista de nomes, utilize um Stream para concatenar todos os nomes em uma única string, separados por vírgula.
*/
public class Challenge09 {
    public static void main(String[] args) {
        List<String> characteres = List.of("Ted", "Barney", "Robin", "Lily", "Marshall", "Tracy", "Stella", "Victoria");

        joinNames(characteres);
    }

    private static void joinNames(List<String> names){
        String namesJoined = names
            .stream()
            .reduce((name1, name2) -> name1 + ", " + name2)
            .get();

        System.out.println(namesJoined);
    }
}
