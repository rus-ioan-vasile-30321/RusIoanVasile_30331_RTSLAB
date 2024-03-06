package Lab1.Ex3;

public class main {
    public static void main(String[] args) {
        int min = -100; // Minimum value of range
        int max = 100; // Maximum value of range


        int[] array=new int[10];
        for (int i=0;i<=9;i++)
            array[i]=(int)Math.floor(Math.random() * (max - min + 1) + min);

        for (int i=0;i<=9;i++)
            System.out.print(array[i]+" ");
        System.out.println();
        for (int i=0;i<9;i++)
            for(int j=i+1;j<=9;j++)
                if(array[i]>array[j])
                {
                    int aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
        System.out.println("After sorting: ");
        for (int i=0;i<=9;i++)
            System.out.print(array[i]+" ");

    }
}
