public static boolean(int a, int b, int c){
  boolean Triangle
  if(a+b>c && a+c>b && b+c>a){
    Triangle = true;
  } else{
    Triangle = false;
  }
  return Triangle;
}
