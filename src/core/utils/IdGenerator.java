package core.utils;

import java.util.UUID;

public class IdGenerator {

    public static String randomId(){
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
