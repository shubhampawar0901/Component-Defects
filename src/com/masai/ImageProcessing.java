package com.masai;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ImageProcessing {
	
	static byte[] fileContent1=null;
	static byte[] fileContent2=null;
	
	public static void main(String[] args) throws IOException {
	        Thread t1 = new Thread(new Runnable() {
	            public void run(){
	            	File fiA2 = new File("D:\\components\\Component A.2.jpg");
	            	try {
						fileContent1 = Files.readAllBytes(fiA2.toPath());
						for(byte b:fileContent1) {
							System.out.println(b+" "+Thread.currentThread());
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            	
	            }
	        });

	        Thread t2 = new Thread(new Runnable() {
	            public void run(){
	            	File fiA3 = new File("D:\\components\\Component A.3.jpg");
	            	try {
						fileContent2 = Files.readAllBytes(fiA3.toPath());
						
						for(byte b:fileContent2) {
							System.out.println(b+" "+Thread.currentThread());
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
	            }
	        });
	  
	        t1.start();
	  
	        t2.start();

	}

}
