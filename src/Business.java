public class Business {
    public static void main(String[] args) {
        Employee [] employees = {
                new ConstructionWorker("Mike", "Construction"),
                new MusicProducer("Hanz", "Production")
        };

        for (Employee employee: employees){
            employee.work();
        }
    }
}
