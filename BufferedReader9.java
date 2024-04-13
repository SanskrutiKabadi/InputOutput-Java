import java.io.*;
class BufferedReader9{
        public static void main(String[] args)throws IOException{
                InputStreamReader Isr=new InputStreamReader(System.in);
                BufferedReader Br=new BufferedReader(Isr);
                boolean Answer;
                System.out.println("Enter the answer :");
                Answer=Boolean.parseBoolean(Br.readLine());
                System.out.println("Answer = "+Answer);
        }
}
