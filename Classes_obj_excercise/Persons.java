public class Persons {
    //At least 5 Class Member Variables
    String name;
    Integer age;
    Integer weight;
    Character sex;
    String race;

    //Constructor #1
    public Persons(String name, Integer age, Integer weight, Character sex, String race){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.race = race;
    }
    //Constructor #2 with default values
    public Persons( Integer age, Character sex, String race) {
        this.name = "John Doe";
        this.age = age;
        this.weight = null;
        this.sex = '?';
        this.race = race;
    }

    // Method #1 (toString)
    // override the toString method to make it give us what we want to see:
    @Override // Indicates this child behavior is different than the parent
    public String toString(){
        String returnValue = ""; //initialized to empty string
        returnValue += "The person is named " + this.name;
        returnValue += ", they are " + this.age + " years old";
        returnValue += ", they are of " + this.race + " origin.";
        return returnValue;
        //? System.out.println(returnValue); Why doesn't this work?
    }


}
