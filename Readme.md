# Android AR Text Assistance

Use [ML Kit](https://developers.google.com/ml-kit) [ARCore](https://developers.google.com/ar), and [Sceneform](https://github.com/google-ar/sceneform-android-sdk) to make it easy to look up beer on menus and in images using your Android phone.

# Features

- Done: Recognize and display text in the camera feed
- TODO: Persistently highlight selected text
- TODO: Search for beer results given a string
- TODO: Render UI on selected text

# Notes

May 6th 2020:  
Emulators need Google play services update to run app.  Get the APK, Google_Play_Services_for_AR_1.16_x86_for_emulator.apk, from https://github.com/google-ar/arcore-android-sdk/releases and drag and drop the APK on to the running emulated phone to update the Google play services
Next steps are to introduce a text string in to the emulated environment and to capture the text string for processing:  https://developers.google.com/vision/android/getting-started

May 11th 2020:
Use extended controls once emulator is running to embed pictures in emulated camera environment:
  https://gist.github.com/gabrieljoelc/df8256b896cac46bd51fd2deb412da5f
  Use included textInput.jpg for testing
