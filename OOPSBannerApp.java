/**
 * OOPS Banner App
 * UC7 - Store Character Pattern in a Class
 * @author Guru
 * @version 1.7
 */

import java.util.*;

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create Character Pattern Objects
        List<CharacterPatternMap> characterList = new ArrayList<>();

        characterList.add(new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        characterList.add(new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        characterList.add(new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        String word = "OOPS";

        printBanner(word, characterList);
    }

    private static void printBanner(String word, List<CharacterPatternMap> list) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                for (CharacterPatternMap cp : list) {

                    if (cp.getCharacter() == ch) {
                        line.append(cp.getPattern()[i]).append("  ");
                    }
                }
            }

            System.out.println(line);
        }
    }
}