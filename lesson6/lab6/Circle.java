public class Circle {
    // 두 개의 private 인스턴스 변수
    private double radius;
    private String color;

    // 기본 생성자
    public Circle() {
        this.radius = 1.0; // 기본값
        this.color = "red"; // 기본값
    }

    // radius를 위한 오버로딩된 생성자
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red"; // 기본값
    }

    // 반지름을 반환하는 메서드
    public double getRadius() {
        return radius;
    }

    // 면적을 계산하여 반환하는 메서드
    public double getArea() {
        return Math.PI * radius * radius; // 원의 면적 공식
    }
}