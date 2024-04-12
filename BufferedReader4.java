import java.io.*;
class BufferedReader4{
        public static void main(String[] args)throws IOException{
                InputStreamReader Isr=new InputStreamReader(System.in);
                BufferedReader Br=new BufferedReader(Isr);
                char Div;
                System.out.println("Enter the division :");
                Div=(char)Br.read();
                System.out.println("Div = "+Div);
        }

}
