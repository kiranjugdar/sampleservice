package com.jugdar.sampleservice;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingInsertingTest {

    @Test
    public void watch_list_in_sorted() {
        List<Watchlist> watchlists = getWatchListDB();
        List<Watchlist> sortedWatchlists = watchlists.stream().sorted((o1, o2) -> o1.getDisplayOrder() - o2.getDisplayOrder()).collect(Collectors.toList());

        //watchlists.stream().forEach(System.out::println);

        Watchlist watchlist = new Watchlist("movie3-new", 3);


        List<Watchlist> firstPart = sortedWatchlists.stream()
                .filter(o -> o.getDisplayOrder() < watchlist.getDisplayOrder())
                .collect(Collectors.toList());

        firstPart.add(watchlist);

        List<Watchlist> secondPart = sortedWatchlists.stream()
                .filter(o -> o.getDisplayOrder() >= watchlist.getDisplayOrder())
                .collect(Collectors.toList());

        secondPart.forEach(o -> o.setDisplayOrder(o.getDisplayOrder() + 1));

        firstPart.addAll(secondPart);

        firstPart.stream().forEach(System.out::println);

//        System.out.println("second part");
//
//
//
//        secondPart.stream().forEach(System.out::println);


        //Insert movie2.1



    }


    private List<Watchlist> getWatchListDB() {

        List<Watchlist> watchlists = new ArrayList<>();
        Watchlist watchlist = new Watchlist("movie1", 1);
        watchlists.add(watchlist);
         watchlist = new Watchlist("movie3-old", 3);
        watchlists.add(watchlist);
         watchlist = new Watchlist("movie2", 2);
        watchlists.add(watchlist);

        return watchlists;
    }

}
