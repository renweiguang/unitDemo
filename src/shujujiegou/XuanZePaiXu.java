package shujujiegou;

/**
 * 选择排序就是就是拿出第一个和后面的所有去比对，每发现最小的就放到i的位置
 * 这样每趟都能找出一个最小的，排完数组长度趟之后，就排好了
 */
public class XuanZePaiXu
{
    public static void main(String[] args)
    {
        int[] arr = { 1, 45, -2, 6, 3 };
        for (int i = 0; i < arr.length; i++)
        {
            // 从i的位置开始，因为i前面已经排好序了。和后面的所有去比对。找到最小的交换位置
            for (int j = i; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
