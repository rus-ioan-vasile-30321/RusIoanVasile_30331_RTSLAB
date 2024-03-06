package Lab1.Ex2;

public class main {

    public static void main(String[] args) {
        int [][] first= {
                {2,3,1},
                {7,1,6},
                {9,2,4}
        };
        int [][] second= {
                {8,5,3},
                {3,9,2},
                {2,7,3}
        };

        int[][] sum=new int[3][3];
        System.out.println("Sum: ");
        for(int i=0;i<=2;i++) {
            for (int j = 0; j <= 2; j++){
                System.out.print(first[i][j]+second[i][j]+" ");
                sum[i][j]=first[i][j]+second[i][j];
            }
                System.out.println();
        }
        System.out.println("Product: ");
        int prod=0;
        for(int i=0;i<=2;i++) {
            for (int j = 0; j <= 2; j++){
                prod=first[i][0]*second[0][j]+first[i][1]*second[1][j]+first[i][2]*second[2][j];
                System.out.print(prod+" ");
            }
            System.out.println();
        }



    }


}
