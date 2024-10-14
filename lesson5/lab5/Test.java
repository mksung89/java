
import java.util.Scanner;
public class Test
{
    
    static public void main(String args[])
    {
        /*
        // Student 객체 생성
        Student student = new Student("John", 2);
        // print() 메소드 호출
        student.print();
        
          // 첫 번째 사각형 (4, 5)
        Rectangle rectangle1 = new Rectangle(4, 5);
        System.out.println("Rectangle 1 - Area: " + rectangle1.getArea() + 
        ", Perimeter: " + rectangle1.getPerimeter());

        // 두 번째 사각형 (5, 8)
        Rectangle rectangle2 = new Rectangle(5, 8);
        System.out.println("Rectangle 2 - Area: " + rectangle2.getArea() + 
        ", Perimeter: " + rectangle2.getPerimeter());
       // Rectangle b = new Rectangle();
        // 피자 객체 생성
        Pizza pizza1 = new Pizza(1, 2, 1, 1); // small 피자, 치즈 2개, 페퍼로니 1개, 햄 1개
        Pizza pizza2 = new Pizza(2, 1, 2, 0); // medium 피자, 치즈 1개, 페퍼로니 2개, 햄 0개

        // 피자 설명 및 비용 출력
        System.out.println(pizza1.getDescription());
        System.out.println("Cost: $" + pizza1.calcCost());

        System.out.println(pizza2.getDescription());
        System.out.println("Cost: $" + pizza2.calcCost());
        */
         Menu n = new Menu();
         while (true) {
           Scanner sc = new Scanner(System.in);      
             n.showMenu();
             System.out.println("Select a menu");
             int a = sc.nextInt();
             boolean k = n.showSelection(a);
             if(k == false)
                break;
             
         } 
       
    }
}
