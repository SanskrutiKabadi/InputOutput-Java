import java.io.*;
class BufferedReader3{
        public static void main(String[] args)throws IOException{
                InputStreamReader Isr=new InputStreamReader(System.in);
                BufferedReader Br=new BufferedReader(Isr);
                float Temprature;
                System.out.println("Enter the temprature :");
                Temprature=Float.parseFloat(Br.readLine());
                System.out.println("Temprature = "+Temprature);
        }

}
