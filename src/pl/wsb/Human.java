package pl.wsb;

public class Human implements Edible {

    String firsName;
    String lastName;
    Animal pet;
    Phone mobile;
    Car vehicle;
    Job job;
    protected String phoneNumber;
    private double salary;
    private static String PASS = "mypass";

    public double getSalary(String pass) {
        if (pass ==  PASS){
            return salary;
        }else{
            return Double.parseDouble(null);
        }
    }

   boolean couldIBuy(Car car){
       return (0.01 * vehicle.price) <= (0.3 * salary);
   }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void eat() throws Exception {
        throw new Exception("Don't do this!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", mobile=" + mobile +
                ", vehicle=" + vehicle +
                ", job=" + job +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                '}';
    }
}
