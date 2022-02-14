package ru.regiuss;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                suits().stream()
                        .flatMap(
                                s -> ranks().stream()
                                        .map(s1 -> new Card(s, s1))
                        ).toList()
        );
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
