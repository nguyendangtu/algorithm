package algorithm.HackerRank.tests;

import java.util.Comparator;

public class Test implements Comparator<Test.Player> {
    public static void main(String args[]) {
        System.out.println("hello");

    }

    @Override
    public int compare(Player a, Player b) {
        if (a.score > b.score) {
            return 1;
        } else if (a.score == b.score) {
            return a.name.compareTo(b.name);
        } else {
            return -1;
        }
    }


    class Player {
        private String name;
        private Integer score;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }
    }
}
