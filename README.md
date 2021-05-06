# VGS Collect/Show SDK. React Native Demo.

<p align="center">
    <img src="images/vgs-filled.png" width="200">
    <img src="images/vgs-revealed.png" width="200">
</p>

> **_NOTE:_**  This demo is just an example of how VGS Collect SDK can be integrated into your application.


## How to run it?

Development domain: https://facebook.github.io/react-native/docs/getting-started

### Installing dependencies

**Node & Watchman**:
```
brew install node
brew install watchman
```
**Java Development Kit**:
```
brew tap AdoptOpenJDK/openjdk
brew cask install adoptopenjdk8
```

**Android development environment**:
- Android SDK
- Android SDK Platform
- Performance (Intel ® HAXM) (See here for AMD)
- Android Virtual Device


**Configure the ANDROID_HOME environment variable**:
```
export ANDROID_HOME=$HOME/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/emulator
export PATH=$PATH:$ANDROID_HOME/tools
export PATH=$PATH:$ANDROID_HOME/tools/bin
export PATH=$PATH:$ANDROID_HOME/platform-tools
```

### Running the project
- `git clone git@github.com:verygoodsecurity/vgs-collect-android-react-native.git`
- Open a Terminal and go to the project directory(`./vgs-collect-android-react-native`).
- If this is first start - run ``npm install`` command.
- Run `restart.sh` script to clear cache and build project on emulator.
- Make sure you have ``assets`` folder created here ``/android/app/src/main/assets``

**Note:** Please, don't forget to change ``<vault_id>`` for [Collect](https://github.com/vgs-samples/vgs-collect-show-android-react-native-demo/blob/master/android/app/src/main/java/com/verygoodsecurity.reactnative/collect/VGSCollectModule.java#L31) and [Show](https://github.com/vgs-samples/vgs-collect-show-android-react-native-demo/blob/master/android/app/src/main/java/com/verygoodsecurity.reactnative/show/VGSShowModule.java#L29) SDKs from [VGS Dashboard](https://dashboard.verygoodsecurity.com/dashboard/).



