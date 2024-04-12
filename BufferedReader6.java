import java.io.*;
class BufferedReader6{
        public static void main(String[] args)throws IOException{
                InputStreamReader Isr=new InputStreamReader(System.in);
                BufferedReader Br=new BufferedReader(Isr);
                Long Number;
                System.out.println("Enter the number :");
                Number=Long.parseLong(Br.readLine());
                System.out.println("Number = "+Number);
        }

}
