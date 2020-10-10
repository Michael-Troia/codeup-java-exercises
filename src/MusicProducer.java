public class MusicProducer extends Employee {
    public MusicProducer(String name, String dept) {
        super(name, dept);
    }

    @Override
    public void work(){
        System.out.println("The label said no more time signature changes");
    }
};

