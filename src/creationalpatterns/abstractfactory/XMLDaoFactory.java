package creationalpatterns.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory{
    @Override
    public Dao createDao(String type) {
       Dao dao = null;

       if(type.equals("emp")) {
           dao = new XMLEMPDao();
       } else if(type.equals("dept")) {
           dao = new XMLDeptDao();
       }

       return dao;
    }
}
