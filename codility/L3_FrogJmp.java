package codility;

public class L3_FrogJmp {
    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;

        if(Y-X == 0)
            System.out.println(0);

        System.out.println((int) Math.ceil((Y-X) / (double) D));
    }
}
