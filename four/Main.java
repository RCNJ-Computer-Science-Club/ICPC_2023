
public class Main {

    Main(){
      double[] list = { 100.00, 489.12, 12454.12, 1234.10, 823.05, 109.20, 5.27, 1542.25, 839.18, 83.99, 1295.01, 1.75 };
      System.out.println("$" + calcualte(list));
    }

    double calcualte(double[] list){
      double sum = 0;

      for (double i: list){
        sum += i;
      }

      double avg = sum / list.length;
      return avg;
    }

    public static void main(String[] args) { new Main(); }
}