package Day1;

import java.util.List;
import reading.Utils;

public class Day1Code {
    public static void main(String args[]){
        Utils utils = new Utils();
        List<Integer> input = utils.getInputPart1();
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
}
