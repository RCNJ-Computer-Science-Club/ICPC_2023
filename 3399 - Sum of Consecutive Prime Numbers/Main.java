import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  Main(){
    int[] input = { 2, 3, 17, 41, 20, 666, 12, 53, 0 };
    // int[] input = { 20 };
    for (int i : input) calculate(i);
  }

  /**
   * c = card length
   */
  void calculate(int n) {
    ArrayList<Integer> list = new ArrayList<>();

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
    // System.out.println(list);


    int count = 0;
    // step two
    for (int i = 0; i < list.size(); i++){
      int sum = 0;
      int j = i;
      while (sum < n && j < list.size()){
        sum += list.get(j);
        // System.out.println(list.get(j));
        j++;
      }

      if (sum == n)
        count++;

      // System.out.println("sum: " + sum + "\n");
    }



    // System.out.println("\n\n\n");
    System.out.println(count);

  }

  public static void main(String[] args){ new Main(); }
}