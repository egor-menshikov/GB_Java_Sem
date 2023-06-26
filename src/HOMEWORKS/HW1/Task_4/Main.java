package HOMEWORKS.HW1.Task_4;


public class Main {
    public static void main(String[] args) {
//        1968 549 2517
        StringBuilder A = new StringBuilder("1?68");
        StringBuilder B = new StringBuilder("5?9");
        StringBuilder C = new StringBuilder("2517");

//        StringBuilder A = new StringBuilder("2?");
//        StringBuilder B = new StringBuilder("?5");
//        StringBuilder C = new StringBuilder("69");
        System.out.println(eq_calc(A, B, C, 1, 0, false));
    }


    public static StringBuilder eq_calc(StringBuilder a, StringBuilder b, StringBuilder c, int pos, int digit, boolean flag) {

        if (a.length() < pos && b.length() < pos) {
            int sum = Integer.parseInt(String.valueOf(a)) + Integer.parseInt(String.valueOf(b));

            if (sum == Integer.parseInt(String.valueOf(c))) {
                return new StringBuilder(a + " + " + b + " = " + c);
            }

            else if (!flag) {
                return eq_calc(a, b, c, 1, 1, true);
        }
            else {
                return new StringBuilder("Уравнение невозможно решить.");
            }
        }

        else {
            if (a.length() >= pos && b.length() >= pos) {
                char char_a = a.charAt(a.length() - pos);
                char char_b = b.charAt(b.length() - pos);
                char char_c = c.charAt(c.length() - pos);

                if (Character.isDigit(char_a) && Character.isDigit(char_b)) {
                    if (Character.getNumericValue(char_c) >=
                            Character.getNumericValue(char_a) + Character.getNumericValue(char_b)) {
                        if (flag) return eq_calc(a, b, c, pos + 1, 0, true);
                        else return eq_calc(a, b, c, pos + 1, 0, false);
                    }
                    else {
                        if (flag) return eq_calc(a, b, c, pos + 1, 1, true);
                        else return eq_calc(a, b, c, pos + 1, 1, false);
                    }
                }
                else if (Character.isDigit(char_a) && !Character.isDigit(char_b)) {
                    if (Character.getNumericValue(char_c) >= Character.getNumericValue(char_a)) {
                        char_b = diff(char_c, char_a, digit);
                        b.setCharAt(b.length() - pos, char_b);
                        if (flag) return eq_calc(a, b, c, pos + 1, 0, true);
                        else return eq_calc(a, b, c, pos + 1, 0, false);
                    }
                    else {
                        char_b = diff(char_c, char_a, digit);
                        b.setCharAt(b.length() - pos, char_b);
                        if (flag) return eq_calc(a, b, c, pos + 1, 1, true);
                        else return eq_calc(a, b, c, pos + 1, 1, false);
                    }
                }
                else if (!Character.isDigit(char_a) && Character.isDigit(char_b)) {
                    if (Character.getNumericValue(char_c) >= Character.getNumericValue(char_b)) {
                        char_a = diff(char_c, char_b, digit);
                        a.setCharAt(a.length() - pos, char_a);
                        if (flag) return eq_calc(a, b, c, pos + 1, 0, true);
                        else return eq_calc(a, b, c, pos + 1, 0, false);
                    }
                    else {
                        char_a = diff(char_c, char_b, digit);
                        a.setCharAt(a.length() - pos, char_a);
                        if (flag) return eq_calc(a, b, c, pos + 1, 1, true);
                        else return eq_calc(a, b, c, pos + 1, 1, false);
                    }
                }
                else {
                    if (!flag) {
                        char_a = Character.forDigit((Character.getNumericValue(char_c)/2), 10);
                        char_b = diff(char_c, char_a, digit);
                        a.setCharAt(a.length() - pos, char_a);
                        b.setCharAt(b.length() - pos, char_b);
                        return eq_calc(a, b, c, pos + 1, 0, false);
                    }
                    else {
                        char_a = Character.forDigit(((Character.getNumericValue(char_c) - 10)/2), 10);
                        char_b = diff(char_c, char_a, digit);
                        a.setCharAt(a.length() - pos, char_a);
                        b.setCharAt(b.length() - pos, char_b);
                        return eq_calc(a, b, c, pos + 1, 1, true);
                    }
                }
            }
            else if (a.length() >= pos && b.length() < pos) {
                char char_a = a.charAt(a.length() - pos);
                char char_c = c.charAt(c.length() - pos);

                if (!Character.isDigit(char_a)) {
                    char_a = Character.forDigit((Character.getNumericValue(char_c) + 10 - digit) % 10, 10);
                    a.setCharAt(a.length() - pos, char_a);
                }
                if (flag) return eq_calc(a, b, c, pos + 1, 0, true);
                    else return eq_calc(a, b, c, pos + 1, 0, false);
            }
            else {
                char char_b = b.charAt(b.length() - pos);
                char char_c = c.charAt(c.length() - pos);

                if (!Character.isDigit(char_b)) {
                    char_b = Character.forDigit((Character.getNumericValue(char_c) + 10 - digit), 10);
                    b.setCharAt(b.length() - pos, char_b);
                }
                if (flag) return eq_calc(a, b, c, pos + 1, 0, true);
                    else return eq_calc(a, b, c, pos + 1, 0, false);
            }
        }
    }

    public static char diff(char a, char b, int digit) {
        return Character.forDigit((Character.getNumericValue(a) - Character.getNumericValue(b)
                + 10 - digit) % 10, 10);
    }
}

