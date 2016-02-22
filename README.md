# ECSE428-TDDapp
####Postal rate calculator created using TDD (Test-Driven Development)
####Assignment for Software Engineering Practice (ECSE 428) at McGill

##Running JUnit Tests

 1.	Clone from Github master branch to local repository
 2.	Navigate to the git repository ("ECSE428-TDDapp" directory) from a terminal and run 
 
 ```ant test``` 

 The ant command as specified in build.xml will compile the source code and run all junit tests.

 Note: Must have [Apache Ant](https://ant.apache.org/bindownload.cgi) installed to run ant commands and a java JDK to compile.
 3.	To view an html report of the junit test results, navigate to the junit folder after running step 2 and open `index.html` in a browser window. 


##Running Android App

1. To generate the APK, we used the Build APK function in Android Studio (Build -> Build APK). A debug APK (sufficient) for our purposes is generated in ECSE428-TDDapp/PostalRateCalculator/app/build/outputs/apk folder. 

2. For convenience, we've put an apk in the top-level folder. It can also be downloaded directly from the following link
<p align="center">
<a href="https://raw.githubusercontent.com/demetrios-koziris/ECSE428-TDDapp/master/app-debug.apk">Download Mobile Postal Rate Calculator</a>
</p>

3. To run, download the .apk file on your android device, open it, and click Install. Note that you must have "Unknown sources: Allow installation of applications from both trusted and unknown sources" turned on in your settings or you will be prompted to change this setting before you can install.

4. For more details see 
<a href="http://www.digitalcitizen.life/how-sideload-apps-using-apk-files-android-devices">How To Sideload Apps Using APK Files On Android Devices</a>

<br>



##TDD Unit Test Mind Map
<p align="center">
  <img src="TDD_MindMap.png">
</p>
