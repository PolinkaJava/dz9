class Dog extends Animal {
    private static Dog dogInstance;

    private Dog() {
    }

    public static Dog dogBorn() {
        if (dogInstance == null) {
            dogInstance = new Dog();
        }
        return dogInstance;
    }

    void voice() {
        System.out.println("Dog says rrrr");
    }

    void eat(String food) {
        System.out.println("Dog eats: " + food);
    }
}


