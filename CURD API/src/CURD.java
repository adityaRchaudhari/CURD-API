
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



class Student {
  
	private int sId;
	private String sName;
	private int sAge;
	private long sMobilenum;
	
	public Student(int sId, String sName, int sAge, long sMobilenum) {
		
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sMobilenum = sMobilenum;
	}
	
	public int getsId() {
		return sId;
	}
	
	public String sName() {
		return sName;
	}
	public int sAge() {
		return sAge;
	}
	public long sClass() {
		return sMobilenum;
	}
	
	public String toString() {
		return sId+" "+sName+" "+sAge+" "+sMobilenum;
	}
}

public class CURD {
    public static void main(String[] args) {
       
    	List<Student> s=new ArrayList<Student>();
    	Scanner scan= new Scanner(System.in);
		Scanner scan1=new Scanner(System.in);
		int ch;
		 do{
			
			System.out.println("1- Insert");
			System.out.println("2- Display");
			System.out.println("3- Delete");
			System.out.println("4- Update");
			System.out.println("5- Exit");
			System.out.println("Enter Your Choice : ");
			ch=scan.nextInt();
		
			switch(ch) {
			case 1:
				System.out.println("Enter the Student Id : ");
				int stuid=scan.nextInt();
				System.out.println("Enter the Student Name : ");
				String stuname=scan1.nextLine();
				System.out.println("Enter the Student Age : ");
				int stuage=scan.nextInt();
				System.out.println("Enter the Student Mobile Number: ");
				long stumnum=scan.nextLong();
				
				s.add(new Student(stuid,stuname,stuage,stumnum));
				break;
				
			case 2:
				System.out.println("--------------------");
			    Iterator<Student> i =  s.iterator();
			while(i.hasNext()) {
				Student S = i.next();
				System.out.println(S);
			}
			System.out.println("--------------------");
			 	break;
			 	
			case 3:
				boolean found=false;
				System.out.println("Enter the Student id to Delete");
				int studentid=scan.nextInt();
				System.out.println("--------------------");
			     i =  s.iterator();
			   while(i.hasNext()) {
				Student S = i.next();
				if(S.getsId()==studentid){
					i.remove();
					found=true;
				}
					
				}
			   if(!found) {
				   System.out.println("Record Not Found");
			   } else {
				   System.out.println("Record is Deleted Successfully");
			   }
			   System.out.println("--------------------");
			   break; 
			   
			case 4 :
				 found=false;
				System.out.println("Enter the Student id to Update");
				 studentid=scan.nextInt();
				System.out.println("--------------------");
			     ListIterator<Student> li =  s.listIterator();
			   while(li.hasNext()) {
				Student S = li.next();
				if(S.getsId()==studentid){
					System.out.println("Enter New Id");
					 stuid=scan.nextInt();
					System.out.println("Enter New Name");
					String sName=scan1.nextLine();
					System.out.println("Enter New Age");
					 stuage=scan.nextInt();
					 System.out.println("Enter New Mobile Number");
					 stumnum=scan.nextLong();
					 
					 li.set(new Student(stuid,sName,stuage,stumnum));
					found=true;
					
				}
					
				}
			   if(!found) {
				   System.out.println("Record Not Found");
			   } else {
				   System.out.println("Record is Updated Successfully");
			   }
			   System.out.println("--------------------");
			   break;
			case 5 :
				System.out.println("Thank You...Visit Again");
				System.exit(0);
			   
			}
		 }while(ch!=0);

	}

}
