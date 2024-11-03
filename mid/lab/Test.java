

import java.util.Scanner;

public class Test
{

    
    static void q1() {
       Scanner scanner = new Scanner(System.in);
        System.out.print("10000에서 99999 사이의 양의 정수를 입력하세요: ");
        int N = scanner.nextInt();
        
        // 입력 값이 유효한지 확인
        if (N < 10000 || N > 99999) {
            System.out.println("유효한 범위의 정수를 입력하세요.");
        } else {
            // 100의 자리를 구하기
            int hundredPlace = (N / 100) % 10;
            System.out.println("100의 자리: " + hundredPlace);
        }
    }
    
    static void q2()
    {
         Scanner scanner = new Scanner(System.in);

        System.out.print("양의 정수 N을 입력하세요: ");
        int N = scanner.nextInt();

        // 숫자를 순환하기 위한 변수
        int currentNumber = 1; // 시작 숫자

        // N줄 출력
        for (int i = 1; i <= N; i++) {
            // 각 줄의 시작 부분에 공백 출력
            System.out.print(" ");
            
            // 각 줄에 i개의 숫자 출력
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber);
                if (j < i) { // 마지막 숫자 뒤에는 공백 없음
                    System.out.print(" ");
                }
                // 현재 숫자 업데이트 (1~9, 0 순환)
                currentNumber = (currentNumber % 10) + 1;
            }
            // 줄 바꿈
            System.out.println();
        
        }
    }
    
    static void q3()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("10 이상의 양의 정수 N을 입력하세요: ");
        int N = scanner.nextInt();

        // N이 10 미만일 경우 처리
        if (N < 10) {
            System.out.println("10 이상의 양의 정수를 입력해야 합니다.");
            return;
        }

        // 디지털 근 계산
        int digitalRoot = N;
        
        while (digitalRoot >= 10) {
            int sum = 0;

            // 각 자리수를 더하기
            while (digitalRoot > 0) {
                sum += digitalRoot % 10; // 일의 자리 숫자 더하기
                digitalRoot /= 10; // 다음 자리로 이동
            }

            digitalRoot = sum; // 합계를 새로운 디지털 근으로 설정
        }

        System.out.println("디지털 근: " + digitalRoot);
        scanner.close();
    }

    static void q5()
    {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        boolean[] counted = new boolean[10]; // 각 숫자가 이미 출력되었는지 확인하기 위한 배열

        System.out.println("10개의 정수를 입력하세요:");

        // 10개의 정수 입력 받기
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 각 숫자의 등장 횟수 세기 및 출력
        for (int i = 0; i < 10; i++) {
            if (!counted[i]) { // 아직 출력되지 않은 숫자일 경우
                int count = 1; // 현재 숫자의 등장 횟수 초기화
                for (int j = i + 1; j < 10; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++; // 같은 숫자가 발견되면 카운트 증가
                        counted[j] = true; // 이미 출력된 숫자로 표시
                    }
                }
                // 결과 출력
                System.out.println(numbers[i] + " " + count);
            }
        }

        scanner.close();
        
    }
    
    static public void main(String args[])
    {
      // q1(); 
      // q2();
    }

}
