package algorithms;
/*
 1.
input : " s w i s s"
find the 1st non repeting charater

output : w 
 */

public class TestRepeatedcharchk {

	public static void main(String[] args) {
		TestDemo t=new TestDemo();
		try {
		char res=TestDemo.firstNonRepeatedCharacter("s w  i s s");
		System.out.println(res);
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}

}