import com.thoughtworks.gauge.BeforeSuite
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import java.net.URI

class ExecutionHooks {
    @BeforeSuite
    fun beforeSuite() {
        val options = UiAutomator2Options()
            .setUdid("emulator-5554")
            .setApp("/home/myapp.apk")
        val driver: AndroidDriver = AndroidDriver(
            URI("http://127.0.0.1:4723").toURL(), options
        )
    }
}