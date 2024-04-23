<?php

include("database.php");


?>
    <ScrollView android:layout_width="match_parent" android:layout_height="match_parent">
        <LinearLayout android:layout_width="match_parent" android:layout_height="wrap_content" android:orientation="vertical">
            <TextView android:id="@+id/textView"
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginStart="130dp"
                      android:layout_marginTop="128dp"
                      android:text="Log in"
                      android:textColor="@color/white"
                      android:textSize="50sp"
                      android:textStyle="bold"/>
            <EditText android:id="@+id/editTextText" android:layout_width="match_parent" android:layout_height="50dp" android:hint="UserName" android:textAlignment="center" android:textColor="@color/white" android:textColorHint="@color/white" android:ems="10" android:background="#74B59F98" android:layout_marginTop="128dp" android:layout_marginStart="32dp" android:layout_marginEnd="32dp" android:inputType="text"/>
            <EditText android:id="@+id/editTextPassword" android:layout_width="match_parent" android:layout_height="50dp" android:hint="Password" android:textAlignment="center" android:textColor="@color/black" android:textColorHint="@color/white" android:ems="10" android:background="#74B59F98" android:layout_marginTop="32dp" android:layout_marginStart="32dp" android:layout_marginEnd="32dp" android:inputType="textPassword"/>
            <TextView android:id="@+id/textView6" android:layout_width="match_parent" android:layout_height="wrap_content" android:text="Forget Your Password?" android:textAlignment="center" android:textColor="@color/white" android:textSize="16sp" android:layout_marginTop="16dp"/>
            <androidx.appcompat.widget.AppCompatButton android:id="@+id/button" style="@android:style/Widget.Button" android:layout_marginTop="64dp" android:layout_marginStart="32dp" android:layout_marginEnd="32dp" android:background="#52511806" android:textSize="18sp" android:textStyle="bold" android:textColor="@color/white" android:layout_width="match_parent" android:layout_height="wrap_content" android:onClick="btnClick" android:text="Login"/>
            <TextView android:id="@+id/textView7" android:layout_width="match_parent" android:layout_height="wrap_content" android:text="Don't have an account" android:textColor="@color/white" android:textSize="16sp" android:textAlignment="center" android:layout_marginTop="32dp"/>
            <TextView android:id="@+id/textView8" android:layout_width="match_parent" android:layout_height="wrap_content" android:text="Register Now" android:textAlignment="center" android:textColor="@color/white" android:textSize="16sp" android:textStyle="bold"/>
        </LinearLayout>
    </ScrollView>