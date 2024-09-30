
import java.util.Scanner;

public class Main
{
    public static void q1()
    {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 > num2)
               System.out.println(num1 + " > " + num2 );
        if (num1 < num2)
            System.out.println(num1 + " < " + num2 );
        if (num1 == num2)
            System.out.println(num1 + " == " + num2);
        if (num1 != num2)
            System.out.println(num1 + " != " + num2);
        if (num1 >= num2)
            System.out.println(num1 + " >= " + num2);
        if (num1 <= num2)
        System.out.println(num1 + " <= " + num2);

        scanner.close();
    }
      
    public static void q2()
    {
       // 지구의 반지름 (km)
        final double RADIUS = 6371.01;

        Scanner scanner = new Scanner(System.in);

        // 첫 번째 지점의 위도와 경도 입력
        System.out.print("첫 번째 지점의 위도(x1)를 입력하세요 (단위: 도): ");
        double x1 = Math.toRadians(scanner.nextDouble()); // 라디안으로 변환
        System.out.print("첫 번째 지점의 경도(y1)를 입력하세요 (단위: 도): ");
        double y1 = Math.toRadians(scanner.nextDouble()); // 라디안으로 변환

        // 두 번째 지점의 위도와 경도 입력
        System.out.print("두 번째 지점의 위도(x2)를 입력하세요 (단위: 도): ");
        double x2 = Math.toRadians(scanner.nextDouble()); // 라디안으로 변환
        System.out.print("두 번째 지점의 경도(y2)를 입력하세요 (단위: 도): ");
        double y2 = Math.toRadians(scanner.nextDouble()); // 라디안으로 변환

        // 거리 계산
        double distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) +
                         Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        // 결과 출력
        System.out.printf("두 지점 사이의 거리: %.2f km\n", distance);

        scanner.close();
        
       
        
    }
    
    public static void q3()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("양의 정수 N을 입력하세요: ");
        int N = scanner.nextInt();

        int i = 1; // 약수를 찾기 위한 변수
        System.out.print("N의 약수: ");

        // N의 약수를 찾기 위한 while 문
        while (i <= N) {
            if (N % i == 0) {
                System.out.print(i + " "); // 약수 출력
            }
            i++; // i를 증가시킴
        }

        scanner.close();
        
    }
    
    public static void q4()
    {
        
       Scanner scanner = new Scanner(System.in);

        // 1. 국어, 영어, 수학 점수를 입력 받음
        System.out.print("국어, 영어, 수학 점수를 입력하세요 (0 ~ 100): ");
        int korean = scanner.nextInt();
        int english = scanner.nextInt();
        int math = scanner.nextInt();

        // 2. 평균 계산
        double average = (korean + english + math) / 3.0;

        // 3. 학점 결정
        char grade;
        if (average >= 75) {
            grade = 'A';
        } else if (average >= 50) {
            grade = 'B';
        } else {
            grade = 'F';
        }

        // 4. 결과 출력
        System.out.printf("%.2f %c\n", average, grade);

        scanner.close();
    }
    
    public static void q5()
    {
        Scanner scanner = new Scanner(System.in);

        // 음료 선택 입력
        System.out.print("음료 종류를 선택하세요 (1: Americano, 2: Cafe Latte, 3: Lemon Tea): ");
        int N = scanner.nextInt();

        // 투입한 금액 입력
        System.out.print("투입한 금액을 입력하세요 (100의 배수): ");
        int M = scanner.nextInt();

        // 음료 가격과 이름 초기화
        String beverage = "";
        int price = 0;

        // 음료 종류에 따른 가격 설정
        switch (N) {
            case 1:
                beverage = "Americano";
                price = 500;
                break;
            case 2:
                beverage = "Cafe Latte";
                price = 400;
                break;
            case 3:
                beverage = "Lemon Tea";
                price = 300;
                break;
            default:
                System.out.println("잘못된 음료 선택입니다.");
                scanner.close();
                return; // 프로그램 종료
        }

        // 잔돈 계산
        int change = M - price;
        int num500 = change / 500; // 500원 짜리 개수
        change %= 500; // 잔돈에서 500원 짜리를 뺀 나머지
        int num100 = change / 100; // 100원 짜리 개수

        // 결과 출력
        System.out.println(beverage + "를 선택하셨습니다.");
        System.out.println("잔돈: " + num500 + "개 (500원), " + num100 + "개 (100원)");

        scanner.close();
        
    }
    
    public static void q6()
    {
        Scanner scanner = new Scanner(System.in);

        // 양의 정수 N 입력
        System.out.print("양의 정수 N을 입력하세요: ");
        int N = scanner.nextInt();

        // 삼각형 출력
        for (int i = 0; i < N; i++) {
            // 공백 출력
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" "); // 공백 출력
            }
            // 별 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*"); // 별 출력
            }
            // 줄 바꿈
            System.out.println();
        }

        scanner.close();
        
    }
    
    public static void q7()
    {
        Scanner scanner = new Scanner(System.in);

        // 기준 정수 입력
        System.out.print("기준 정수를 입력하세요: ");
        int answer = scanner.nextInt();
        
        int guess;
        int attempts = 0;

        do {
            // 정수 입력
            System.out.print("정답 입력: ");
            guess = scanner.nextInt();
            attempts++; // 시도 횟수 증가

            // 대소 관계 출력
            if (guess < answer) {
                System.out.println(guess + "보다 높습니다");
            } else if (guess > answer) {
                System.out.println(guess + "보다 낮습니다");
            } else {
                System.out.println(guess + " 정답입니다");
            }

        } while (guess != answer); // 정답이 아닐 경우 반복

        // 시도 횟수 출력
        System.out.println("시도횟수는 " + attempts + "입니다");

        scanner.close();
    }
      
     public static void q8()
     {
        Scanner scanner = new Scanner(System.in);
        char[] characters = new char[7];

        // 7개의 문자 입력 받기
        System.out.print("7개의 문자를 입력하세요: ");
        String temp = scanner.next();
               
        // 문자 배열을 문자열로 변환
        for (int i=0; i<7; i++)
           characters[i] = temp.charAt(i);
        
        // "cat"의 개수 세기
        int count = 0;
        int index = 0;

        while ((index = temp.indexOf("cat", index)) != -1) {
            count++;
            index += 3; // "cat"의 길이만큼 이동
        }

        // 결과 출력
        System.out.println(count);

        scanner.close();
         
     }
    
    public static void q9()
    {
        
        Scanner scanner = new Scanner(System.in);
        
        // 5개의 문자를 저장할 배열 생성
        char[] characters = new char[5];

        // 5개의 문자 입력 받기
        System.out.print("영어 문자 5개를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            characters[i] = scanner.next().charAt(0);
        }

        // 한 번에 한 칸씩 shift하여 출력
        for (int i = 0; i < 5; i++) {
            // Shift된 배열 생성
            for (int j = 0; j < 5; j++) {
                // 배열 인덱스를 계산하여 출력
                System.out.print(characters[(j + i) % 5]);
            }
            System.out.println(); // 줄 바꿈
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
