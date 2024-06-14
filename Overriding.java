// class Test
// {
//     void show()
//     {
//         System.out.println("No arguments");
//     }
// }
// class Marks extends Test
// {
//     void show()
//     {
//         System.out.println("One argument: " + 10);
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         Marks m = new Marks();
//         t.show();
//         m.show();
//     }
// }


/* Invorking overridden method from sub-class*/


class Test
{
    
    void show()
    {
        System.out.println("No arguments");
    }
}
class Marks extends Test
{
    void show()
    {
        super.show();
        System.out.println("One argument: " + 10);
    }
    public static void main(String[] args) {
        
        Marks m = new Marks();
        
        m.show();
    }
}