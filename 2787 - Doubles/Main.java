public class Main {

  Main(){
    int[][] input = { {1, 4, 3, 2, 9, 7, 18, 22, 0} ,
                      {2, 4, 8, 10, 0},
                      {7, 5, 11, 13, 1, 3, 0}};

    for (int[] i: input) calculate(i);
  }

  /**
   * arr = array of random numbers
   */
  void calculate(int[] arr){
    int count = -1; 

    for (int i: arr)
      for (int j: arr)
        if (i * 2 == j) 
          count++;

    System.out.println(count);
  }
  
  public static void main(String[] args){ new Main(); }
  
}
