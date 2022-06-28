package Week3.Calculator;

import java.util.List;
import java.util.stream.Collectors;

public class Calculator2 {
    InputGenerator inputGenerator;
    public Calculator2(InputGenerator inputGenerator) {
        this.inputGenerator = inputGenerator;
    }


    public int add() {
         // return inputGenerator.generate().stream().mapToInt(stringNumber -> Integer.valueOf(stringNumber))
         //       .sum();
           return inputGenerator.generate().stream().map(Integer::parseInt).reduce(0, (a,b) -> a + b);
    }

    public int subtract() {
        List<String> list = inputGenerator.generate().stream().collect(Collectors.toList());
        int ans = Integer.parseInt(list.get(0));
        for (int counter = 1; counter < list.size(); counter++) {
            if (list.size() > 5) {
                return 0;
            }
            ans = ans - Integer.parseInt(list.get(counter));
        }
        return ans;

//        list.forEach(currentElement ->{
//            System.out.println(currentElement);
//        });

 //       return inputGenerator.generate().stream().skip(1).map(Integer::parseInt).reduce(Integer.valueOf(list.get(0)), (a,b) -> a - b);
    }
    public int multiply() {
        List<String> list = inputGenerator.generate().stream().collect(Collectors.toList());
        int ans = Integer.parseInt(list.get(0));
        for (int counter = 1; counter < list.size(); counter++) {
            ans = ans * Integer.parseInt(list.get(counter));
        }
        return ans;
     // return list.stream().map(Integer::parseInt).reduce(0, (a,b) -> a * b);
    }
    public int divide() {
        List<String> csvData = inputGenerator.generate().stream().collect(Collectors.toList());
        boolean csvHasZero = csvData.stream().filter(e -> e.equals("0")).count() > 0;
        if (csvHasZero) {
            throw new NumberFormatException();
        }
        int ans = Integer.parseInt(csvData.get(0));
        for (int counter = 1; counter < csvData.size(); counter++) {
            ans = ans / Integer.parseInt(csvData.get(counter));
        }
        return ans;
    }
    public double average() {
        double ave = inputGenerator.generate().stream().mapToInt(stringNumber -> Integer.valueOf(stringNumber))
                .average().getAsDouble();
        return ave;
    }
}
