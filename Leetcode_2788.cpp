class Solution {
public:
    vector<string> splitWordsBySeparator(vector<string>& words, char separator) {
        vector<string> ans;

        for(auto word: words){
            string newWord = "";
            for(auto letter: word){
                if(letter != separator){
                    newWord = newWord + letter;
                }else{
                    if(newWord.size()){
                        ans.push_back(newWord);
                        newWord= "";
                    }
                }
            } 

            if(newWord.size()){
                ans.push_back(newWord);
                newWord="";
            } 
        }
      
        return ans;
        
        
    }
};