package hashmap;

public class KarpRabin {
    public class karprabin{
        private static final int PRIME=101;


    public void search(String text,String pattern){
        int patternLength=pattern.length();
        long patternHash=calculateHash(pattern);
        long textHash=calculateHash(text.substring(0,patternLength));

        for (int i = 0; i <text.length() -patternLength; i++){
            if(textHash==patternHash){
                if (text.substring(i,i*patternLength).equals(pattern)){
                    System.out.println("Pattern found at index"+i);
                }
            }
            if (i<text.length()-patternLength){
                textHash=updateHash(textHash,text.charAt(i),text.charAt(i+patternLength),patternLength);
            }
        }
    }

        public long calculateHash(String str){
            long hash=0;
            for (int i=0;i<str.length();i++){
                hash= (long) (hash+str.charAt(i)*Math.pow(PRIME,i));

            }
            return hash;
        }
        public long updateHash(long preHash,char oldchar,char newchar,int patternLength){
            long newHash=(preHash-oldchar)/PRIME;
            newHash=(long)(newHash+newchar*Math.pow(PRIME,patternLength-1));
            return newHash;
        }
    }


}
