
import java.util.Scanner;

public class Main
{
    public static void q1()
    {
      
       // 두 값을 변수에 선언
        double num1 = 10.0;
        double num2 = 3.0;

        // 나누기 연산
        double result = num1 / num2;

        // 결과 출력
        System.out.println("10 / 3의 결과: " + result);
    }
      
    public static void q2()
    {
       Scanner sc = new Scanner(System.in);
        
        // 정수 입력 받기
        System.out.print("정수를 입력하세요: ");
        int number = sc.nextInt();
        
        System.out.println(number);
        
        // 3의 배수인지 확인
        boolean isMultipleOfThree = (number % 3 == 0);
        
        // 결과 출력
        System.out.println(isMultipleOfThree);
        
        sc.close();
        
        
    }
    
    public static void q3()
    {
        Scanner scanner = new Scanner(System.in);
        
        // 영문자 한 글자 입력 받기
        System.out.print("영문자 한 글자를 입력하세요: ");
        String i = scanner.nextLine();   //엔터 입력까지 입력

        char aa = i.charAt(0);
        
        // 모음인지 자음인지 확인
        if (Character.isLetter(aa)) {
            if ("aeiouAEIOU".indexOf(aa) != -1) {
                System.out.println("모음입니다.");
            } else {
                System.out.println("자음입니다.");
            }
        } else {
            System.out.println("영문자가 아닙니다.");
        }
        
        scanner.close();
        
    }
    
    public static void q4()
    {
        
         // long 타입 변수 선언
        long value1 = 2322331L;
        long value2 = 52341241L;

        // long을 int로 변환
        int intValue1 = (int) value1;
        int intValue2 = (int) value2;

        // 결과 출력
        System.out.println("long 값 1: " + value1 + " -> int 값 1: " + intValue1);
        System.out.println("long 값 2: " + value2 + " -> int 값 2: " + intValue2);
    }
    
    public static void q5()
    {
        
         // 문자열 선언
        String str1 = "23";
        String str2 = "4566";

        // 문자열을 int로 변환
        int intValue1 = Integer.parseInt(str1);
        int intValue2 = Integer.parseInt(str2);

        // 결과 출력
        System.out.println("str1의 int 값: " + intValue1);
        System.out.println("str2의 int 값: " + intValue2);
    }
    
    public static void q6()
    {
        
        Scanner scanner = new Scanner(System.in);
        
        // 정수 입력 받기
        System.out.print("0과 30 사이의 정수를 입력하세요: ");
        int x = scanner.nextInt();
        
        // 조건에 따른 출력
        if (x >= 0 && x < 10) {
            System.out.println("0보다 크고 10 미만입니다.");
        } else if (x >= 10 && x < 20) {
            System.out.println("10보다 크고 20 미만입니다.");
        } else if (x >= 20 && x <= 30) {
            System.out.println("20보다 크고 30 미만입니다.");
        } else {
            System.out.println("0과 30사이의 값을 입력하세요.");
        }
        
        scanner.close();
    }
    
    public static void q7()
    {
        Scanner scanner = new Scanner(System.in);
        
        // 두 개의 양의 정수 입력 받기
        System.out.print("두 개의 양의 정수를 입력하세요 (N, M): ");
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // 곱셈 관계 확인
        boolean foundRelation = false;

        // N이 M의 제곱인 경우
        if (M > 0 && N % M == 0) {
            int factor = N / M;
            if (factor == M) {
                System.out.println(M + "*" + M + " = " + N);
                foundRelation = true;
            }
        }

        // M이 N의 제곱인 경우
        if (N > 0 && M % N == 0) {
            int factor = M / N;
            if (factor == N) {
                System.out.println(N + "*" + N + " = " + M);
                foundRelation = true;
            }
        }

        // 곱셈 관계가 없는 경우
        if (!foundRelation) {
            System.out.println("none");
        }
        
        scanner.close();
    }
      
       
    
    public static void main(String[] args) 
    {
        
       // q1();
       // q2();
       //q3();
      // q5();
      q6();
      //q3_1();
      //q3_2();
      
      
      
    }

    
}
