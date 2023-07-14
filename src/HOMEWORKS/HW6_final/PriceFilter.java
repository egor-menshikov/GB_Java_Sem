package HOMEWORKS.HW6_final;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PriceFilter {
    private HashSet<Laptop> set;
    private HashMap<String, Object> params;

    public PriceFilter(HashSet<Laptop> set) {
        this(new HashMap<>());
        this.set = set;
    }

    private PriceFilter(HashMap<String, Object> params) {
        this.params = params;
    }

    public void receiveParams() {
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
                case 1 -> filter();
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
                    else params.put("color", Laptop.Color.BLUE);
                }
                case 7 -> System.out.println(Text.menuExit);
            }
        }

    }

    private void filter() {
    }

}

