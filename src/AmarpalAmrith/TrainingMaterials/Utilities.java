package AmarpalAmrith.TrainingMaterials;

import java.util.Scanner;

public class Utilities {

    public static void separatedMsg(String msg) {
        System.out.println(msg);
        String correctedMsg = "";
        if (msg.contains("\n")) {
            String[] splitStr = msg.split("\\r?\\n");
            correctedMsg = splitStr[splitStr.length - 1];
        } else {
            correctedMsg = msg;
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < correctedMsg.length(); i++) {
            s.append("=");
        }
        System.out.println(s.toString());
    }

    public static int requestInt(String msg) {
        while (true) {
            String requestNumber = requestString(msg);
            try {
                return Integer.valueOf(requestNumber);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            }
        }
    }

    public static String requestString(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        System.out.print(">");
        return scanner.nextLine();
    }
}