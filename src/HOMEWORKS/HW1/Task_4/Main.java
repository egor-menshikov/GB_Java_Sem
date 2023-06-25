package HOMEWORKS.HW1.Task_4;


public class Main {
    public static void main(String[] args) {
//        String equation = "2? + 1?5 = 168";
        String equation = "14?9 + 1?64 = 2833";
        String A = "14?9";
        String B = "1?64";
        StringBuilder C = new StringBuilder("2833");
        C.setCharAt(1, '+');
        System.out.println(C);
    }

    public static StringBuilder eq_calc(StringBuilder a, StringBuilder b, StringBuilder c, int pos, int digit) {
        int sum = Integer.parseInt(String.valueOf(a)) + Integer.parseInt(String.valueOf(b));

        if (a.length() < pos && b.length() < pos && sum == Integer.parseInt(String.valueOf(c))) {
            return new StringBuilder(a + " + " + b + " = " + c);
        } else if (a.length() < pos && b.length() < pos && sum != Integer.parseInt(String.valueOf(c))) {
            return new StringBuilder("Уравнение невозможно решить");
        } else {
            if (a.length() >= pos && b.length() >= pos) {
                char char_a = a.charAt(a.length() - pos);
                char char_b = b.charAt(b.length() - pos);

                if (Character.isDigit(char_a) && Character.isDigit(char_b)) {
                    if (Character.getNumericValue(c.charAt(c.length() - pos)) >=
                            Character.getNumericValue(char_a) + Character.getNumericValue(char_b)) {
                        return eq_calc(a, b, c, pos + 1, 0);
                    }
                    else return eq_calc(a, b, c, pos + 1, 1);
                }
                else if (Character.isDigit(char_a) && !Character.isDigit(char_b)) {
                    if (Character.getNumericValue(c.charAt(c.length() - pos)) >= char_a) {
                        char_b = Character.forDigit(Character.getNumericValue(c.charAt(c.length() - pos)) -
                                Character.getNumericValue(char_a) - digit, 10);
                        b.setCharAt(b.length() - pos, char_b);
                        return eq_calc(a, b, c, pos + 1, 0);
                    }
                    else {
                        char_b = Character.forDigit(Character.getNumericValue(c.charAt(c.length() - pos)) -
                                Character.getNumericValue(char_a) - digit + 10, 10);
                        return eq_calc(a, b, c, pos + 1, 1);
                    }
                }
                else if
            }
        }
    }
}

