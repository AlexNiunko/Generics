public class Gen3<T extends Animal> {
    public void outNameAndColour(T o){
        System.out.println("Animal's class "+ o.getClass());
        System.out.println("Animal's name "+o.name);
        System.out.println("Animal's colour "+o.colour);
        System.out.println();
    }
    Cat cat=new Cat("Murka","grey");
    Dog dog=new Dog("Bobik","red");
    Snake snake=new Snake("Kaa","silver");

    public static void main(String[] args) {
        Gen3<Animal>animalGen3=new Gen3<>();
        animalGen3.outNameAndColour(animalGen3.cat);
        animalGen3.outNameAndColour(animalGen3.dog);
        animalGen3.outNameAndColour(animalGen3.snake);
    }
}
