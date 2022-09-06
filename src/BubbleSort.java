public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{98,23,44,12,0,9,32,435,213,99};

        //比的轮数是当前长度减一
        for (int i = 0;i < arr.length -1;i++){
            //比一次少一次，在当前少一论的基础上，再减掉比过的轮次
            for (int j = 0;j < arr.length -1 -i;j++){
                //判断当前元素是否大于后一个元素
                if (arr[j] > arr[j + 1]){
                    //进行交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
