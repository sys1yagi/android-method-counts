
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
|18245|8974|1505KB|


## Java 8 desugar

[desugar?](https://developer.android.com/studio/preview/features/java8-support.html)

```
compile "com.android.support:appcompat-v7:$appcompat_v7_version"
compile "com.android.support.constraint:constraint-layout:$constraint_layout_version"
compile "com.jakewharton.threetenabp:threetenabp:$threetenabp_version"
```

Jack can not count the number of methods right now. [Method count when enabling Jack compiler](https://github.com/KeepSafe/dexcount-gradle-plugin/issues/143)

|methods|fields|apk|
|:-:|:-:|:-:|
|21316|9699|1706KB|
|+3071|+725|+201KB|


## Java 8 Retrolambda

```
compile "com.android.support:appcompat-v7:$appcompat_v7_version"
compile "com.android.support.constraint:constraint-layout:$constraint_layout_version"
compile 'com.annimon:stream:1.1.5'
compile "com.jakewharton.threetenabp:threetenabp:$threetenabp_version"
```

|methods|fields|apk|
|:-:|:-:|:-:|
|22419|10033|1802KB|
|+4174|+1059|+297KB|

>NOTE: Build for java8-retrolambda.
>Add android.enableDesugar=false to gradle.properties.
>Comment out compileOptions on java8-desugar.

## Kotlin

```
compile "com.android.support:appcompat-v7:$appcompat_v7_version"
compile "com.android.support.constraint:constraint-layout:$constraint_layout_version"
compile "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
```

1.1.2-4

|methods|fields|apk|
|:-:|:-:|:-:|
|24377|9720|1903KB|
|+6132|+746|+398KB|

