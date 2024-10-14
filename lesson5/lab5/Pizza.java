
public class Pizza
{
   // 필드
    private int size; // 1: small, 2: medium, 3: large
    private int numCheese;
    private int numPepperoni;
    private int numHam;

    // 생성자
    public Pizza(int size, int numCheese, int numPepperoni, int numHam) {
        this.size = size;
        this.numCheese = numCheese;
        this.numPepperoni = numPepperoni;
        this.numHam = numHam;
    }

    // Getter 및 Setter 메소드
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumCheese() {
        return numCheese;
    }

    public void setNumCheese(int numCheese) {
        this.numCheese = numCheese;
    }

    public int getNumPepperoni() {
        return numPepperoni;
    }

    public void setNumPepperoni(int numPepperoni) {
        this.numPepperoni = numPepperoni;
    }

    public int getNumHam() {
        return numHam;
    }

    public void setNumHam(int numHam) {
        this.numHam = numHam;
    }

    // 비용 계산 메소드
    public double calcCost() {
        double baseCost;
        switch (size) {
            case 1: // small
                baseCost = 11.0;
                break;
            case 2: // medium
                baseCost = 12.0;
                break;
            case 3: // large
                baseCost = 14.0;
                break;
            default:
                baseCost = 0.0;
                break;
        }
        return baseCost + (2.0 * (numCheese + numPepperoni + numHam));
    }

    // 피자 설명 메소드
    public String getDescription() {
        String sizeDescription;
        switch (size) {
            case 1:
                sizeDescription = "small";
                break;
            case 2:
                sizeDescription = "medium";
                break;
            case 3:
                sizeDescription = "large";
                break;
            default:
                sizeDescription = "unknown size";
                break;
        }
        return "Pizza size: " + sizeDescription + ", Cheese: " + numCheese + ", Pepperoni: " + numPepperoni + ", Ham: " + numHam;
    }
  
}
