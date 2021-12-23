class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    // Write your code here
        Map<String,Integer> mmap = new HashMap<>();//will map string to their count in magazine
        
        for(String s : magazine){
            if(mmap.get(s)==null)
                mmap.put(s,1);
            else 
                mmap.put(s,mmap.get(s)+1);
        }
        String res = "Yes";
        for(String s : note){
            if(mmap.get(s)==null ||mmap.get(s)==0)//if no string to map left
                res ="No";
            else
                mmap.put(s,mmap.get(s)-1);
        }
        System.out.println(res);
    }
}
