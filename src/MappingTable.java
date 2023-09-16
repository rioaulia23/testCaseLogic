import models.ModelName;

import java.util.ArrayList;
import java.util.Scanner;


public class MappingTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();
        System.out.println(input);
        System.out.println("\nOutput:");


        initialData();
        find(input);


    }

    public static void initialData() {
        data.add(new ModelName("A001", "Wati", ""));
        data.add(new ModelName("A002", "Wira", "A001"));
        data.add(new ModelName("A003", "Andi", "A002"));
        data.add(new ModelName("A004", "Bagus", "A002"));
        data.add(new ModelName("A005", "Siti", "A001"));
        data.add(new ModelName("A006", "Hasan", "A005"));
        data.add(new ModelName("A007", "Abdul", "A006"));
    }

    private static void find(String input) {
        for (ModelName datake : data) {
            if (datake.getParent().equalsIgnoreCase(input)) {
                System.out.println(datake.getName());
                find(datake.getCode());
            }
        }
    }

    private static final ArrayList<ModelName> data = new ArrayList<>();


}