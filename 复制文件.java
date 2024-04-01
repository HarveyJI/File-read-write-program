package 实验报告5_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class 复制文件 {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		
		/*InputStream fis; 
		OutputStream fos;   //定义可以用父类*/
		/*InputStreamReader fis;
		 OutputStreamWriter fos;*/
		Reader fis;
		Writer fos;
		File path=new File("D:\\作业\\java\\file测试");
		System.out.println("请分别输入要复制的原文件全名和目标文件全名:"); //source.java  dest.java
		String  name_s,name_c;
		name_s=in.next();
		name_c=in.next();
		File file_s=new File(path,name_s);
		File file_c=new File(path,name_c);
		
		try{
			//读写字节
			/*fis=new FileInputStream(file_s);
			fos=new FileOutputStream(file_c,true);  //追加覆盖*/
			/*fis=new InputStreamReader(new FileInputStream(file_s));
			
			//读写字符
			fos=new OutputStreamWriter(new FileOutputStream(file_c,true));  //UFT-8*/
			/*fis=new FileReader(file_s);
			fos=new FileWriter(file_c);*/
			fis=new BufferedReader(new FileReader(file_s));
			fos=new BufferedWriter(new FileWriter(file_c));
			int d;
			while((d=fis.read())!=-1){
				fos.write(d);          //?????
			}
			System.out.println("复制成功!");
			fis.close();
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
