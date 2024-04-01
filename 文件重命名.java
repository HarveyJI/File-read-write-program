package 实验报告5_11;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class file重命名 {

	
	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		
		File path=new File("D:\\Desktop\\数据结构笔记");

		if(path.isAbsolute()) {
			String names[]=path.list();
			
			if(names.length<10) {                      
				for(int i=1;i<=10-names.length;i++) {                //如果没有10个文件,就随机生成到达10个文件     
					File file=new File(path,i+".txt");
					if(!file.exists()) {                  //防止重名
						try{                             //或者main方法声明部分直接抛出
							file.createNewFile();	
						}catch(IOException e){
							e.printStackTrace();
						}
					}
				}
				System.out.println("文件生成成功!");
			}else{			
				for(int i=0;i<names.length;i++) {       //有10个文件,就重命名文件
					
					File file=new File(path,names[i]);
					String str[]=names[i].split("\\.");    //点是转义字符
					file.renameTo(new File(path,str[0]+"_new"+"."+str[1]));
				}
				System.out.println("重命名文件成功!");
			}
			
			 String nnames[]=path.list();            //输出文件名
			for(String s:nnames) {
				System.out.println(s);
			}
			
		}
	
		
		

		
		
		
	
		
		
		
	}
}
