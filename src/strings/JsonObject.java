package strings;

public class JsonObject {

	private String name;
	private String desc;
	private int employees;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getEmployees() {
		return employees;
	}
	public void setEmployees(int employees) {
		this.employees = employees;
	}
	
	
	// Creating toString
    @Override
    public String toString()
    {
        return "Organisation [organisation_name="
            + name
            + ", description="
            + desc
            + ", Employees="
            + employees + "]";
    }
}
