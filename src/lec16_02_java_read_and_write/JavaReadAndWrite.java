package lec16_02_java_read_and_write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaReadAndWrite {
	public static void main(String[] args) {
		// Creating a Folder (file explorer)
		// for Mac user -- go to the properties -- if the folder name is
		// December2023Batch --> /Users/YourName/Desktop/August2023Batch

		String folderPath = "C:\\Users\\Tofael\\Desktop\\December2023Batch";
		File folder = new File(folderPath);
		folder.mkdir(); // this method will create directory or folder -- interview question

		if (folder.exists()) {
			System.out.println(folder.getName() + " folder is created");
			
			// creating a file now
			String filePath = "C:\\Users\\Tofael\\Desktop\\December2023Batch\\December.txt";
			File file = new File(filePath);
			try {
				file.createNewFile(); // this method create the file
			} catch (IOException e) {
				System.out.println("The exception occured is >>>>> " + e);
				// e.printStackTrace();
			}

			if (file.exists()) {
				System.out.println(file.getName() + " file is created inside the folder");
				
				// learning here from today 37-82
				System.out.println("<-- Please write something about the students of December 2023 Batch -->");
				Scanner scanner = new Scanner(System.in);
				String userInput = scanner.nextLine();
				
				// how to write inside the file 43 - 51
				FileWriter fw = null;
				try {
					fw = new FileWriter(file);
					fw.write(userInput); // write () from FileWriter class-- > help to write in the file
					fw.close();
				} catch (IOException f) {
					System.out.println("Filewriter failed to write in the file");
					// f.printStackTrace(); // this method print the Exception or you can use sysout like line 25
				}
				
				System.out.println("Now go to the Desktop, open the folder, then the file and see what is written in the file");
				
				// File reader from 56 - 65
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					fr = new FileReader(filePath); // FileReader read the location of the file
					System.out.println("FileReader find the location of the path as: " + filePath);
				} catch (FileNotFoundException g) {
					// TODO Auto-generated catch block
					g.printStackTrace();
				}
				
				// Buffered reader from 68 - 84
				String data = "";
				br = new BufferedReader(fr); // BufferedReader buffer the content /data of the file
				try {
					while ((data = br.readLine()) != null) {
						System.out.println("The BufferedReader read the file and got:  " + data);					
					}
				} catch (IOException h) {
					// TODO Auto-generated catch block
					h.printStackTrace();
				} finally {
					if (fr != null) {
						fr = null; // If fr is not null, make it null, mean close the resource.
					}
					if (br != null) {
						br = null;  // If br is not null, make it null, mean close the resource.
					}
				}		
				
			} else {
				System.out.println("Exception occured, file is not created");
			}

		} else {
			System.out.println("Folder is not created");
		}

	}

}
