
import java.util.Scanner;

public class Main
{
    public static void q1()
    {
      
        Scanner scanner = new Scanner(System.in);
        
        // 양의 정수 N 입력 받기
        System.out.print("양의 정수 N을 입력하세요: ");
        int N = scanner.nextInt();
        
        // 삼각형 출력
        int count = 0;
        int index = 1;
        for (int i = 0; i < N; i++) {
            // 줄 바꿈
            
            for (int j = 0; j < index; j++) {
                System.out.print("*");
            }
            System.out.println();
            index += 2;
            count++;
        }
        
        scanner.close();
    }
      
    public static void q2()
    {
              
       Scanner scanner = new Scanner(System.in);
        // 양의 정수 N 입력 받기
       System.out.print("양의 정수 N을 입력하세요: ");
       int N = scanner.nextInt();
        
        // 삼각형 출력
       int count = 0;
       int index = 1;
       for (int i = 0; i < N; i++) {
            // 줄 바꿈
             // 별의 개수 계산 (2 * (N - i) - 1)
            int stars = 2 * (N - i) - 1;
            
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            
            count++;
       }
        
        scanner.close();
        
    }
    
    public static void q3()
    {
         Scanner scanner = new Scanner(System.in);
        
        // 정수 다섯 개를 저장할 배열 생성
        int[] numbers = new int[5];
        
        // 사용자로부터 정수 입력 받기
        System.out.println("정수 다섯 개를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 정수: ");
            numbers[i] = scanner.nextInt();
        }
        
        // 첫 번째 큰 수와 두 번째 큰 수 초기화
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // 배열을 순회하며 첫 번째와 두 번째 큰 수 찾기
        for (int number : numbers) {
            if (number > firstLargest) {
                secondLargest = firstLargest; // 이전의 첫 번째 큰 수를 두 번째 큰 수로 이동
                firstLargest = number; // 새로운 첫 번째 큰 수
            } else if (number > secondLargest && number != firstLargest) {
                secondLargest = number; // 새로운 두 번째 큰 수
            }
        }
        
        // 결과 출력
        System.out.println("첫 번째 큰 수: " + firstLargest);
        System.out.println("두 번째 큰 수: " + secondLargest);
        
        scanner.close();       
        
    }
    
    public static void q4()
    {
         Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int count1 = 0, count2 = 0, count3 = 0;

        System.out.println("1, 2, 3 중 하나의 숫자를 10개 입력하세요:");

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print((i + 1) + "번째 숫자: ");
                int input = scanner.nextInt();

                if (input == 1 || input == 2 || input == 3) {
                    numbers[i] = input; // 배열에 저장
                    break; // 올바른 입력이므로 반복 종료
                } else {
                    System.out.println("잘못된 입력입니다. 1, 2, 3 중 하나를 입력하세요.");
                }
            }
        }

        // 각 숫자의 개수 세기
        for (int number : numbers) {
            if (number == 1) {
                count1++;
            } else if (number == 2) {
                count2++;
            } else if (number == 3) {
                count3++;
            }
        }

        // 결과 출력
        System.out.println("출력 결과:");
        System.out.print("1 : ");
        for (int j = 0; j < count1; j++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("2 : ");
        for (int j = 0; j < count2; j++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("3 : ");
        for (int j = 0; j < count3; j++) {
            System.out.print("*");
        }
        System.out.println();

        scanner.close();
    }
      
     public static void q5()
     {
        
        Scanner scanner = new Scanner(System.in);
        int N;
        
        // N 입력 받기
        do {
            System.out.print("3~18 사이의 정수 N을 입력하세요: ");
            N = scanner.nextInt();
        } while (N < 3 || N > 18);

        System.out.println("주사위의 합이 " + N + "이 되는 경우:");

        // 중첩 반복문을 사용하여 모든 경우의 수 찾기
        for (int i = 1; i <= 6; i++) { // 첫 번째 주사위
            for (int j = 1; j <= 6; j++) { // 두 번째 주사위
                for (int k = 1; k <= 6; k++) { // 세 번째 주사위
                    if (i + j + k == N) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }

        scanner.close();
     
    }

     
    public static void q6()
    {
        Scanner scanner = new Scanner(System.in);
        
        // N 입력 받기
        System.out.print("홀수인 양의 정수 N을 입력하세요: ");
        int N = scanner.nextInt();
        
        // N이 홀수인지 확인
        if (N % 2 == 0) {
            System.out.println("N은 홀수여야 합니다.");
        } else {
            // 중첩 반복문을 사용하여 출력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (j == i || j == (N - 1 - i)) {
                        System.out.print("X ");
                    } else {
                        System.out.print("O ");
                    }
                }
                System.out.println(); // 줄 바꿈
            }
        }
        
        scanner.close();
            
    }
    
    
    public static void q7()
    {
       Scanner scanner = new Scanner(System.in);
        
        // 정답 단어 설정
        
        String answer = scanner.next();
        char[] answerArray = answer.toCharArray();
        char[] currentGuess = {'_', '_', '_'}; // 현재 상태 초기화
        int attempts = 5; // 최대 시도 횟수
               
        System.out.println("3글자의 영단어를 맞춰보세요! (5번의 시도 기회가 있습니다.)");
        
        while (attempts > 0) {
            System.out.print("한 글자를 입력하세요: ");
            char guess = scanner.next().charAt(0);
            boolean correctGuess = false;

            // 입력한 글자가 정답에 있는지 확인
            for (int i = 0; i < answerArray.length; i++) {
                if (answerArray[i] == guess) {
                    currentGuess[i] = guess; // 맞춘 글자를 현재 상태에 반영
                    correctGuess = true;
                }
            }

            // 현재 상태 출력
            System.out.println("현재 상태: " + new String(currentGuess));

            // 정답을 맞춘 경우
            if (new String(currentGuess).equals(answer)) {
                System.out.println("축하합니다! 정답을 맞추셨습니다: " + answer);
                break;
            }

            // 시도 횟수 감소
            attempts--;
            System.out.println("남은 시도 횟수: " + attempts);
        }

        // 시도 횟수를 모두 소진한 경우
        if (attempts == 0) {
            System.out.println("시도 횟수를 모두 소진했습니다. 정답은: " + answer);
        }

        scanner.close();
    
        
    }
    
    public static void main(String[] args) 
    {
        
       // q1();
       // q2();
       //q3();
      // q5();
      //q6();
      //q3_1();
      //q3_2();
      
      
      
    }

    
}
