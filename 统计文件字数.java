package ʵ�鱨��5_11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ͳ����Ŀ {

	public static void main(String[] args) {
		/*Scanner in =new Scanner (System.in);
		
		File path=new File("D:\\��ҵ\\java\\file����");
		System.out.println("������Ŀ���ļ�:");    //sample.txt
		String name=in.next();	
		File file=new File(path,name);
		
		long total=0; //�ܵ��ʸ���
		long count=0; //��Ӧ���ʸ���
		String s,str="";
		System.out.println("��������Ҫ���ҵĵ���:");
		s=in.next();
		int d;  //�����ֽ� 
		char c;  //ת��Ϊ��ĸ
		try{
			RandomAccessFile fos=new RandomAccessFile(file,"r");
	
			long filepoint=0; //��ǰָ��
			long filel=fos.length(); //�ļ�����
				while(filepoint<filel) {
				d=fos.readByte();
				c=(char) (d);
				if(!Character.isUpperCase(c)&&
						!Character.isLowerCase(c)) {
					total++;
					if(s.equals(str)) {
						count++;
					}
					str="";
				}
				str+=c;
				filepoint=fos.getFilePointer();
			}
			fos.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(total);*/
		
		Scanner in =new Scanner (System.in);
		File path=new File("D:\\��ҵ\\java\\file����");
		System.out.println("������Ŀ���ļ�:");    //sample.txt
		String name=in.next();	
		File file=new File(path,name);
		
		long total=0; //�ܵ��ʸ���
		long count=0; //��Ӧ���ʸ���
		String s,str="";
		System.out.println("��������Ҫ���ҵĵ���:");
		s=in.next();
		try{
			RandomAccessFile fos=new RandomAccessFile(file,"r");
			String sstr=new String();
			while((sstr=fos.readLine())!=null){
				
				sstr=sstr.replace(',',' ');
				sstr=sstr.replace('��',' ');
				String []sz= sstr.split("\\s+");
				total+=sz.length;
				for(int i=0;i<sz.length;i++){
					if(sz[i].equals(s)){
						count++;
					}
				}
			}
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(total+" "+count);
		
	}

}
