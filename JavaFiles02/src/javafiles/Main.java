/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        File project_dir = new File("./").getCanonicalFile();

        System.out.println(project_dir.getName());

//        String[] list = project_dir.list();
//
//        if (list != null) {
//            for (String file_name : list) {
//                System.out.println(" " + file_name);
//            }
//        }

        File[] listFiles = project_dir.listFiles();
        
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    System.out.println(" + " + file.getName());
                } else { // file.isFile()
                    System.out.printf("   %s (%012db)\n", file.getName(), file.length());
                }
            }
        }

    }

}
