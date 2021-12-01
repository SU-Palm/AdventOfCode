package Day1;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files

public class Day1Code {
    public static void main(String args[]){
        List<Integer> input = getInput();
        part1(input);
        part2(input);
    }

    private static void part1(List<Integer> input) {
        Integer prev = input.get(0), counter = 0;
        for(Integer depth: input) {
            if(depth > prev) {
                counter++;
            }
            prev = depth;
        }
        System.out.println(counter);
    }

    private static void part2(List<Integer> input) {
        Integer prev = input.get(0) + input.get(1) + input.get(2), counter = 0;

        for(int i = 1; i < input.size() - 2; i++) {
            Integer threeSumDepth = input.get(i) + input.get(i + 1) + input.get(i + 2);
            if(threeSumDepth > prev) {
                counter++;
            }
            prev = threeSumDepth;
        }
        System.out.println(counter);
    }

    private static List<Integer> getInput() {
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
}
