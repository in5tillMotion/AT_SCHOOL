import java.util.HashMap;

public class MapTest {
    public static void testMap() {
        System.out.println("\nMethod Validation Class Map");
        testCount();
        testRemove();
    }

    private static void testCount() {
        System.out.println("Method Validation Class countElementsInMap");
        int res = Map.countElementsInMap("Ерохин", "Сергей");
        if (res == 3) System.out.println("Test successful. Expected Result 3");
        else System.out.println("Test failed. Expected Result 3 actual " + res);
        res = Map.countElementsInMap("Андреев ", "Андрей ");
        if (res == 2) System.out.println("Test successful. Expected Result 2");
        else System.out.println("Test failed. Expected Result 2 actual " + res);

    }

    private static void testRemove() {
        System.out.println("Method Validation Class deleteValueFromMap");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Дмитров", "Алексей");
        map.put("Ерохин", "Сергей ");
        map.put("Ярмолов", "Алексей");
        map.put("Карасев ", "Дмитрий");
        map.put(" Ерохин", "Сергей");
        map.put("Андреев ", "Андрей ");
        map.put("Смирнов", "Владимир");
        map.put("Ерохин ", "Сергей");
        map.put("Андреев", "Андрей");

        System.out.println("Ерохин ");
        System.out.println(Map.deleteValueFromMap(map, "Ерохин "));
        System.out.println("Владимир");
        System.out.println(Map.deleteValueFromMap(map, "Владимир"));
    }

}

