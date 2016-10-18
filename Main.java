package DES;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad Naufal A on 08/10/2016.
 */
/*public class Main {
    public static void main(String[] argv) throws Exception {
        SecretKey key = KeyGenerator.getInstance("DES").generateKey();
        DesEncrypter encrypter = new DesEncrypter(key);
        String encrypted = encrypter.encrypt("Don't tell anybody!");
        String decrypted = encrypter.decrypt(encrypted);

        System.out.println(encrypted);
    }
}*/
public class Main{
    public static void main(String[] argv) throws UnsupportedEncodingException {
        String teks = "100110010110";
//        String teks2 = "011110011010111011011001110110111100100111100101";
        DesEncrypter encrypter = new DesEncrypter(teks);
        List<String> aa = new ArrayList<String>();
        String bb;
//        System.out.println(encrypter.keyToBiner(teks));
//        bb = encrypter.encrypt(teks);
//        System.out.println(bb);
//        for (String a: aa){
//            System.out.println(a);
//        }
//        System.out.println(encrypter.leftShift(teks,2));
//        for (int i=0; i<teks.length();i++){
//            System.out.print(Character.toString(teks.charAt(i)));
//        }
        bb = encrypter.encrypt("COMPUTER","133457799BBCDFF1");
        BigInteger x = new BigInteger(bb,2);
        System.out.println(bb);
        System.out.println(x.toString(16));
//        bb = encrypter.keyToBiner("133457799BBCDFF1");
//        String cc = encrypter.xor(encrypter.getLeftKeyBiner(encrypter.permutation(bb,encrypter.matrixPcSatu)),
//                encrypter.getRightKeyBiner(encrypter.permutation(bb,encrypter.matrixPcSatu)));
//        System.out.println(bb);
//        System.out.println(encrypter.permutation(bb,encrypter.matrixPcSatu));
//        System.out.println(encrypter.getLeftKeyBiner(encrypter.permutation(bb,encrypter.matrixPcSatu)));
//        System.out.println(encrypter.getRightKeyBiner(encrypter.permutation(bb,encrypter.matrixPcSatu)));
//        bb = "100110110000001011101111111111001010010001110100";
//        encrypter.initSBoxes();
//        System.out.println(encrypter.sBox(bb,encrypter.sBoxes));
    }
}