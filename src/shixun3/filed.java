package shixun3;


import java.io.File;
import java.io.IOException;

/**
 * �����ļ�
 */
public class filed {

    public static void main(String[] args) {
        //�����ļ���4�ַ���
        //ͨ��·����
        File f1 = new File("d:/io/test1.txt");
        isEmpty(f1);
        //Ĭ�ϴ�������ǰ����Ŀ¼��
        File f2 = new File("test2.txt");
        isEmpty(f2);
        //���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ��
        File f3 = new File("d:/io", "test3.txt");
        isEmpty(f3);
        //���� parent ����·������ child ·�����ַ�������һ���� File ʵ��
        File f = new File("d:/io");
        File f4 = new File(f, "test4.txt");
        isEmpty(f4);
    }

    private static void isEmpty(File file) {
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("�����ļ��ɹ�");
                } else {
                    System.out.println("�����ļ�ʧ��");
                }
            }
            catch (IOException e) {
                e.printStackTrace();
                System.out.println("�����ļ�����;������·��������");
            }
        }

    }


}
