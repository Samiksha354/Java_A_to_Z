package DSA.Recurssion;

public class RecurssionBasicsAndProblemSolving {

    public void fun_names(int i, int n){
        if(i>n) return;
        System.out.print("Shobha");
        fun_names(i+1,n);
    }

    public void print1_n(int i,int n){
        if(i > n) return;
        System.out.println(n);
        print1_n(i+1,n);
        System.out.println(n);
    }


    public void printn_1(int n){
        if(n == 0) return;
        System.out.println(n);
        printn_1(n-1);
        System.out.println(n);

    }

    public int sumofn(int n){
        if( n == 1) return 1;

        return n+sumofn(n-1);
    }




    public static void main(String []args){
        RecurssionBasicsAndProblemSolving r1=new RecurssionBasicsAndProblemSolving();
        r1.fun_names(1,5);
        r1.print1_n(1,100);
        r1.printn_1(10);
        int a=r1.sumofn(10);
        System.out.println(a);
    }
}
