
public class Main {

    Main(){
      int[][] list = {
        { 3 },
        { 24, 1 },
        { 4358, 754 },
        { 305, 794 },
      };

      calcualte(list);
    }

    void calcualte(int[][] list){
      for (int i = 1; i <= list[0][0]; i++){
        int sum = reverseInt(list[i][0]) + reverseInt(list[i][1]);
        System.out.println(reverseInt(sum));
      }
    }

    int reverseInt(int num){
      String str = "";
      for (char i: (num + "").toCharArray()) str = i + str;
      return Integer.parseInt(str);
    }

    public static void main(String[] args) { new Main(); }
}