package ru.regiuss;

import java.util.ArrayList;
import java.util.List;

public class Extensions {
    public static <T> List<T> shuffle(Iterable<T> first, Iterable<T> second){
        var firstIter = first.iterator();
        var secondIter = second.iterator();
        List<T> items = new ArrayList<>();
        while (firstIter.hasNext() && secondIter.hasNext()){
            items.add(firstIter.next());
            items.add(secondIter.next());
        }
        return items;
    }
}
