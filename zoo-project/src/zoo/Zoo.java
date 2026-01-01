package zoo;

public abstract class Zoo{
	private int staffNo;
	private int animalNo;
	private double area;
	private String name;
	
	//Getter
	public int getStaffNo(){
		return staffNo;
	}
	public int getAnimalNo(){
		return animalNo;
	}
	public double getArea(){
		return area;
	}
	public String getName(){
		return name;
	}

	//Setters
	public void setStaffNo(int staffNo) throws InvalidZooException{
		if(staffNo <= 0 || staffNo > 100){
			throw new InvalidZooException("Invalid staff Number");
		}
		this.staffNo = staffNo;
	}
	public void setAnimalNo(int animalNo) throws InvalidZooException{
		if(animalNo <= 0 || animalNo > 500){
			throw new InvalidZooException("Invalid animal Number");
		}
		this.animalNo = animalNo;
	}
	public void setArea(double area) throws InvalidZooException{
		if(area <= 1000  ||  area > 10000){
			throw new InvalidZooException ("Invalid area for the zoo");
		}
		this.area = area;
	}
	public void setName(String name){
		this.name = name;
	}
	//Constructor
	protected Zoo(int staffNo, int animalNo, double area, String name) throws InvalidZooException{
		setStaffNo(staffNo);
		setAnimalNo(animalNo);
		setArea(area);
		this.name = name;
	}
}
