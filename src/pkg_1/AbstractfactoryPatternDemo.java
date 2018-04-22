package pkg_1;

/**
 * Created by User on 4/22/2018.
 */
public class AbstractfactoryPatternDemo {

    public static void main(String[] args) {

        //get shape factory
        ApControl ApFactory = new ApControl() {
            @Override
            DisplayDriver getdisplaydriver() {
                return null;
            }

            @Override
            PrintDriver getprintdriver() {
                return null;
            }
        };


    }



}
