/* Method Overloading */

// class Test
// {
//     void show()
//     {
//         System.out.println("No arguments");
//     }
//     void show(int a)
//     {
//         System.out.println("One argument: " + a);
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show(10);
//     }
// }


/* varaargs */


// class Test
// {
//     void show(int a)
//     {
//         System.out.println("int method");
//     }
//     void show(int... a)
//     {
//         System.out.println("var-args method");
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show(10);
//         t.show(10, 20, 30, 40, 50);
//     }
// }

/* String Buffer */


class Test
{
    void show(StringBuffer a)
    {
        System.out.println("StringBuffer method");
    }
    void show(String a)
    {
        System.out.println("String method");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.show("Hello");
        t.show(new StringBuffer("Hello"));
    }
}