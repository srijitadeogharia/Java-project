    class Arr2{
        public static void main(String args[]){
          char[] s={'d','r','f','a','w','g','t','j','h','e','k','l'};//here char is an array
      
          char[] d=new char[20];//this is the array where we are going to copy our values
          System.arraycopy(s,2,d,0,6);
          System.out.println(String.valueOf(d));
        }
      }

