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


    //Pattern 6
    //1 2 3
    //1 2
    //1

    public void pattern6(int n)
    {
        for (int i = n; i >0; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j+" ");

            }
            System.out.println();
        }
    }


    //Pattern 7
    //  *
    // ***
    //*****

    public void pattern7(int n)
    {

        for (int i = 0; i < n; i++) {
             for(int k=0;k <n-i-1;k++){
                 System.out.print(" "+" ");
             }
            for (int j = 0; j < ((2*i)+1); j++) {
                System.out.print("*"+" ");
            }



            System.out.println();
        }
    }


    //Pattern 8
    //*****
    // ***
    //  *

    public void pattern8(int n)
    {

        for (int i = 0; i < n; i++) {
            for(int k=0;k<=(i-1);k++){
                System.out.print(" "+" ");
            }
            for (int j = 0; j < (2*(n-i)-1); j++) {
                System.out.print("*"+" ");
            }



            System.out.println();
        }
    }


//Pattern 9
    //  *
    // ***
    //*****
    //*****
    // ***
    //  *

    public void pattern9(int n)
    {
         pattern7(n);
         pattern8(n);
    }


        //pattern 10
        //*
        //**
        //***
        //**
        //*

    public void pattern10(int n)
    {
        if(n%2 ==0){System.out.print("No");}

        for (int i = 0; i < 2*n-1; i++) {
            if (i <n ) {
                for (int k = 0; k <= i; k++) {
                    System.out.print("*" + " ");
                }
            }
            else{
                for(int j=0;j<2*n-i-1;j++){
                    System.out.print("*"+" ");
                }
            }


            System.out.println();
        }
    }











    public static void main (String[] args){
            int n=5;

            DSA.Pattern_Beginer_To_Advanced.EasyPattern c1=new DSA.Pattern_Beginer_To_Advanced.EasyPattern();

//            c1.pattern1(n);
//            System.out.println();
//
//
//            c1.pattern2(n);
//            System.out.println();
//
//        c1.pattern3(n);
//        System.out.println();
//
//
//
//        c1.pattern4(n);
//        System.out.println();
//
//
//        c1.pattern5(n);
//        System.out.println();
//
//        c1.pattern6(n);
//        System.out.println();

//        c1.pattern7(n);
//        System.out.println();


//        c1.pattern8(n);
//        System.out.println();


//    c1.pattern9(n);
//        System.out.println();
//
//    }

        c1.pattern10(n);
        System.out.println();

    }




}
