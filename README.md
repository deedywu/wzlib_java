本程序由原来程序  [Brenterino/jwzlib](https://github.com/Brenterino/jwzlib) fork而来<br>
2023/11/11<br>
1.修复了decryptUnicodeStr读取 简/繁 中文会乱码的bug<br>
测试用例 src/test/java/xxxReadString 自行修改本地路径版本测试<br>
<br>
也可以通过引包的方式使用<br>
<br>
1.gradle
```
repositories {
  maven { url 'https://jitpack.io' }
  ...
}
```
``` implementation 'com.github.deedywu:wzlib_java:v1.0'```
<br>
2.maven
```
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```
```
<dependency>
  <groupId>com.github.deedywu</groupId>
  <artifactId>wzlib_java</artifactId>
  <version>v1.0</version>
</dependency>
```
