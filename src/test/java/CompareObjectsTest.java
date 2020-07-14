public class CompareObjectsTest {
    public static void testCompareObjects() {
        testObjects();
    }

    private static void testObjects() {
        System.out.println("Method Validation Class CompareObjects");
        System.out.println("Method Validation compare");

        boolean res = CompareObjects.compare("anyThing1", "anyThing2");
        if(res == false) System.out.println("Test successful");
        else System.out.println("Test failed");
        res = CompareObjects.compare(1, 2);
        if(res == false) System.out.println("Test successful");
        else System.out.println("Test failed");
        res = CompareObjects.compare(6.00, 6.00);
        if(res == true) System.out.println("Test successful");
        else System.out.println("Test failed");

        System.out.println("Method Validation Class compareToString");

        res = CompareObjects.compareToString(89898.22, 89892.22);
        if(res == false) System.out.println("Test successful");
        else System.out.println("Test failed");
        res = CompareObjects.compareToString(420000, 420000);
        if(res == true) System.out.println("Test successful");
        else System.out.println("Test failed");
        res = CompareObjects.compareToString(1, "1");
        if(res == true) System.out.println("Test successful");
        else System.out.println("Test failed");

        System.out.println("Method Validation Class compareHashCode");
        Object ob = 0;
        Object ob1 = new int[]{1, 2, 3};
        Object ob2 =  new int[]{1, 2, 3};
        res = CompareObjects.compareHashCode(ob1, ob2);
        if(res == false) System.out.println("Test successful");
        else System.out.println("Test failed");
        res = CompareObjects.compareHashCode(ob, ob);
        if(res == true) System.out.println("Test successful");
        else System.out.println("Test failed");

    }


}
