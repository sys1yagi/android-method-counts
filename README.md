
# Android Method Counts

use command `assembleDebug`

## default

dependencies

```
compile "com.android.support:appcompat-v7:$appcompat_v7_version"
compile "com.android.support.constraint:constraint-layout:$constraint_layout_version"
```


|methods|fields|apk|
|:-:|:-:|:-:|
|18062|8872|1520KB|


## Java 8 Jack and Jill

```
compile "com.android.support:appcompat-v7:$appcompat_v7_version"
compile "com.android.support.constraint:constraint-layout:$constraint_layout_version"
compile "com.jakewharton.threetenabp:threetenabp:$threetenabp_version"
```

Jack can not count the number of methods right now. [Method count when enabling Jack compiler](https://github.com/KeepSafe/dexcount-gradle-plugin/issues/143)

|methods|fields|apk|
|:-:|:-:|:-:|
|-|-|2168KB|


## Java 8 Retrolambda


```
compile "com.android.support:appcompat-v7:$appcompat_v7_version"
compile "com.android.support.constraint:constraint-layout:$constraint_layout_version"
compile 'com.annimon:stream:1.1.5'
compile "com.jakewharton.threetenabp:threetenabp:$threetenabp_version"
```

|methods|fields|apk|
|:-:|:-:|:-:|
|22237|10031|1816KB|
|+4175|+1159|+296KB|


## Kotlin

```
compile "com.android.support:appcompat-v7:$appcompat_v7_version"
compile "com.android.support.constraint:constraint-layout:$constraint_layout_version"
compile "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
```

|methods|fields|apk|
|:-:|:-:|:-:|
|24217|9614|1948KB|
|+6155|+742|+428KB|
