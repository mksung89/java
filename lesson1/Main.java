

public class Main
{
    public static void q1()
    {
       String name = "성만규 ";
       String dept = "게임소프트웨어 ";
       int id = 12344;
       
       System.out.println(name + "는 " + dept + "학과 소속으로 학번은 "+id + "입니다");
       
        
    }
    
    public static void q2()
    {
           // 정수 10과 3을 정의
        int dividend = 10;
        int divisor = 3;

        // 몫과 나머지 계산
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // 결과 출력
        System.out.println("몫: " + quotient);
        System.out.println("나머지: " + remainder);
        
    }
    
    public static void q3_1()
    {
        
          // 문자열 정의
        String originalString = "The quick brown fox jumps over the lazy dog";
        
        // 'd'를 'f'로 변경
        String modifiedString = originalString.replace('d', 'f');

        // 결과 출력
        System.out.println("원본 문자열: " + originalString);
        System.out.println("변경된 문자열: " + modifiedString);
        
    }
    
    public static void q3_2()
    {
        
         
        // 문자열 정의
        String originalString = "The quick brown fox jumps over the lazy dog";

        // 인덱스 10에서 16까지의 부분 문자열 추출
        String substring = originalString.substring(10, 16);

        // 결과 출력
        System.out.println("원본 문자열: " + originalString);
        System.out.println("부분 문자열 (인덱스 10부터 16까지): " + substring);
        
    }
    
    public static void q3_3()
    {
        
         
        // 두 문자열 정의
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        // 문자열 합치기
        String combinedString = str1 + str2;

        // 결과 출력
        System.out.println("합쳐진 문자열: " + combinedString);
        
    }
    
    public static void q3_4()
    {
       
        String myString = "PHP Exercises and Python Exercises";

        // "and"가 포함되어 있는지 확인
        boolean containsAnd = myString.contains("and");

        // 결과 출력
        if (containsAnd) {
            System.out.println("\"and\"가 문자열에 포함되어 있습니다.");
        } else {
            System.out.println("\"and\"가 문자열에 포함되어 있지 않습니다.");
        }
           
    }
    
    public static void q3_5()
    {
       
        // 문자열 정의
        String myString = "Java Exercises! ";

        // 0번째 글자와 10번째 글자 가져오기
        char firstChar = myString.charAt(0);
        char tenthChar = myString.charAt(10);

        // 결과 출력
        System.out.println("0번째 글자: " + firstChar);
        System.out.println("10번째 글자: " + tenthChar);
           
    }
    
    public static void q4()
    {
        double a = 104.5;
        float b = 104.5f;
        
    }
    
    public static void q5()
    {
        final float pi = 3.1452f;
        final float r = 5.4f;
        
        float area = r * r * pi;
        System.out.println(area);
        
    }
      
    public static void main(String[] args) 
    {
        q1();
      //  q2();
      //q3_1();
      //q3_2();
      
      
      
    }

    
}
