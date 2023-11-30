class Solution {
    public String intToRoman(int num) {
        //store romans and their corresponding values
        int values[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roms= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  

        StringBuilder result = new StringBuilder();

        while(num > 0){

            int i=0;
            while(num < values[i]){
                i++;
            }

            result.append(roms[i]);
            num = num - values[i];
        }

        return result.toString();
    }
}
