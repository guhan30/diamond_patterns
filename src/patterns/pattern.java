package patterns;
public class pattern {
    public static void main(String[] args) {
        int n=5;
        for (int rows = 1; rows <n ; rows++) {
            for (int space = n; space >rows ; space--) {
                System.out.print("  ");
            }
            for (int col = 1; col <=rows ; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <rows ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int rows = 1; rows <=n ; rows++) {
            for (int space = 1; space <rows ; space++) {
                System.out.print("  ");
            }
            for (int col = n; col >=rows ; col--) {
                System.out.print("* ");
            }
            for (int col = n; col>rows ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*int a=1,b=2;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                if(row%2==1){
                    System.out.print(a++ + " ");
                    a+=1;
                }
                if(row%2==0){
                    System.out.print(b++ + " ");
                    b+=1;
                }
            }
            System.out.println();
        }*/
    }
}
