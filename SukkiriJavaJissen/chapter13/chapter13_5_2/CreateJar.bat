REM JAR�t�@�C���쐬
jar -cvf Test.jar Test1.class Test2.class
REM JAR�t�@�C������Test1�N���X�����s
java -cp Test.jar Test1
REM JAR�t�@�C���W�J
jar -xvf Test.jar
REM �}�j�t�F�X�g���܂߂�JAR�t�@�C���쐬
jar -cvfm Test.jar manifest.txt Test1.class Test2.class