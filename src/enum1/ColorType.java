package enum1;

public enum ColorType {

	BLUE, // ColorType BLUE = new ColorType();
	RED, // ColorType RED = new ColorType();
	BLACK, white, GREEN;

	public static boolean isValidColor(String input) {
		ColorType[] objs = ColorType.values();
		boolean found = false;
		for (ColorType obj : objs) {
			if (input.equals(obj.toString())) {
				found = true;
				break;
			}
		}
		return found;
	}

}
