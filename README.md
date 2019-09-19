# react-native-idnow

## Getting started

`$ npm install react-native-idnow --save`

### Mostly automatic installation

`$ react-native link react-native-idnow`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-idnow` and add `RNIDNow.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNIDNow.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import co.urbi.idnow.RNIDNowPackage;` to the imports at the top of the file
  - Add `new RNIDNowPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-idnow'
  	project(':react-native-idnow').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-idnow/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-idnow')
  	```


## Usage
```javascript
import RNIDNow from 'react-native-idnow';

// TODO: What to do with the module?
RNIDNow;
```
