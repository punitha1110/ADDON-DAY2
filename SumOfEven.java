class SumOfEven{
    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i=0;i<number.length;i++)
        {
            if(i%2==1){
                System.out.println(number[i]);
                sum=sum+number[i];
            }
        }
        System.out.println("sum is" + sum);
    }
}