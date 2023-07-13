package module1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> listOfPrimes = new ArrayList<>();
        //Array vs ArrayList : static : dynamic
        for (int i = 1; i <= 100; i++) {
            if (decidePrime(i) != -1) {
                listOfPrimes.add(i);
            }
        }
        System.out.println(listOfPrimes.size());

        //Java Functional Programming

        //listOfPrimes.forEach(System.out::println);

        //listOfPrimes.stream().filter(aNum -> aNum> 10 ).toList().forEach(System.out::println);
        //
        System.out.println(listOfPrimes.stream().mapToInt(Integer::intValue).sum());

    }

    public static int decidePrime(int aNum) {
        //aNum = 15
        //This method will return  : aNum  number when it is a prime , otherwise return -1
        //When any number is divisible by that same number and one
        //other than same num a
        for (int j = 2; j <= aNum / 2; j++) {
            if (aNum % j==0)
            {
                return -1;
            }
        }
        return aNum;
    }
}
