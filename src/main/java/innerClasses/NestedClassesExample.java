package innerClasses;

/**
 * @author Farida Fatali
 * Practice about Inner/Nested classes for my Udemy lesson: Object-Oriented and Functional Programming in Java
 */

public class NestedClassesExample {
    public static void main(String[] args) {
        TopClass.doThat(5);

        TopClass tc = new TopClass();
        tc.doIt(10);

        TopClass.InnerClass o1 = tc.getIc();
        o1.show();

        TopClass.StaticInnerClass o2 = TopClass.getSic();
        o2.show();
    }
}

class TopClass {
    private int i = 5;
    private static int j = 8;

    private InnerClass ic = new InnerClass(19);
    private static StaticInnerClass sic = new StaticInnerClass();

    static class StaticInnerClass {
        public StaticInnerClass() {
            System.out.println("\nIn StaticInnerClass() and j: " + j);
        }

        public void show() {
            System.out.println("In show() of StaticInnerClass.");
        }
    }

    class InnerClass {
        private int l;

        public InnerClass(int l) {
            this.l = l;
            System.out.println("\nIn InnerClass() and i: " + i + ", l: " + l + " and j: " + j);
        }

        public void show() {
            System.out.println("In show() of InnerClass.");
        }
    }

    public TopClass() {
        System.out.println("In TopClass().");
    }

    public InnerClass getIc() {
        return ic;
    }

    public static StaticInnerClass getSic() {
        return sic;
    }

    public void doIt(int k) {
        // k++;

        class LocalClass1 {
            public LocalClass1() {
                System.out.println("\nIn LocalClass1().");
            }

            public void doLocal() {
                System.out.println("In doLocal() and j: " + j + " and i: " + i + " and k: " + k);
            }
        }

        LocalClass1 o = new LocalClass1();
        o.doLocal();

        int m = 10;
        // m++;

        new MyInterface() {

            {
                System.out.println("\nAn instance initializer instead of a constructor.");
            }

            @Override
            public void aMethod() {
                System.out.println("aMethod() in an anonymous class in doIt() and i: " + i + ", j: " + j + " and m: " + m);
            }
        }.aMethod();
    }

    public static void doThat(int k) {
        class LocalClass2 {
            public LocalClass2() {
                System.out.println("\nIn LocalClass2().");
            }

            public void doLocal() {
                System.out.println("In doLocal() and j: " + j + " and k: " + k);
            }
        }

        LocalClass2 o = new LocalClass2();
        o.doLocal();
    }
}

interface MyInterface {
    void aMethod();
}