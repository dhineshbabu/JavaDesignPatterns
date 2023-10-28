package creationalpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Date;

public class ReflectionProblem {
    public static void main(String[] args) {
        DateUtil instance1 = DateUtil.getInstance();
        DateUtil instance2 = null;

        Constructor[] constructors = DateUtil.class.getDeclaredConstructors();
        System.out.println(Arrays.toString(constructors));

        for(Constructor constructor : constructors) {
            constructor.setAccessible(true); // making the private constructor to accessible

            try{
                instance2 = (DateUtil) constructor.newInstance();
                break;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // below code should print different hashCodes breaking the singleton rule

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
