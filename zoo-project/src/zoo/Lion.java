package zoo;
public class Lion extends Animal implements AnimalBehaviour{
    String sex;
    //Getter for sex
    public String getSex(){
        return sex;
    }
    //Constructor
    public Lion(String name, String type, int age, String sex){
        super(name, type, age);
        this.sex = sex;
    }
    @Override
    public void makeSound(){
        System.out.println("Roar");
    }
    @Override
    public void eatFood(){
        System.out.println("Eating meal (Carnivores)");
    }
    @Override
    public void poop(){
        System.out.println("Pooping :)");
    }
}
