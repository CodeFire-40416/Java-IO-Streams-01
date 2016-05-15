/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeventsmodel;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console console = new Console(System.in);

        console.addExitListener(new ExitListener() {
            @Override
            public void exitAction() {
                System.out.println("SEE YOU LATER");
            }
        });
        
        console.addExitListener(new ExitListener() {
            @Override
            public void exitAction() {
                System.out.println("GOOD BYE!");
            }
        });

        console.addExitListener(new ExitListener() {
            @Override
            public void exitAction() {
                System.exit(0);
            }
        });
        console.working();
    }

}
