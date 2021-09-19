import java.net.*;
import java.io.*;
public class serverside {
    public static void main(String[] args) throws Exception {
        ServerSocket skt=new ServerSocket(65012);
        Socket n=skt.accept();
        System.out.println("Connection established");
        DataInputStream in=new DataInputStream(n.getInputStream());
        DataOutputStream out=new DataOutputStream(n.getOutputStream());
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        String str1="",str2="";
        while(!str1.equals("exit")){
            str1=in.readUTF();
            System.out.println("client says: "+str1);
            str2=bf.readLine();
            out.writeUTF(str2);
            out.flush();
        }
        in.close();
        n.close();
        skt.close();

    }
}
