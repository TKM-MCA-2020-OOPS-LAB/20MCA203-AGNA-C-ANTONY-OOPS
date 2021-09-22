import java.io.*;
import java.net.*;
class serverside {
    public static void main(String[] args) throws IOException {
        DatagramSocket skt=new DatagramSocket(12345);
        byte[] buf=new byte[324];
        DatagramPacket packet=new DatagramPacket(buf,buf.length);
        skt.receive(packet);
        String reply =new String(packet.getData());
        System.out.println("\n Client Says : "+reply);
        skt.close();
    }
}
