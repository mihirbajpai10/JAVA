/* Using this Keyword */
 class Test
 {
    int a;
    void setValue(int a)
    {
        this.a = a;
    }
    void display()
    {
        System.out.println(a);
    }
 }
 class Marks
 {
    public static void main(String[] args)
    {
        Test t = new Test();
        t.setValue(10);
        t.display();
    }
 }