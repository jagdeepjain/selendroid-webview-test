selendroid-webview-test
=======================

Simple test script for ui automation on mobile webview using selendriod.

Setting up envrionment
======================
Download android sdk https://developer.android.com/sdk/index.html
Add all required packages as per your requirement

Modify permissions so as to make tools scripts executable:
```
chmod -R 775 andriod-sdk-eclipse/
```

Setup required path:
edit ~/.bash_profile
add:
```
export ANDROID_HOME="/Users/<your-user-name>/andriod-sdk-eclipse/adt-bundle-mac-x86_64-20140702/sdk"
export PATH="$PATH:$ANDROID_HOME/tools"
export PATH="$PATH:$ANDROID_HOME/platform-tools"
```
Test:
```
$ android target list
```
This will list the current configuration, if you get something like ID : 1 etc that means all set, follow https://developer.android.com for complete information.

Creating AVD aka android virtual device
=======================================
Below command will create a virtual device:
```
$android create avd -n my_android20 -t 2 --abi default/armeabi-v7a
```

Starting up emulator
====================
```
emulator -avd my_andriod20&
```
do below to see it in the list:
```
$adb devices
```

Setting up selendroid
=====================
Download selendroid 
Navigate to the download path and start the stand alone server: http://selendroid.io/
```
$java -jar selendroid-standalone-0.11.0-with-dependencies.jar
```

Starting test:
==============
```
$mvn test
```


