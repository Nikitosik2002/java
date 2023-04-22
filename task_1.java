import java.io.FileWriter;
import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] arr = {4, 3, 5, 2, 1, -10};
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j + 1] < arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
                sb.append(Arrays.toString(arr)).append("\n");
                try {
                    FileWriter fw = new FileWriter("log_task1.txt", false);
                    fw.write(sb.toString());
                    fw.close();
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }  
            }
        }
    }
}