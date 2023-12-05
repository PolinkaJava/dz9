class Tiger extends Animal {
    void voice() {
        System.out.println("Tiger says rararara");
    }

    void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Tiger loves eating " + food);
        } else {
            System.out.println("Tiger dislikes " + food);
        }
    }
}
