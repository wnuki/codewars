package com.java.udemy.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League <T extends Team> {
    private String name;
    private List<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            System.out.println("Team " + team.getName() + " has been already added to the league");
            return false;
        }
        league.add(team);
        System.out.println("Team " + team.getName() + " added");
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
