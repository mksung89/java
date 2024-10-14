
/**
 * Rectangle 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Rectangle
{
   
     // 세로 길이와 가로 길이
    int height;
    int width;

    // 생성자
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // 면적을 계산하는 메소드
    public int getArea() {
        return height * width;
    }

    // 둘레 길이를 계산하는 메소드
    public int getPerimeter() {
        return 2 * (height + width);
    }

    
}
