package Week2.Examples.java14;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class HiddenClassDemo {
	static final String CLASS_IN_BASE64 = """
			yv66vgAAADwAGAcAAgEAC0xvb2t1cFByb3h5BwAEAQAQamF2YS9sYW5nL09iamVjdAEABjxpbml0PgEAAygpVgEA\
			BENvZGUKAAMACQwABQAGAQAPTGluZU51bWJlclRhYmxlAQASTG9jYWxWYXJpYWJsZVRhYmxlAQAEdGhpcwEADUxMb\
			29rdXBQcm94eTsBAAZsb29rdXABABUoKUxqYXZhL2xhbmcvSW50ZWdlcjsKABEAEwcAEgEAEWphdmEvbGFuZy9JbnR\
			lZ2VyDAAUABUBAAd2YWx1ZU9mAQAWKEkpTGphdmEvbGFuZy9JbnRlZ2VyOwEAClNvdXJjZUZpbGUBABBMb29rdXBQcm\
			94eS5qYXZhACEAAQADAAAAAAACAAEABQAGAAEABwAAAC8AAQABAAAABSq3AAixAAAAAgAKAAAABgABAAAAAgALAAAADA\
			ABAAAABQAMAA0AAAAJAA4ADwABAAcAAAAlAAEAAAAAAAUEuAAQsAAAAAIACgAAAAYAAQAAAAUACwAAAAIAAAABABYAAAACABc=""";

    public static void main(String[] args) throws Throwable {

        byte[] array = Files.readAllBytes(
              Paths.get("D:\\OneDrive\\OneDrive - Magenic\\java11AndBeyond-eclipse-2021-workspace\\Java14\\bin\\LookUpProxy.class"));
        String s = Base64.getEncoder().encodeToString(array);
        System.out.println(s);

        testHiddenClass();

    }

    // create a hidden class and run its static method
    public static void testHiddenClass() throws Throwable {

        byte[] classInBytes = Base64.getDecoder().decode(CLASS_IN_BASE64);

        Class<?> proxy = MethodHandles.lookup()
                .defineHiddenClass(classInBytes,
                        true, MethodHandles.Lookup.ClassOption.NESTMATE)
                .lookupClass();

        // output: com.mkyong.java15.jep371.LookUpProxy/0x0000000800b94440
        System.out.println(proxy.getName());

        MethodHandle mh = MethodHandles.lookup().findStatic(proxy,
                "lookup",
                MethodType.methodType(Integer.class));

        Integer status = (Integer) mh.invokeExact();
        System.out.println(status);

    }

}
