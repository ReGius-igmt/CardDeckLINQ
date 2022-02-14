package ru.regiuss;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var cards = suits().stream()
                .flatMap(
                        s -> ranks().stream()
                                .map(s1 -> new Card(s, s1))
                ).toList();
        System.out.println(cards);

        var top = cards.stream().limit(26).toList();
        var bottom = cards.stream().skip(26).toList();

        var shuffle = Extensions.shuffle(top, bottom);

        System.out.println(shuffle);


    }

    static List<String> suits(){
        return List.of(
                "clubs",
                "diamonds",
                "hearts",
                "spades"
        );
    }

    static List<String> ranks(){
        return List.of(
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "jack",
                "queen",
                "king",
                "ace"
        );
    }
}
