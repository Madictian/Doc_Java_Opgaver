public class Opgave_1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;
        {
            boolean a = (x <= 5 && z != y);
            boolean b = (x == 5 || x == y && z == 3);
            boolean c = (x / y > z / x);
            boolean d = (!(x != y - z) == false);
            boolean e = (2 * x != x || x == 0);
            boolean f = (!true || !false);

            System.out.println(b);
        }



//A:    Udtrykket fungere kun  hvis begge udtryk {x <= 5 && z != y} giver true. Så hvis 5 != 5 giver anden del false og derved bliver det endelige udtryk false. men med de givne intergers er det true.
//B:    Der er kombineret en ||(or) sammen med en &&(and). "or" udtrykket virker udafhængigt af om "and" udtrykket fungere, så længe den er true på en af siderne. forvented out true.
//C:    forventet output er false da begge sidder dividere med det større tal, og når der divideres med integers runder java ned.
//D:    forventet false "!(5 != 8 - 3 ) == false"  da udtrykket inde i parentesen giver vil segmented !(false) bliver til true og "true == false = false"
//E:    forvented true da den først del "2 * x != x" er det samme som "2 * 5 != 5" hvilket er true.
//F:    error? spytter true ud da fortolkningen af !false giver true.
    }
}
