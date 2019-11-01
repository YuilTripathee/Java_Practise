/**
 * Programmer
 */
public class Programmer extends Employee { // inheriting base class with 'extends' keyword

    float bonus = 10000;
    
    public static void main(String[] args) {
        Programmer ob = new Programmer();
        System.out.println("Programmer's Salary is : " + ob.salary);
        System.out.println("Programmer's Bonus is : " + ob.bonus);
    }
    
}