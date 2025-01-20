//To determine if a given number is prime or not.
     //0 and 1 are not prime.A prime no.is that
     //which is divisible by 1 and the number itself
class PrimeChecker{
    public static void main(String args[]){
       int num=17;
       boolean isprime=true;
       if (num<=1){
          isprime=false;
       }
       else{
        for(int i=2;i<=num/2;i++){
          //2 se number ko divide kro agar divisor aata h to bol do ki prime ni h
              if (num%i==0){
                isprime=false;
                break;
            }
         }
       }
       if(isprime){
        System.out.println(num+" is a prime number");
       }
       else{
        System.out.println(num+" is not a prime number");
       }
    }
}
