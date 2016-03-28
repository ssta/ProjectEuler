/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssta.pe.p081_090;

/**
 *
 * @author ssta
 */
public class Problem85 {

  public static void main(String[] args) {
    System.out.println(new Problem85().solve());
  }

  // horrible bruite-force solution (that happens to run quick enough!)
  public String solve() {
    int closestCount=0;
    int closestArea=0;
    int AIM=2000000;
    
    // guess an upper bound of 1000*1000 (probably too big)
    int UPB = 1000;
    for(int x=0; x<UPB; x++){
      for(int y=0; y<UPB; y++){
        int rects = countRects(x, y);
        if(Math.abs(closestCount-AIM)>Math.abs(rects-AIM)){
          closestArea=x*y;
          closestCount=rects;
        }
        if(rects>AIM){
          break;
        }
      }
    }
    return String.valueOf(closestArea);
  }

  private int countRects(int x, int y) {
    int rects = 0;
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        rects += (x - i) * (y - j);
      }
    }
    return rects;
  }
}
