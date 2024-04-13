import java.io.*;
class BufferedReader10{
        public static void main(String[] args)throws IOException{
                InputStreamReader Isr=new InputStreamReader(System.in);
                BufferedReader Br=new BufferedReader(Isr);
		String Name;
		int RollNo;
		char Div;
		float Temprature;
                System.out.println("Enter the Name :");
                Name=Br.readLine();

		System.out.println("Enter the student current temprature :");
                Temprature=Float.parseFloat(Br.readLine());

                System.out.println("Enter the roll no :");
                RollNo=Integer.parseInt(Br.readLine());

                System.out.println("Enter the div :");
                Div=(char)Br.read();
		
               
               
                System.out.println("Name = "+ Name);
		System.out.println("RollNo = "+ RollNo);
		System.out.println("Div = "+  Div);
		System.out.println("Temprature = "+ Temprature);
        }
}
