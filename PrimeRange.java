class PrimeRange {
    public static void main(String args[]){
      int low=30;
      int high=50;
      while (low<high){
          boolean isprime=false;
          //yaha batana h ki ye dono range ke beech prime hai kon kon
          //to prime = true kr dege
          for(int i=2;i<=low/2;i++){
              if( low % i ==0){
                 isprime=true;
                 break;
              }
          }
          //print numbers
          if(!isprime && low!=0 && low!=1){
              System.out.println(low+" ");
          }
          ++low;//low se high jaata rahe
      }
    }    
  }
