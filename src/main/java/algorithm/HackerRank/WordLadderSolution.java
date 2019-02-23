package algorithm.HackerRank;

import java.util.*;

/***
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest
 * transformation sequence from beginWord to endWord, such that:
 *
 * Only one letter can be changed at a time.
 * Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
 */
public class WordLadderSolution {
    public static void main(String[] args) {
        String start = "hit";
        String end = "cog";
        Set<String> dict = new TreeSet<>(
                Arrays.asList("hot", "dot", "dog", "lot", "log"));
        System.out.println("Shortest transformation is " + ladderLength(start, end, dict));
    }

    /***
     * Use Breath First Search to find the shortest transformation sequence from beginWord to endWord.
     * @param beginWord
     * @param endWord
     * @param wordList
     * @return
     */
    public static int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        wordList.add(endWord);
        LinkedList<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(beginWord, 1));
        while (!queue.isEmpty()) {
            WordNode wordNode = queue.remove();
            String word = wordNode.word;
            if (word.equals(endWord)) {
                return wordNode.stepNumbers;
            }
            char[] array = word.toCharArray();
            for (int i = 0; i < array.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char temp = array[i];
                    if (array[i] != c) {
                        array[i] = c;
                    }
                    String newWord = new String(array);
                    if (wordList.contains(newWord)) {
                        wordList.remove(newWord);
                        queue.add(new WordNode(newWord, wordNode.stepNumbers + 1));
                    }
                    array[i] = temp;
                }
            }
        }

        return 0;
    }

    static class WordNode {
        String word;
        int stepNumbers;

        public WordNode(String word, int stepNumbers) {
            this.word = word;
            this.stepNumbers = stepNumbers;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public int getStepNumbers() {
            return stepNumbers;
        }

        public void setStepNumbers(int stepNumbers) {
            this.stepNumbers = stepNumbers;
        }
    }
}
