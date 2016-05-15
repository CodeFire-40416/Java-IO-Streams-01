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
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        File project_dir = new File("./").getCanonicalFile();

//        System.out.println(project_dir.getName());

//        File[] listFiles = project_dir.listFiles();
//
//        if (listFiles != null) {
//            for (File file : listFiles) {
//                if (file.isDirectory()) {
//                    System.out.println(" + " + file.getName());
//                } else { // file.isFile()
//                    System.out.printf("   %s (%012db)\n", file.getName(), file.length());
//                }
//            }
//        }

        listAllFiles(project_dir, 0);

    }

    private static void listAllFiles(File parent, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }

        if (parent.isDirectory()) {
            File[] listFiles = parent.listFiles();
            if (listFiles != null) {
                System.out.println(" - " + parent.getName());
                for (File subFile : listFiles) {
                    listAllFiles(subFile, level + 1);
                }
            }
        } else {
            System.out.println("   " + parent.getName());
        }

    }

}
