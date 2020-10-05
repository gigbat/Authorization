import java.util.Arrays;
import java.util.List;

public class Auth implements Tasks {
    List<String> word;
    String result;

    public Auth(List<String> word) {
        this.word = word;
    }

    public static void main(String[] args) {
        Auth auth = new Auth(Arrays.asList("worship", "outreach", "luck"));
        auth.printGeneralTask();
        System.out.println("Your real password: " + auth.result);

        System.out.println("==============================================================");
        System.out.println("Method for check bellow.");

        String password = PasswordField.readPassword("Enter password: ");
        System.out.println("The password is: " + password);

        auth.checkPassword(password);
    }

    public String test1() {
        String letters = this.word.get(1);
        char[] letterList = new char[2];
        String result = "";

        for (int i = 0; i < 2; i++) {
            char c = letters.charAt(i);
            int up = c + 1;
            letterList[i] = (char) up;
        }

        for (int i = 0; i < letterList.length; i++) {
            result += letterList[i];
        }

        // System.out.print("Input: " + letters + "\n");
        return result;
    }

    public char test2() {
        String letters = this.word.get(1);
        char letter;

        if (letters.length() % 2 == 0) {
            letter = letters.charAt(letters.length() / 2 - 1);
        } else {
            letter = letters.charAt(letters.length() / 2);
        }

        // System.out.print("Input: " + letters + "\n");
        return letter;
    }

    public char test3() {
        String letters = this.word.get(2);
        char letter;
        int down;

        if (letters.length() % 2 == 0) {
            letter = test3_1();
        } else {
            letter = letters.charAt(letters.length() / 2);
            down = (int) letter - 1;
            letter = (char) down;
        }

        // System.out.print("Input: " + letters + "\n");
        return letter;
    }

    public char test3_1() {
        String letters = this.word.get(2);
        char letter;

        letter = letters.charAt(letters.length() / 2 - 1);
        int down = letter + 1;
        letter = (char) down;

        return letter;
    }

    public char test4() {
        String lettersOfWord = "";
        int result = 0;

        for (int i = 0; i < 2; i++) {
            lettersOfWord += this.word.get(i);
        }

        int iteration = lettersOfWord.length();
        if (iteration > 26) {
            while (iteration > 26) {
                result = iteration % 26;
                iteration %= 26;
            }
        } else {
            result = lettersOfWord.length() - 4;
        }

        char letter = lettersOfWord.charAt(result);

        // System.out.print("Input: " + lettersOfWord + "\n");
        return letter;
    }

    public void printTask() {
        /*System.out.println("---TASK1---");
        System.out.println(auth.test1());
        System.out.println("==========================================================");
        System.out.println("---TASK2---");
        System.out.println(auth.test2());
        System.out.println("==========================================================");
        System.out.println("---TASK3---");
        System.out.println(auth.test3());
        System.out.println("==========================================================");
        System.out.println("---TASK4---");
        System.out.println(auth.test4());
        System.out.println("==========================================================");
        System.out.println("---TASK5---");
        System.out.println(auth.test5());*/
    }

    public String printGeneralTask() {
        System.out.println("==========================================================");
        System.out.println("---OUTPUT OF 5 TASKS---");
        result = test1() + test2() + test3() + test4();

        return result;
    }

    public boolean checkPassword(String data) {
        if (this.result.equals(data)) {
            System.out.println("Password is correct!");
            return true;
        } else {
            System.out.println("Password isn't correct!");
            return false;
        }
    }
}
