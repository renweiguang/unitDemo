package txtConvertArr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class demo03 {
    static List x = new ArrayList();
    static List y = new ArrayList();

    public static void main(String args[]) {
        readFile();
    }

    /**
     * 读入TXT文件
     */
    public static void readFile() {
        List<CaseClassCode> caseClassCodeList = new ArrayList<>();
        String pathname = System.getenv().get("HSZJ_MAIN_PATH") + File.separator + "CONF" + File.separator
                + "01.txt"; // 绝对路径或相对路径都可以，写入文件时演示相对路径,读取以上路径的input.txt文件
        //防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
        //不关闭文件会导致资源的泄露，读写文件都同理
        //Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                String[] s = line.split(" ");

                CaseClassCode caseClassCode = new CaseClassCode();
                caseClassCode.setXxx(s[0]);
                caseClassCode.setYyy(s[2]);
                caseClassCodeList.add(caseClassCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class CaseClassCode {
        public String xxx;

        public String yyy;

        public String getXxx() {
            return xxx;
        }

        public void setXxx(String xxx) {
            this.xxx = xxx;
        }

        public String getYyy() {
            return yyy;
        }

        public void setYyy(String yyy) {
            this.yyy = yyy;
        }
    }
}

