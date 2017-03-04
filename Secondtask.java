package deskera;

public class Secondtask {

	public static void countWord(String s){
		
		String str1[]=s.split("\\?|\\.");
		int maxlength = 0;
		int length=str1.length;
		for(String s1:str1)
		{
			String str2[]=s1.split(" ");
			/*for(String s2:str2)
			{	
				//String str2[]=s2.split(" ");
				//System.out.println(s2);
			}*/
			//System.out.println("length" +" " + str2.length);
			if(str2.length>=maxlength)
			{
				maxlength = str2.length;
			}
		}
		// TODO Auto-generated method stub
		System.out.println("maximum no of words :" +" " + maxlength);
		}
 //System.out.println(s.trim().split("\\?|\\.").length);
	
	public static void main(String[] args) {
		String s="Hello.My bro?how are you test ?test123.testing?exercise is bst ?for heal n wealth";
       Secondtask.countWord(s);
}
}
/*s.trim().split("\\s+").length*/