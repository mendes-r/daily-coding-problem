package problems;

public class ProblemThirteen {

    /**
     * Given a array of numbers representing the stock prices of a company in chronological order, 
     * write a function that calculates the maximum profit you could have made from buying and selling that stock once. 
     * You must buy before you can sell it.
     * 
     * @param array
     * @return
     */
    public int answer(int[] array){
        int bestProfit = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                int buy = array[i];
                int sell = array[j];
                if((sell - buy) > bestProfit) bestProfit = sell - buy;
            }
        }
        return bestProfit;
    }
    
}
