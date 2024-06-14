// interface I1
// {
//     void show();
// }
// class Test implements I1
// {
//     public void show()
//     {
//         System.out.println("Hello");
//     }
//     public static void main(String[] args)
//     {
//         Test t = new Test();
//         t.show();
//     }
// }

/* In case of multiple inheritance */


interface I1
{
    void show();
}
interface I2
{
    void display();
}
class Test implements I1, I2
{
    public void show()
    {
        System.out.println("Hello");
    }
    public void display()
    {
        System.out.println("World");
    }
    public static void main(String[] args)
    {
        Test t = new Test();
        t.show();
        t.display();
    }
}
