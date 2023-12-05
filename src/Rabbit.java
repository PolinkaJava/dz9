class Rabbit extends Animal {
    void voice() {
        System.out.println("Rabbit says hphphp");
    }

    void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Rabbit loves eating " + food);
        } else {
            System.out.println("Rabbit dislikes " + food);
        }
    }
}