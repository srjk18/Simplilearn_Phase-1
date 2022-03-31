package com.mphasis.ph1_project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Phase_1_Project {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\SURAJKUMAR\\Desktop\\Simplilearn\\Ph_1_project\\";
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();

		Task: while (true) {

			System.out.println("Main Menu Option Are: 1 , 2 , 3 ");
			Scanner sc_1 = new Scanner(System.in);
			int option = sc_1.nextInt();
			switch (option) {

			case 1:
				File f1 = new File(path);
				File file_name[] = f1.listFiles();
				for (File ff : file_name) {
					System.out.println(ff.getName());
				}
				break;

			case 2:
				
			 while (true) {

					System.out.println(
							"Sub-Menu Option Are:\n type 11 for creatFile\n type 22 for deletFile\n type 33 for searchFile\n type 44 for Exit");

					Scanner sc_2 = new Scanner(System.in);
					int operation1 = sc_2.nextInt();

					switch (operation1) {

					case 11:

						System.out.println("enter the file name to create");
						String filename = sc.next();
						String finalname = path + filename;
						System.out.println(finalname);

						// create a file

						File f = new File(finalname);
						boolean b = f.createNewFile();
						if (b != true) {
							System.out.println("the file not created");
						} else {
							al.add(filename);
							System.out.println("file created");
							break;
						}

						System.out.println("the collection of files is " + al);

						break;

					case 22:

						Scanner sc1 = new Scanner(System.in);
						System.out.println("enter the file name to be deleted");
						String filname = sc1.next();
						String finalfile = path + filname;
						File file = new File(finalfile);
						file.delete();
						System.out.println("file deleted");

						break;

					case 33:

						Scanner sc2 = new Scanner(System.in);
						System.out.println("enter the file name to search");
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

						System.out.println("Exited from the Sub-Menu.");
//						System.exit(0);
						continue Task;

					default:
						System.out.println("You have enterd wrong choice, please enter the" + " 11 for createFile,"
								+ " 22 for deletFile," + " 33 for searchFile," + " 44 for Exit.");
						break;

					}
				}

			case 3:
				System.out.println("Application Closed.");
				System.exit(0);
				break;

			default:
				System.out.println("You have chose the wrong option, please select from 1,2,3");
				break;
			}
		}

	}
}
