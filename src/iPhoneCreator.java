/**
 * Created by Frett on 2/14/2017.
 */
public class iPhoneCreator {
    public static iPhone7 createNewPhone(String sn,float price){
        iPhone7 p1 = new iPhone7(sn,price);
        p1.bundle();
        p1.prepSoftware();
        p1.qualityCheck();
        p1.ship();

        return p1;
    }
}

