package wrapperClass;

public class Test {
public static void main(String[] args) {

	Student s = new Student();
	//System.out.println(s.sub1); //0
	//System.out.println(s.sub2);  //null
	
	//assignment : convert the primitive to wrapper obj

	Integer i = new Integer(1313);
	Float f = new Float(12.114f);
	Long l = new Long(13131311);
	Double d = new Double(11313131d);
	Character c = new Character('c');
	Boolean b = new Boolean(true);
	
	
	
	// convert int obj  to int primitive
	int i1 = i.intValue();

// convert float obj  to float primitive
	float f1 = f.floatValue();

// convert long obj  to long primitive
	long l1 = l.longValue();

// convert double obj  to double primitive
	double d1 = d.doubleValue();
//converting character object to char primitive	
 char c1 = c.charValue();
 
 boolean b1 = b.booleanValue();

	System.out.println(i1);
	System.out.println(f1);
	System.out.println(l1);
	System.out.println(d1);	
	System.out.println(c1);
	System.out.println(b1);
	
	
}
}
