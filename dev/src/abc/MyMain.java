package abc;
import student.*;
class Test1 implements Students
{
    public void RollNo()    {
        System.out.println("18CS35");
    }
    public void course()    {
        System.out.println("OOP");
    }
    public void marks()    {
        System.out.println("85");
    }
}
class MyMain
{
    public static void main(String[] args)
    {
        Test1 t = new Test1();
        t.RollNo();
        t.course();
        t.marks();
    }
}