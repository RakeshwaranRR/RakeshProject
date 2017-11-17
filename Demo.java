package testpkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

public class Demo {
	@Test
	  public void f() throws IOException {
		  System.out.println("Test Case");
		  //ResourceBundle obj=ResourceBundle.getBundle("MalikTest");
		  /*File file=new File("MalikTest.properties");
		  FileOutputStream FIS=new FileOutputStream("E:/Test/testprj/src/testpkg/MalikTest.properties");
		  Properties prop=new Properties();
		  //prop.load(FIS);
		  prop.setProperty("test3", "Testinggggggg");
		  prop.setProperty("test4", "Testinggggggsdfsdfg");
		  prop.store(FIS, null);

		  FIS.close();*/
		  /*String str=obj.getString("test");
		  System.out.println("Testing-----"+str);*/
		  ResourceBundle obj=ResourceBundle.getBundle("testpkg.MalikTest");
		 // Enumeration  <String> key = obj.getKeys();
		  String value = obj.getString("test4");
		  System.out.println("Testing------->"+value);
	}
	@Test
	public void f1() throws IOException{
		System.out.println("Testing2------->");
		File file=new File("E:\\Test\\testprj\\src\\testpkg\\testing.txt");
		FileWriter fw= new FileWriter(file);
		fw.write("This is line1");
		fw.write("This is line2");
		fw.write("This is line3");
		fw.write("This is line4");
		fw.close();
	}
	@Test
	public void f2() throws IOException{
		System.out.println("Testing3------->");
		File file=new File("E:\\Test\\testprj\\src\\testpkg\\testing.txt");
		FileReader fw= new FileReader(file);
		StringBuffer sb= new StringBuffer();
		BufferedReader br=new BufferedReader(fw);
		String line;
		while((line = br.readLine())!= null){
			sb.append(line).append("\n");
			//sb.append("\n");
		}
		//fw.read();
		fw.close();
		System.out.println(sb.toString());
	}
	@Test
	public void f3() throws IOException
	{
		File file = new File("E:\\Test\\testprj\\src\\testpkg\\testing.txt");
		List<String> lines = FileUtils.readLines(file);

		//Collections.sort(lines);

		for (String line : lines) {
			System.out.println("line:" + line);
			System.out.println("\n");
		}
	}
}
