package stringBuffer;

public class StringBufferExample {
	public static void main(String[] args) {
		//created 9 objects
		//only 1 object is used and 8 are garbage collected
		//creates memory issues
		
		
		String text = "user1";
		text = text + " user2";
		text = text + " user3";
		text = text + " user4";
		text = text + " user5";
		System.out.println(text);
		
		
		
		StringBuffer textBuf =new StringBuffer("user1");
		textBuf.append(" user2");
		textBuf.append( " user3");
		textBuf.append(" user4");
		textBuf.append( " user5");
		System.out.println(textBuf.toString());
		//can be used in multi threaded environment
    //new object is not created when we use stringbuffer
  
		
		StringBuilder textBuild =new StringBuilder("user1");
		textBuild.append(" user2");
		textBuild.append( " user3");
		textBuild.append(" user4");
		textBuild.append( " user5");
		System.out.println(textBuild.toString());
	///can not be used in multi threaded environment
		
	}
}
