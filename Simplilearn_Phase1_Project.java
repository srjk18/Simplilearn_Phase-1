package com.mphasis.ph1_assmnt;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Simplilearn_Phase1_Project {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\SURAJKUMAR\\Desktop\\Simplilearn\\Ph_1_project\\";
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		System.out.println("Welocome to the 'LockedMe.com'");
		System.out.println();
		System.out.println("Application is Developed and maintained by XYZ Company Limited.");
		System.out.println();

		Task: while (true) {

			System.out.println("Main Menu Option Are:\n Type 1 To see the files.\n Type 2 To enter into the sub-menu.\n Type 3 To exit.");
			System.out.println();
			Scanner sc_1 = new Scanner(System.in);
			int option = sc_1.nextInt();
			switch (option) {

			case 1:
				File f1 = new File(path);
				File file_name1[] = f1.listFiles();
				System.out.println();
				System.out.println("file available are:");
				for (File ff : file_name1) {
					System.out.println(ff.getName());
				}
				System.out.println();
				break;

			case 2:
				
			 while (true) {
				 	System.out.println();
					System.out.println(
							"Sub-Menu Option Are:\n Type 11 for creatFile\n Type 22 for deletFile\n Type 33 for searchFile\n Type 44 for Exit");
				 	System.out.println();

					Scanner sc_2 = new Scanner(System.in);
					int operation1 = sc_2.nextInt();

					switch (operation1) {

					case 11:
					 	System.out.println();
						System.out.println("enter the file name to create");
					 	System.out.println();
						String filename = sc.next();
						String finalname = path+filename;
						System.out.println(finalname);

						// create a file

						File f = new File(finalname);
						boolean b = f.createNewFile();
						if (b!=true) {
							System.out.println("the file not created");
						} else {
							al.add(filename);
							System.out.println("file created");
							Collections.sort(al);
							System.out.println("the collection of files is " + al);
							break;
						}
						

						break;

					case 22:

						Scanner sc1 = new Scanner(System.in);
					 	System.out.println();
						System.out.println("enter the file name to be deleted");
					 	System.out.println();
						String filname = sc1.next();
						String finalfile = path + filname;
						File file = new File(finalfile);
						file.delete();
						System.out.println("file deleted");

						break;

					case 33:

						Scanner sc2 = new Scanner(System.in);
					 	System.out.println();
						System.out.println("enter the file name to search");
					 	System.out.println();
						String filsearchname = sc2.next();
						File f2 = new File(path);
						File file1_name[] = f2.listFiles();
						int flag = 0;
						for (File ff : file1_name) {
							if (ff.getName().equals(filsearchname)) {
								flag = 1;
								break;
							} else {
								flag = 0;
							}

						}

						if (flag == 1) {
							System.out.println("found the file");
						} else {
							System.out.println("file is not found");
						}
						break;

					case 44:
					 	System.out.println();
						System.out.println("Exited from the Sub-Menu.");
					 	System.out.println();
//						System.exit(0);
						continue Task;

					default:
					 	System.out.println();
						System.out.println("You have enterd wrong choice, please enter the" + " 11 for createFile,"
								+ " 22 for deletFile," + " 33 for searchFile," + " 44 for Exit.");
					 	System.out.println();
						break;

					}
				}

			case 3:
			 	System.out.println();
				System.out.println("Application Closed.");
			 	System.out.println();
				System.exit(0);
				break;

			default:
			 	System.out.println();
				System.out.println("You have chose the wrong option, please select from 1,2,3");
			 	System.out.println();
				break;
			}
		}

	}
}
