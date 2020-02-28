package enum1;

public enum LoanType {
	  //objects with data 
		HOME("100", "loan for home purpose"), 
		VEHICLE("101", "loan for VEHICLE purpose"), 
		PERSONAL("102", "loan for PERSONAL purpose");
		//100
		private String code;
		// loan for *** purpose
		private String desc;

		private LoanType(String code, String desc) {
			this.code = code;
			this.desc = desc;
		}

		public String getCode() {
			return code;
		}

		public String getDesc() {
			return desc;
		}

	}