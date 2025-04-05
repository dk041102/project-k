class solutions{
    public static int rotations(int []arr){
        for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    return i+1;
                }
        }
        return 0;
    }
    public static void main(String[]args){
        int arr[] = {6,7,8,9,1,2,3};
        int result = rotations(arr);
        System.out.println("the array rotated " + result +" times");

    }
}