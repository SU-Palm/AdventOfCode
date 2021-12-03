package Day2;

import reading.Utils;

import java.util.List;

public class Day2Code {
    public static void main(String args[]){
        Utils utils = new Utils();
        List<String> input = utils.getInputPart2();
        part1(input);
        part2(input);
    }

    private static void part1(List<String> input) {
        Integer finalHorizontal = 0, finalDepth = 0;
        for(String line: input) {
            String[] parts = line.split(" ");
            switch(parts[0]) {
                case "forward":     finalHorizontal += Integer.parseInt(parts[1]);
                                    break;
                case "backward":    finalHorizontal -= Integer.parseInt(parts[1]);
                                    break;
                case "down":        finalDepth += Integer.parseInt(parts[1]);
                                    break;
                case "up":          finalDepth -= Integer.parseInt(parts[1]);
                                    break;
            }
        }
        System.out.println(finalHorizontal * finalDepth);
    }

    private static void part2(List<String> input) {
        Integer finalHorizontal = 0, finalDepth = 0, aim = 0;
        for(String line: input) {
            String[] parts = line.split(" ");
            Integer num = Integer.parseInt(parts[1]);
            switch(parts[0]) {
                case "forward":     finalHorizontal += num;
                                    finalDepth += (aim * num);
                                    break;
                case "backward":    finalHorizontal -= num;
                                    break;
                case "down":        aim += num;
                                    break;
                case "up":          aim -= num;
                                    break;
            }
        }
        System.out.println(finalHorizontal * finalDepth);
    }

}
