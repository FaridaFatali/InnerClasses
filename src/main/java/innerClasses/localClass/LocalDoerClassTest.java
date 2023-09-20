package innerClasses.localClass;

import innerClasses.anonymous.doer.DoerInterface;

// There are two different classes using one name "LocalDoerClass"

public class LocalDoerClassTest {
    private int i = 2;
    private static int k = 5;

    public static void main(String[] args) {

        class LocalDoerClass implements DoerInterface {
            @Override
            public void doIt() {
                System.out.println("k: " + k);
                System.out.println("I always do it.");
            }

            @Override
            public void doThat() {
                System.out.println("k: " + k);
                System.out.println("I always do that\n");
            }
        }

        System.out.println("main() method's LocalDoerClass results:");
        LocalDoerClass object1 = new LocalDoerClass();
        object1.doIt();

        LocalDoerClass object2 = new LocalDoerClass();
        object2.doThat();

        System.out.println("aMethod() method's LocalDoerClass results:");
        LocalDoerClassTest test = new LocalDoerClassTest();
        test.aMethod();
    }

    public void aMethod() {
        class LocalDoerClass implements DoerInterface {
            @Override
            public void doIt() {
                System.out.println("i: " + i);
                System.out.println("I always do it.");
            }

            @Override
            public void doThat() {
                System.out.println("i: " + i);
                System.out.println("I always do that");
            }
        }

        LocalDoerClass object1 = new LocalDoerClass();
        object1.doIt();

        LocalDoerClass object2 = new LocalDoerClass();
        object2.doThat();
    }
}
