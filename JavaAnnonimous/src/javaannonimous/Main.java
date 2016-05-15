/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaannonimous;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Action action1 = new Action() {

            public int h;

            @Override
            public void show() {
                System.out.println("Wiiiii!");
            }
        };

        action1.show();

        System.out.println(action1);

        action1 = new Action() {

            public int h;

            @Override
            public void show() {
                System.out.println("Wiiiii!");
            }
        };

        System.out.println(action1);
    }

}
