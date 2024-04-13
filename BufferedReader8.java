import java.io.*;
class BufferedReader8{
        public static void main(String[] args)throws IOException{
                InputStreamReader Isr=new InputStreamReader(System.in);
                BufferedReader Br=new BufferedReader(Isr);
                byte Number;
                System.out.println("Enter the number :");
                Number=Byte.parseByte(Br.readLine());
                System.out.println("Number = "+Number);
        }
}
