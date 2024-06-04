class Animal
{
    String color;
    int age;
    void initObj(String c, int a)
    {
        color = c;
        age = a;
    }
    void display()
    {
        System.out.println(color+" "+age);
    }
    public static void main(String[] args)
    {
        Animal jack = new Animal();
        jack.initObj("black", 5);
        jack.display();
    }
}