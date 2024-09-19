import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] list = a.split("");

        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
