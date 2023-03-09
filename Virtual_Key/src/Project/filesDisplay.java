package Project;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class filesDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numChoice=0;
		DisplayMenu();
		Scanner scanner=new Scanner(System.in);
		while(numChoice!=-1) {
		System.out.println("\n Enter Your choice");
		numChoice=scanner.nextInt();
		
				
		switch(numChoice) {
		case 1:ListFiles();
		break;
		case 2:int n=0;
		boolean s=true;
		while(s) {
		System.out.println("1. Add Files ");
		System.out.println("2. Search Files ");
		System.out.println("3. Delete Files ");
		System.out.println("4. Main Menu ");
		//while(n!=-1) {
		System.out.println("\n Enter Your choice ");
		n=scanner.nextInt();	
		switch(n) {
		case 1:AddFiles();break;
		case 2:SearchFile();break;
		case 3:DeleteFiles();break;
		case 4:DisplayMenu(); s=false;break;
		}
		}
		}
		}
		
		
		System.out.println("You are exited from application");
		
		
}
	static void ListFiles() {
		File f=new File("C:/java/Virtual_Key/FileRepository");
		File[] pathnames=f.listFiles();
		Sorting(pathnames);
		int num=1;
		for(File pathname:pathnames) {
			System.out.println();
			System.out.println(num+") "+pathname.getName());
			num++;
		}
		
	}
	static void DisplayMenu() {
		final String name="Sowmyashree M M";
		final String email="somm@teksystems.com";
		final String city="Mysuru";
		System.out.println(" ************************************ ");
		System.out.println("   WELCOME TO VIRTUAL KEY APLLICATION    ");
		System.out.println("   Developer Name: "+name);
		System.out.println("   Email id:       "+email);
		System.out.println("   City:           "+city);
		System.out.println(" ************************************ ");
		System.out.println();
		System.out.println("MAIN MENU");
		System.out.println();
		System.out.println(" To Select Option Enter Number ");
		System.out.println();
		System.out.println("1. Display File list");
		System.out.println("2. File Operations");
		System.out.println("3. To Exit enter -1");
		
		
		
		
	}
	static void AddFiles() {
		String fileName;
		File f=new File("C:/java/Virtual_Key/FileRepository");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter File Name ");
		fileName=scanner.nextLine();
		File myFile=new File(f,fileName);
		if(myFile.exists()) {
			System.out.println("Sorry File Already Exists!!!");
		}
		else {
		try(FileOutputStream fstream=new FileOutputStream(myFile);
				DataOutputStream data=new DataOutputStream(fstream)){
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("File is Added");
}
}
	
	static void DeleteFiles() {
		String fileName;
		File f=new File("C:/java/Virtual_Key/FileRepository");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter File Name You Wish To Be Deleted ");
		fileName=scanner.nextLine();
        int num=0;
	    for(File file:f.listFiles()) {
		    	if((file.getName()).equals(fileName)) {
				file.delete();
				System.out.println("File deleted");
				num=1;
				break;
			}
	}
	    if(num!=1) {
	    System.out.println("File not found");
	    }
			System.out.println();
	}  
	static File[] Sorting(File[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j].compareTo(array[i])>0) {
					File temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		return array;
	}
	
	    
	static void SearchFile() {
		String fileName;
		File f=new File("C:/java/Virtual_Key/FileRepository");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter File Name You Want to Search ");
		fileName=scanner.nextLine();
		File[] files=f.listFiles();
		Sorting(files);
		ArrayList<String> array=new ArrayList<>();
		for(File f3:files) {
			//String s=f3.getName();
			//if(s.compareTo(fileName)>0) {
			array.add(f3.getName());
				
				
			}
		int firstIndex=0;
		int lastIndex=array.size()-1;
		int mid=array.size()/2;
		int num=0;
		while(firstIndex<=lastIndex) {
			
			if((array.get(mid)).compareTo(fileName)<0) {
				firstIndex=mid+1;			
			}else if((array.get(mid)).compareTo(fileName)==0){
				
				System.out.println("File  "+array.get(mid)+" found At position " +(array.indexOf(fileName)+1));
				num=1;
				break;
				
			}else {
				lastIndex=mid-1;
			}
			mid=(firstIndex+lastIndex)/2;
		}
		if(num!=1) {
			System.out.println("\nSorry File not found!!! ");
		}	
		}		
		}
		
		
		
	
	





