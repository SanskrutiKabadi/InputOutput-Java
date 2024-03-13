import java.util.*;
class Scanner10{
        public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                String Name;
                int rollNo;
                char Div,bloodGroup;
                System.out.println("Enter the  Name : ");
                Name=Sc.nextLine();
                System.out.println("Enter the  roll no : ");
                rollNo=Sc.nextInt();
                System.out.println("Enter the  division : ");
                Div=Sc.next().charAt(0);
                System.out.println("Enter the  blood group: ");
                bloodGroup=Sc.next().charAt(0);;
                System.out.println("Name = "+Name);
                System.out.println("RollNo= "+rollNo);
                System.out.println("Div= "+ Div);
                System.out.println("bloodGroup= "+bloodGroup);
        }

}
