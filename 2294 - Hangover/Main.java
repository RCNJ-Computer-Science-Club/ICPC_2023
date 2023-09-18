public class Main {

  Main(){
    double[] input = {1.00, 3.71, 0.04, 5.19};
    for (double i : input) calculate(i);
  }

  /**
   * c = card length
   */
  void calculate(double c) {
    double sum = 0; 
    int count = 0;

    while (c > sum){
      sum += 1.0 / (count + 2);
      count++;
    }

    System.out.println(count + " cards(s)");
  }

  public static void main(String[] args){ new Main(); }
}
