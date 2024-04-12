import java.io.*;
class BufferedReader7{
        public static void main(String[] args)throws IOException{
                InputStreamReader Isr=new InputStreamReader(System.in);
                BufferedReader Br=new BufferedReader(Isr);
                short Number;
                System.out.println("Enter the number :");
                Number=Short.parseShort(Br.readLine());
                System.out.println("Number = "+Number);
        }

}
