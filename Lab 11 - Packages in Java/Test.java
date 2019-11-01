import package1.*; // importing package

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Add ob = new Add(); // this class came from package 'myPackage'
        System.out.println("The sum is : " + ob.sum(5, 10));
    }
}