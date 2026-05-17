package one.xis.boot.nativevalue;

import one.xis.ModelData;
import one.xis.Page;
import one.xis.WelcomePage;
import one.xis.context.Value;

@Page("/native-value.html")
@WelcomePage
class NativeValuePage {

    @Value("native.value.message")
    private String message;

    @ModelData("message")
    String message() {
        return message;
    }
}
