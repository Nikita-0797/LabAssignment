package com.abc.filehandle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21 {
	 public static void main(String[] arg)throws IOException
	 {
	 Exercise2 fd=new Exercise2();
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter the file name:");
	 String s=br.readLine();
	 fd.analyze(s);
	 }
}
