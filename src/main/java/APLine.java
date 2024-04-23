public class APLine
{
  private int a, b, c;
  Public APLine (int x, int y, int slope) {
    a = x;
    b = y;
    c = slope;
  }
  public int getSlope(){
    return -(a/b);
  }
  public boolean isOnLine(int x, int y){
    if(a*x + b*y + c == 0)
      return true;
    return false;
  }
  
}
