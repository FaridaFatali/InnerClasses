package innerClasses.anonymous.doer;

public class AnonymousDoerClassTest {
    public static void main(String[] args) {
        AnonymousDoerClassTest test = new AnonymousDoerClassTest();

        test.callAnonymousDoerClass1();
        callAnonymousDoerClass2();

        test.aMethod(new DoerClass());

        test.aMethod(new DoerInterface() {
            @Override
            public void doIt() {
                System.out.println("I have to do it.");
            }

            @Override
            public void doThat() {
                System.out.println("I have to do that.");
            }
        });
    }

    public void callAnonymousDoerClass1() {
        DoerInterface doerObject = new DoerInterface() {
            @Override
            public void doIt() {
                System.out.println("I'll always do it.");
            }

            @Override
            public void doThat() {
                System.out.println("I'll always do that");
            }
        };
        doerObject.doIt();
        doerObject.doThat();
    }

    public static void callAnonymousDoerClass2() {
        (new DoerInterface() {

            {
                System.out.println("\nIn DoerInterface() initializer.");
            }

            @Override
            public void doIt() {
                System.out.println("I'm gonna always do it.");
            }

            @Override
            public void doThat() {
                System.out.println("I'm gonna always do that.");
            }
        }).doIt();
    }

    public void aMethod(DoerInterface doerInterface) {
        System.out.println("\nIn aMethod().");
        doerInterface.doIt();
        doerInterface.doThat();
    }
}
