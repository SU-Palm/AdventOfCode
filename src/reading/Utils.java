package reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public static List<Integer> getInputPart1() {
        List<Integer> input = new ArrayList<Integer>();
        try {
            File myObj = new File("C:\\Users\\jmbal\\IdeaProjects\\AdventOfCode\\src\\Day1\\input.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                input.add(Integer.parseInt(data));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return input;
    }

    public static List<String> getInputPart2() {
        List<String> input = new ArrayList<String>();
        try {
            File myObj = new File("C:\\Users\\jmbal\\IdeaProjects\\AdventOfCode\\src\\Day2\\input.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                input.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return input;
    }

    public static List<String> getInputPart3() {
        List<String> input = new ArrayList<String>();
        try {
            File myObj = new File("C:\\Users\\jmbal\\IdeaProjects\\AdventOfCode\\src\\Day3\\input.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                input.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return input;
    }
}
