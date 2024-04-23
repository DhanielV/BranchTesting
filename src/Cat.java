public class Cat extends  Animal {

    @Override
    public void makeSound() {
        System.out.println("The cat says meow meow");


    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

}