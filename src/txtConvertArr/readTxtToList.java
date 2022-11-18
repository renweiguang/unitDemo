package txtConvertArr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readTxtToList {
    public static void main(String[] args) throws IOException {
        int i = 0;
        FileWriter fw = new FileWriter("C:\\Users\\renwg\\Desktop\\same.txt");
        List<KeyValue> caseCodeList = readCaseCodeTxt();

        List<KeyValue> myTxtList = readMytxt();

        List<KVMap> kvMapList = readMapTxt();

        for (KeyValue caseClassKey : caseCodeList) {
            for (KeyValue myTxtKey : myTxtList) {
                if (caseClassKey.getKey().equals(myTxtKey.getKey())) {
                    if (!caseClassKey.getValue().equals(myTxtKey.getValue())) {
                        System.out.println(caseClassKey.getKey());
                        fw.write(caseClassKey.getKey());
                        fw.write("\n");
                        i++;
                    }
                    break;
                }
            }
        }
        System.out.println("查找重复数据结束......................................................");
        fw.close();
        System.out.println(i);

        for (KeyValue caseClassKey : caseCodeList) {
            for (KVMap kvMap : kvMapList) {
                if (caseClassKey.getKey().equals(kvMap.getKey())) {
                    if (!caseClassKey.getValue().equals(kvMap.getValue())) {
                        kvMap.setValue(caseClassKey.getValue());
                    }
                }
            }
        }
        FileWriter fw1 = new FileWriter("C:\\Users\\rwg\\Desktop\\newCaseCode.txt");

        for (KVMap kvMap : kvMapList) {
            fw1.write(kvMap.getKey1() + " " + kvMap.getValue1() + " " + kvMap.getKey() + " " + kvMap.getValue());
            fw1.write("\n");
        }

        fw1.close();
    }

    public static List<KeyValue> readCaseCodeTxt() {
        List<KeyValue> list = new ArrayList<>();
        try (FileReader reader = new FileReader("C:\\Users\\rwg\\Desktop\\case_class2.txt");
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                String[] arr = line.split("\t");

                KeyValue keyValue = new KeyValue();
                keyValue.setKey(arr[0]);
                keyValue.setValue(arr[2]);
                list.add(keyValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<KeyValue> readMytxt() {
        List<KeyValue> listMyTxt = new ArrayList<>();
        try (FileReader reader = new FileReader("C:\\Users\\renwg\\Desktop\\mytxt.txt");
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {

            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                String[] arr = line.split(" ");

                KeyValue keyValue = new KeyValue();
                keyValue.setKey(arr[0]);
                keyValue.setValue(arr[1]);
                listMyTxt.add(keyValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listMyTxt;
    }

    public static List<KVMap> readMapTxt() {
        List<KVMap> listKvMap = new ArrayList<>();
        try (FileReader reader = new FileReader("C:\\Users\\rwg\\Desktop\\caseClassCode.txt");
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                String[] arr = line.split(" ");

                KVMap kvMap = new KVMap();
                kvMap.setKey1(arr[0]);
                kvMap.setValue1(arr[1]);
                kvMap.setKey(arr[2]);
                kvMap.setValue(arr[3]);
                listKvMap.add(kvMap);
                System.out.println(arr[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listKvMap;
    }
}
