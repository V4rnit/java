package zoo;
public abstract class Animal{
    private String name;
    private String type;
    private int age;

    //Getters
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getAge(){
        return age;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    //Constructor
    public Animal(String name, String type, int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }
    public void displayAnimal(){
        System.out.println(name + " " + type + " " + age);
    }
}
