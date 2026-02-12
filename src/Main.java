//kelvin yohanes putra - 12S24018

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String soal = sc.next(); // Soal1, Soal2, Soal3, Soal4, Soal5

        if (soal.equals("Soal1")) {
          
            // SOAL 1 — Integer Overflow
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a + b;

            if ((a > 0 && b > 0 && result < 0) ||
                (a < 0 && b < 0 && result > 0)) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(result);
            }

        } else if (soal.equals("Soal2")) {
           
            // SOAL 2 — Float vs Double
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            float xf = (float) x;
            float yf = (float) y;

            float sumFloat = xf + yf;
            double sumDouble = x + y;

            double diff = Math.abs(sumDouble - sumFloat);
            System.out.printf("%.6f\n", diff);

        } else if (soal.equals("Soal3")) {
         
            // SOAL 3 — Primitive vs Wrapper
            int n = sc.nextInt();

            Integer a = n;
            Integer b = a;

            a = a + 1;

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        } else if (soal.equals("Soal4")) {
      
            // SOAL 4 — String Immutability
            String s = sc.next();

            String a = s;
            String b = new String(s);

            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        } else if (soal.equals("Soal5")) {
            
            // SOAL 5 — Parsing & Type Safety 
            String intStr = sc.next();
            String doubleStr = sc.next();
            String boolStr = sc.next();

            int i = Integer.parseInt(intStr);
            double d = Double.parseDouble(doubleStr);
            boolean b = Boolean.parseBoolean(boolStr);

            double result = i * d;

            if (!b) {
                result *= -1;
            }

            System.out.printf("%.2f\n", result);

        } else {
            System.out.println("Soal tidak dikenali");
        }

        sc.close();
    }
}
