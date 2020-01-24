import java.lang.reflect.*;
public class Main {
  public static void main(String[] args) throws Exception {
    Class clazz = RefSample.class;
    // ����1�̃R���X�g���N�^���擾���A�C���X�^���X�𐶐�����
    Constructor<?> cons = clazz.getConstructor(int.class);
    RefSample rs = (RefSample) cons.newInstance(256);
    // times�t�B�[���h�Ɋւ���field���擾���ēǂݏ���
    Field f = clazz.getField("times");
    f.set(rs, 2);
    System.out.println(f.get(rs));
    // ����2��hello���\�b�h���擾���ČĂяo��
    Method m = clazz.getMethod("hello", String.class, int.class);
    m.invoke(rs, "reflection!", 128);
    // �N���X�⃁�\�b�h�ւ̏C��(public��final�̗L��)�𒲂ׂ�
    boolean pubc = Modifier.isPublic(clazz.getModifiers());
    boolean finm = Modifier.isFinal(m.getModifiers());
  }
}