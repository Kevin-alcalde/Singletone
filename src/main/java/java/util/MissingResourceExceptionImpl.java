package java.util;

public class MissingResourceExceptionImpl extends MissingResourceException {
    public MissingResourceExceptionImpl(String s, String className, String key) {
        super(s, className, key);
    }
}
