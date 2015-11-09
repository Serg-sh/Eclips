package SortString;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class SortString {
	private List<String> readString(){
		List <String> ls = new ArrayList<String>();
		try{
		File f1 = new File("D:/GoogleDrive/workspace/File/src/SortString/aa.txt");
		InputStream is = new FileInputStream(f1);
		
		ls.addAll(FileUtils.readLines(f1));
		ls.sort(null);
		is.close();
		}catch(IOException e){
			System.out.println(e);
		}
		return ls;
		
	}
	private void writeFile(List <String> ls){
		try{
			File f2 = new File("D:/GoogleDrive/workspace/File/src/SortString/aa.txt");
			OutputStream os = new FileOutputStream(f2);
			IOUtils.writeLines(ls, null, os);
			os.close();
		}catch(IOException e){
		System.out.println(e);
		}
	}
	private void allAct(){
		writeFile(readString());
	}
	

	public static void main(String[] args){
		new SortString().allAct();
}
}

	


