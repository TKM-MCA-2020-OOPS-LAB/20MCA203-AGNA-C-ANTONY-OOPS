package co6q1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.*;
public class ListOfFiles implements FilenameFilter 
{

    public static void main(String[] args)
	{
        String[] filelist;     
        File f = new File("D:\\");
        filelist = f.list();
        for (String fi : filelist) 
		{
          
            System.out.println(fi);
        }
		System.out.println("Enter the file to be searched:" );
		Scanner sc=new Scanner(System.in);
        String name = sc.next();
        FilenameFilter filter = null;
	    File[] list = f.listFiles();
        if(list!=null)
        for (File files : list)
        {
			if (name.equalsIgnoreCase(files.getName()))
			{
                System.out.println("exist");
			}
			else
			{
			    System.out.println("Not exist");
			}	
		}
    }
}
        
       