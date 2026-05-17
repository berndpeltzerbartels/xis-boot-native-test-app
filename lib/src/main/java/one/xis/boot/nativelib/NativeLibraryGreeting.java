package one.xis.boot.nativelib;

import one.xis.context.Component;

@Component
public class NativeLibraryGreeting {

    public String message() {
        return "library component from maven local";
    }
}
