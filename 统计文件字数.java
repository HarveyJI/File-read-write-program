package 实验报告5_11;

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

public class 统计数目 {

	public static void main(String[] args) {
		/*Scanner in =new Scanner (System.in);
		
		File path=new File("D:\\作业\\java\\file测试");
		System.out.println("请输入目标文件:");    //sample.txt
		String name=in.next();	
		File file=new File(path,name);
		
		long total=0; //总单词个数
		long count=0; //相应单词个数
		String s,str="";
		System.out.println("请输入需要查找的单词:");
		s=in.next();
		int d;  //接受字节 
		char c;  //转化为字母
		try{
			RandomAccessFile fos=new RandomAccessFile(file,"r");
	
			long filepoint=0; //当前指针
			long filel=fos.length(); //文件长度
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
		File path=new File("D:\\作业\\java\\file测试");
		System.out.println("请输入目标文件:");    //sample.txt
		String name=in.next();	
		File file=new File(path,name);
		
		long total=0; //总单词个数
		long count=0; //相应单词个数
		String s,str="";
		System.out.println("请输入需要查找的单词:");
		s=in.next();
		try{
			RandomAccessFile fos=new RandomAccessFile(file,"r");
			String sstr=new String();
			while((sstr=fos.readLine())!=null){
				
				sstr=sstr.replace(',',' ');
				sstr=sstr.replace('。',' ');
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
