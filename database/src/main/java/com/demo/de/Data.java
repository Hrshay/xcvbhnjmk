package com.demo.de;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;



public class Data {
    public static void main(String[] args) throws IOException{
    	File f1=new File("Harshad.txt");
        if(f1.exists()) {
        	FileWriter f2=new FileWriter(f1);
        	f2.write("Section A 10 marks\r\n");
        	f2.close();
        	System.out.println("File is there");
        }else {
        	System.out.println("We are creating file");
        	f1.createNewFile();
        	System.out.println("File created");
        }
    }
}
