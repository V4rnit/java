package ThemePark;
import java.util.*;

public class MyPark extends ThemeDesign implements Restaurant{
    private String name;    
    private int staffNo;
    private int parkNo;
    private String [] menu = new String [5];

    //Getter
    public String getName(){
        return name;
    }
    public int getStaffNo(){
        return staffNo;
    }
    public int parkNo(){
        return parkNo;
    }
    //Setters with Exceptions
    public void setName(String name){
        this.name = name;
    }
    public void setStaffNo(int staffNo) throws InvalidThemeDataException{
        if(staffNo <= 15 || staffNo > 100){
            throw new InvalidThemeDataException("Staff Number is not correct");
        }
        this.staffNo = staffNo;
    }
    public void setParkNo(int parkNo) throws InvalidThemeDataException{
        if(parkNo < 2 || parkNo > 12){
            throw new InvalidThemeDataException("Check the manual");
        }
        this.parkNo =  parkNo;
    }
    //Constructor
    MyPark(double area,String name, int staffNo, int parkNo)throws InvalidThemeDataException{
        super(area);
        this.name = name;
        setStaffNo(staffNo);
        setParkNo(parkNo);
    }
    @Override
    public void displayMenu(){
        for(String s : menu){
            System.out.println(s);
        }
    }
}
