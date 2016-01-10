package CE_RemoveCharacters;

import sun.util.resources.ParallelListResourceBundle;
import sun.util.xml.PlatformXmlPropertiesProvider;

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
       //File file = new File("src/CE_RemoveCharacters/input.txt");
       File file = new File(args[0]);
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

        ArrayList<String> list = new ArrayList<String>();

        scanner.useDelimiter(",");

        while (scanner.hasNext()) {

            list.add(scanner.next());

        }

        SeparateToChars(list.get(1));
        RemoveCharacters(list.get(0));

    }

    protected static ArrayList<Character> SeparateToChars(String s) {

        // remove starting space if any
        if(s.contains(" "))s = s.substring(1);
        // purge contents of ListOfCharsToRemove
        if (ListOfCharsToRemove.size() != 0)ListOfCharsToRemove.clear();

        try {
            for(char i : s.toCharArray()){
                //only add if list doesn't contain the char yet
                if(!ListOfCharsToRemoveContain(i))ListOfCharsToRemove.add(i);
            }

            return ListOfCharsToRemove;
        }
        catch (IndexOutOfBoundsException e) {return null;}

    }

    protected static boolean ListOfCharsToRemoveContain (char c){

        for(char i : ListOfCharsToRemove){
            if(c == i) return true;

        }
        return false;
    }

    protected static String RemoveCharacters (String l) {
        try {

            CharacterIterator ci = new StringCharacterIterator(l);
            StringBuilder sb = new StringBuilder(l);

            //get the places where chars to delete are located
           for(char i: ListOfCharsToRemove){

               for (char j = ci.first();j != CharacterIterator.DONE; j = ci.next()){
                   if (Character.toString(j).matches(Character.toString(i)))
                   {
                      //recursively delete all chars
                       sb.deleteCharAt(sb.toString().indexOf(j));

                   }
               }

           }

        System.out.println(sb);
            return sb.toString();

        } catch (IndexOutOfBoundsException e) {

            System.out.println("bad stuff");
            return null;
        }
    }
}