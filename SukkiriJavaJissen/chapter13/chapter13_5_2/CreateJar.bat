REM JARファイル作成
jar -cvf Test.jar Test1.class Test2.class
REM JARファイルからTest1クラスを実行
java -cp Test.jar Test1
REM JARファイル展開
jar -xvf Test.jar
REM マニフェストを含めてJARファイル作成
jar -cvfm Test.jar manifest.txt Test1.class Test2.class