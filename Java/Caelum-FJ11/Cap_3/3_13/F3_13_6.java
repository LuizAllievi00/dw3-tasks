class E3_13_6{
  public static void main(String[] args) {
    int actual = 1;
    int previous = 0;
    int total = 0;
    int termo = 4;
    for (int i = 1; i <= termo; i++ ) {
      if (i == 1){
        System.out.println(previous);
        continue;
      }
      else if(i == 2){
        System.out.println(actual);
        continue;
      }
      total = actual + previous;
      previous = actual;
      actual = total;
      System.out.println(total);
    }
  }
}
