package shujujiegou;

/**
 * 冒泡排序
 */
public class MaoPaoPaiXu {
    public static void main(String[] args) {
        int temp;
        int[] arr = {1, 4, 3, 2, -1, 9};
//        for (int i = 0; i < arr.length - 1; i++) {
//            // 每趟排序出来一个最大的所以每趟都会变少 -1是因为怕数组越界
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }

        for(int i=0; i<arr.length -1; i++){
            for (int j=0; j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                     temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //冒泡
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j < arr.length - i -1; j++){

            }
        }

        //希尔
        for (int gap =4; gap >0; gap = gap/2){
            for (int i=gap; i<arr.length; i++){
                for (int j=i; j>gap-1; j = j-gap){
                    if (arr[j-gap] > arr[j]){
                         temp = arr[j-gap];
                        arr[j-gap] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
