public class Opgave_6 {
    public static void main(String[] args) {

        int x = 15;
        int y = 11;
        int z = 23;

        if (x > y && x < z || x > z && x < y) {
            System.out.println(x);
        }
        if (y > x && y < z || y < x && y > z) {
            System.out.println(y);
        }
        if (z > x && z < y || z < x && z > y) {
            System.out.println(z);
        }
        // forvented output hvis (x=1 y=2 z=3) ville være 2
        // forvented output hvis (x=72 y=54 z= 32) ville være 54
    }
}
