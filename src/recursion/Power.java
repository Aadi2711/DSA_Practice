package recurssion;

public class Power {
    public int power(int n){
        //Base Case
        if(n==0){
            return 1;
        }
        //Small Calculation
        int answer= 2*power(n-1);

        //Recursive Call
        return answer;
    }

    public static void main(String[] args) {
        Power p= new Power();
        System.out.println(p.power(5));
    }
}
