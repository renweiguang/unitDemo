//package xmlCdata;
//
//import org.dom4j.DocumentHelper;
//import org.jdom2.Document;
//import org.jdom2.Element;
//
//import java.util.Iterator;
//import java.util.List;
//
//public class Testttt
//{
//    public static void main(String [] args){
//        String result1="<?xml version=\"1.0\" encoding=\"UTF-8\"?><bill><id>4028a8973f5c45db013f5c61fb8f0002</id><ProofBillBarCode>B11000000000020130600003</ProofBillBarCode><proofInfo id=\"4028708c3f552dbd013f552dbd140000\">W11000000000020130600001</proofInfo></bill>";
//        try {
//            Document doc=(Document) DocumentHelper.parseText(result1);
//            Element books = doc.getRootElement();
//            System.out.println("根节点"+books.getName());
//            // Iterator users_subElements = books.elementIterator("UID");//指定获取那个元素
//            Iterator Elements = books.elementIterator();
//            while(Elements.hasNext()){
//                Element user = (Element)Elements.next();
//                System.out.println("节点"+user.getName()+"\ttext="+user.getText());
//                List subElements = user.elements();
//                //    List user_subElements = user.elements("username");指定获取那个元素
//                //             System.out.println("size=="+subElements.size());
//                //             for( int i=0;i<subElements.size();i++){
//                //                 Element ele = (Element)subElements.get(i);
//                //                 System.out.print(ele.getName()+" : "+ele.getText()+" ");
//                //             }
//                System.out.println();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
