class functions{
    public static boolean BiSearch(int[] arr, int value){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == value){
                return true;
            }
            if (arr[mid] < value){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
    public static int Calculator(int x, String y, int z){
        int total;
        if(y.equals("+")){
            total = x+z;
        } else if (y.equals("-")) {
            total = x-z;
        } else if (y.equals("*")){
            total = x*z;
        } else if (y.equals("/")){
            total = x/z;
        }else{
            return -1;
        }
        return total;
    }
}