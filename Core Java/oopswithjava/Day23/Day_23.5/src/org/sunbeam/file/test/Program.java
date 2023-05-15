package org.sunbeam.file.test;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Program {
	public static void main(String[] args) {
		try( RandomAccessFile file = new RandomAccessFile("/Users/sandeepkulange/Desktop/Java8/Info.txt", "rw");
			 FileChannel channel =  file.getChannel(); ){
			
			ByteBuffer buffer = ByteBuffer.allocate(100);
			int bytesRead =  channel.read(buffer);//Writing data into buffer.
			while( bytesRead != -1 ) {
				buffer.flip(); //Read Buffer
				while( buffer.hasRemaining())
					System.out.print((char)buffer.get());
				buffer.clear();
				bytesRead =  channel.read(buffer);//Writing data into buffer.
			}
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}	
}
