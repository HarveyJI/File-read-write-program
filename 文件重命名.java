package ʵ�鱨��5_11;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class file������ {

	
	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		
		File path=new File("D:\\Desktop\\���ݽṹ�ʼ�");

		if(path.isAbsolute()) {
			String names[]=path.list();
			
			if(names.length<10) {                      
				for(int i=1;i<=10-names.length;i++) {                //���û��10���ļ�,��������ɵ���10���ļ�     
					File file=new File(path,i+".txt");
					if(!file.exists()) {                  //��ֹ����
						try{                             //����main������������ֱ���׳�
							file.createNewFile();	
						}catch(IOException e){
							e.printStackTrace();
						}
					}
				}
				System.out.println("�ļ����ɳɹ�!");
			}else{			
				for(int i=0;i<names.length;i++) {       //��10���ļ�,���������ļ�
					
					File file=new File(path,names[i]);
					String str[]=names[i].split("\\.");    //����ת���ַ�
					file.renameTo(new File(path,str[0]+"_new"+"."+str[1]));
				}
				System.out.println("�������ļ��ɹ�!");
			}
			
			 String nnames[]=path.list();            //����ļ���
			for(String s:nnames) {
				System.out.println(s);
			}
			
		}
	
		
		

		
		
		
	
		
		
		
	}
}
