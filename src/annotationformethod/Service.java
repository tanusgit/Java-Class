package annotationformethod;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MethodInfo {
	String author() default "ram";

	String date();

	int revision() default 1;

	String comments();
}
public class Service {

	@MethodInfo(author = "kumar", comments = "Main method", date = "Nov 17 2012", revision = 1)
	public String process() {
		return "Overriden toString method";
	}

	@Deprecated
	@MethodInfo(comments = "deprecated method", date = "Nov 17 2012")
	public void oldMethod() {
		System.out.println("old method, don't use it.");
	}

	@Override
	public String toString() {
		return "MethodInfoUse []";
	}

}

