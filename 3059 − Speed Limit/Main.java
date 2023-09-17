import java.util.Arrays;

public class Main {
    Main(){
        int[][][] input = {
            { {3}, {20, 2}, {30, 6}, {10, 7} },
            { {2}, {60, 1}, {30, 5} },
            { {4}, {15, 1}, {25, 2}, {30, 3}, {10, 5} }
        };

        Arrays.asList(input)
              .forEach(i -> 
                calculate(i[0][0], Arrays.copyOfRange(i, 1, i[0][0] + 1))
              );
    }

    /**
     * n = number of pairs of values
     * st = speed in miles per hour, total elapsed time in hours
     */
    void calculate(int n, int[][] st){
        int speedInMiles = st[0][0];
        int elapsedTime = st[0][1];

        int totalMiles = speedInMiles * elapsedTime;

        for (int i = 1; i < n; i++){
            speedInMiles = st[i][0];
            elapsedTime = st[i][1] - st[i - 1][1];
            totalMiles += speedInMiles * elapsedTime;
        }

        System.out.println(totalMiles + " miles");
    }


    public static void main(String[] args) { new Main(); }
}
