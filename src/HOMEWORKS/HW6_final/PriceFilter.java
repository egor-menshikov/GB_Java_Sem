package HOMEWORKS.HW6_final;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PriceFilter {
    private HashSet<Laptop> set;
    private final HashMap<String, Object> params;

    public PriceFilter(HashSet<Laptop> set) {
        this(new HashMap<>());
        this.set = set;
    }

    private PriceFilter(HashMap<String, Object> params) {
        this.params = params;
    }

    public void filter() {
        Scanner sc = new Scanner(System.in);
        int selection = -1;
        while (selection != 7) {
            System.out.println(Text.menuPrompt);
            System.out.println(Text.menu);
            selection = sc.nextInt();
            while (selection < 1 || selection > 7) {
                System.out.println(Text.menuWrongInput);
                System.out.println(Text.menu);
                selection = sc.nextInt();
            }
            switch (selection) {
                case 1 -> applyParams();
                case 2 -> {
                    System.out.println(Text.menuRam);
                    params.put("ram", sc.nextInt());
                }
                case 3 -> {
                    System.out.println(Text.menuSSD);
                    params.put("ssd", sc.nextInt());
                }
                case 4 -> {
                    System.out.println(Text.menuScreenDiag);
                    params.put("screen", sc.nextInt());
                }
                case 5 -> {
                    System.out.println(Text.menuPrice);
                    params.put("price", sc.nextInt());
                }
                case 6 -> {
                    System.out.println(Text.menuColor);
                    int chosenColorNumeric = sc.nextInt();
                    if (chosenColorNumeric == 1) params.put("color", Laptop.Color.SILVER);
                    else if (chosenColorNumeric == 2) params.put("color", Laptop.Color.BLACK);
                    else if (chosenColorNumeric == 3) params.put("color", Laptop.Color.GREY);
                    else params.put("color", Laptop.Color.BLUE);
                }
                case 7 -> System.out.println(Text.menuExit);
            }
        }
    }

    private void applyParams() {
        for (Laptop item :
                set) {
            if ((params.get("ram") == null || (int) params.get("ram") <= item.getRam()) &&
                    (params.get("ssd") == null || (int) params.get("ssd") <= item.getSsd()) &&
                    (params.get("screen") == null || (int) params.get("screen") <= item.getScreen()) &&
                    (params.get("price") == null || (int) params.get("price") >= item.getPrice()) &&
                    (params.get("color") == null || item.getColor().equals(params.get("color"))))
                System.out.println(item);
        }
    }

}

