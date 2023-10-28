package creationalpatterns.abstractfactory;

public class XMLEMPDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving employee to xml");
    }
}
