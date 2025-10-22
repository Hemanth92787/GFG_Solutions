class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        
        ArrayList<Integer> al = new ArrayList<>();
        int max = arr[arr.length-1];
        al.add(max);
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] >= max) {
                al.add(arr[i]);
                max = arr[i];
            }
        }
        
        Collections.reverse(al);
        return al;
        
    }
}
