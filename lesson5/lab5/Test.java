

public class Test
{
    
    static public void main(String args[])
    {
        Student a = new Student();
        Rectangle b = new Rectangle();
        // 피자 객체 생성
        Pizza pizza1 = new Pizza(1, 2, 1, 1); // small 피자, 치즈 2개, 페퍼로니 1개, 햄 1개
        Pizza pizza2 = new Pizza(2, 1, 2, 0); // medium 피자, 치즈 1개, 페퍼로니 2개, 햄 0개

        // 피자 설명 및 비용 출력
        System.out.println(pizza1.getDescription());
        System.out.println("Cost: $" + pizza1.calcCost());

        System.out.println(pizza2.getDescription());
        System.out.println("Cost: $" + pizza2.calcCost());
    }
}
