# Android AR Text Assistance

Use [ML Kit](https://developers.google.com/ml-kit) [ARCore](https://developers.google.com/ar), and [Sceneform](https://github.com/google-ar/sceneform-android-sdk) to make it easy to look up beer on menus and in images using your Android phone.

# Features

- Done: Recognize and display text in the camera feed
- TODO: Persistently highlight selected text
- TODO: Search for beer results given a string
- TODO: Render UI on selected text

# Setup

0. Join the [Clean Code Slack](https://join.slack.com/t/cleancodersgroup/shared_invite/enQtNzEyMjgyMDU3MDYwLTZkMjViNWVkZTJlNTI4NjZmZGIzNGY5NDA2NThhMGJiOWNmMTRkYmI4ZTUzYzI0YzJmYTZhNDMwM2UzY2I3MjU)
0. Join the [#project-android-camera](https://cleancodersgroup.slack.com/archives/C012RC4D7MM) channel
0. Clone this repository
1. Install [Android Studio](https://developer.android.com/studio/install)
2. Install [Android R SDK](https://developer.android.com/studio/intro/update) under SDK Platforms 
3. Create an [AVD](https://developer.android.com/studio/run/managing-avds). Recommend using a Pixel 3a with the Play Store Badge and Android R. 
4. Open the repository directory in Android studio, select "app" in the top bar to the right of the hammer, and click the green play button to build the app and install on your emulator.
5. Set the `textInput.jpg` to show up on the wall in the virtual camera under camera settings of your emulator.
6. Walk over to the wall in the virtual camera. You should see recognized text appear over the wall.

# Notes

May 6th 2020:  
Emulators need Google play services update to run app.  Get the APK, Google_Play_Services_for_AR_1.16_x86_for_emulator.apk, from https://github.com/google-ar/arcore-android-sdk/releases and drag and drop the APK on to the running emulated phone to update the Google play services
Next steps are to introduce a text string in to the emulated environment and to capture the text string for processing:
  - https://developers.google.com/vision/android/getting-started
  - https://codelabs.developers.google.com/codelabs/mobile-vision-ocr/#0


May 11th 2020:
Use extended controls once emulator is running to embed pictures in emulated camera environment:
  https://gist.github.com/gabrieljoelc/df8256b896cac46bd51fd2deb412da5f
  Use included textInput.jpg for testing
