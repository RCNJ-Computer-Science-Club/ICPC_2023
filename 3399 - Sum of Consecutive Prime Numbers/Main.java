import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  Main(){
    int[] input = { 2, 3, 17, 41, 20, 666, 12, 53, 0 };
    for (int i : input) calculate(i);
  }

  /**
   * c = card length
   */
  void calculate(int n) {
    ArrayList<Integer> list = new ArrayList<>();
    int numOfPrimeSet = 0;

    // find prime
    for (int i = 2; i <= n; i++){

      boolean isPrime = true;

      for (int j = 2; j <= i/2; j++){
          if (i % j == 0){
            isPrime = false;
            break;
          }
      }

      if (isPrime)
        list.add(i);
    }

    // step two
    for (int i = 0; i < list.size(); i++){
      int sum = 0;

      for (int j = i; sum < n && j < list.size(); j++)
        sum += list.get(j);

      if (sum == n)
        numOfPrimeSet++;
    }

    System.out.println(numOfPrimeSet);
  }

  public static void main(String[] args){ new Main(); }
}