import java.util.*;
class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        stockSpan(prices);
    }
    
    static void stockSpan(int[] prices){
        int[] span = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<prices.length; i++){
            while(!st.isEmpty() && prices[st.peek()] <= prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }
            else{
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        for(int i=0; i<span.length; i++){
            System.out.print(span[i] + " ");
        }
    }
}
