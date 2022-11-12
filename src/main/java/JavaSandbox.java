import com.andrew.javasandbox.Dog;

import java.util.Optional;

public class JavaSandbox {

    public static void main(String[] args) {
        Dog oldDog1 = Dog.oldDog();
        Dog oldDog2 = Dog.oldDog();
        Dog oldDog3 = new Dog("grandpaDog", 99);

        if (oldDog1 == oldDog2) {
            System.out.println("1 == 2");
        }

        if (oldDog1.equals(oldDog2)) {
            System.out.println("1 eq 2");
        }

        if (oldDog1 == oldDog3) {
            System.out.println("1 == 3");
        }

        if (oldDog1.equals(oldDog3)) {
            System.out.println("1 eq 3");
        }

        if (new Dog() == new Dog()) {
            System.out.println("no1");
        }

        if (new Dog().equals( new Dog())) {
            System.out.println("no2");
        }

        oldDog2.happyDogBirthday();

        if (oldDog1 == oldDog2) {
            System.out.println("1 == 2");
        }

        if (oldDog1.equals(oldDog2)) {
            System.out.println("1 eq 2");
        }

        oldDog1.typedBark(1);
        return;
    }
}
