package algorithm.HackerRank;

import java.util.*;

public class WordLadderIISolution {
    public static void main(String[] args) {
        String start = "hit";
        String end = "cog";
        List<String> dict = new ArrayList<>(
                Arrays.asList("hot", "dot", "dog", "lot", "log"));
        List<List<String>> result = findLadders(start, end, dict);
        result.forEach(item -> {
            System.out.print("\nResult:");
            item.forEach(i -> System.out.print(i + ","));
        });
    }

    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();

        wordList.add(endWord);

        LinkedList<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(beginWord, 1, null));

        HashSet<String> visited = new HashSet<>();
        HashSet<String> unvisited = new HashSet<>();
        unvisited.addAll(wordList);

        int minSteps = 0, currentSteps = 0, preSteps = 0;
        while (!queue.isEmpty()) {
            WordNode wordNode = queue.remove();
            currentSteps = wordNode.numberSteps;
            String word = wordNode.word;

            if (word.equals(endWord)) {
                if (minSteps == 0) {
                    minSteps = currentSteps;
                }
                if (minSteps == currentSteps && minSteps != 0) {
                    List<String> t = new ArrayList<>();
                    t.add(word);
                    while (wordNode.pre != null) {
                        wordNode = wordNode.pre;
                        t.add(wordNode.word);
                    }
                    Collections.reverse(t);
                    result.add(t);
                    continue;
                }
            }

            if (preSteps < currentSteps) {
                unvisited.removeAll(visited);
            }
            preSteps = currentSteps;

            char[] array = word.toCharArray();
            for (int i = 0; i < array.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char temp = array[i];
                    if (c != array[i]) {
                        array[i] = c;
                    }
                    String newWord = new String(array);
                    if (unvisited.contains(newWord)) {
                        queue.add(new WordNode(newWord, currentSteps + 1, wordNode));
                        visited.add(newWord);
                    }
                    array[i] = temp;
                }
            }
        }

        return result;

    }

    static class WordNode {
        String word;
        int numberSteps;
        WordNode pre;

        public WordNode(String word, int numberSteps, WordNode pre) {
            this.word = word;
            this.numberSteps = numberSteps;
            this.pre = pre;
        }
    }
}