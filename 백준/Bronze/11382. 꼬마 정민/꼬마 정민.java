import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 한 줄 전체를 입력받고 공백으로 분리
        String input = sc.nextLine();
        String[] values = input.split(" ");

        // 각 값을 long 타입으로 변환
        long A = Long.parseLong(values[0]);
        long B = Long.parseLong(values[1]);
        long C = Long.parseLong(values[2]);

        System.out.println(A + B + C);
    }
}
