import java.io.*;
import java.net.*;
class clientside{
    public static void main(String[] args) throws IOException {
        DatagramSocket skt= new DatagramSocket();
        InetAddress add=InetAddress.getByName("localhost");
        String str ="ready to connect";
        byte[] bufBytes = str.getBytes();
        DatagramPacket datagramPacket=new DatagramPacket(bufBytes,bufBytes.length,add,12345);
        skt.send(datagramPacket);
        skt.close();
    }
}