package polymorphism;
public class Test {
    public static void soundMaker(Animal k) {
        k.makeSound();
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        soundMaker(d);
        Cat c = new Cat();
        soundMaker(c);
        Cow co = new Cow();
        soundMaker(co);
        //------my
        soundMaker(c);
        Animal e = new Dog();
        Rab r = new Rab();
        soundMaker(r);
    }
}
