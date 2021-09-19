import java.net.*;
import java.io.*;
public class clientside {
    public static void main(String[] args) throws Exception{
        Socket n=new Socket("localhost",65012);
        DataInputStream in=new DataInputStream(n.getInputStream());
        DataOutputStream out=new DataOutputStream(n.getOutputStream());
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str1="",str2="";
        while(!str1.equals("exit")) {
            str1=bf.readLine();
            out.writeUTF(str1);
            out.flush();
            str2=in.readUTF();
            System.out.println("Server says: "+str2);

        }
        out.close();
        n.close();


    }

}
