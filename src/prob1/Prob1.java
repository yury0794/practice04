package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");

		int inputNumber = scanner.nextInt();

		/* 여기에 구현 코드를 작성 합니다. */
		int result = 0;
		if (inputNumber % 2 == 0) {
			for (int i = 2; i <= inputNumber; i = i + 2) {
				result = result + i;
			}
			System.out.println(result);
		} else {
			for (int i = 1; i <= inputNumber; i = i + 2) {
				result = result + i;
			}
			System.out.println(result);
		}
		scanner.close();
	}
}