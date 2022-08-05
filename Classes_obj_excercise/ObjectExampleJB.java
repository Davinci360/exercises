public class ObjectExampleJB {
    public static void main(String[] args) {

        Persons person1 = new Persons("Jason",39,200,'M',"black");
        Persons person2 = new Persons(65,'F',"caucasian");
        Persons person3 = new Persons("Jennifer",38,140,'f',"hispanic");
        Persons person4 = new Persons(15,'M',"asian");
        Persons person5 = new Persons("Abdul",45,200,'M',"black");

        //Method #2 (println)
         String personsString = person1.toString();

        System.out.println(personsString);
        //Method #3 (.toString)
        String personString = person2.toString();
        System.out.println(personsString);
        //Method #4 (.equals) Check if 2 Persons have the same race
        System.out.println(person5.race.equals(person1.race)); //true. How can I set this to make a string statement?

    }
}