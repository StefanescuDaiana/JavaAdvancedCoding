package ro.sda.advanced._6_generic;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {//<T> poate sa fie doar copii lui Team ori Team
    private String name;
    private final ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            return false;
        } else {
            league.add(team);
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T team : league) {
            System.out.println(team.getName() + ": " + team.raking());
        }
    }
}
