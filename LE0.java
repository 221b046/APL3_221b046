public class LE0 {
    private int speed;    
    private int mileage;  


    public LE0(int  speed, int mileage) {
        this.speed = speed;
        this.mileage = mileage;
    }

    
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
    public double getSpeed() {
        return speed;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    
    public double getMileage() {
        return mileage;
    }


    public void displayDetails() {
        System.out.println("Speed: " + speed );
        System.out.println("Mileage: " + mileage );
    }

    public static void main(String[] args) {
       
        LE0 car = new LE0(80, 15);

        car.displayDetails();

        car.setSpeed(100);
        car.setMileage(18);

        
        car.displayDetails();
    }
}