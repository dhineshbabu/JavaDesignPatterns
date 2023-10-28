package creationalpatterns.abstractfactory;

public class DBEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving employee to db");
    }
}
