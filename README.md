# java9のモジュールにするためにやること
## 参考URL
[Maven JDK9 Jigsaw Example](https://github.com/khmarbaise/jdk9-jlink-jmod-example/tree/master/maven-example)
[A practical guide to Java 9 - compile, jar, run](https://sites.google.com/a/athaydes.com/renato-athaydes/posts/guidetojava9-compilejarrun)

## apiプロジェクト
- [module-info.java](api/src/main/java/module-info.java)作成

## implプロジェクト
- [module-info.java](impl/src/main/java/module-info.java)作成

## applicationプロジェクト
- [module-info.java](application/src/main/java/module-info.java)作成

## runtime-image
runtime image作成用プロジェクト(jlinkプラグイン利用)

## プロジェクトの依存関係
```
jdeps -s $(find . *.jar)


java9.spring.boot.api -> java.base
java9.spring.boot.impl -> java.base
java9.spring.boot.impl -> java9.spring.boot.api
java9.spring.boot.application -> java.base
java9.spring.boot.application -> java9.spring.boot.api
```

![](dependency.png)

## 実行(従来)
```
java -p target/libs -m java9.spring.boot.application/com.hyojinbae.sample.java9.spring.boot.Java9SpringBootApplication
```

## 実行(jlink)

### maven goal実行
```
clean package
```

### アプリケーション実行
terminalにて下記を実行する。

```
runtime-image/target/maven-jlink/bin/java com.hyojinbae.sample.java9.spring.boot.Java9SpringBootApplication
```


## まとめ
- 意図しなかったクラスを参照(import)するのを防げる
- IDE(intellij)機能を使えば簡単にできる


## その他
### jlink
jlinkつーるはautomatic moduleのlinkはサポートしていなめ、automatic moduleが含まれていると下記のエラーが発生する。

```
module-info.class not found for XXX modules
```

そのため、 automatic module(none modular jar)が含まれているアプリケーションのruntime imageを作成するには、module-info.classを作成する必要がある。
その際に、jdepツールの--generate-module-infoオプションが役に立つ。

```
jdeps --generate-module-info dir xxx-1.0.jar xxx.jar
```
