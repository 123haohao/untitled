class Prime {
    public static void main(String[] args) {
        Prime a = new Prime();
        a.print(100);
    }

    //质数是，大于1 && 只能被1和本身整除的自然数
    public void print(int tel) {
        int count = 0;
        //外层循环控制要循环的个数
        for (int i = 2; i <= tel; i++) {
            //定义Boolean值好判断
            boolean Flag = true;
            //除9和3是一个道理，开方能缩小循环次数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                //只要进了过一次，后面就不在判断
                if (i % j == 0) {
                    Flag = false;
                    break;
                }
            }
            if (Flag) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println(count);
    }
}


