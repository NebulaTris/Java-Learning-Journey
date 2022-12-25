/*Aim:Write a program use try-catch,throw,throws any two built-in exceptions,one custom exception, all use catch statement to print stack trace,print custom exception and print its stack tree.

Description:Exception-An exception is an event that disrupts the normal flow of the program.It is an object which is thrown at runtime.
Try-The "try* keyword is used to specify a block where we should place an exception code.
Catch-The "catch" block is used to handle the exception.
Throw-The "throw" keyword is used to throw the exception.
Throws-The "throws" keyword is used to declare exceptions.It specifies that there may occur an exception in the method.It doesn't throw an exception.*/

//Program:
class exp
{
    float div(float a,float b) throws ArithmeticException
    {
        if(b=0.0)
        {
            throw new ArithmeticException("div by 0");
        }
        return(a/b);
    }
}
class ProbWaterSpill extends Exception
{
    public ProbWaterSpill(String error)
    {
        super(error);
    }
}
public class Main
{
    public static void main(String args[])
    {
        int a=8;
        int[] b=new int[5];
        for(int i=0;i<5;i++)
        {
            b[i]=i+1;
        }
        int var1=100;
    }
}

//1
try
{
    var1=var1/0;
}
catch (ArithmeticException e)
{
    System.out.println(e);
}
//2
try
{
    if(a==8){
        throw new ArithmeticException ("Value is 8");
    }
}
catch (ArithmeticException e)
{
    System.out.println(e);
}
//3
try
{
    b[6]=8;
}
catch (IndexOutOfBoundsException e)
{
    System.out.println(e);
}
//4
try
{
    float c=new exp().div(1,2);
    System.out.println(c);
    float d=new exp().div(1,0);
}
catch (ArithmeticException e)
{
    System.out.println(e);
}
//5
try
{
    float p=0.8f;
    if (p>0.7){
        throw new ProbWaterSpill("Probability too high");
    }
}
catch (ProbWaterSpill e)
{
    System.out.println(e);
}
