/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeventsmodel;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author human
 */
public class Console {

    private Scanner scanner;
    private List<ExitListener> exitListeners;

    public Console(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
        this.exitListeners = new ArrayList<>();
    }

    public void addExitListener(ExitListener exitListener) {
        exitListeners.add(exitListener);
    }

    public void working() {
        while (true) {
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "exit":
                    for (ExitListener exitListener : exitListeners) {
                        exitListener.exitAction();
                    }
                    break;
            }
        }
    }

}
