import java.util.HashMap;
import java.util.Scanner;

public class prototype {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        String type;
        type = r.nextLine();
        Dog dog = (Dog)storage.getAnimal("dog");
        dog.setname("lucy");
        dog.tostring();
        Dog dog1 = (Dog)storage.getAnimal("dog");
        dog.setname("roby");
        dog.tostring();
    }
}

class storage {
    private static HashMap<String,Animal> AnimalMap = new HashMap<String, Animal>();

    public static Animal getAnimal(String type){
        Dog dog = (Dog)AnimalMap.get("dog");
        if(dog==null){
            dog = new Dog();
            System.out.println("Cretaing first one");
            AnimalMap.put("dog",dog);
            return dog;
        }
        System.out.println("Returing Clone");
        return dog.clone();
    }
}
interface Animal extends Cloneable {
    public Animal clone();
}

 class Dog implements Animal{
    //private dogears ;
    //private dogeyes ;
   // private doglegs ;
    private String name;
    public Dog(){
       // dogears = new dogear();
       // dogeyes = new dogeye();
       // dogleg = new dogleg();
       // dogears.setear(2);
       // dogeyes.seteye(2);
       // doglegs.setleg(4);
    }

    public void setname(String name){
        this.name = name;

    }

    public Animal clone(){
        Dog obj = null;
        try {
            obj = (Dog)super.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return obj;
    }
    public void  tostring(){
        System.out.println("DogName" +name);
    }
}