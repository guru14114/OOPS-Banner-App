/**
 * OOPS Banner App
 * UC4 - Banner using Array and Loop
 * @author Guru
 * @version 1.3
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", " *****   ", " *****  ", "******   ", " ****** "),
                String.join("", "*     * ", "*     * ", " *     * ", "  *        "),
                String.join("", "*     * ", "*     * ", " *     * ", "* *      "),
                String.join("", "*     * ", " *****   ", "******    ", " ***** "),
                String.join("", "*     * ", "*       ", "*          ", "      *     "),
                String.join("", "*     * ", "*       ", "*          ", "      *     "),
                String.join("", " *****  ", "*       ", "*          ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}