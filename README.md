# java9のモジュールにするためにやること
## apiプロジェクト
- [module-info.java](api/src/main/java/module-info.java)作成

## implプロジェクト
- [module-info.java](impl/src/main/java/module-info.java)作成

## applicationプロジェクト
- [module-info.java](application/src/main/java/module-info.java)作成

## まとめ
- 意図しなかったクラスを参照(import)するのを防げる
- IDE(intellij)機能を使えば簡単にできる
