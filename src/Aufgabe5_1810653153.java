public class Aufgabe5_1810653153
{
    public static void main(String[] args)
    {

        int zahl1 = 1234;
        int zahl2 = 2345;

        /*
            Der Unterschied zwischen zahl1++ und ++zahl1 liegt darin,
            dass bei zahl1++ zuerst die Variable ausgelesen wird
            und dann erst der Wert erhöht wird und bei ++zahl1 wird
            zuerst der Wert erhöht und dann die Variable ausgelesen.

        */

        System.out.println(zahl1++);
        System.out.println(zahl2++);

        System.out.println(zahl1);
        System.out.println(zahl2);

        System.out.println(++zahl1);
        System.out.println(++zahl2);

        System.out.println(zahl1);
        System.out.println(zahl2);

    }
}
