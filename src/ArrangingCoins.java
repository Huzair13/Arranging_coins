import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Nth value !!");

        int N=scanner.nextInt();

        int rows=arrangeRows(N);
        System.out.println("Number of complete rows : "+rows);
    }

    private static int arrangeRows(int n) {
        int rows=0;
        for(int i=1;i<=n;i++){
            rows++;
            n-=i;
        }
        return rows;
    }
}