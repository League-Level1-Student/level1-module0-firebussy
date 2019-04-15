class Car {
  int x;
  int y;
  int size;
  int speed;

  Car(int x, int y, int size, int speed) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.speed = speed;
  }
  void display() 
  {
    fill(0, 255, 0);
    rect(x, y, size, 50);
  }
  void left() {
    x-=speed;
    if (x<0) {
      x=width;
    }
  }
  void right () {
    x+=speed;
    if (x>width) {
      x=-size;
    }
  }
  
  int getX(){
     return x; 
  }
  int getY(){
     return y; 
  }
  int getSize(){
     return size; 
  }
}