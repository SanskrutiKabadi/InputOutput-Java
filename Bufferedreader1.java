import java.io.*;
class BufferedReader1{ 
	public static void main(String[] args)throws IOException{
		InputStreamReader Isr=new InputStreamReader(System.in);
		BufferedReader Br=new BufferedReader(Isr);
		int Age;
		System.out.println("Enter the age :");
		Age=Integer.parseInt(Br.readLine());
		System.out.println("Age = "+Age);
	}

}
