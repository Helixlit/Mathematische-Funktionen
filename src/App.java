import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        while (true) {
            int x = in.nextInt();
            //int y = in.nextInt();

            System.out.println(hasen_rek(x));
        }
    }

    private static int hasen_rek(int n)
    {
        if (n < 3) return 1;
        return hasen_rek(n-1) + hasen_it(n-2);
    }

    private static int hasen_it(int n)
    {
        int ergebnis = 1;
        if (n < 3) return 1;
        for (int i = 3; i <= n; i++)
        {
            ergebnis = ergebnis * 2;
        }
        return ergebnis;
    }

    private static int bak_rek(int n, int a)
    {
        if (n < 1) return a;
        return bak_rek(n-1, a) * 2;
    }

    private static int bak_it(int n, int a)
    {
        int ergebnis = a;
        for (int i = 1; i <= n; i++)
        {
            ergebnis *= 2;
        }
        return ergebnis;
    }

    private static int fak_rek(int n)
    {
        if (n < 2) return 1;
        return fak_rek(n-1) * n;
    }

    private static int fak_it(int n)
    {
        if (n < 2) return 1;
        int ergebnis = 1;
        for (int i = 1; i <= n; i++)
        {
            ergebnis *= i;
        }
        return ergebnis;
    }
}
