class Animal
{
    public void eat()
    {
        System.out.println("Animal is eating");
    }
    public static void main(String[] args) 
    {
        System.out.println("1");
        Animal jack = new Animal();
        jack.eat();
        jack.sleep();
    }
    public void sleep()
    {
        System.out.println("Animal is sleeping");
    }
}