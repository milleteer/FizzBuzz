package CE_ReverseGroups;

import java.io.*;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by gkoles on 2016.01.10..
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/CE_ReverseGroups/input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        try {
            while ((line = buffer.readLine()) != null) {
                line = line.trim();

                try {
                    processLine(line);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        catch(IOException e) {
         e.printStackTrace();
        }
    }

    //used variables
    private static int k = 0;
    private static List<String> listToGroup = new ArrayList<String>();
    private static ArrayList<Integer> GroupsToReverse = new ArrayList<Integer>();

    // setter-getters
    public static int getK() {
        return k;
    }

    public static void setK(int k) {
        Main.k = k;
    }

    public  static ArrayList<Integer> getGroupsToReverse() {
        return GroupsToReverse;
    }

    public static void setGroupsToReverse(ArrayList<Integer> groupsToReverse) {
        GroupsToReverse = groupsToReverse;
    }

    // actual functions
    private static void processLine (String line){

        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(";");

        while (scanner.hasNext()) {
            listToGroup.add(scanner.next());
        }

        // separate into numbers to revert and 'k'
        separateIntoGroups(listToGroup);
        // form 'k'-s from the numbers
        // formGroups();

    }

    private static void separateIntoGroups(List<String> ListToGroup) throws NumberFormatException{

        //the second item in the array is 'k'
        setK(Integer.valueOf(ListToGroup.get(1)));

        // the first STring contains the integers to group by 'k'
        Scanner scanner = new Scanner(ListToGroup.get(0));
        scanner.useDelimiter(",");
        ArrayList<Integer> tmpStorage = new ArrayList<Integer>();
        while (scanner.hasNext()){
            tmpStorage.add(Integer.valueOf(scanner.next()));
        }

        //tmpStorage contains the now integers
        // these have to be grouped by 'k'
        int Divider = getK();
        int cnt = 0;
        ArrayList<ArrayList<Integer>> DoubleDecker = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> pairs = new ArrayList<Integer>();

        //************* doesnt work yet

        // until the tmpStorage is empty, we group the integers
        for (int i : tmpStorage) {
            if (cnt < Divider) {
                pairs.add(i);
                cnt++;
            }
            else{
                // reset counter
                cnt = 0;
                // increase DoubleDecker slot
                DoubleDecker.add(pairs);
                // reset pairs
                pairs.clear();
        }
            }

        System.out.println(DoubleDecker);

    }
    }


