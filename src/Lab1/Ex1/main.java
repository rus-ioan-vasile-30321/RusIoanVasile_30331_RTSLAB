package Lab1.Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {

        char answer;
        String line;
        complexnumber fnum,snum;
        BufferedReader fluxIn = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("Menu Login");
            System.out.println("1-Addition");
            System.out.println("2-Substraction");
            System.out.println("3-Multiplication");
            System.out.println("e-exit");
            int a,b;
            line=fluxIn.readLine();
            answer=line.charAt(0);

            switch (answer){
                case '1':
                    System.out.println("ENTER first-number: ");
                    System.out.println("real: ");
                    a= Integer.parseInt(fluxIn.readLine());
                    System.out.println("img: ");
                    b= Integer.parseInt(fluxIn.readLine());
                    fnum=new complexnumber(a,b);
                    System.out.println("ENTER second-number: ");
                    System.out.println("real: ");
                    a= Integer.parseInt(fluxIn.readLine());
                    System.out.println("img: ");
                    b= Integer.parseInt(fluxIn.readLine());
                    snum=new complexnumber(a,b);

                    System.out.println("RESULT: " + (fnum.getReal()+snum.getReal()) +"+("+ (fnum.imag+snum.imag)+')'+'i');
                    break;
                case '2':
                    System.out.println("ENTER first-number: ");
                    System.out.println("real: ");
                    a= Integer.parseInt(fluxIn.readLine());
                    System.out.println("img: ");
                    b= Integer.parseInt(fluxIn.readLine());
                    fnum=new complexnumber(a,b);
                    System.out.println("ENTER second-number: ");
                    System.out.println("real: ");
                    a= Integer.parseInt(fluxIn.readLine());
                    System.out.println("img: ");
                    b= Integer.parseInt(fluxIn.readLine());
                    snum=new complexnumber(a,b);
                    System.out.println("RESULT: " + (fnum.getReal()-snum.getReal()) +"+(" +(fnum.getImag()-snum.getImag())+')'+'i');
                    break;
                case '3':
                    System.out.println("ENTER first-number: ");
                    System.out.println("real: ");
                    a= Integer.parseInt(fluxIn.readLine());
                    System.out.println("img: ");
                    b= Integer.parseInt(fluxIn.readLine());
                    fnum=new complexnumber(a,b);
                    System.out.println("ENTER second-number: ");
                    System.out.println("real: ");
                    a= Integer.parseInt(fluxIn.readLine());
                    System.out.println("img: ");
                    b= Integer.parseInt(fluxIn.readLine());
                    snum=new complexnumber(a,b);
                    System.out.println("RESULT: " + (fnum.getReal()*snum.getReal()-fnum.getImag()*snum.getImag()) +"+("+ (fnum.getReal()*snum.getImag()+fnum.getImag()*snum.getReal())+')'+'i');
                    break;
                default:
                    System.out.println("Incorrect input!");

            }


        }while (answer!='e' && answer!='E');
        System.out.println("Program Finish!");

    }
}
