import java.util.Arrays;
public class ArrayExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];
        persons[0] = new Person("bob");
        persons[1] = new Person("bobby");
        persons[2] = new Person("bobbra");

        for (Person p : persons) {
            System.out.println(p.getName());
        }


        addPerson(persons, new Person("bobbette"));

        Person[] newPersons = addPerson(persons, new Person("bobbette"));

        for (Person p: newPersons){
            System.out.println(p.getName());
        }

    }

    public static Person[] addPerson(Person[] array, Person newPerson) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = newPerson;
        return array;
    }
}

