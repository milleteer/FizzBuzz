package CE_RemoveCharacters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       File file = new File("src/CE_RemoveCharacters/input.txt");
       //File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null){
            line = line.trim();

            try {
                processLine(line);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> getListToRemoveCharacters() {
        return ListToRemoveCharactersFrom;
    }

    public static void setListToRemoveCharacters(List<String> listToRemoveCharacters) {
        ListToRemoveCharactersFrom = listToRemoveCharacters;
    }

    private static List<String> ListToRemoveCharactersFrom = new ArrayList<String>();
    private static ArrayList<Character> ListOfCharsToRemove = new ArrayList<Character>();

    private static void processLine(String s) throws Exception {

        Scanner scanner = new Scanner(s);

        List<String> list = new ArrayList<String>();

        scanner.useDelimiter(",");

        while (scanner.hasNext()) {

            list.add(scanner.next());

        }

        SeparateToChars(list.get(list.size() - 1));
        // purge the last segment that contains the chars to remove
        list.remove(list.get(list.size() - 1));
        RemoveCharacters(list);

    }

    protected static List<Character> SeparateToChars(String s) {

        if(s.contains(" "))s = s.substring(1);

        try {
            for(char i : s.toCharArray()){
                ListOfCharsToRemove.add(i);
            }

            return ListOfCharsToRemove;
        }
        catch (IndexOutOfBoundsException e) {return null;}

    }

    protected static List<String> RemoveCharacters (List<String> l) {
        try {
            for (char c : ListOfCharsToRemove) {
                String fullString;
                fullString = l.get(0);

                CharacterIterator it = new StringCharacterIterator(fullString);

                for (char i = it.first();i != CharacterIterator.DONE; i = it.next()) {
                            l.get(0).replace(Character.toString(c),"");

                        //put in a new String for the String without removed chars
                        }
                    }


            System.out.println(l);
            return l;

        } catch (IndexOutOfBoundsException e) {

            System.out.println("bad stuff");
            return null;
        }
    }
}