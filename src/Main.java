public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        Dog dog = Dog.dogBorn();

        dog.eat("Dog food");
        dog.voice();

        tiger.eat("Meat");
        tiger.voice();

        rabbit.eat("Grass");
        rabbit.voice();
    }
}