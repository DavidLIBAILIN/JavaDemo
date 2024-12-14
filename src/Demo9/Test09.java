package Demo9;

import java.lang.reflect.Method;

public class Test09 {
    public static void main(String[] args) {
        Class<InfoImpl> infoClass = InfoImpl.class;
        Method[] declaredMethods = infoClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() + ": " + declaredMethod.getReturnType().getSimpleName());
        }
    }
}
