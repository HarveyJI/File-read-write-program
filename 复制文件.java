package ʵ�鱨��5_11;

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

public class �����ļ� {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		
		/*InputStream fis; 
		OutputStream fos;   //��������ø���*/
		/*InputStreamReader fis;
		 OutputStreamWriter fos;*/
		Reader fis;
		Writer fos;
		File path=new File("D:\\��ҵ\\java\\file����");
		System.out.println("��ֱ�����Ҫ���Ƶ�ԭ�ļ�ȫ����Ŀ���ļ�ȫ��:"); //source.java  dest.java
		String  name_s,name_c;
		name_s=in.next();
		name_c=in.next();
		File file_s=new File(path,name_s);
		File file_c=new File(path,name_c);
		
		try{
			//��д�ֽ�
			/*fis=new FileInputStream(file_s);
			fos=new FileOutputStream(file_c,true);  //׷�Ӹ���*/
			/*fis=new InputStreamReader(new FileInputStream(file_s));
			
			//��д�ַ�
			fos=new OutputStreamWriter(new FileOutputStream(file_c,true));  //UFT-8*/
			/*fis=new FileReader(file_s);
			fos=new FileWriter(file_c);*/
			fis=new BufferedReader(new FileReader(file_s));
			fos=new BufferedWriter(new FileWriter(file_c));
			int d;
			while((d=fis.read())!=-1){
				fos.write(d);          //?????
			}
			System.out.println("���Ƴɹ�!");
			fis.close();
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
