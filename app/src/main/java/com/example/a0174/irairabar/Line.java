package com.example.a0174.irairabar;

/**
 * Created by 0174 on 2017/09/14.
 */

public class Line {

    public float _x,_y;   // x,y:始点座標
    public float _sx,_sy;   // sx,sy:サイズ
    Line( float x1, float y1, float x2, float y2 ){
        _x  = x1;
        _y  = y1;
        _sx = x2-x1;
        _sy = y2-y1;
    }
    public Line() {
        _x = _y = _sx = _sy = 0;
    }

}
