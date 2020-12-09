package ge.btu.edu.demo2;

public class Main{
    public static void main(String[] args) {
//        sumable sum = new sumableImplement();
//        sum.sum();

        sumable summerizer = (int x, int y) -> System.out.println(x + y);
        summerizer.sum(5,8);
    }
}
