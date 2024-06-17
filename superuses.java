/* Super keyword is used to refer immediate parent class instance variable. */

// class A
// {
//     int a= 10;
// }
// class B extends A
// {
//     int a = 20;
//     void show(int a)
//     {
//         System.out.println(a);
//         System.out.println(this.a);
//         System.out.println(super.a);
//     }
//     public static void main(String[] args) {
//         B b = new B();
//         b.show(30);
//     }
// }


/* Super keyword can be used to invoke immediate parent class method */

// class A
// {
//     void m1()
//     {
//         System.out.println("m1 method");
//     }
// }
// class B extends A
// {
    
//     void show()
//     {
//         super.m1();
//     }
//     public static void main(String[] args) {
//         B b = new B();
//         b.show();
//     }
// }


/* super() can be used to invoke immediate parent class constructor */


class A
{
    A()
    {
        System.out.println("A class constructor");
    }
}
class B extends A
{
    
    B()
    {
        super(); // if we will not use super() then compile automatically add super()
        System.out.println("B class constructor");
    }
    public static void main(String[] args) {
        B b = new B();
    }
}