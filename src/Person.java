public class Person {
    private String name;

    public Person (String name){
        this.name = name;
    }
    public Person () { this.name = "help me";}
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("It's %s!!\n", this.getName());
    }

    public static void main(String[] args) {
        Person p1 = new Person("Mike");//Use contructor to build a person
        System.out.println(p1.name);

        System.out.println(p1.getName());//use getname function to get the name

        p1.setName("Michael Jackson");//use setname function to change name
        System.out.println(p1.getName());

        p1.sayHello();//use sayhello function to say hello to new name


    }
}
