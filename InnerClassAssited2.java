public class InnerClassAssited2 {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	InnerClassAssited2  ob=new InnerClassAssited2 ();  
	ob.display();  
	}
}
