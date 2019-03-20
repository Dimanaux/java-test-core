package main;

import java.util.Scanner;
import java.io.IOException;

public class Service {
    public static void main(String[] args) throws IOException {
        Service service = new Service();
        System.out.println(service.runTests());
    }

    public String runTests() throws IOException {
        Process process = Runtime.getRuntime().exec("run-tests-win.bat");
        Scanner scanner = new Scanner(process.getInputStream()).useDelimiter("\\A");
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine() + "\n");
        }

        return builder.toString();
    }
}
