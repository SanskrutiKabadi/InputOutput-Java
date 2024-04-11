import java.io.*;
class BufferedReader2{
        public static void main(String[] args)throws IOException{
                InputStreamReader Isr=new InputStreamReader(System.in);
                BufferedReader Br=new BufferedReader(Isr);
                String Name;
                System.out.println("Enter the Name :");
                Name=Br.readLine();
                System.out.println("Name = "+Name);
        }

}
