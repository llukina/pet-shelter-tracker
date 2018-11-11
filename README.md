# PetShelterTracker
Android application for creating / modifying / keeping / deleting the data about pets in shelter.

This application saves the data about pet in sqlite database, and allows users to enter new pet, modify it and delete it from the database. On main screen it displays a list of saved pets and by selecting any, we can see / modify data. Tapping the floating action button opens new screen where a new pet can be inserted. 
Used in a Udacity course in the Android Basics Nanodegree by Google.



## Requirements:
- Android Studio 3.2 or later
- Java 7+
- Android 5.1 or later



## How to install:
1. Import project to Android studio:
    - Click on **Checkout from Version Control** (on Welcome screen, or in Toolbar - **VCS**) - **Git** in URL field set **https://github.com/isink17/pet-shelter-tracker** or
    - Download this project as .zip - unpack it, and select **Open an existing Android Studio project** from Welcome Screen _or_ in Toolbar - **File** - **Open...** and select the folder with the extracted project.
2. Click on **Run 'app** or **Shift + F10**
3. Select deployment target:
   - To deploy the application to virtual device go [here](https://developer.android.com/studio/run/emulator) .
   - To deploy the application to real device go [here](https://developer.android.com/studio/run/device) .


Application uses LoaderManager to manage Loaders.

![Alt text](Screenshot_1.png?raw=true "Empty view")
![Alt text](Screenshot_2.png?raw=true "Insert dummy data")
![Alt text](Screenshot_3.png?raw=true "Discard changes")
![Alt text](Screenshot_4.png?raw=true "Edit pet")
