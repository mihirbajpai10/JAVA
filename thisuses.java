/*  this keyword is used to invoke current class instance variable. */

// class thisDemo
// {
//     int i;
//     void setValue(int i)
//     {
//         this.i=i;
//     }
//     void display()
//     {
//         System.out.println(i);
//     }
//     public static void main(String[] args)
//     {
//         thisDemo t1=new thisDemo();
//         t1.setValue(10);
//         t1.display();
//     }
// }


/* this keyword can be used to invoke current class method (implicitly). */


// class thisDemo
// {
//     int i;
//     void show()
//     {
//         System.out.println("Hello");
//     }
//     void display()
//     {
//         show();
//     }
//     public static void main(String[] args)
//     {
//         thisDemo t1=new thisDemo();
//         t1.show();
        
//     }
// }


/*   this() can be used to invoke current class constructor. */


// class thisDemo
// {
    
//     thisDemo()
//     {
//         this(10);
//         System.out.println("no arg constructor");
//     }
//     thisDemo(int a)
//     {   
//         // this();
//         System.out.println("parameterized constructor");
//     }
//     public static void main(String[] args)
//     {
//         thisDemo t1=new thisDemo();
        
//     }
// }


/* this keyword can be passed as an argument in the method call. */


// class thisDemo
// {
    
//     void f1(thisDemo t1)
//     {
//         System.out.println("I'm in f1 method");
//     }
//     void f2()
//     {
//         f1(this);
//     }
//     public static void main(String[] args)
//     {
//         thisDemo t1=new thisDemo();
//         t1.f2();
        
//     }
// }


/* this keyword can be passed as an argument in the constructor call. */

// class Test
// {
//     Test(thisDemo t)
//     {
//         System.out.println("I'm in constructor");
//     }
// }
// class thisDemo
// {
    
//     void f1()
//     {
//         Test t=new Test(this);
//     }
    
//     public static void main(String[] args)
//     {
//         thisDemo t1=new thisDemo();
//         t1.f1();
        
//     }
// }


/* this Keyword can be used to return the current class instance from the method. */

class thisDemo
{
    thisDemo f1()
    {
        return this;
    }
    public static void main(String[] agrs)
    {
        thisDemo t=new thisDemo();
        t.f1();
    }
}