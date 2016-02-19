import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Character,Integer> letters= new HashMap<>();
        letters.put('A',1);
        letters.put('B',2);
        letters.put('C',3);
        letters.put('D',4);
        letters.put('E',5);
        letters.put('F',6);
        letters.put('G',7);
        letters.put('H',8);
        letters.put('I',9);
        letters.put('J',10);
        letters.put('K',11);
        letters.put('L',12);
        letters.put('M',13);
        letters.put('N',14);
        letters.put('O',15);
        letters.put('P',16);
        letters.put('Q',17);
        letters.put('R',18);
        letters.put('S',19);
        letters.put('T',20);
        letters.put('U',21);
        letters.put('V',22);
        letters.put('W',23);
        letters.put('X',24);
        letters.put('Y',25);
        letters.put('Z',26);
        letters.put('a',0);
        letters.put('b',1);
        letters.put('c',2);
        letters.put('d',3);
        letters.put('e',4);
        letters.put('f',5);
        letters.put('g',6);
        letters.put('h',7);
        letters.put('i',8);
        letters.put('j',9);
        letters.put('k',10);
        letters.put('l',11);
        letters.put('m',12);
        letters.put('n',13);
        letters.put('o',14);
        letters.put('p',15);
        letters.put('q',16);
        letters.put('r',17);
        letters.put('s',18);
        letters.put('t',19);
        letters.put('u',20);
        letters.put('v',21);
        letters.put('w',22);
        letters.put('x',23);
        letters.put('y',24);
        letters.put('z',25);
                
        BufferedReader reader = new BufferedReader(new FileReader("code_off-1.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("code_off-1.out"));

        try {
            String line = reader.readLine();
            int numberOfWords = Integer.parseInt(line.trim());
            ArrayList<String> words = new ArrayList<>(numberOfWords);
            ArrayList<Integer> values = new ArrayList<>(numberOfWords);
            ArrayList<Boolean> palindromes = new ArrayList<>(numberOfWords);
            line = reader.readLine();
            while(line!=null){
                Integer wordValue =0;
                for(int i =0;i<line.length();i++) {
                    wordValue += letters.get(line.charAt(i));
                }
                words.add(line);
                values.add(wordValue);
                palindromes.add(instPalindrome(line.toCharArray()));
                line = reader.readLine();
            }

            for(int i =0;i<numberOfWords;i++) {
                writer.write(words.get(i));
                writer.newLine();
                writer.write(palindromes.get(i).toString());
                writer.newLine();
                for(int x = 0;x< numberOfWords;x++) {
                    if(values.get(i).equals(values.get(x)) && i != x) {
                        writer.write(words.get(x));
                            writer.newLine();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.close();
    }
    public static boolean instPalindrome(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
