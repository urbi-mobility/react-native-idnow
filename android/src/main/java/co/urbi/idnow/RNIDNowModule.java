package co.urbi.idnow;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import de.idnow.sdk.IDnowSDK;

public class RNIDNowModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNIDNowModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNIDNow";
    }

    @ReactMethod
    public void sampleMethod(String stringArgument, int numberArgument, Callback callback) {
        try {
            IDnowSDK.getInstance().initialize(this.reactContext.getCurrentActivity(), "");
            callback.invoke("yo! IDnow is all set!");
        } catch (Exception e) {
            callback.invoke("he, IDnow failed with message" + e.getMessage() + ". See logs for details.");
        }
    }
}
