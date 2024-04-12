import java.io.*;
class BufferedReader5{
        public static void main(String[] args)throws IOException{
                InputStreamReader Isr=new InputStreamReader(System.in);
                BufferedReader Br=new BufferedReader(Isr);
                double Salary;
                System.out.println("Enter the salary :");
                Salary=Double.parseDouble(Br.readLine());
                System.out.println("Salary = "+Salary);
        }

}
