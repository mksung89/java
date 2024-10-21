
/**
 * Menu 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Menu
{
    
    public Menu()
    {
        // 인스턴스 변수 초기화
    
    }

    public void showMenu()
    {
        System.out. println("1. Spagetti");
        System.out. println("2. Steak");
        System.out. println("3. Ham burger");
        
    }
    public boolean showSelection(int n)
    {
        
        switch(n) {
        case 1 : System.out.println("You selected Spagetti");
                 return true;
                
        case 2 : System.out.println("You selected Steak");
                 return true;
                
        case 3 : System.out.println("You selected Ham burger");
                 return true;                
                 
        }
        return false;
    }
}
