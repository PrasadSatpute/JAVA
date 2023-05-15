package org.sunbeam.file.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
	private static void printFileInfo(Path path) throws IOException {	// TODO Auto-generated method stub
		System.out.println("Name			:	"+path.getFileName());
		System.out.println("Parent			:	"+path.getParent());
		BasicFileAttributes attribute = Files.readAttributes(path, BasicFileAttributes.class);
		System.out.println("Size			:	"+attribute.size());
		System.out.println("Creation Time		:	"+attribute.creationTime());
		System.out.println("Access Time		:	"+attribute.lastAccessTime());
		System.out.println("Modified Time		:	"+attribute.lastModifiedTime());
	}

	private static void printDirectoryInfo(Path path) throws IOException {
		List<Path> list = Files.list(path).collect(Collectors.toList());
		for (Path p : list) {
			BasicFileAttributes attribute = Files.readAttributes(p, BasicFileAttributes.class);
			if( attribute.isDirectory()) {
				//TODO
			}else {
				//TODO
			}
		}
	}
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Enter path : ");
			String pathname = sc.nextLine();
			
			Path path = Paths.get(pathname);
			if( Files.exists(path)) {
				if( Files.isDirectory(path))
					Program.printDirectoryInfo( path );
				else
					Program.printFileInfo( path );
			}else
				System.out.println(pathname+" does not exist");
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}	
}
