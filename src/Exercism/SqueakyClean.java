package Exercism;

public class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < identifier.length(); i++) {
            if (identifier.charAt(i) == ' ')
                s.append('_');
            else if (identifier.charAt(i) == '-') {
                i++;
                s.append(Character.toUpperCase(identifier.charAt(i)));
            } else if (Character.isDigit(identifier.charAt(i))) {
                if (identifier.charAt(i) == '4')
                    s.append('a');
                else if (identifier.charAt(i) == '3')
                    s.append('e');
                else if (identifier.charAt(i) == '1')
                    s.append('l');
                else if (identifier.charAt(i) == '0')
                    s.append('o');
                else
                    s.append('t');
            } else if (Character.isLetter(identifier.charAt(i))) {
                s.append(identifier.charAt(i));
            }

        }

        return s.toString();
    }
}
