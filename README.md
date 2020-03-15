## Introduction
*That's You* is my android app for fun. I created it in purpose of learning and creating something that I find useful for myself and fun to use it.
## Features
- Running foreground service to capture of the person face when using the mobile
- Recognise person face and know who they are based on the previous or available photos of them that input into the app for AI (Image processing & recognition)
- Train image processing AI by import all the photo related to a particular person so that the app can recognize and know the person from the front camera capture
- Import funny or prank image for that particular person so that it will be on the lock screen wallpaper after the screen is locked when the recognition processed it done
> **Note:** All these service and features can only be run and stop within the app and to minimize the app so the user is allowed to do something else.
## About the App
App is called *That's You*. It is used for changing lock screen wallpaper based on the person who, at the moment, using that mobile phone. It is like a prank to surprise someone with their photo (funny photo of them or their captured face) in the lock screen after the face is detected by the app.
### TODO:
- [ ] Create button to start and stop service
- [ ] Detect face and capture image secretly when the service is started in the background
- [ ] Train AI to be able to recognize certain person
- [ ] Create AI to that takes the captured face as the input to recognize who it is based on the train data
- [ ] Create file input for images
    - [ ] Input for training image
    - [ ] Input for lock screen image
- [ ] Create button upload train image
- [ ] Create button unload lock screen image
- [ ] Stop Service automatically after the recognition is done and image for that person is set