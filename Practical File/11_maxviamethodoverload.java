/*Aim:Program to find the Maximum of 3 Numbers using Method Overload
Description: If a class has multiple methods having same name but different in parameters,it is known as Method Overloading*/

//Program:
class Maxof3
{
    static int a;
    static int b;
    static int c;
    static double d;
    static double e;
    static double f;
    public void input( int a, int b ,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("a = "+a+": b="+b+ " c =" +c);
    }
    public void input(double d,double e,double f){
        this.d=d;
        this.e=e;
        this.f=f;
        System.out.println("d = "+d+": e="+e+ " f =" +f);
    }
    public static int max3(int a, int b, int c)
    {
        int max=a;
        if (b>max)max=b;
        if (c>max)max=c;
        return max;
    }
      public static double max3(double d,double e,double f)
    {
        double max=d;
        if (e>max)max=e;
        if (f>max)max=f;
        return max;
    }
}
class A{
    static int a=9;
    static int b=10;
    static int c=14;
    static double d=7;
    static double e=22;
    static double f=49;
    public static void main(String args[])
    {
        Maxof3 g= new Maxof3();
        Maxof3 h= new Maxof3();
        g.input(a,b,c);
        int i=g.max3(a,b,c);
        System.out.println("Maximum of the 3 numbers is: "+i);
        h.input(d,e,f);
        double j=h.max3(d,e,f);
        System.out.println("Maximum of the 3 numbers is: "+j);
    }
}
