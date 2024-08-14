import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = new String[1000];
        int wordCount = 0;
        int characters = 0;

        System.out.println("Up to 1000 words can be counted!\nPlease input text for counting:\n(Press enter twice after when finished)");

        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.isEmpty()) {
                break;
            }

            Scanner lineScanner = new Scanner(line);
            int k = 0;
            while(lineScanner.hasNext()) {
                String temp = lineScanner.next();
                int wordLength = temp.length();
                characters += wordLength;
                words[k] = temp;
                k++;
            }
            lineScanner.close();
            for(int i = 0; i < words.length; i++) {
                if(words[i] != null) {
                    wordCount++;
                }
            }
        }

        in.close();

        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + characters);
    }
}
