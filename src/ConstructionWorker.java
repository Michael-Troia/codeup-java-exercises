public class ConstructionWorker extends Employee{
    public ConstructionWorker(String name, String dept){
        super(name, dept);
    }

    @Override
    public void work(){
        System.out.println("My lower-back paid the price for this building.");
    }
}
