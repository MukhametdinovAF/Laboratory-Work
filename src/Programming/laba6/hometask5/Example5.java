package Programming.laba6.hometask5;

public class Example5 {
public static int sumSquaring(int n){
    int sum=0;
    for (int i =0;i<=n;i++){
        sum=sum+i*i;
    }
    return sum;
}
public static int sumSquaringRec(int n) {
    int res;
    if(n==1){
        return 1;
    }

    res =(n+1)*sumSquaringRec(n-1);
    return res;
}
}

