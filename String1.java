class Solution {
  public String[] uncommonFromSentences(String s1, String s2) {
      s1="this apple is \"sweet\"";
      String[] NameOfs1= s1.split(" ");
      for(int i=0;i<NameOfs1.length;i++){
          System.out.println(NameOfs1[i]);
      }
      return NameOfs1;

     // s2="This apple is \"sour\"";
     // String[] NameOfs2=s2.spilt(" ");
      //for(int j=0;j<NameOfs2.length;j++){
       //   System.out.println(NameOfs2[j]);
      //}
      //return NameOfs2;

      //System.out.println(NameOfs1[i]+NameOfs2[j]);
  }
}
