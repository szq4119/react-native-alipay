# react-native-alipay


具体要求请修改 /android/src/main/java/com/alipay/AlipayModule.java 文件

## Installation
```bash
npm install react-native-alipay@latest --save
```

```bash
react-native link react-native-alipay
```

* register module (in MainActivity.java)
```java
import com.alipay.AlipayPackage;  // <--- import
 public class MainActivity extends Activity implements DefaultHardwareBackBtnHandler {
    ...
    private AlipayPackage alipay;
    ...
    protected void onCreate(Bundle savedInstanceState) {
      ...
      alipay = new AlipayPackage(this);
      ...
      mReactInstanceManager = ReactInstanceManager.builder()
        ...
        .addPackage(alipay)
      }  
    ...
  }
```
