import java.util.List;

public class iPhoneFactory {
    private static iPhoneFactory instance;

    //CONSTRUCTOR PRIVADO
    private iPhoneFactory() {}

    //INSTANCE
    public static iPhoneFactory getInstance() {
        if (instance == null){
            instance = new iPhoneFactory();
        }
        return instance;
    }

    public iPhone oderIphone(String modelo){
        switch (modelo){
            case "iPhone 11":
                return new iPhone11();
            case "iPhone X":
                return new iPhoneX();
            default:
                break;
        }
            return null;
    }
}
