//enum ....main method written in single_inherit

public enum month {
	
    JANUARY("Sankranti"), FEBRAURAY("Valentines week"), MARCH("Womens Day"), APRIL("Health Day"), MAY("May Day"), JUNE("Father Day");
    
    private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	month (String type){
		this.type=type;
	}
}
