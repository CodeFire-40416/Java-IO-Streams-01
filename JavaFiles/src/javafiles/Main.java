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
        
        File file = new File("file.txt");
        
        System.out.println(file.exists());
        
        if (!file.exists()) {
            file.createNewFile();
        }
        
        File project_dir = new File("./");
        
        System.out.println(project_dir.exists());
        
        System.out.println("Paths:");
        System.out.println(project_dir.getPath());
        System.out.println(project_dir.getAbsoluteFile().getPath());
        System.out.println(project_dir.getCanonicalFile().getPath());
        
        System.out.println("Names:");
        System.out.println(project_dir.getName());
        System.out.println(project_dir.getAbsoluteFile().getName());
        System.out.println(project_dir.getCanonicalFile().getName());
        
    }
    
}
