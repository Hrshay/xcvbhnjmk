package com.demo.de;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Test {
	public static void main(String[] args) throws IOException{
	    File f1=new File("Harsh.txt");
	    FileReader f2=new FileReader(f1);
	    String str1;
	    int str=f2.read();
	    //char[] c=str;
	    for(int i=0; i<str; i++) {
	    	System.out.println((char) i);
	    }
	}
}
