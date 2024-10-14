
/**
 * Student 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Student
{
     // 문자열 변수 name
    String name;
    // 정수 변수 roll_no
    int roll_no;

    // 생성자
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    // print() 메소드
    public void print() {
        System.out.println("Roll No: " + roll_no + ", Name: " + name);
    }

}
