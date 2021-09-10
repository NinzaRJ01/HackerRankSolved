public static void countSort(List<List<String>> arr) {
    // Write your code here
        if(arr==null)return;
        
        String[] helperList = new String[100];
        int n=arr.size();
        for(int i=0;i<n;i++){//Adding Strings at right index of helperList
            int key = Integer.parseInt(""+arr.get(i).get(0));
            String s = ""+arr.get(i).get(1);
            if(i>=n/2)
                {
                    if(helperList[key]==null)
                        helperList[key] = s +" ";
                    else
                        helperList[key] += s + " ";
                }
                
            else
                {
                    if(helperList[key]==null)
                        helperList[key] = "-"+" ";
                    else
                        helperList[key] += "-" + " ";
                }
            // System.out.println(l.get(0).getClass().getName());
        }
        
        String result = "";
        for(int i=0;i<helperList.length;i++){
            if(helperList[i]!=null)
                result+=helperList[i];
        }
        System.out.println(result);
        
        
        
    }
//--------will fail 1 test--------
