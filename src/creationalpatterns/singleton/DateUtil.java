package creationalpatterns.singleton;

import java.io.Serializable;
import java.util.Date;

public class DateUtil implements Serializable, Cloneable {
    private static volatile DateUtil instance = new DateUtil(); // Eager initialization

    // we can also use static blocks to create singleton instance, this is also Eager initialization
    static {
        instance = new DateUtil();
    }

    private DateUtil() {

    }

    public static DateUtil getInstance() {
        // return only if the instance is null else return the existing instance
        /// This is not eager initialization ,. this is lazy initialization
        if(instance == null) { // anyhow, null check is happening again inside the synchronized block
            synchronized (DateUtil.class) {
                if(instance == null) {
                    instance = new DateUtil();
                }
            }
        }

        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); - singleton should not be cloned
        throw new CloneNotSupportedException();
    }
}
