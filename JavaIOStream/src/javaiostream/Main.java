/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("file.txt", true);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            
            if ("end".equals(line)) {
                break;
            }
            
            byte[] bytes = line.getBytes();
            fos.write(bytes);
//            fos.write("\n".getBytes());
            fos.write('\n'); // write (int)
        }
        
        fos.close();
    }

}
