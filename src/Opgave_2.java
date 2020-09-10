public class Opgave_2 {
    public static void main(String[] args) {
        int x = 41;
        int y = 67;
        {
            if (x + y > 100) {
                System.out.println("summen er større end hundrede");
            } else if (x + y < 100) {
                System.out.println("summen er mindre end hundrede");
            } else {
                System.out.println("summen er lig hundrede");
            }
        }
    }
}