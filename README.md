# Custom BindingAdapter in Kotlin

activity_main.xml
```
<TextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:kotlinText="@{viewModel.kotlinText}"
    />
<Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Button"
    app:kotlinClick="@{viewModel.kotlinClick}"
    />
```

KotlinBindingAdapter.kt
```
object KotlinBindingAdapter {
    @BindingAdapter("kotlinText")
    @JvmStatic
    fun setKotlinText(view: TextView, text: String) {
        view.text = text
    }

    @BindingAdapter("kotlinClick")
    @JvmStatic
    fun setKotlinClick(view: Button, listener: View.OnClickListener) {
        view.setOnClickListener(listener)
    }
}
```

Error
```
/Users/wada/AndroidStudioProjects/KotlinBindingAdapter/app/src/main/res/layout/activity_main.xml
Error:(30, 31) Cannot find the setter for attribute 'app:kotlinText' with parameter type java.lang.String on android.widget.TextView. 
```
