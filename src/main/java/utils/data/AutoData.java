package utils.data;

public class AutoData {
	private String autoInsurane;
	private String zipCode;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String suffixString;
	
	public AutoData(String autoInsurane, String zipCode, String firstName, String middleInitial, String lastName,
			String suffixString) {
		super();
		this.autoInsurane = autoInsurane;
		this.zipCode = zipCode;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.suffixString = suffixString;
	}

	public String getAutoInsurane() {
		return autoInsurane;
	}
	
	
	public String getZipCode() {
		return zipCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSuffixString() {
		return suffixString;
	}
	
	
	
	
	

}
