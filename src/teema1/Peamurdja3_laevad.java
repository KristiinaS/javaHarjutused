package teema1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {

        //int[] laud = {1, 0, 0, 1, 1, 0, 1, 1, 0};


        int[]laud = new int[9];
        for (int i=0;i<9; i++){
            int n = (int)(Math.random()*2);
            laud[i]=n;
            //System.out.println(laud[i]);
        }

        System.out.println(Arrays.toString(laud));

        int sum = IntStream.of(laud).sum();
        //System.out.println("Laevu on järel  " + sum);
        System.out.println("Laevu on järel  " + sum);

        while (sum > 0) {

            Scanner kasutaja = new Scanner(System.in);
            System.out.println("Sistesta number 0-st 8-ni");
            int sisestus = kasutaja.nextInt();
            System.out.println(laud[sisestus]);


            if (laud[sisestus] == 1) {
                System.out.println("Pihtas!");
                laud[sisestus] = 0;
                //System.out.println(Arrays.toString(laud));
                int sum2 = IntStream.of(laud).sum();
                System.out.println("---------------");
                System.out.println("Laevu on järel  " + sum2);
                sum = sum-1;
            } else if (laud[sisestus] == 0) {
                    System.out.println("Läks mööda. Proovi uuesti.");
                    int sum2 = IntStream.of(laud).sum();
                    System.out.println("---------------");
                    System.out.println("Laevu on järel  " + sum2);
            }

            }
        System.out.println("Palju õnne! Võitsid mängu!");
        }
    }

