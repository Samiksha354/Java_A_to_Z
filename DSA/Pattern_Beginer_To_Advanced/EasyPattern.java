package DSA.Pattern_Beginer_To_Advanced;
import java.util.*;

public class EasyPattern {
        //Pattern 1
        //* * * *
        //* * * *
        //* * * *

        public void pattern1(int n)
        {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    //Pattern 2
    //*
    //* *
    //* * *

    public void pattern2(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern 3
    //1
    //1 2
    //1 2 3

    public void pattern3(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(j+1 +" ");

            }
            System.out.println();
        }
    }

    //Pattern 4
    //1
    //2 2
    //3 3 3

    public void pattern4(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(i+1 +" ");

            }
            System.out.println();
        }
    }


    //Pattern 5
    //* * *
    //* *
    //*

    public void pattern5(int n)
    {
        for (int i = n; i >0; i--) {
            for (int j = 0; j < i; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }
    }


    //Pattern 5
    //* * *
    //* *
    //*

    public void pattern6(int n)
    {
        for (int i = n; i >0; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j+" ");

            }
            System.out.println();
        }
    }










    public static void main (String[] args){
            int n=4;

            DSA.Pattern_Beginer_To_Advanced.EasyPattern c1=new DSA.Pattern_Beginer_To_Advanced.EasyPattern();

            c1.pattern1(n);
            System.out.println();


            c1.pattern2(n);
            System.out.println();

        c1.pattern3(n);
        System.out.println();



        c1.pattern4(n);
        System.out.println();


        c1.pattern5(n);
        System.out.println();

        c1.pattern6(n);
        System.out.println();

    }




}
