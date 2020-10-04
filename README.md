# OTPProject

## DESCRIPTION

###### This project is about creating OTP line view

## Library Used

###### [otpview-pinview](https://github.com/mukeshsolanki/android-otpview-pinview)

## USAGE

 1. Add this in build.gradle project level at the last line of repositories for allprojects definition
  ```maven { url "https://jitpack.io" }```
  
 2. Then add this in build.gradle app level
  //otpview librabry
    ```implementation 'com.github.mukeshsolanki:android-otpview-pinview:2.1.0' ```

## Modifications to suite android kotlin

###### Used the following code to log the input 

```
class MainActivity : AppCompatActivity() {
    var otpView: OtpView? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        otpView = findViewById(R.id.otp_view)
        otpView!!.setOtpCompletionListener {
            Log.d("onOtpCompleted=>", it)
        }
    }
}
```


## Layout Modification
###### Add the following xml in your desired layout to create the pinview

    <com.mukesh.OtpView
        android:id="@+id/otp_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="72dp"
        android:drawableBottom="@drawable/otpline"
        android:inputType="number"
        app:lineWidth="5dp"
        app:lineColor="@color/otpTextAndLineColor"
        android:singleLine="true"
        android:textColor="@color/otpTextAndLineColor"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:viewType="line" />
