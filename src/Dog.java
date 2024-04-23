public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The dog says woof woof");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
